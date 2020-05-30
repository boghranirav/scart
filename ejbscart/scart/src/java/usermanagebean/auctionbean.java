/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usermanagebean;

import entity.AuctionDetails;

import entity.AuctionUserDetail;
import entity.BidActivity;
import ejb.scartbeanLocal;
import ejb.userbeanLocal;
import entity.AuctionImages;
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
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;
import org.primefaces.event.FileUploadEvent;

/**
 *
 * @author shailesh
 */
@Named(value = "auctionbean")
@RequestScoped
public class auctionbean {
@EJB(mappedName = "scart/scartbean")
scartbeanLocal scartport;

@EJB(mappedName = "scart/userbean")
userbeanLocal userport;

    /**
     * Creates a new instance of auctionbean
     */
    private String startdate,closedate,btitle,bpcondition,bdispetchtime,bdesc,brpolicy,bsellerdesc,cimgpath,dispimage,userid;
    private int auctionid,bsbid,bpquantity,auctionuserid;
    private String destination="C:\\Users\\NIR\\Desktop\\final\\ejbscart\\scart\\web\\scartimage\\";
    private Part myfile;
    
    public auctionbean() {
    }
      @PostConstruct
    public void init()
    {
       
        
    }

    public int getAuctionuserid() {
        return auctionuserid;
    }

    public void setAuctionuserid(int auctionuserid) {
        this.auctionuserid = auctionuserid;
    }

    
    public int getAuctionid() {
        return auctionid;
    }

    public void setAuctionid(int auctionid) {
        this.auctionid = auctionid;
    }
    
    
    public String getStartdate() {
        return startdate;
    }

    public void setStartdate(String startdate) {
        this.startdate = startdate;
    }

    public String getClosedate() {
        return closedate;
    }

    public void setClosedate(String closedate) {
        this.closedate = closedate;
    }

    public String getBtitle() {
        return btitle;
    }

    public void setBtitle(String btitle) {
        this.btitle = btitle;
    }

    public String getBpcondition() {
        return bpcondition;
    }

    public void setBpcondition(String bpcondition) {
        this.bpcondition = bpcondition;
    }

    public String getBdispetchtime() {
        return bdispetchtime;
    }

    public void setBdispetchtime(String bdispetchtime) {
        this.bdispetchtime = bdispetchtime;
    }

    public String getBdesc() {
        return bdesc;
    }

    public void setBdesc(String bdesc) {
        this.bdesc = bdesc;
    }

    public String getBrpolicy() {
        return brpolicy;
    }

    public void setBrpolicy(String brpolicy) {
        this.brpolicy = brpolicy;
    }

    public String getBsellerdesc() {
        return bsellerdesc;
    }

    public void setBsellerdesc(String bsellerdesc) {
        this.bsellerdesc = bsellerdesc;
    }

    public int getBsbid() {
        return bsbid;
    }

    public void setBsbid(int bsbid) {
        this.bsbid = bsbid;
    }

    public int getBpquantity() {
        return bpquantity;
    }

    public void setBpquantity(int bpquantity) {
        this.bpquantity = bpquantity;
    }

    public String getCimgpath() {
        return cimgpath;
    }

    public void setCimgpath(String cimgpath) {
        this.cimgpath = cimgpath;
    }

    public Part getMyfile() {
        return myfile;
    }

    public void setMyfile(Part myfile) {
        this.myfile = myfile;
    }

    public String getDispimage() {
        return dispimage;
    }

    public void setDispimage(String dispimage) {
        this.dispimage = dispimage;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }
    
    

 public String addNewAuction()
 {
     Date d=new Date();
     Format ft=new SimpleDateFormat("dd/MM/yy HH:mm:ss");
     String dt=ft.format(d);
     HttpServletRequest rq=(HttpServletRequest)FacesContext.getCurrentInstance().getExternalContext().getRequest();
     HttpSession session=rq.getSession(false);
       
        String uname=session.getAttribute("usersession").toString();
     userport.addAuctionDetail(btitle, startdate, closedate, bsbid, bpcondition, bdispetchtime, bpquantity, bdesc, uname, dt, brpolicy, bsellerdesc);
     
 return "/user/myauction.xhtml?faces-redirect=true";
 }
 
    public String showAuctionImages(int iid){
        Collection<AuctionImages> ai=scartport.showSingleAuctionImage(iid);
        String ipath;
        for(AuctionImages a:ai){
           ipath = a.getAuctionImagePath();
        
        return ipath;
        }
        return null;
    }
 
    public Collection<AuctionDetails> showAutionByUserID()
    {
        HttpServletRequest rq=(HttpServletRequest)FacesContext.getCurrentInstance().getExternalContext().getRequest();
     HttpSession session=rq.getSession(false);
       
        String uname=session.getAttribute("usersession").toString();
        return scartport.showUserAuction(uname);
        
    }
    
   public String goToViewInfo(int aid2){
       auctionid=aid2;
       return "auctioninfo.xhtml";
   }
   
   
   public String showAuctionInfo(){
       Collection<AuctionDetails> ad= scartport.showAuctionByAID(auctionid);
       String tit="";
       for(AuctionDetails a:ad){
           tit=a.getProductTitle();
       }
       return tit;
   }
   
   public Collection<BidActivity> showAllBid(){
      return scartport.showBidActivity(auctionid);
       
   }

    public String doUpdateAution(int aid1){
         auctionid=aid1;
         Collection<AuctionDetails> adetail=scartport.showAuctionByAID(aid1);
         Collection<AuctionUserDetail> audet=scartport.showUserAuctionDetail(aid1);
         
         
        for (AuctionDetails ad:adetail) {
            this.btitle=ad.getProductTitle();
            this.startdate=ad.getStartTime();
            this.closedate=ad.getCloseTime();
            this.bpcondition=ad.getProductCondition();
            this.bdispetchtime=ad.getDispatchTime();
            this.bdesc=ad.getDescription();
            this.bsbid=ad.getStartingBid();
            this.bpquantity=ad.getProductQuantity();
            
            
            
        }
        
        for(AuctionUserDetail aud : audet){
            this.auctionuserid=aud.getAuctionUdId();
            this.brpolicy=aud.getReturnPolicy();
            this.bsellerdesc=aud.getSellerDescription();
        }
       
        //return null;
        return "editauction.xhtml";
    }
    
 
    
    public String updateAuction()
    {
        userport.editAutionDetail(auctionid, btitle, startdate, closedate, bsbid, bpcondition, bdispetchtime, bpquantity, bdesc);
        userport.editAuctionUserDetail(auctionuserid, brpolicy, bsellerdesc);
        
        return "myauction.xhtml";
    }
    
    public String deleteAuction(int aid)
    {
        userport.removeAutionDetail(aid);
        
        return "myauction.xhtml?faces-redirect=true";
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
        redirectToMyaction();
    }  
     public String redirectToMyaction()
     {
     return "/user/myauction.xhtml?faces-redirect=true";
     }
    
      public void copyFile(String fileName, InputStream in) {
          
//FacesContext.getCurrentInstance().getS   
        try{
             HttpServletRequest req = (HttpServletRequest)FacesContext.getCurrentInstance().getExternalContext().getRequest();     
             HttpSession imgsession=req.getSession(false);
             this.auctionid=Integer.parseInt(imgsession.getAttribute("aucid").toString());
             userport.addAuctionImage(auctionid,fileName);
            // userport.addAuctionImage(fileName, auctionid);

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
      
     
      public String addImage(int aid){
          this.auctionid=aid;
           HttpServletRequest req = (HttpServletRequest)FacesContext.getCurrentInstance().getExternalContext().getRequest();     
          HttpSession imgsession=req.getSession(false);
              imgsession.setAttribute("aucid", aid);
          return "auctionimage.xhtml";
      }
      
   public String startForAuction()
   {
           HttpServletRequest req = (HttpServletRequest)FacesContext.getCurrentInstance().getExternalContext().getRequest();     
          HttpSession usersession=req.getSession(false);
       
    if(usersession.getAttribute("usersession")!=null)
        {
            return "/user/currentauction.xhtml?faces-redirect=true";
        }
    else{
         HttpSession pagession=req.getSession(false);
        pagession.removeAttribute("msgpagess");
          HttpSession pagession2=req.getSession(false);
          pagession2.removeAttribute("pagesession");
         HttpSession viewauction=req.getSession(false);
         viewauction.setAttribute("viewauction","/user/currentauction.xhtml?faces-redirect=true");
        return "/login.xhtml?faces-redirect=true";
      }
    }
     
}
