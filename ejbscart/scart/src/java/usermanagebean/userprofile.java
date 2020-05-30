/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usermanagebean;

import entity.UserTable;
import ejb.scartbeanLocal;
import ejb.userbeanLocal;
import entity.CityTable;
import java.util.Collection;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.faces.bean.SessionScoped;


import javax.faces.context.FacesContext;
import javax.faces.event.ValueChangeEvent;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;


/**
 *
 * @author shailesh
 */
@Named(value = "userprofile")
@RequestScoped
public class userprofile {
   @EJB(mappedName = "scart/userbean")
userbeanLocal userport;
    @EJB(mappedName = "scart/scartbean")
    scartbeanLocal scartport;
    /**
     * Creates a new instance of userprofile
     */
    private String username,firstname,lastname,password,repass,email_id,phone,address,mstatus;
    private int pincode,cityid,stateid,countryid;
    Collection<UserTable> userCollection;
    Collection<CityTable> CityEdit;
     @PostConstruct
     public void init()
    {
       
       HttpServletRequest rq=(HttpServletRequest)FacesContext.getCurrentInstance().getExternalContext().getRequest();
     HttpSession session=rq.getSession(false);
       
        String uname=session.getAttribute("usersession").toString();
       Collection<UserTable> users=userport.showUserDetails(uname);
     for(UserTable u:users)
       {
           this.username=u.getUsername();
         
              this.firstname=u.getFirstname();
                this.lastname=u.getLastname();
           this.password=u.getPassword();
           this.email_id=u.getEmailId();
           this.phone=u.getPhone();
           if(u.getAddress()=="")
            {
               this.address="-";
            }else{
             this.address=u.getAddress();
            }
           if(u.getPincode()==null){
           this.pincode=0;
           }else{
           this.pincode=u.getPincode();
           }
           this.cityid=u.getCityId().getCityId();
           this.stateid=u.getStateId().getStateId();
//           this.mstatus=u.getMobilestatus();
       }
    }
    
    public userprofile() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRepass() {
        return repass;
    }

    public void setRepass(String repass) {
        this.repass = repass;
    }

    public String getEmail_id() {
        return email_id;
    }

    public void setEmail_id(String email_id) {
        this.email_id = email_id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMstatus() {
        return mstatus;
    }

    public void setMstatus(String mstatus) {
        this.mstatus = mstatus;
    }

    public int getPincode() {
        return pincode;
    }

    public void setPincode(int pincode) {
        this.pincode = pincode;
    }

    public int getCityid() {
        return cityid;
    }

    public void setCityid(int cityid) {
        this.cityid = cityid;
    }

    public int getStateid() {
        return stateid;
    }

    public void setStateid(int stateid) {
        this.stateid = stateid;
    }

    public int getCountryid() {
        return countryid;
    }

    public void setCountryid(int countryid) {
        this.countryid = countryid;
    }
  
    public Collection<UserTable> getUserCollection(){
       HttpServletRequest rq=(HttpServletRequest)FacesContext.getCurrentInstance().getExternalContext().getRequest();
     HttpSession session=rq.getSession(false);
       
        String uname=session.getAttribute("usersession").toString();
       userCollection=userport.showUserDetails(uname);
        return userCollection;
    }
   public String updateprofile()
        { HttpServletRequest rq=(HttpServletRequest)FacesContext.getCurrentInstance().getExternalContext().getRequest();
             HttpSession session=rq.getSession(false);

                String uname=session.getAttribute("usersession").toString();

            userport.maintainProfile(uname, firstname,lastname, email_id, phone, address, pincode, cityid, stateid,"show");
        return"/user/userhome.xhtml?faces-redirect=true";
        }


 

    public Collection<CityTable> getCityEdit() {
      if(stateid==0)
        {
        return CityEdit=scartport.showAllCity();
        }else{
          return CityEdit = scartport.showAllCityByStateId(stateid);
        }
       
    }
     
}
