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
import java.util.Collection;
import javax.ejb.Local;

/**
 *
 * @author shailesh
 */
@Local
public interface scartbeanLocal {
     Collection<CategoryMaster> showAllCategory();
     Collection<ChildCategory> showAllChildCategory();
     Collection<ChildCategory> showMasterCategoryWise(int cateid);
     Collection<BrandList> showCategoryWiseBrand(int ccateid);
     Collection<BrandList> showByBrandId(int bid);
     Collection<AdTable> showUserWiseAd(String uname);
    
     Collection<AdTable> showAllAds();

     Collection<AdTable> showAdCategoryWise(int childcateid);
    
     Collection<AdDetails> showAllAdDetails();
     Collection<AdDetails> showAdidWiseDetails(int adid);
    
     Collection<AdImages> showAdWiseImage(int adid);
    
     Collection<AuctionDetails> showAllAuctionDetail();
     Collection<AuctionDetails> showUserAuction(String uname);
    Collection<AuctionDetails> showAuctionByAID(int aid);
    Collection<AuctionUserDetail> showUserAuctionDetail(int uaid);
     Collection<AuctionImages> showAuctionImage(int aid);
    
     Collection<BidActivity> showBidActivity(int aid);
     Collection<AdTable> showAdByCategoryAndName(int ccid,String name);
    Collection<AdImages> showSingleImage(int aid);
     Collection<AdDetails> showSingleAddetails(int aid);
     Collection<AdTable> showAdByUsernameAndDate(String uname,String cdate);

     Collection<CountryTable> showAllCountry();
     Collection<StateTable> showAllStateByCountryId(int cid);
     Collection<CityTable> showAllCityByStateId(int sid);
     Collection<AdTable> showAdByCityAndTitle(String cty,String title);
     Collection<AdTable> showAdByTitle(String title);
     Collection<CityTable> showAllCity();
     Collection<AdTable> showAdByAdId(int aid);
     
     Collection<AdTable> showAdOrderByPriceAsc(String title);
     Collection<AdTable> showAdOrderByPriceDesc(String title);
     Collection<AdTable> showAdByCityAndTitleAsc(String cty,String title);
     Collection<AdTable> showAdByCityAndTitleDesc(String cty,String title);
     
     Collection<AdTable>ShowAdByCategoryAsc(int ccid);
     Collection<AdTable>showAdByCaregoryDesc(int ccid);
     
     Collection<AdTable> showTenRecords();
     Collection<AuctionImages> showSingleAuctionImage(int aid);
   
   }
