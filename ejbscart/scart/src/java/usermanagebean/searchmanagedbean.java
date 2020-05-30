/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usermanagebean;

import ejb.scartbeanLocal;
import entity.AdImages;
import entity.AdTable;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.Collection;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 *
 * @author shailesh
 */
@Named(value = "searchmanagedbean")
@SessionScoped
public class searchmanagedbean implements Serializable {
 @EJB(mappedName = "scart/scartbean")
      scartbeanLocal scartport;
 
    private String searchby,searchcity;
   Collection<AdTable> allsearchAds;

     //display adDetails
    Collection<AdTable> displayAd;
    Collection<AdImages> displayAdImage;
    Collection<AdImages> displayOneImage;
 private int childcateid;
    /**
     * Creates a new instance of searchmanagedbean
     */
    @PostConstruct
    public void init()
    {
    }

  
    
    public searchmanagedbean() {
     
    }

    public String getSearchby() {
        return searchby;
    }

    public void setSearchby(String searchby) {
        this.searchby = searchby;
    }

    public String getSearchcity() {
        return searchcity;
    }

    public void setSearchcity(String searchcity) {
        this.searchcity = searchcity;
    }

    public Collection<AdTable> getAllsearchAds() {
        return allsearchAds;
    }

    public void setAllsearchAds(Collection<AdTable> allsearchAds) {
        this.allsearchAds = allsearchAds;
    }

     public String doSearch()
    {
        
        if(searchby!=null && searchcity!=null)
        {
           allsearchAds=scartport.showAdByCityAndTitle(searchcity, searchby);
        return "/ads?faces-redirect=true";
        }
        else if(searchby!=null && searchcity==null)
        {
        allsearchAds=scartport.showAdByTitle(searchby);
        return "/ads?faces-redirect=true";
        }
        return "/index?faces-redirrect=true";
    }

    public Collection<AdTable> getDisplayAd() {
        return displayAd;
    }

    public void setDisplayAd(Collection<AdTable> displayAd) {
        this.displayAd = displayAd;
    }

    public Collection<AdImages> getDisplayAdImage() {
        return displayAdImage;
    }

    public void setDisplayAdImage(Collection<AdImages> displayAdImage) {
        this.displayAdImage = displayAdImage;
    }

    public Collection<AdImages> getDisplayOneImage() {
        return displayOneImage;
    }

    public void setDisplayOneImage(Collection<AdImages> displayOneImage) {
        this.displayOneImage = displayOneImage;
    }
 
 
     
     
     public String displayaidDetails(int aid)
    {
     displayAd=scartport.showAdByAdId(aid);
     displayAdImage=scartport.showAdWiseImage(aid);
     displayOneImage=scartport.showSingleImage(aid);
    return "/ad_detail?faces-redirect=true";
    }
    public void priceAsc()
    {
        if(searchby!=null && searchcity!=null)
        {
            allsearchAds=scartport.showAdByCityAndTitleAsc(searchcity, searchby);
        }else if(searchby!=null && searchcity==null){
             allsearchAds=scartport.showAdOrderByPriceAsc(searchby);
        }
    }
    public void priceDesc()
    {
         if(searchby!=null && searchcity!=null)
         {
              allsearchAds=scartport.showAdByCityAndTitleDesc(searchcity, searchby);
         }else if(searchby!=null && searchcity==null){
             allsearchAds=scartport.showAdOrderByPriceDesc(searchby);
         }
    }
    public String IndexCategory(int id)
    { 
      childcateid=id;
    allsearchAds=scartport.showAdCategoryWise(id);
    return "/cateAds.xhtml?faces-redirect=true";
    
    }

    public int getChildcateid() {
        return childcateid;
    }

    public void setChildcateid(int childcateid) {
        this.childcateid = childcateid;
    }
    
    public void catePriceAsc()
    {
    
    allsearchAds=scartport.ShowAdByCategoryAsc(childcateid);
    }
    public void catepriceDesc()
    {
    allsearchAds=scartport.showAdByCaregoryDesc(childcateid);
    }
}
