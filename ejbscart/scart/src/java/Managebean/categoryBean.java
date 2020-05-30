/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Managebean;

import ejb.AdminbeanService;
import entity.CategoryMaster;
import ejb.ScartbeanService;
import ejb.adminbeanLocal;
import ejb.scartbeanLocal;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
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
import javax.servlet.http.Part;
import javax.xml.ws.WebServiceRef;
import org.primefaces.event.FileUploadEvent;
import org.apache.commons.io.FilenameUtils;


/**
 *
 * @author shailesh
 */
@ManagedBean
@RequestScoped
public class categoryBean {
    @EJB(mappedName = "scart/scartbean")
      scartbeanLocal scartport;
   @EJB(mappedName = "scart/adminbean")
      adminbeanLocal adminport;
 
    
    /**
     * Creates a new instance of categoryBean
     */
    private String categoryName,cimgpath,childcatename,cateimg;
    Collection<CategoryMaster> allmastercategory;
    private int catid,childid;
    private String destination="E:\\study\\project\\scart\\web\\scartimage\\";
    private Part myfile;
 
    @PostConstruct
    public void init()
    {
      
     }

    public String getCateimg() {
        return cateimg;
    }

    public void setCateimg(String cateimg) {
        this.cateimg = cateimg;
    }

    public String getChildcatename() {
        return childcatename;
    }

    public void setChildcatename(String childcatename) {
        this.childcatename = childcatename;
    }

    public int getCatid() {
        return catid;
    }

    public void setCatid(int catid) {
        this.catid = catid;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
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

    public int getChildid() {
        return childid;
    }

    public void setChildid(int childid) {
        this.childid = childid;
    }
    
    public categoryBean() {
   
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
               cimgpath=fileName;
              HttpSession   imgsession=req.getSession(false);
              imgsession.setAttribute("imgss", cimgpath);

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

 
    public void  uploadmyimage() throws IOException
   {
         Date d=new Date();
            Format ft=new SimpleDateFormat("dd-MM-yyyy HH:mm");
            String dt=ft.format(d);
          
        Part uploadedFile = getMyfile();
       
        
        //MakeUploadPath
        final java.nio.file.Path newdestination = Paths.get("M:/ejbscart/scart/web/scartimage/"+ FilenameUtils.getName(uploadedFile.getSubmittedFileName()));
        InputStream bytes=null;
        if (null!=uploadedFile) {
            bytes = uploadedFile.getInputStream();  //
            //Copies bytes to destination.
            Files.copy(bytes, newdestination);
            
            String Imagename=null;
            Imagename=FilenameUtils.getName(uploadedFile.getSubmittedFileName());
              HttpServletRequest req = (HttpServletRequest)FacesContext.getCurrentInstance().getExternalContext().getRequest();     
        HttpSession   imgsession=req.getSession(false);
            imgsession.setAttribute("adminimages", Imagename);
            
       //adminservice.Admin port = service.getAdminPort();
       //port.eventCategoryUpd(event_category_id, event_name, event_detail, Imagename);
        }
       
   }
 
    public Collection<CategoryMaster> getAllmastercategory() {
      allmastercategory=scartport.showAllCategory();
        return allmastercategory;
    }
    
    public String addCategory()
    {         
      try{
          uploadmyimage();
             }
        catch(Exception e)
        {
            }
        HttpServletRequest req = (HttpServletRequest)FacesContext.getCurrentInstance().getExternalContext().getRequest();     
        HttpSession   imgsession=req.getSession(false);
        String img1=imgsession.getAttribute("adminimages").toString();
       
        adminport.addNewCategory(categoryName,img1);
       return null;
    }
   
    public String deleteCategory(int id)
    {
        adminport.removeCategory(id);
        return null;
    }
     public String setcategoryvalue(int cid,String cname)
     {
        this.catid=cid;
        this.categoryName=cname;
        return "/admin/editmcategory.xhtml";
    }
     
   public String doupdatemastercategory()
    {   try{
              uploadmyimage();
            }
        catch(Exception e)
        {
            }
            HttpServletRequest req = (HttpServletRequest)FacesContext.getCurrentInstance().getExternalContext().getRequest();     
        HttpSession   imgsession=req.getSession(false);
        String img1=imgsession.getAttribute("adminimages").toString();
       adminport.editCategory(catid,categoryName, img1);
   return "/admin/mastercategory?faces-redirect=true";
   }
  
   public String addchildcategory()
   {
        try{
          uploadmyimage();
         }
      catch(Exception e)
      {
        }
            HttpServletRequest req = (HttpServletRequest)FacesContext.getCurrentInstance().getExternalContext().getRequest();     
        HttpSession   imgsession=req.getSession(false);
        String img1=imgsession.getAttribute("adminimages").toString();
    adminport.addNewChildCategory(catid, childcatename, img1);
    return null;
   }
   
    public String deleteChildCategory(int cid,int mid)
    {
        adminport.removeChildCategory(cid,mid);
        return null;
      }
    public String SetValueOfChildCate(int ccid,String ccname,int cid)
    {
        this.childid=ccid;
        this.childcatename=ccname;
        this.catid=cid;
    return "/admin/editchildcategory.xhtml";
    }
   public String doupdateChildCategory()
   {   try{
          uploadmyimage();
         }
      catch(Exception e)
      {
        }
            HttpServletRequest req = (HttpServletRequest)FacesContext.getCurrentInstance().getExternalContext().getRequest();     
        HttpSession   imgsession=req.getSession(false);
        String img1=imgsession.getAttribute("adminimages").toString();
       adminport.editChildCategory(childid, catid, childcatename, img1);
   return "/admin/childcategory.xhtml?faces-redirect=true";
   }
  
}
