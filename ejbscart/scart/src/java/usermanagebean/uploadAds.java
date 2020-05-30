/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usermanagebean;

import ejb.scartbeanLocal;
import ejb.userbeanLocal;
import entity.AdTable;
import entity.BrandList;
import entity.CategoryMaster;
import entity.ChildCategory;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.primefaces.event.FileUploadEvent;


/**
 *
 * @author shailesh
 */
@ManagedBean
@RequestScoped
public class uploadAds {
@EJB(mappedName = "scart/userbean")
userbeanLocal ubl;
@EJB(mappedName = "scart/scartbean")
scartbeanLocal scartport;
        
    
private String title,description,caryear,fueltype,kmdriven,rooms,sfeet,furnished;
private int cateid,brandid,childid,price;
Collection<ChildCategory> MasterwiseChild;
 private String destination="M:\\ejbscart\\scart\\web\\scartimage\\";

/**
     * Creates a new instance of uploadAds
     */
    public uploadAds() {
    }
@PostConstruct
public void init()
{


}

    public Collection<ChildCategory> getMasterwiseChild() {
        return MasterwiseChild;
    }

    public void setMasterwiseChild(Collection<ChildCategory> MasterwiseChild) {
        this.MasterwiseChild = MasterwiseChild;
    }

    public String getTitle() {
        return title;
    }

    public int getChildid() {
        return childid;
    }

    public void setChildid(int childid) {
        this.childid = childid;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getCateid() {
        return cateid;
    }

    public void setCateid(int cateid) {
        this.cateid = cateid;
    }

    public int getBrandid() {
        return brandid;
    }

    public void setBrandid(int brandid) {
        this.brandid = brandid;
    }

    public String getCaryear() {
        return caryear;
    }

    public void setCaryear(String caryear) {
        this.caryear = caryear;
    }

    public String getFueltype() {
        return fueltype;
    }

    public void setFueltype(String fueltype) {
        this.fueltype = fueltype;
    }

    public String getKmdriven() {
        return kmdriven;
    }

    public void setKmdriven(String kmdriven) {
        this.kmdriven = kmdriven;
    }

    public String getRooms() {
        return rooms;
    }

    public void setRooms(String rooms) {
        this.rooms = rooms;
    }

    public String getSfeet() {
        return sfeet;
    }

    public void setSfeet(String sfeet) {
        this.sfeet = sfeet;
    }

    public String getFurnished() {
        return furnished;
    }

    public void setFurnished(String furnished) {
        this.furnished = furnished;
    }
    
    public String uploadNewads()
    {
    int aid;
        Date d=new Date();
    Format ft=new SimpleDateFormat("dd-MM-yyyy HH:mm");
    String dt=ft.format(d);
    String bnd=String.valueOf(brandid);
    HttpServletRequest rq=(HttpServletRequest)FacesContext.getCurrentInstance().getExternalContext().getRequest();
       HttpSession childidsession=rq.getSession(false);
       int selectedcid=Integer.parseInt(childidsession.getAttribute("childidss").toString());
      HttpSession userss=rq.getSession(false);
      String uname=userss.getAttribute("usersession").toString();
  
       ubl.addNewAd(uname, selectedcid, title, price, dt);
        
//     Collection<AdTable> ads=scartport.showAdByUsernameAndDate("shailesh", dt);
  Collection<AdTable> ads=scartport.showAdByUsernameAndDate(uname, dt);
    for(AdTable a:ads)
     {
         HttpSession setadIdss=rq.getSession(false);
         setadIdss.setAttribute("adIdss", a.getAdId());
         if(brandid!=0)
         {
             Collection<BrandList> bls=scartport.showByBrandId(brandid);
                for(BrandList b:bls)
                {
                ubl.addDetailsForAd(a.getAdId(),"Brand", b.getBrandName());
                }
         }
         if(furnished!=null && rooms!=null && sfeet!=null)
         {
         ubl.addDetailsForAd(a.getAdId(),"Furnished", furnished);
         ubl.addDetailsForAd(a.getAdId(),"Rooms", rooms);
         ubl.addDetailsForAd(a.getAdId(),"Square Feet", sfeet);
         }
       ubl.addDetailsForAd(a.getAdId(),"Description", description);
     }

    return "/user/adImagepage?faces-redirect=true";
    }

    public String uploadCarAd()
    {
        Date d=new Date();
    Format ft=new SimpleDateFormat("dd-MM-yyyy HH:mm");
    String dt=ft.format(d);
    String bnd=String.valueOf(brandid);
    HttpServletRequest rq=(HttpServletRequest)FacesContext.getCurrentInstance().getExternalContext().getRequest();
       HttpSession childidsession=rq.getSession(false);
       int selectedcid=Integer.parseInt(childidsession.getAttribute("childidss").toString());
  HttpSession userss=rq.getSession(false);
   String uname=userss.getAttribute("usersession").toString();
       ubl.addNewAd(uname, selectedcid, title, price, dt);
        
//     Collection<AdTable> ads=scartport.showAdByUsernameAndDate("shailesh", dt);
  Collection<AdTable> ads=scartport.showAdByUsernameAndDate(uname, dt);
    for(AdTable a:ads)
     {
         HttpSession setadIdss=rq.getSession(false);
         setadIdss.setAttribute("adIdss", a.getAdId());
         Collection<BrandList> bls=scartport.showByBrandId(brandid);
         for(BrandList b:bls)
         {
         ubl.addDetailsForAd(a.getAdId(),"Brand", b.getBrandName());
         }
       ubl.addDetailsForAd(a.getAdId(),"Description", description);
       ubl.addDetailsForAd(a.getAdId(),"Year" , caryear);
       ubl.addDetailsForAd(a.getAdId(),"KM's Driven" , kmdriven);
       if(fueltype!=null){
       ubl.addDetailsForAd(a.getAdId(),"Fuel Taype" , fueltype);
       }
     }

    return "/user/adImagepage?faces-redirect=true";  
    
    }
   public void showCateByMasterId()
    {
     MasterwiseChild=scartport.showMasterCategoryWise(cateid);
    }
   public String showpage()
   {
       HttpServletRequest rq=(HttpServletRequest)FacesContext.getCurrentInstance().getExternalContext().getRequest();
       HttpSession childidsession=rq.getSession(false);
       childidsession.setAttribute("childidss", childid);
       if(childid==1){
     return "/user/mobilepage.xhtml?faces-redirect=true";
       }else if(childid==2)
       {
       return "/user/carpage.xhtml?faces-redirect=true";
       }else if(childid==3)
       {
       return "/user/bikepage.xhtml?faces-redirect=true";
       }
       else if(cateid==8)
       {
       return "/user/realestatepage.xhtml?faces-redirect=true";
       }
       else
       {
       return "/user/otherpage.xhtml?faces-redirect=true";
       }
       
   }
   public Collection<BrandList> showBrandByCategory()
   {     HttpServletRequest rq=(HttpServletRequest)FacesContext.getCurrentInstance().getExternalContext().getRequest();
       HttpSession childidsession=rq.getSession(false);
       int selectedcid=Integer.parseInt(childidsession.getAttribute("childidss").toString());
   
   return scartport.showCategoryWiseBrand(selectedcid);
   }
   public void upload(FileUploadEvent event) {  
        
        FacesMessage msg = new FacesMessage("Success! ", event.getFile().getFileName() + " is uploaded.");  
        FacesContext.getCurrentInstance().addMessage(null, msg);
        // Do what you want with the file        
        try {
            copyFile(event.getFile().getFileName(), event.getFile().getInputstream());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }  
    public void copyFile(String fileName, InputStream in) {
          
//FacesContext.getCurrentInstance().getS   
        try{
             HttpServletRequest req = (HttpServletRequest)FacesContext.getCurrentInstance().getExternalContext().getRequest();     
                   HttpSession getAdIdss=req.getSession(false);
                   int aid=Integer.parseInt(getAdIdss.getAttribute("adIdss").toString());
                   ubl.addImageForAd(aid, fileName);
//               cimgpath=fileName;
//              HttpSession   imgsession=req.getSession(false);
//              imgsession.setAttribute("imgss", cimgpath);

        String st= req.getContextPath() ;
        // write the inputStream to a FileOutputStream
                OutputStream out = new FileOutputStream(new File(destination + fileName));
              
                int read = 0;
                byte[] bytes = new byte[1024];
              
                while ((read = in.read(bytes)) != -1) {
                    out.write(bytes, 0, read);
                    
                }
              
                in.close();
                out.flush();
                out.close();
              
                System.out.println("New file created!");
                } catch (IOException e) {
                System.out.println(e.getMessage());
                }
    }

    
    public String startForUpload()
    {
         HttpServletRequest rq=(HttpServletRequest)FacesContext.getCurrentInstance().getExternalContext().getRequest();
     HttpSession session=rq.getSession(false);
       
        //String uname=session.getAttribute("usersession").toString();
        if(session.getAttribute("usersession")==null)
        {  HttpSession pagession=rq.getSession(false);
        pagession.removeAttribute("msgpagess");
           HttpSession pagession2=rq.getSession(false);
          pagession2.removeAttribute("viewauction");
        
           HttpSession pageses=rq.getSession(false);
            
            pageses.setAttribute("pagesession","/user/selectcategory?faces-redirect=true" );
          return "/login?faces-redirect=true";
        }
        else if(session.getAttribute("usersession")!=null){
         
        return "/user/selectcategory?faces-redirect=true";
        }
        return null;
    }
    public String finishMethod()
    {
    return "/user/myads.xhtml?faces-redirect=true";
    }
   
    public Collection<ChildCategory> showchildCate()
    {
        if(cateid==0)
        {
        return scartport.showAllChildCategory();
        }else
        {
        return scartport.showMasterCategoryWise(cateid);
            }
    }
}
