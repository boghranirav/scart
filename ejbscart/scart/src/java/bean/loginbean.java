/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.io.IOException;
import javax.inject.Named;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author shailesh
 */
@Named(value = "loginbean")
@RequestScoped
public class loginbean {
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

    /**
     * Creates a new instance of loginbean
     */
    public void setMsg(String msg) {
        this.msg = msg;
    }
    public loginbean() {
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
        return "/user/userhome";
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
return "/index";
}
}
