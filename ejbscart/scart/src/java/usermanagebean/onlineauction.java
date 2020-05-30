/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usermanagebean;

import entity.AuctionDetails;
import entity.AuctionImages;
import entity.AuctionUserDetail;
import entity.BidActivity;

import entity.UserTable;

import ejb.scartbeanLocal;
import ejb.userbeanLocal;
import java.io.Serializable;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.primefaces.push.EventBus;
import org.primefaces.push.EventBusFactory;

/**
 *
 * @author NIR
 */
@ManagedBean
@ApplicationScoped
public class onlineauction implements Serializable{
@EJB(mappedName = "scart/scartbean")
    scartbeanLocal scartport;
    @EJB(mappedName = "scart/userbean")
    userbeanLocal userport;
    
    /**
     * Creates a new instance of onlineauction
     */
    
    private String startdate,closedate,btitle,bpcondition,bdispetchtime,bdesc,brpolicy,bsellerdesc,uname,aimages,fullname,location,uemail,bstatus;
    private int auctionid,bsbid,bpquantity,auctionuserid,bamount;
    private int pauctionid;
    private volatile int userbid;
    public onlineauction() {
        
    }
    
    @PostConstruct
    public void init(){
      
         
        
    }
    
   
    
    public String addNewBid(){
        HttpServletRequest rq=(HttpServletRequest)FacesContext.getCurrentInstance().getExternalContext().getRequest();
     HttpSession session=rq.getSession(false);
       
        String buname=session.getAttribute("usersession").toString();
        
         Date d=new Date();
        Format ft=new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        String dt=ft.format(d);
        userport.addBidActivity(buname, pauctionid, this.userbid, dt);
       
        Collection<BidActivity> bactivity=scartport.showBidActivity(pauctionid);
        if(bactivity.isEmpty()){
                      this.userbid=(int) (bsbid+(bsbid*0.01));
        }
        else{
            for(BidActivity ba:bactivity){
                  this.bamount=ba.getAmount();
                  int a=(int) (ba.getAmount()*0.01);
                  this.userbid=ba.getAmount()+a;
                  break;
            }
        }
       return null; 
    }
    
    public String sshowAuctionImage(){
        Collection<AuctionImages> ai= scartport.showSingleAuctionImage(pauctionid);
        String ip;
        for(AuctionImages a:ai){
            ip = a.getAuctionImagePath();
            return ip;
        }
        return null;
    }
    
      public String goToproductauction(int id){
           
         this.pauctionid=id;
         
         Collection<AuctionDetails> adetail= scartport.showAuctionByAID(pauctionid);
        
        for(AuctionDetails ad : adetail){
            this.btitle=ad.getProductTitle();
            this.bsbid=ad.getStartingBid();
            this.bdesc=ad.getDescription();
            this.bpcondition=ad.getProductCondition();
            this.bdispetchtime=ad.getDispatchTime();
            this.bpquantity=ad.getProductQuantity();
            this.uname=ad.getUsername().getUsername();
            
            
            Format ft=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            Date d=new Date();
            
            String dbdate=ad.getCloseTime();
            String dbdatest=ad.getStartTime();
            
            if((dbdatest.compareTo(ft.format(d))<0) && (dbdate.compareTo(ft.format(d))>0)){
                this.startdate="Start Date : "+ad.getStartTime()+"|";
                this.closedate="Close Date : "+ad.getCloseTime();
            }
            else
                if(dbdatest.compareTo(ft.format(d))>0){
                    this.startdate="Auction For This Item Is Not Started. It starts from "+ad.getStartTime()+" to "+ad.getCloseTime();
                    this.closedate=null;
                }
                else
                    if(dbdate.compareTo(ft.format(d))<0){
                        this.startdate="Auction For This Item was Closed on "+ad.getCloseTime();
                        this.closedate=null;
                    }
           
            //this.startdate=ad.getStartTime();
            //this.closedate=ad.getCloseTime();
            
            this.fullname=ad.getUsername().getFirstname()+" "+ad.getUsername().getLastname();
            this.location = ad.getUsername().getCityId().getCityName()+","+ad.getUsername().getStateId().getStateName();
            this.uemail= ad.getUsername().getEmailId();
            
            
        }
        
        Collection<AuctionUserDetail> audetail=scartport.showUserAuctionDetail(pauctionid);
        
        
        for(AuctionUserDetail aud : audetail){
            this.brpolicy = aud.getReturnPolicy();
            this.bsellerdesc=aud.getSellerDescription();
          
        }
        
        Collection<UserTable> usert=userport.showUserDetails(uname);
        for (UserTable ut : usert){
            this.uname=ut.getUsername();
        }
       
        Collection<BidActivity> bactivity=scartport.showBidActivity(pauctionid);
        if(bactivity.isEmpty()){
                      this.userbid=(int) (bsbid+(bsbid*0.01));
                      this.bamount=0;
        }
        else{
            for(BidActivity ba:bactivity){
                  this.bamount=ba.getAmount();
                  int a=(int) (ba.getAmount()*0.01);
                  this.userbid=ba.getAmount()+a;
                  break;
            }
        }
        return "/user/productauction.xhtml?faces-redirect=true";
    //  return null;
    }
   
    
    public Collection<AuctionImages> showAuctionImages(){
        return scartport.showAuctionImage(pauctionid);
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
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

    public int getAuctionid() {
        return auctionid;
    }

    public void setAuctionid(int auctionid) {
        this.auctionid = auctionid;
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

    public int getAuctionuserid() {
        return auctionuserid;
    }

    public void setAuctionuserid(int auctionuserid) {
        this.auctionuserid = auctionuserid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getAimages() {
        return aimages;
    }

    public void setAimages(String aimages) {
        this.aimages = aimages;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getUemail() {
        return uemail;
    }

    public void setUemail(String uemail) {
        this.uemail = uemail;
    }

    public int getBamount() {
        return bamount;
    }

    public void setBamount(int bamount) {
        this.bamount = bamount;
    }

    public String getBstatus() {
        return bstatus;
    }

    public void setBstatus(String bstatus) {
        this.bstatus = bstatus;
    }

    public int getUserbid() {
        return userbid;
    }

    public void setUserbid(int userbid) {
        this.userbid = userbid;
    }

    public int getPauctionid() {
        return pauctionid;
    }

    public void setPauctionid(int pauctionid) {
        this.pauctionid = pauctionid;
    }

    
}
