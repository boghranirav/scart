/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb;

import entity.BrandList;
import entity.CategoryMaster;
import entity.ChildCategory;
import entity.FieldCategoryRelation;
import entity.FieldsDetails;
import entity.UserTable;
import java.util.Collection;
import java.util.Date;
import javax.ejb.Local;

/**
 *
 * @author shailesh
 */
@Local
public interface adminbeanLocal {
    
     void removeUser(String uname);
     Collection<UserTable> showAllUser();
     void addNewCategory(String cname,String cimage);
     void removeCategory(int cid);
     void editCategory(int cid,String cname,String cimage);
  
   
   void addNewChildCategory(int cmasterid,String childcate_name,String childimage);
   void editChildCategory(int childcateid,int cmasterid,String childcate_name,String childimage);
   void removeChildCategory(int childcateid,int mccid);
   
   void addNewBrand(String brandname,int childcateid);
   void editBrand(int brandid,String brandname,int childcateid);
   void removeBrand(int brandid,int ccid);
   Collection<BrandList> showAllBrand();
   
   
    void addNewFields(String ftitle,String ftype,String fcontrol);
    void removeFields(int fid);
    Collection<FieldsDetails> showAllFields();
    
    void addFieldtoCategory(int childcateid,int fid);
    void removeFieldFromCategory(int fdid);
    Collection<FieldCategoryRelation> showFiledToCategory();
   
    void setVisibilityToAd(int aid,String status); 
  void setVisibilityToUser(String uname,String ustatus);

  
}
