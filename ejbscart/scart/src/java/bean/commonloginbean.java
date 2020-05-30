/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import ejb.userbeanLocal;
import java.io.IOException;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 *
 * @author shailesh
 */
@ManagedBean
@RequestScoped
public class commonloginbean {
    @EJB(mappedName = "scart/userbean")
userbeanLocal ubl;

    /**
     * Creates a new instance of commonloginbean
     */
    private String username,password,msg;


public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
    public commonloginbean() {
    }
    public String dologin()
{
    try{
        msg="";
    HttpServletRequest rq=(HttpServletRequest)FacesContext.getCurrentInstance().getExternalContext().getRequest();
    rq.login(username, password);
        
        
    if(rq.isUserInRole("AdminRole"))
        return "/admin/adminhome?faces-redirect=true";
    else if(rq.isUserInRole("UserRole"))
      {
          HttpSession usersession=rq.getSession(false);
          usersession.setAttribute("usersession",username);
          HttpSession pageses=rq.getSession(false);
            HttpSession msgpage=rq.getSession(false);
           HttpSession viewauction=rq.getSession(false);
            if(pageses.getAttribute("pagesession")==null && msgpage.getAttribute("msgpagess")==null && viewauction.getAttribute("viewauction")==null)
                {
                    return "/user/userhome?faces-redirect=true";
                }
            else if(pageses.getAttribute("pagesession")!=null && msgpage.getAttribute("msgpagess")==null && viewauction.getAttribute("viewauction")==null )
                {
                    String page1=pageses.getAttribute("pagesession").toString();
                 return page1;
                }
             else if(msgpage.getAttribute("msgpagess")!=null && viewauction.getAttribute("viewauction")==null)
                {
                    
                      HttpSession tousersession=rq.getSession(false);
                     String touser= tousersession.getAttribute("touserss").toString();
                      HttpSession aidsession=rq.getSession(false);
                      int aid=Integer.parseInt(aidsession.getAttribute("aidss").toString());
                       Date d=new Date();
                        Format ft=new SimpleDateFormat("dd-MM-yyyy HH:mm");
                        String dt=ft.format(d);
               
                        ubl.addNewUserChat(username, touser,null, dt,aid);
                    String page2=msgpage.getAttribute("msgpagess").toString();
                 return page2;
                }
             else if(viewauction.getAttribute("viewauction")!=null)
             {
             String page3=viewauction.getAttribute("viewauction").toString();
             return page3;
             }
       }
        else{
    msg="invalid";
    return "/index";
    }
    }
    catch(Exception e)
    {
        msg="Error";
    }
    return null;
    }

public String dologout()throws IOException,ServletException
{
     HttpServletRequest rq=(HttpServletRequest)FacesContext.getCurrentInstance().getExternalContext().getRequest();
     rq.logout();
          HttpSession usersession=rq.getSession(false);
//           usersession.invalidate();
//           HttpSession pageses=rq.getSession(false);
//           pageses.invalidate();
//           pa
usersession.removeAttribute("pagesession");
rq.getSession().invalidate();
return "/index?faces-redirect=true";
}
}
