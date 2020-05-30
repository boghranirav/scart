/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Managebean;

import entity.AdDetails;
import entity.AdImages;
import entity.AdTable;

import entity.BrandList;
import entity.CategoryMaster;
import entity.ChildCategory;
import entity.CityTable;

import ejb.adminbeanLocal;
import ejb.scartbeanLocal;
import entity.UserTable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;




/**
 *
 * @author shailesh
 */
@ManagedBean
@RequestScoped
//@RequestScoped
public class showdatabean {

 @EJB(mappedName = "scart/scartbean")
      scartbeanLocal scartport;
   @EJB(mappedName = "scart/adminbean")
      adminbeanLocal adminport;

    /**
     * Creates a new instance of showdatabean
     */
    Collection<CategoryMaster> allcategory;
    Collection<ChildCategory> allchildcategory;
    Collection<BrandList> allbrand;
   
    Collection<AdTable> allads;
    Collection<AdDetails> allAdDetails;
    Collection<UserTable> allUser;
    ArrayList<String> data=null; 
    ArrayList<String> data2=null;
    private int childcateid;
   
    
  
   
    
    @PostConstruct
    public void init()
    {
   
    data=new ArrayList<>();
    Collection<AdTable> ads=scartport.showAllAds();
     for(AdTable a:ads)
     {
       data.add(a.getTitle());
      }
     data2=new ArrayList<>();
     Collection<CityTable> ctys=scartport.showAllCity();
        for(CityTable ct:ctys)
        {
        data2.add(ct.getCityName());
        }
    }
   public List<String>  ComleteText(String query)
   {
      List<String> result=new ArrayList<>();
        for(String s:data)
        {
            if(s.substring(0,query.length()).equalsIgnoreCase(query)){
            result.add(s);
             }
          }
        return result;
   }
   public List<String> CompleteText2(String query)
   {
     List<String> result1=new ArrayList<>();
     for(String s1:data2)
     {
        if(s1.substring(0,query.length()).equalsIgnoreCase(query)){
        result1.add(s1);
        }
     }
   return result1;
   }

   
    public int getChildcateid() {
        return childcateid;
    }

    public void setChildcateid(int childcateid) {
        this.childcateid = childcateid;
    }

   

    public Collection<CategoryMaster> getAllcategory() {
        allcategory=scartport.showAllCategory();
        return allcategory;
    }

    public Collection<ChildCategory> getAllchildcategory() {
       allchildcategory=scartport.showAllChildCategory();
        return allchildcategory;
    }

    public Collection<BrandList> getAllbrand() {
       allbrand=adminport.showAllBrand();
        return allbrand;
    }


    public showdatabean() {
    }

    public Collection<AdTable> getAllads() {
      allads=scartport.showAllAds();
        return allads;
    }

    public void setAllads(Collection<AdTable> allads) {
        this.allads = allads;
    }

    
    public Collection<AdImages> showimgbyads(int aid)
    {
        return scartport.showSingleImage(aid);
      }
    public Collection<AdDetails> showallAdDetails()
    {
        return scartport.showAllAdDetails();
        }

    public Collection<AdDetails> getAllAdDetails() {
        //allAdDetails=scartport.showSingleAddetails(1);
        return allAdDetails;
    }

    public void setAllAdDetails(Collection<AdDetails> allAdDetails) {
        this.allAdDetails = allAdDetails;
    }
     
   //adminsite
     public String showAddetailsByAdid(int aid)
       {
        allAdDetails=scartport.showSingleAddetails(aid);
        return "/admin/viewaddetails.xhtml";
        }
   
     public Collection<AdDetails> showadd(int aid)
    {
        return scartport.showSingleAddetails(aid);
    }

    public Collection<UserTable> getAllUser() {
    allUser=adminport.showAllUser();
        return allUser;
    }



public Collection<AdTable> showTenRecord()
{

return scartport.showTenRecords();
}
    
public String viewSingleImgOfAd(int aid)
{
Collection<AdImages>  imgcol=scartport.showSingleImage(aid);
String ipath;  
for(AdImages a:imgcol)
  {
  ipath=a.getAdImagePath();
  return ipath;
  }
return null;
}
 
   

}
