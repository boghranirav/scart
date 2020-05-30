/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usermanagebean;

/**
 *
 * @author NIR
 */
public class auctioncollection {
    
    String sdate,cdate,btitle,imgsrc,bdis;
    int bamount,aid,curbid;

    public auctioncollection(){}
    
    public auctioncollection(int aid,int bamount, String sdate,String cdate,String btitle,String bdis,int curbid) {
        this.aid=aid;
        this.bamount=bamount;
        this.sdate=sdate;
        this.cdate=cdate;
        this.btitle=btitle;
        this.bdis=bdis;
        this.curbid=curbid;
        
    }
    
    public String getSdate() {
        return sdate;
    }

    public void setSdate(String sdate) {
        this.sdate = sdate;
    }

    public String getCdate() {
        return cdate;
    }

    public void setCdate(String cdate) {
        this.cdate = cdate;
    }

    public String getBtitle() {
        return btitle;
    }

    public void setBtitle(String btitle) {
        this.btitle = btitle;
    }

    public String getImgsrc() {
        return imgsrc;
    }

    public void setImgsrc(String imgsrc) {
        this.imgsrc = imgsrc;
    }

    public String getBdis() {
        return bdis;
    }

    public void setBdis(String bdis) {
        this.bdis = bdis;
    }

    public int getBamount() {
        return bamount;
    }

    public void setBamount(int bamount) {
        this.bamount = bamount;
    }

    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public int getCurbid() {
        return curbid;
    }

    public void setCurbid(int curbid) {
        this.curbid = curbid;
    }
    
    
}
