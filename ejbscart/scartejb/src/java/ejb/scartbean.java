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
import entity.BrandList;
import entity.CategoryMaster;
import entity.ChildCategory;
import entity.CityTable;
import entity.CountryTable;
import entity.StateTable;

import entity.UserTable;
import java.util.Collection;
import javax.ejb.Stateless;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author shailesh
 */

@Stateless(mappedName = "scart/scartbean")
public class scartbean implements scartbeanLocal {

    @PersistenceContext(unitName = "scartejbPU")
    private EntityManager em;

    public void persist(Object object) {
        em.persist(object);
    }
    

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

   
   
    @Override
    public Collection<CategoryMaster> showAllCategory() {
    return em.createNamedQuery("CategoryMaster.findAll").getResultList();
    }

    @Override
    public Collection<ChildCategory> showAllChildCategory() {
        return em.createNamedQuery("ChildCategory.findAll").getResultList();
    }

    @Override
    public Collection<ChildCategory> showMasterCategoryWise(int cateid) {
    CategoryMaster cm=em.find(CategoryMaster.class, cateid);
        return cm.getChildCategoryCollection();
    }
     @Override
    public Collection<BrandList> showCategoryWiseBrand(int ccateid) {
     ChildCategory cc=em.find(ChildCategory.class, ccateid);
    return cc.getBrandListCollection();
    }

    @Override
    public Collection<BrandList> showByBrandId(int bid) {
   return em.createNamedQuery("BrandList.findByBrandId").setParameter("brandId", bid).getResultList();
    }
  
    @Override
    public Collection<AdTable> showAllAds() {
      return em.createNamedQuery("AdTable.findAll").getResultList();
    }
          @Override
    public Collection<AdTable> showUserWiseAd(String uname) {
        UserTable ut=em.find(UserTable.class, uname);
      return em.createNamedQuery("AdTable.findByusername").setParameter("username", ut).getResultList();
    }

      @Override
    public Collection<AdTable> showAdCategoryWise(int childcateid){
     ChildCategory ct=em.find(ChildCategory.class, childcateid);
     return ct.getAdTableCollection();
    }

  
    @Override
    public Collection<AdDetails> showAllAdDetails() {
       return em.createNamedQuery("AdDetails.findAll").getResultList();
    }

    @Override
    public Collection<AdDetails> showAdidWiseDetails(int adid) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   @Override
    public Collection<AdImages> showAdWiseImage(int adid) {
        AdTable ad=em.find(AdTable.class, adid);
        return ad.getAdImagesCollection();
    // return em.createNamedQuery("AdImages.findAll").getResultList();
    }

  

@Override
    public Collection<AuctionDetails> showAllAuctionDetail() {
        return em.createNamedQuery("AuctionDetails.findAll").getResultList();
    }

    @Override
    public Collection<AuctionDetails> showUserAuction(String uname) {
        UserTable ut=em.find(UserTable.class, uname);
        return  em.createNamedQuery("AuctionDetails.findByusername").setParameter("username", ut).getResultList();
    }
  
    @Override
    public Collection<AuctionImages> showAuctionImage(int aid) {
        AuctionDetails ad=em.find(AuctionDetails.class, aid);
        return ad.getAuctionImagesCollection();
    }

    @Override
    public Collection<BidActivity> showBidActivity(int aid) {
        AuctionDetails ad=em.find(AuctionDetails.class, aid);
        return em.createNamedQuery("BidActivity.findByAuctionId").setParameter("auctionId", ad).getResultList();
    }

    @Override
    public Collection<AdTable> showAdByCategoryAndName(int ccid, String name) {
        ChildCategory cc=em.find(ChildCategory.class, ccid);
        return em.createNamedQuery("AdTable.findByCateAndName").setParameter("childCategoryId", cc).setParameter("title", name).getResultList();
    }

    @Override
    public Collection<AdImages> showSingleImage(int aid) {
        AdTable ad=em.find(AdTable.class, aid);
      return em.createNamedQuery("AdImages.findByAdId").setParameter("adId", ad).setMaxResults(1).getResultList();
    }

    @Override
    public Collection<AdDetails> showSingleAddetails(int aid) {
         AdTable ad=em.find(AdTable.class, aid);
      return em.createNamedQuery("AdDetails.findByAdId").setParameter("adId", ad).getResultList();
    }

    @Override
    public Collection<AdTable> showAdByUsernameAndDate(String uname, String cdate) {
        UserTable ut=em.find(UserTable.class, uname);
        return em.createNamedQuery("AdTable.findByUsernameAndDate").setParameter("username", ut).setParameter("adDate", cdate).getResultList();
    }

    @Override
    public Collection<CountryTable> showAllCountry() {
     return em.createNamedQuery("CountryTable.findAll").getResultList();
    }

    @Override
    public Collection<StateTable> showAllStateByCountryId(int cid) {
         CountryTable ct=em.find(CountryTable.class, cid);
        return ct.getStateTableCollection();
    }

    @Override
    public Collection<CityTable> showAllCityByStateId(int sid) {
     StateTable st=em.find(StateTable.class, sid);
     return st.getCityTableCollection();
    }

    @Override
    public Collection<AdTable> showAdByCityAndTitle(String cty, String title) {
    return em.createNamedQuery("AdTable.findByCityAndName").setParameter("username",cty).setParameter("title", title).getResultList();
    }

    @Override
    public Collection<AdTable> showAdByTitle(String title) {
        return em.createNamedQuery("AdTable.findByTitle").setParameter("title", title).getResultList();
    }

    @Override
    public Collection<CityTable> showAllCity() {
      return em.createNamedQuery("CityTable.findAll").getResultList();
    }

    @Override
    public Collection<AdTable> showAdByAdId(int aid) {
        return em.createNamedQuery("AdTable.findByAdId").setParameter("adId", aid).getResultList();
    }

    @Override
    public Collection<AdTable> showAdOrderByPriceAsc(String title) {
   return em.createNamedQuery("AdTable.findByPriceAsc").setParameter("title", title).getResultList();
    }

    @Override
    public Collection<AdTable> showAdOrderByPriceDesc(String title) {
    return em.createNamedQuery("AdTable.findByPriceDesc").setParameter("title", title).getResultList();
    }

    @Override
    public Collection<AdTable> showAdByCityAndTitleAsc(String cty, String title) {
    return em.createNamedQuery("AdTable.findByCityAndNameAsc").setParameter("username",cty).setParameter("title", title).getResultList();
    }

    @Override
    public Collection<AdTable> showAdByCityAndTitleDesc(String cty, String title) {
           return em.createNamedQuery("AdTable.findByCityAndNameDesc").setParameter("username",cty).setParameter("title", title).getResultList();
    }

    @Override
    public Collection<AdTable> ShowAdByCategoryAsc(int ccid) {
    ChildCategory ct=em.find(ChildCategory.class, ccid);
    return em.createQuery("SELECT a FROM AdTable a WHERE a.childCategoryId = :childCategoryId  ORDER BY a.price ASC ").setParameter("childCategoryId", ct).getResultList();
    }

    @Override
    public Collection<AdTable> showAdByCaregoryDesc(int ccid) {
       ChildCategory ct=em.find(ChildCategory.class, ccid);
    return em.createQuery("SELECT a FROM AdTable a WHERE a.childCategoryId = :childCategoryId  ORDER BY a.price DESC ").setParameter("childCategoryId", ct).getResultList();
    }

    @Override
    public Collection<AdTable> showTenRecords() {
     return em.createQuery("SELECT a FROM AdTable a ORDER BY a.adId DESC").setMaxResults(10).getResultList();
    }

    @Override
    public Collection<AuctionDetails> showAuctionByAID(int aid) {
     return em.createNamedQuery("AuctionDetails.findByAuctionId").setParameter("auctionId", aid).getResultList();
    }

    @Override
    public Collection<AuctionImages> showSingleAuctionImage(int aid) {
     AuctionDetails ad=em.find(AuctionDetails.class, aid);
     return em.createNamedQuery("AuctionImages.findByAuctionId").setParameter("auctionId", ad).setMaxResults(1).getResultList();
     
    }

    @Override
    public Collection<AuctionUserDetail> showUserAuctionDetail(int uaid) {
    AuctionDetails ad=em.find(AuctionDetails.class, uaid);
    return ad.getAuctionUserDetailCollection();
    }
    

  
    
}
