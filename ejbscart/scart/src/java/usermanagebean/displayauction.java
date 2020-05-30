/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usermanagebean;

import entity.AuctionDetails;
import entity.BidActivity;

import ejb.scartbeanLocal;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.xml.ws.WebServiceRef;

/**
 *
 * @author NIR
 */
@Named(value = "displayauction")
@RequestScoped
public class displayauction {

   // ejb.Scartbean sport ;
    @EJB(mappedName = "scart/scartbean")
     scartbeanLocal scartport;       

    int cbid;
    private String curdate;
    ArrayList alcol=null;
     Collection<BidActivity> bactivity;
  //  @WebServiceRef(wsdlLocation = "http://localhost:8080/scartbeanService/scartbean")
  //  private ScartbeanService service;
  //  ejb.Scartbean scartport;

    /**
     * Creates a new instance of displayauction
     */
    
    
    
    public displayauction() {
    }

    public void init(){
   //     sport= service.getScartbeanPort();
      //  scartport = service.getScartbeanPort();
       Format ft=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            Date d=new Date();
            this.curdate = ft.format(d);
        
    }

    
    public ArrayList getAlcol() {

        alcol=new ArrayList();
        Collection<AuctionDetails> adc=scartport.showAllAuctionDetail();
        Format ft=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
       
        for(AuctionDetails ad:adc){
            
            Date d=new Date();
            String dbdate=ad.getCloseTime();
            String dbdatest=ad.getStartTime();
            
            if((dbdatest.compareTo(ft.format(d))<0) && (dbdate.compareTo(ft.format(d))>0)){
            bactivity = null;
            this.cbid = 0;
            bactivity=scartport.showBidActivity(ad.getAuctionId());
            for(BidActivity ba:bactivity){
                {
                    this.cbid=ba.getAmount();
                    break;
                }
            }
            auctioncollection a=new auctioncollection(ad.getAuctionId(),ad.getStartingBid(), ad.getStartTime(), ad.getCloseTime(), ad.getProductTitle(), ad.getDescription(),cbid);
            alcol.add(a);
            
        }
        }
        return alcol;
    }
    
    public ArrayList getPastAlcol() {
      
        alcol=new ArrayList();
        Collection<AuctionDetails> adc=scartport.showAllAuctionDetail();
        Format ft=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
       
        for(AuctionDetails ad:adc){
            
            Date d=new Date();
            String dbdate=ad.getCloseTime();
            String dbdatest=ad.getStartTime();
            
            if(dbdate.compareTo(ft.format(d))<0){
            bactivity = null;
            this.cbid = 0;
             bactivity=scartport.showBidActivity(ad.getAuctionId());
            for(BidActivity ba:bactivity){
                    this.cbid=ba.getAmount();
                
              break;
                
            }
            auctioncollection a=new auctioncollection(ad.getAuctionId(),ad.getStartingBid(), ad.getStartTime(), ad.getCloseTime(), ad.getProductTitle(), ad.getDescription(),cbid);
            alcol.add(a);
            
        }
        }
        return alcol;
    }
    
    public ArrayList getUpcomingAlcol() {
        
        alcol=new ArrayList();
        Collection<AuctionDetails> adc=scartport.showAllAuctionDetail();
        Format ft=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
       
        for(AuctionDetails ad:adc){
            
            Date d=new Date();
            String dbdate=ad.getCloseTime();
            String dbdatest=ad.getStartTime();
            
            if(dbdatest.compareTo(ft.format(d))>0){
            auctioncollection a=new auctioncollection(ad.getAuctionId(),ad.getStartingBid(), ad.getStartTime(), ad.getCloseTime(), ad.getProductTitle(), ad.getDescription(),cbid);
            alcol.add(a);
            
        }
        }
        return alcol;
    }
    
//    public java.util.List<ejb.AuctionDetails> showAllAuctionDetail() {
//        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
//        // If the calling of port operations may lead to race condition some synchronization is required.
//        ejb.Scartbean port = service.getScartbeanPort();
//        return port.showAllAuctionDetail();
//    }

    public String getCurdate() {
        return curdate;
    }

    public void setCurdate(String curdate) {
        this.curdate = curdate;
    }

    public int getCbid() {
        return cbid;
    }

    public void setCbid(int cbid) {
        this.cbid = cbid;
    }

    public Collection<BidActivity> getBactivity() {
        return bactivity;
    }

    public void setBactivity(Collection<BidActivity> bactivity) {
        this.bactivity = bactivity;
    }
   
    
}
