/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usermanagebean;

import entity.AdDetails;
import entity.AdTable;
import entity.CityTable;
import entity.CountryTable;
import ejb.scartbeanLocal;
import entity.StateTable;

import ejb.userbeanLocal;
import entity.UserChat;
import entity.UserTable;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ValueChangeEvent;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;


/**
 *
 * @author shailesh
 */
@ManagedBean
@RequestScoped
public class userbean {
@EJB(mappedName = "scart/userbean")
userbeanLocal ubl;
@EJB(mappedName = "scart/scartbean")
scartbeanLocal scartport;
    /**
     * Creates a new instance of userbean
     */
    private String username,firstname,lastname,password,repass,email_id,phone,address,mstatus;
    private int pincode,cityid,stateid,countryid;
  Collection<UserTable> UserData;
    Collection<CountryTable> allcountry;
   Collection<StateTable> allstate;
   Collection<CityTable> allcity;

   private String slmsg;
   
   public userbean() {
    }
     
    @PostConstruct
    public void init()
    {
         
       
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

    public String getMstatus() {
        return mstatus;
    }

    public void setMstatus(String mstatus) {
        this.mstatus = mstatus;
    }

    public Collection<StateTable> getAllstate() {
        allstate=scartport.showAllStateByCountryId(1);
        return allstate;
    }

    public void setAllstate(Collection<StateTable> allstate) {
        
        this.allstate = allstate;
    }

    public Collection<CityTable> getAllcity() {
        if(stateid==0)
        {
        return allcity=scartport.showAllCity();
        }else{
             allcity=scartport.showAllCityByStateId(stateid);
        }
        return allcity;
    }

    public void setAllcity(Collection<CityTable> allcity) {
        this.allcity = allcity;
    }

    public int getCountryid() {
        return countryid;
    }

    public void setCountryid(int countryid) {
        this.countryid = countryid;
    }
 
    public Collection<CountryTable> getAllcountry() {
        allcountry=scartport.showAllCountry();
        return allcountry;
    }
    public void showstate(ValueChangeEvent e)
    {
        int countid=Integer.parseInt(e.getNewValue().toString());
    allstate=scartport.showAllStateByCountryId(countid);
    }
    
    public void showcity(ValueChangeEvent e)
    {
              int stsid=Integer.parseInt(e.getNewValue().toString());
     allcity=scartport.showAllCityByStateId(stsid);
     }
    
    public Collection<UserTable> getUserData() {
      HttpServletRequest rq=(HttpServletRequest)FacesContext.getCurrentInstance().getExternalContext().getRequest();
     HttpSession session=rq.getSession(false);
       
        String uname=session.getAttribute("usersession").toString();
       UserData=ubl.showUserDetails(uname);
     for(UserTable u:UserData)
       {
           this.username=u.getUsername();
           if(u.getFirstname()==null)
            {
              this.firstname="-";
            }else{
              this.firstname=u.getFirstname();
            }
           if(u.getLastname()==null)
            {
                this.lastname="-";
             }else{
                this.lastname=u.getLastname();
           }
           this.password=u.getPassword();
           this.email_id=u.getEmailId();
           this.phone=u.getPhone();
           if(u.getAddress()==null)
            {
               this.address="-";
            }else{
             this.address=u.getAddress();
            }
//           if(u.getPincode()==null)
//            {
//                this.pincode=0;
//            }else{
//              this.pincode=u.getPincode();
//            }
//           if(u.getMobilestatus()==null)
//           {
//              this.mstatus="-";
//           }else{
//              this.mstatus=u.getMobilestatus();
//           }
//           if(u.getCityId().getCityId()==null)
//           {
//              this.cityid=0;
//           }else{
//              this.cityid=u.getCityId().getCityId();
//           }
//           if(u.getStateId().getStateId()==null)
//           {
//               this.stateid=0;
//           }else{
//             this.stateid=u.getStateId().getStateId();
//           }
      
        }
        return UserData;
    }
  
        public String registration()
        {
            if(username!=null && firstname!=null && lastname!=null && password!=null && email_id!=null && phone!=null && address!=null && pincode!=0 && cityid!=0 && stateid!=0)
            {
            Date d=new Date();
            Format ft=new SimpleDateFormat("dd-MM-yyyy HH:mm");
            String dt=ft.format(d);

        ubl.registration(username,firstname, lastname,password, email_id, phone, address, pincode, cityid, stateid,"show", dt);
        return "/login.xhtml?faces-redirect=true";
            }else{
            return null;
            }
        }

//        public String updateprofile()
//        { HttpServletRequest rq=(HttpServletRequest)FacesContext.getCurrentInstance().getExternalContext().getRequest();
//             HttpSession session=rq.getSession(false);
//
//                String uname=session.getAttribute("usersession").toString();
//
//            ubl.maintainProfile(uname, firstname,lastname, email_id, phone, address, pincode, cityid, stateid,mstatus);
//        return"/user/userhome.xhtml?faces-redirect=true";
//        }


    public Collection<AdTable> showMyAd()
    {
          HttpServletRequest rq=(HttpServletRequest)FacesContext.getCurrentInstance().getExternalContext().getRequest();
             HttpSession session=rq.getSession(false);

                String uname=session.getAttribute("usersession").toString();
        Collection<AdTable> ads=scartport.showUserWiseAd(uname);
    return scartport.showUserWiseAd(uname);
    }
    public Collection<AdDetails> viewMyAdDetails(int aid)
      {
      return scartport.showSingleAddetails(aid);
      }
    
    public String removeMyAd(int aid,int ctid)
    {
          HttpServletRequest rq=(HttpServletRequest)FacesContext.getCurrentInstance().getExternalContext().getRequest();
             HttpSession session=rq.getSession(false);

                String uname=session.getAttribute("usersession").toString();
    ubl.removeAd(aid, uname, ctid);
return null;
    }

    public String getSlmsg() {
        return slmsg;
    }

    public void setSlmsg(String slmsg) {
        this.slmsg = slmsg;
    }
    
    
    
    public String sendMsgToSeller(String touname,int aid)
   {
       HttpServletRequest rq=(HttpServletRequest)FacesContext.getCurrentInstance().getExternalContext().getRequest();
     HttpSession session=rq.getSession(false);
           Date d=new Date();
            Format ft=new SimpleDateFormat("dd-MM-yyyy HH:mm");
           String dt=ft.format(d);
//       
    if(session.getAttribute("usersession")!=null)
        {
             String fromuname=session.getAttribute("usersession").toString();
         ubl.addNewUserChat(fromuname, touname,null, dt, aid);
         return "/user/mymsgsend?faces-redirect=true";
        }
    else if(session.getAttribute("usersession")==null){
        HttpSession pagession=rq.getSession(false);
        pagession.removeAttribute("pagesession");
           HttpSession pagession2=rq.getSession(false);
          pagession2.removeAttribute("viewauction");
          HttpSession msgsession=rq.getSession(false);
//          msgsession.setAttribute("msgss", slmsg);
          HttpSession tousersession=rq.getSession(false);
          tousersession.setAttribute("touserss", touname);
          HttpSession aidsession=rq.getSession(false);
          aidsession.setAttribute("aidss", aid);
          HttpSession msgpage=rq.getSession(false);
          msgpage.setAttribute("msgpagess","/user/mymsgsend?faces-redirect=true");
          return "/login?faces-redirect=true";
    }
   return null;
   }
    public Collection<UserChat> showMymsg()
    {
        HttpServletRequest rq=(HttpServletRequest)FacesContext.getCurrentInstance().getExternalContext().getRequest();
     HttpSession session=rq.getSession(false);
     String uname=session.getAttribute("usersession").toString();
    return ubl.showUserChat(uname);
    }
    
    public Collection<UserChat> showSentMsg()
    {    HttpServletRequest rq=(HttpServletRequest)FacesContext.getCurrentInstance().getExternalContext().getRequest();
     HttpSession session=rq.getSession(false);
     String uname=session.getAttribute("usersession").toString();
    return ubl.showMySentMsg(uname);
    
    }
}
