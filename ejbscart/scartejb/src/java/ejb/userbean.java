/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb;

import entity.AdDetails;
import entity.AdImages;
import entity.AdTable;
import entity.AuctionDetails;
import entity.AuctionImages;
import entity.AuctionUserDetail;
import entity.BidActivity;
import entity.ChildCategory;
import entity.CityTable;
import entity.GroupMaster;
import entity.GroupMasterPK;
import entity.StateTable;
import entity.UserChat;
import entity.UserTable;
import java.util.Collection;
import javax.ejb.Stateless;
import javax.jws.WebService;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author shailesh
 */

@Stateless(mappedName = "scart/userbean")
public class userbean implements userbeanLocal {

    @PersistenceContext(unitName = "scartejbPU")
    private EntityManager em;

    public void persist(Object object) {
        em.persist(object);
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
     @Override
    public void registration(String uname,String fname, String lname, String pass, String email, String phone,String address,int pcode, int city, int state,String mstatus,String rgdate) {
      UserTable ut=new UserTable();
      ut.setUsername(uname);
      ut.setFirstname(fname);
      ut.setLastname(lname);
      ut.setPassword(pass);
      ut.setEmailId(email);
      ut.setPhone(phone);
      ut.setAddress(address);
      ut.setPincode(pcode);
       CityTable ct=em.find(CityTable.class, city);
      ut.setCityId(ct);
       StateTable st=em.find(StateTable.class, state);
      ut.setStateId(st);
      ut.setMobilestatus(mstatus);
      ut.setRegDate(rgdate);
      em.persist(ut);
      GroupMaster gm=new GroupMaster();
      GroupMasterPK gp=new GroupMasterPK();
      gp.setGroupname("User");
      gp.setUsername(uname);
      gm.setGroupMasterPK(gp);
      em.persist(gm);
      
    }


    @Override
    public void maintainProfile(String uname, String fname, String lname, String email, String  phone,String address,int pcode, int city, int state,String mstatus) {
  UserTable ut=em.find(UserTable.class, uname);
      ut.setUsername(uname);
      ut.setFirstname(fname);
      ut.setLastname(lname);
      ut.setEmailId(email);
      ut.setPhone(phone);
      ut.setAddress(address);
      ut.setPincode(pcode);
     CityTable ct=em.find(CityTable.class, city);
      ut.setCityId(ct);
      StateTable st=em.find(StateTable.class, state);
      ut.setStateId(st);
    ut.setPincode(pcode);
   
    ut.setMobilestatus(mstatus);
     em.merge(ut);
    
    
    }


  @Override
    public Collection<UserTable> showUserDetails(String uname) {
return em.createNamedQuery("UserTable.findByUsername").setParameter("username", uname).getResultList();
        
    }

    @Override
    public void addNewAd(String uname,int childcateid,String title,int price,String ad_date) {
        AdTable at=new AdTable();
        UserTable ut=em.find(UserTable.class, uname);
        ChildCategory cc=em.find(ChildCategory.class, childcateid);
          Collection<AdTable> adcollection=cc.getAdTableCollection();
          Collection<AdTable> adcollection2=ut.getAdTableCollection();
        
          adcollection2.add(at);
          at.setUsername(ut);
          ut.setAdTableCollection(adcollection2);
        
          adcollection.add(at);
         at.setChildCategoryId(cc);
        cc.setAdTableCollection(adcollection);
        at.setTitle(title);
        at.setPrice(price);
        at.setAdDate(ad_date);
        at.setStatus("Disable");
        em.persist(at);
        em.merge(ut);
        em.merge(cc);
    }

    @Override
    public void removeAd(int adid,String uname,int childcateid) {
     AdTable ad=em.find(AdTable.class, adid);
      ChildCategory cc=em.find(ChildCategory.class, childcateid);
      UserTable ut=em.find(UserTable.class, uname);
     Collection<AdTable> adcollection1=cc.getAdTableCollection();
     Collection<AdTable> adcollection2=ut.getAdTableCollection();
 
     if((adcollection1.contains(ad))&&(adcollection2.contains(ad)))
     {
 
      adcollection1.remove(ad);
      adcollection2.remove(ad);
       
      cc.setAdTableCollection(adcollection1);
      ut.setAdTableCollection(adcollection2);
       em.remove(ad);
       em.merge(cc);
       em.merge(ut);
        }
    }

    @Override
    public void editAd(int adid, String uname, int childcateid,String title,int price) {
      AdTable at=em.find(AdTable.class, adid);
        
        ChildCategory cc=em.find(ChildCategory.class, childcateid);
          Collection<AdTable> adcollection=cc.getAdTableCollection();
        
          adcollection.add(at);
         at.setChildCategoryId(cc);
        cc.setAdTableCollection(adcollection);
        at.setTitle(title);
        at.setPrice(price);
        em.merge(at);
        
        em.merge(cc);
    }


  @Override
    public void addDetailsForAd(int adid, String adtitle, String advalue) {
       AdDetails ad=new AdDetails();
      AdTable at=em.find(AdTable.class, adid);
      Collection<AdDetails> adcollection=at.getAdDetailsCollection();
      adcollection.add(ad);
      ad.setAdId(at);
      at.setAdDetailsCollection(adcollection);
      ad.setAdTitle(adtitle);
      ad.setAdValue(advalue);
      em.persist(ad);
      em.merge(at);
    }

    @Override
    public void editAdDetails(int ad_detailsid, String adid, String adtitle, String advalue) {
    AdDetails ad=em.find(AdDetails.class, ad_detailsid);
       
      AdTable at=em.find(AdTable.class, adid);
      Collection<AdDetails> adcollection=at.getAdDetailsCollection();
      adcollection.add(ad);
      ad.setAdId(at);
      at.setAdDetailsCollection(adcollection);
      ad.setAdTitle(adtitle);
      ad.setAdValue(advalue);
      em.persist(ad);
      em.merge(at);
    }

      @Override
    public void addImageForAd(int adid, String imgpath) {
       AdImages ai=new AdImages();
       AdTable ad=em.find(AdTable.class, adid);
     Collection<AdImages> imgcoll=ad.getAdImagesCollection();
       imgcoll.add(ai);
       ai.setAdId(ad);
       ad.setAdImagesCollection(imgcoll);
       ai.setAdImagePath(imgpath);
       em.persist(ai);
       em.merge(ad);
    }

    @Override
    public void editImageOfAd(int adimgid,int adid, String imgpath) {
    AdImages ai=em.find(AdImages.class, adimgid);
       AdTable ad=em.find(AdTable.class, adid);
     Collection<AdImages> imgcoll=ad.getAdImagesCollection();
       imgcoll.add(ai);
       ai.setAdId(ad);
       ad.setAdImagesCollection(imgcoll);
       ai.setAdImagePath(imgpath);
       em.persist(ai);
       em.merge(ad);
    }

    @Override
    public void removeImageofAd(int adimgid) {
     AdImages ai=em.find(AdImages.class, adimgid);
     em.remove(ai);
    }

     @Override
    public void addNewUserChat(String frmuser, String touser, String umsg, String msgdate,int aid) {
            UserChat uc=new UserChat();
            UserTable ut1=em.find(UserTable.class, frmuser);
            Collection<UserChat> uchatCollection1=ut1.getUserChatCollection();
            UserTable ut2=em.find(UserTable.class, touser);
            Collection<UserChat> uchatCollection2=ut1.getUserChatCollection();
            AdTable at=em.find(AdTable.class, aid);
            Collection<UserChat> uchatCollection3=at.getUserChatCollection();
         
           uchatCollection1.add(uc);
           uc.setFromUsername(ut1);
           ut1.setUserChatCollection(uchatCollection1);
           
           uchatCollection2.add(uc);
           uc.setToUsername(ut2);
           ut2.setUserChatCollection(uchatCollection2);
           
            uc.setUserMessage(umsg);
           uc.setChatDate(msgdate);
           
           uchatCollection3.add(uc);
           uc.setAdId(at);
           at.setUserChatCollection(uchatCollection3);
          
           em.persist(uc);
           em.merge(at);
           em.merge(ut1);
           em.merge(ut2);
    
    }

    @Override
    public Collection<UserChat> showUserChat(String uname) {
        UserTable ut=em.find(UserTable.class, uname);
        return ut.getUserChatCollection1();
                
    }

    @Override
    public Collection<UserChat> showMySentMsg(String uname) {
            UserTable ut=em.find(UserTable.class, uname);
            return ut.getUserChatCollection();
    }

    @Override
    public void removeUserChat(String uname) {
//    UserChat uc=em.find(UserChat.class, chatid);
//        em.remove(uc);
    }

    @Override
    public void addAuctionDetail(String ptitle, String stime, String ctime, int sbid, String pcondition,String dtime, int pquantity, String description, String uname,String adate,String rpolicy,String sellerdes) {
        
        AuctionDetails ad=new AuctionDetails();
        UserTable ut=em.find(UserTable.class, uname);
        ad.setProductTitle(ptitle);
        ad.setStartTime(stime);
        ad.setCloseTime(ctime);
        ad.setStartingBid(sbid);
        ad.setProductCondition(pcondition);
        ad.setDispatchTime(dtime);
        ad.setProductQuantity(pquantity);
        ad.setDescription(description);
        Collection<AuctionDetails> aucollection=ut.getAuctionDetailsCollection();
        aucollection.add(ad);
        ad.setUsername(ut);
        ut.setAuctionDetailsCollection(aucollection);
        ad.setAuctionDate(adate);
        em.persist(ad);
        em.merge(ut);
        AuctionUserDetail aud=new AuctionUserDetail();
        Collection<AuctionDetails> a2=em.createNamedQuery("AuctionDetails.findByusernameAndDate").setParameter("username", ut).setParameter("auctionDate", adate).getResultList();
        for(AuctionDetails ad2:a2)
        {
        aud.setAuctionId(ad2);
        aud.setReturnPolicy(rpolicy);
        aud.setSellerDescription(sellerdes);
        em.persist(aud);
        }
    }

    @Override
    public void editAutionDetail(int aid, String ptitle,String stime,String ctime, int sbid, String pcondition, String dtime, int pquantity, String description) {
        AuctionDetails ad=em.find(AuctionDetails.class, aid);
        ad.setProductTitle(ptitle);
        ad.setStartTime(stime);
        ad.setCloseTime(ctime);
        ad.setStartingBid(sbid);
        ad.setProductCondition(pcondition);
        ad.setDispatchTime(dtime);
        ad.setProductQuantity(pquantity);
        ad.setDescription(description);
        em.merge(ad);
        
    }


   @Override
    public void removeAutionDetail(int aid) {
        AuctionDetails ad=em.find(AuctionDetails.class, aid);
        em.remove(ad);
    }

    

    @Override
    public void addAuctionImage(int aid,String imgpath) {
        AuctionImages ai=new AuctionImages();
        AuctionDetails ad=em.find(AuctionDetails.class, aid);
        ai.setAuctionImagePath(imgpath);
        Collection<AuctionImages> aicollection=ad.getAuctionImagesCollection();
        aicollection.add(ai);
        
        ai.setAuctionId(ad);
        ad.setAuctionImagesCollection(aicollection);
        em.persist(ai);
        em.merge(ad);
                
    }

    @Override
    public void removeAutionImage(int aimageid) {
        AuctionImages ai=em.find(AuctionImages.class, aimageid);
        em.remove(ai);
    }

   

    @Override
    public void addBidActivity(String uname, int aid, int amount, String bdate) {
        BidActivity ba=new BidActivity();
        UserTable ut=em.find(UserTable.class, uname);
        AuctionDetails ad=em.find(AuctionDetails.class, aid);
        
        ba.setUsername(ut);
        ba.setAuctionId(ad);
        ba.setAmount(amount);
        ba.setBidDate(bdate);
        em.persist(ba);
    }

    @Override
    public void removeBidActivity(int baid) {
        BidActivity ba=em.find(BidActivity.class, baid);
        em.remove(ba);
    }

    @Override
    public void editAuctionUserDetail(int aid, String rpolicy, String sdesc) {
           AuctionUserDetail aud=em.find(AuctionUserDetail.class, aid);
        aud.setReturnPolicy(rpolicy);
        aud.setSellerDescription(sdesc);
        em.merge(aud);
    }

    @Override
    public void removeAuctionUserDetail(int uid) {
     AuctionUserDetail aud=em.find(AuctionUserDetail.class, uid);
        em.remove(aud);
    }

  
}
