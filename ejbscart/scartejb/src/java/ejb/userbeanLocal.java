/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb;

import entity.AdTable;
import entity.AuctionDetails;
import entity.AuctionImages;
import entity.BidActivity;
import entity.UserChat;
import entity.UserTable;
import java.util.Collection;
import java.util.Date;
import javax.ejb.Local;

/**
 *
 * @author shailesh
 */
@Local
public interface userbeanLocal {
    void registration(String uname,String fname,String lname,String pass,String email,String phone,String address,int pcode,int city,int state,String mstatus,String rgdate);
   
  
   void maintainProfile(String uname,String fname,String lname,String email,String phone,String address,int pcode,int city,int state,String mstatus);
   
    
    Collection<UserTable> showUserDetails(String uname);
    void addNewAd(String uname,int childcateid,String title,int price,String ad_date);
    void removeAd(int adid,String uname,int childcateid);
    void editAd(int adid,String uname,int childcateid,String title,int price);
    
    
    void addDetailsForAd(int adid,String adtitle,String advalue);
    void editAdDetails(int ad_detailsid,String adid,String adtitle,String advalue);

    void addImageForAd(int adid,String imgpath);
    void editImageOfAd(int adimgid,int adid,String imgpath);
    void removeImageofAd(int adimgid);

    void addNewUserChat(String frmuser,String touser,String umsg,String msgdate,int aid);
 
    Collection<UserChat> showUserChat(String uname);
    Collection<UserChat> showMySentMsg(String uname);
    void removeUserChat(String uname);
  
    
    void addAuctionDetail(String ptitle,String stime,String ctime,int sbid,String pcondition,String dtime,int pquantity,String description,String uname,String adate,String rpolicy,String sellerdes);
     public void editAutionDetail(int aid, String ptitle,String stime,String ctime, int sbid, String pcondition, String dtime, int pquantity, String description);
    void removeAutionDetail(int aid);
    
    
     void addAuctionImage(int aid,String imgpath);
    
    void removeAutionImage(int aimageid);
  
   
    void addBidActivity(String uname,int aid,int amount,String bdate);
    
    void removeBidActivity(int baid);

   void editAuctionUserDetail(int aid,String rpolicy,String sdesc);
   void removeAuctionUserDetail(int uid);
   
   
   
}
