/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb;

import entity.AdTable;
import entity.BrandList;
import entity.CategoryMaster;
import entity.ChildCategory;
import entity.FieldCategoryRelation;
import entity.FieldsDetails;
import entity.UserTable;
import java.util.Collection;
import javax.ejb.Stateless;
import javax.jws.WebService;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author shailesh
 */

@Stateless(mappedName = "scart/adminbean")
public class adminbean implements adminbeanLocal {

    @PersistenceContext(unitName = "scartejbPU")
    private EntityManager em;

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    
   @Override
    public void removeUser(String uname) {
      UserTable ut=em.find(UserTable.class, uname);
      em.remove(ut);
    }
        
    @Override
    public Collection<UserTable> showAllUser() {
    return em.createNamedQuery("UserTable.findByName").setParameter("username","admin").getResultList();
    }


    @Override
    public void addNewCategory(String cname, String cimage) {
    CategoryMaster cm=new CategoryMaster();
  cm.setCategoryName(cname);
  cm.setCategoryImg(cimage);
  em.persist(cm);
    }

    @Override
    public void removeCategory(int cid) {
    CategoryMaster cm=em.find(CategoryMaster.class, cid);
    em.remove(cm);
    }

    @Override
    public void editCategory(int cid, String cname, String cimage) {
  CategoryMaster cm=em.find(CategoryMaster.class, cid);
    cm.setCategoryName(cname);
    cm.setCategoryImg(cimage);
    em.merge(cm);
    }    

    @Override
    public void addNewChildCategory(int cmasterid, String childcate_name,String childimage) {
        CategoryMaster cm=em.find(CategoryMaster.class, cmasterid);
        ChildCategory cc=new ChildCategory();
       Collection<ChildCategory> c=cm.getChildCategoryCollection();
        
        
        cc.setChildCategoryName(childcate_name);
        c.add(cc);
        cc.setCategoryId(cm);
        cm.setChildCategoryCollection(c);
        cc.setChildImage(childimage);
        em.persist(cc);
        em.merge(cm);
    }

    @Override
    public void editChildCategory(int childcateid, int cmasterid, String childcate_name,String childimage) {
      CategoryMaster cm=em.find(CategoryMaster.class, cmasterid);
        ChildCategory cc=em.find(ChildCategory.class, childcateid);
        Collection<ChildCategory> c=cm.getChildCategoryCollection();
        
        
        cc.setChildCategoryName(childcate_name);
        c.add(cc);
        cc.setCategoryId(cm);
        cm.setChildCategoryCollection(c);
        cc.setChildImage(childimage);
        em.merge(cc);
        em.merge(cm);
    }

    @Override
    public void removeChildCategory(int childcateid,int mcid) {
    ChildCategory cc=em.find(ChildCategory.class, childcateid);
    CategoryMaster cm=em.find(CategoryMaster.class, mcid);
    Collection<ChildCategory> Childcats=cm.getChildCategoryCollection();
    if(Childcats.contains(cc))
    {
        Childcats.remove(cc);
        cm.setChildCategoryCollection(Childcats);
    em.remove(cc);
    em.merge(cm);
    }
    
    }


    @Override
    public void addNewBrand(String brandname, int childcateid) {
     BrandList bl=new BrandList();
     bl.setBrandName(brandname);
     ChildCategory cc=em.find(ChildCategory.class, childcateid);
     Collection<BrandList> b=cc.getBrandListCollection();
     b.add(bl);
     bl.setChildCategoryId(cc);
     cc.setBrandListCollection(b);
     em.persist(bl);
     em.merge(cc);
    }

    @Override
    public void editBrand(int brandid, String brandname, int childcateid) {
      BrandList bl=em.find(BrandList.class, brandid);
     bl.setBrandName(brandname);
     ChildCategory cc=em.find(ChildCategory.class, childcateid);
     Collection<BrandList> b=cc.getBrandListCollection();
     b.add(bl);
     bl.setChildCategoryId(cc);
     cc.setBrandListCollection(b);
     em.merge(bl);
     em.merge(cc);
    }

    @Override
    public void removeBrand(int brandid,int ccid) {
    ChildCategory cc=em.find(ChildCategory.class, ccid);
    Collection<BrandList> brands=cc.getBrandListCollection();
    BrandList bl=em.find(BrandList.class, brandid);
   if(brands.contains(bl))
   {
   brands.remove(bl);
   cc.setBrandListCollection(brands);
   em.remove(bl);
   em.merge(cc);
   }
   
    }

    @Override
    public Collection<BrandList> showAllBrand() {
        return em.createNamedQuery("BrandList.findAll").getResultList();
    }

   

    @Override
    public void addNewFields(String ftitle, String ftype, String fcontrol) {
    FieldsDetails fd=new FieldsDetails();
    fd.setFieldTitle(ftitle);
    fd.setFieldType(ftype);
    fd.setFieldControl(fcontrol);
    em.persist(fd);
    }

    @Override
    public void removeFields(int fid) {
        FieldsDetails fd=em.find(FieldsDetails.class, fid);
        em.remove(fd);
    }

    @Override
    public Collection<FieldsDetails> showAllFields() {
  return em.createNamedQuery("FieldsDetails.findAll").getResultList();
    }

    @Override
    public void addFieldtoCategory(int childcateid, int fid) {
      FieldCategoryRelation fcr=new FieldCategoryRelation();
      ChildCategory cc=em.find(ChildCategory.class, childcateid);
    Collection<FieldCategoryRelation> fcollection=cc.getFieldCategoryRelationCollection();
      FieldsDetails fd=em.find(FieldsDetails.class, fid);
      Collection<FieldCategoryRelation> fcollection2=fd.getFieldCategoryRelationCollection();
      fcollection.add(fcr);
      fcr.setChildCategoryId(cc);
      cc.setFieldCategoryRelationCollection(fcollection);
      fcollection2.add(fcr);
      fcr.setFieldId(fd);
      fd.setFieldCategoryRelationCollection(fcollection2);
      em.persist(fcr);
      em.merge(cc);
      em.merge(fd);
    }

    @Override
    public void removeFieldFromCategory(int fdid) {
      FieldCategoryRelation fcr=em.find(FieldCategoryRelation.class,fdid);
      em.remove(fcr);
    }

    @Override
    public Collection<FieldCategoryRelation> showFiledToCategory() {
      return em.createNamedQuery("FieldCategoryRelation.findAll").getResultList();
    }

    @Override
    public void setVisibilityToAd(int aid, String status) {
        AdTable ad=em.find(AdTable.class, aid);
        ad.setStatus(status);
        em.merge(ad);
    }

    @Override
    public void setVisibilityToUser(String uname, String ustatus) {
     UserTable ut=em.find(UserTable.class, uname);
     ut.setUserStatus(ustatus);
     em.merge(ut);
    }

    public void persist(Object object) {
        em.persist(object);
    }

}
