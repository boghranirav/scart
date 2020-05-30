/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Managebean;

import ejb.AdminbeanService;
import ejb.adminbeanLocal;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.inject.Named;
import javax.faces.bean.RequestScoped;
import javax.xml.ws.WebServiceRef;


/**
 *
 * @author shailesh
 */
@ManagedBean
@RequestScoped
public class brandbean {
      @EJB(mappedName = "scart/adminbean")
      adminbeanLocal adminport;

    /**
     * Creates a new instance of brandbean
     */
    
    private String brandname;
    private int childid,brandid;
    public brandbean() {
    }
    @PostConstruct
    public void init()
    {

    }

    public int getBrandid() {
        return brandid;
    }

    public void setBrandid(int brandid) {
        this.brandid = brandid;
    }

    public String getBrandname() {
        return brandname;
    }

    public void setBrandname(String brandname) {
        this.brandname = brandname;
    }

    public int getChildid() {
        return childid;
    }

    public void setChildid(int childid) {
        this.childid = childid;
    }

    public String addbrand()
    {
        adminport.addNewBrand(brandname, childid);
        return null;
      }
    public String deletebrand(int bid ,int ccid)
    {
        adminport.removeBrand(bid,ccid);
        return null;
      }
    public String  setValueOfBrand(int bid,String bname,int cid)
    {
        this.brandid=bid;
        this.brandname=bname;
        this.childid=cid;
    return "/admin/editbrandlist.xhtml";
    }
    
    public String doUpdateBrandList()
    {
       adminport.editBrand(brandid, brandname, childid);
        return "/admin/brandlist?faces-redirect=true";
    }

 
          
}
