
package ejb;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ejb package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _EditChildCategoryResponse_QNAME = new QName("http://ejb/", "editChildCategoryResponse");
    private final static QName _SetVisibilityToUser_QNAME = new QName("http://ejb/", "setVisibilityToUser");
    private final static QName _UserTable_QNAME = new QName("http://ejb/", "userTable");
    private final static QName _Persist_QNAME = new QName("http://ejb/", "persist");
    private final static QName _RemoveCategory_QNAME = new QName("http://ejb/", "removeCategory");
    private final static QName _ShowAllBrandResponse_QNAME = new QName("http://ejb/", "showAllBrandResponse");
    private final static QName _RemoveBrandResponse_QNAME = new QName("http://ejb/", "removeBrandResponse");
    private final static QName _ShowAllBrand_QNAME = new QName("http://ejb/", "showAllBrand");
    private final static QName _CityTable_QNAME = new QName("http://ejb/", "cityTable");
    private final static QName _BrandList_QNAME = new QName("http://ejb/", "brandList");
    private final static QName _ShowAllFieldsResponse_QNAME = new QName("http://ejb/", "showAllFieldsResponse");
    private final static QName _FieldCategoryRelation_QNAME = new QName("http://ejb/", "fieldCategoryRelation");
    private final static QName _EditCategory_QNAME = new QName("http://ejb/", "editCategory");
    private final static QName _AddFieldtoCategoryResponse_QNAME = new QName("http://ejb/", "addFieldtoCategoryResponse");
    private final static QName _SetVisibilityToAdResponse_QNAME = new QName("http://ejb/", "setVisibilityToAdResponse");
    private final static QName _StateTable_QNAME = new QName("http://ejb/", "stateTable");
    private final static QName _EditCategoryResponse_QNAME = new QName("http://ejb/", "editCategoryResponse");
    private final static QName _RemoveChildCategoryResponse_QNAME = new QName("http://ejb/", "removeChildCategoryResponse");
    private final static QName _RemoveFieldsResponse_QNAME = new QName("http://ejb/", "removeFieldsResponse");
    private final static QName _FieldsDetails_QNAME = new QName("http://ejb/", "fieldsDetails");
    private final static QName _CountryTable_QNAME = new QName("http://ejb/", "countryTable");
    private final static QName _RemoveChildCategory_QNAME = new QName("http://ejb/", "removeChildCategory");
    private final static QName _AddFieldtoCategory_QNAME = new QName("http://ejb/", "addFieldtoCategory");
    private final static QName _AddNewCategoryResponse_QNAME = new QName("http://ejb/", "addNewCategoryResponse");
    private final static QName _ShowFiledToCategory_QNAME = new QName("http://ejb/", "showFiledToCategory");
    private final static QName _AddNewBrand_QNAME = new QName("http://ejb/", "addNewBrand");
    private final static QName _CategoryMaster_QNAME = new QName("http://ejb/", "categoryMaster");
    private final static QName _AddNewChildCategory_QNAME = new QName("http://ejb/", "addNewChildCategory");
    private final static QName _AddNewChildCategoryResponse_QNAME = new QName("http://ejb/", "addNewChildCategoryResponse");
    private final static QName _EditBrandResponse_QNAME = new QName("http://ejb/", "editBrandResponse");
    private final static QName _SetVisibilityToUserResponse_QNAME = new QName("http://ejb/", "setVisibilityToUserResponse");
    private final static QName _RemoveUser_QNAME = new QName("http://ejb/", "removeUser");
    private final static QName _RemoveFields_QNAME = new QName("http://ejb/", "removeFields");
    private final static QName _AddNewBrandResponse_QNAME = new QName("http://ejb/", "addNewBrandResponse");
    private final static QName _RemoveFieldFromCategoryResponse_QNAME = new QName("http://ejb/", "removeFieldFromCategoryResponse");
    private final static QName _ShowAllUser_QNAME = new QName("http://ejb/", "showAllUser");
    private final static QName _EditChildCategory_QNAME = new QName("http://ejb/", "editChildCategory");
    private final static QName _RemoveBrand_QNAME = new QName("http://ejb/", "removeBrand");
    private final static QName _ChildCategory_QNAME = new QName("http://ejb/", "childCategory");
    private final static QName _ShowAllFields_QNAME = new QName("http://ejb/", "showAllFields");
    private final static QName _ShowAllUserResponse_QNAME = new QName("http://ejb/", "showAllUserResponse");
    private final static QName _ShowFiledToCategoryResponse_QNAME = new QName("http://ejb/", "showFiledToCategoryResponse");
    private final static QName _RemoveCategoryResponse_QNAME = new QName("http://ejb/", "removeCategoryResponse");
    private final static QName _EditBrand_QNAME = new QName("http://ejb/", "editBrand");
    private final static QName _PersistResponse_QNAME = new QName("http://ejb/", "persistResponse");
    private final static QName _SetVisibilityToAd_QNAME = new QName("http://ejb/", "setVisibilityToAd");
    private final static QName _RemoveUserResponse_QNAME = new QName("http://ejb/", "removeUserResponse");
    private final static QName _AddNewCategory_QNAME = new QName("http://ejb/", "addNewCategory");
    private final static QName _AddNewFields_QNAME = new QName("http://ejb/", "addNewFields");
    private final static QName _RemoveFieldFromCategory_QNAME = new QName("http://ejb/", "removeFieldFromCategory");
    private final static QName _AddNewFieldsResponse_QNAME = new QName("http://ejb/", "addNewFieldsResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ejb
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ChildCategory }
     * 
     */
    public ChildCategory createChildCategory() {
        return new ChildCategory();
    }

    /**
     * Create an instance of {@link ShowAllFields }
     * 
     */
    public ShowAllFields createShowAllFields() {
        return new ShowAllFields();
    }

    /**
     * Create an instance of {@link EditChildCategory }
     * 
     */
    public EditChildCategory createEditChildCategory() {
        return new EditChildCategory();
    }

    /**
     * Create an instance of {@link RemoveBrand }
     * 
     */
    public RemoveBrand createRemoveBrand() {
        return new RemoveBrand();
    }

    /**
     * Create an instance of {@link RemoveFieldFromCategoryResponse }
     * 
     */
    public RemoveFieldFromCategoryResponse createRemoveFieldFromCategoryResponse() {
        return new RemoveFieldFromCategoryResponse();
    }

    /**
     * Create an instance of {@link ShowAllUser }
     * 
     */
    public ShowAllUser createShowAllUser() {
        return new ShowAllUser();
    }

    /**
     * Create an instance of {@link RemoveFields }
     * 
     */
    public RemoveFields createRemoveFields() {
        return new RemoveFields();
    }

    /**
     * Create an instance of {@link AddNewBrandResponse }
     * 
     */
    public AddNewBrandResponse createAddNewBrandResponse() {
        return new AddNewBrandResponse();
    }

    /**
     * Create an instance of {@link RemoveUser }
     * 
     */
    public RemoveUser createRemoveUser() {
        return new RemoveUser();
    }

    /**
     * Create an instance of {@link AddNewChildCategoryResponse }
     * 
     */
    public AddNewChildCategoryResponse createAddNewChildCategoryResponse() {
        return new AddNewChildCategoryResponse();
    }

    /**
     * Create an instance of {@link EditBrandResponse }
     * 
     */
    public EditBrandResponse createEditBrandResponse() {
        return new EditBrandResponse();
    }

    /**
     * Create an instance of {@link SetVisibilityToUserResponse }
     * 
     */
    public SetVisibilityToUserResponse createSetVisibilityToUserResponse() {
        return new SetVisibilityToUserResponse();
    }

    /**
     * Create an instance of {@link AddNewFieldsResponse }
     * 
     */
    public AddNewFieldsResponse createAddNewFieldsResponse() {
        return new AddNewFieldsResponse();
    }

    /**
     * Create an instance of {@link RemoveFieldFromCategory }
     * 
     */
    public RemoveFieldFromCategory createRemoveFieldFromCategory() {
        return new RemoveFieldFromCategory();
    }

    /**
     * Create an instance of {@link AddNewCategory }
     * 
     */
    public AddNewCategory createAddNewCategory() {
        return new AddNewCategory();
    }

    /**
     * Create an instance of {@link AddNewFields }
     * 
     */
    public AddNewFields createAddNewFields() {
        return new AddNewFields();
    }

    /**
     * Create an instance of {@link EditBrand }
     * 
     */
    public EditBrand createEditBrand() {
        return new EditBrand();
    }

    /**
     * Create an instance of {@link PersistResponse }
     * 
     */
    public PersistResponse createPersistResponse() {
        return new PersistResponse();
    }

    /**
     * Create an instance of {@link SetVisibilityToAd }
     * 
     */
    public SetVisibilityToAd createSetVisibilityToAd() {
        return new SetVisibilityToAd();
    }

    /**
     * Create an instance of {@link RemoveUserResponse }
     * 
     */
    public RemoveUserResponse createRemoveUserResponse() {
        return new RemoveUserResponse();
    }

    /**
     * Create an instance of {@link RemoveCategoryResponse }
     * 
     */
    public RemoveCategoryResponse createRemoveCategoryResponse() {
        return new RemoveCategoryResponse();
    }

    /**
     * Create an instance of {@link ShowFiledToCategoryResponse }
     * 
     */
    public ShowFiledToCategoryResponse createShowFiledToCategoryResponse() {
        return new ShowFiledToCategoryResponse();
    }

    /**
     * Create an instance of {@link ShowAllUserResponse }
     * 
     */
    public ShowAllUserResponse createShowAllUserResponse() {
        return new ShowAllUserResponse();
    }

    /**
     * Create an instance of {@link EditCategory }
     * 
     */
    public EditCategory createEditCategory() {
        return new EditCategory();
    }

    /**
     * Create an instance of {@link FieldCategoryRelation }
     * 
     */
    public FieldCategoryRelation createFieldCategoryRelation() {
        return new FieldCategoryRelation();
    }

    /**
     * Create an instance of {@link BrandList }
     * 
     */
    public BrandList createBrandList() {
        return new BrandList();
    }

    /**
     * Create an instance of {@link ShowAllFieldsResponse }
     * 
     */
    public ShowAllFieldsResponse createShowAllFieldsResponse() {
        return new ShowAllFieldsResponse();
    }

    /**
     * Create an instance of {@link RemoveBrandResponse }
     * 
     */
    public RemoveBrandResponse createRemoveBrandResponse() {
        return new RemoveBrandResponse();
    }

    /**
     * Create an instance of {@link ShowAllBrand }
     * 
     */
    public ShowAllBrand createShowAllBrand() {
        return new ShowAllBrand();
    }

    /**
     * Create an instance of {@link CityTable }
     * 
     */
    public CityTable createCityTable() {
        return new CityTable();
    }

    /**
     * Create an instance of {@link ShowAllBrandResponse }
     * 
     */
    public ShowAllBrandResponse createShowAllBrandResponse() {
        return new ShowAllBrandResponse();
    }

    /**
     * Create an instance of {@link SetVisibilityToUser }
     * 
     */
    public SetVisibilityToUser createSetVisibilityToUser() {
        return new SetVisibilityToUser();
    }

    /**
     * Create an instance of {@link UserTable }
     * 
     */
    public UserTable createUserTable() {
        return new UserTable();
    }

    /**
     * Create an instance of {@link Persist }
     * 
     */
    public Persist createPersist() {
        return new Persist();
    }

    /**
     * Create an instance of {@link RemoveCategory }
     * 
     */
    public RemoveCategory createRemoveCategory() {
        return new RemoveCategory();
    }

    /**
     * Create an instance of {@link EditChildCategoryResponse }
     * 
     */
    public EditChildCategoryResponse createEditChildCategoryResponse() {
        return new EditChildCategoryResponse();
    }

    /**
     * Create an instance of {@link AddNewChildCategory }
     * 
     */
    public AddNewChildCategory createAddNewChildCategory() {
        return new AddNewChildCategory();
    }

    /**
     * Create an instance of {@link AddNewBrand }
     * 
     */
    public AddNewBrand createAddNewBrand() {
        return new AddNewBrand();
    }

    /**
     * Create an instance of {@link CategoryMaster }
     * 
     */
    public CategoryMaster createCategoryMaster() {
        return new CategoryMaster();
    }

    /**
     * Create an instance of {@link AddNewCategoryResponse }
     * 
     */
    public AddNewCategoryResponse createAddNewCategoryResponse() {
        return new AddNewCategoryResponse();
    }

    /**
     * Create an instance of {@link ShowFiledToCategory }
     * 
     */
    public ShowFiledToCategory createShowFiledToCategory() {
        return new ShowFiledToCategory();
    }

    /**
     * Create an instance of {@link RemoveChildCategory }
     * 
     */
    public RemoveChildCategory createRemoveChildCategory() {
        return new RemoveChildCategory();
    }

    /**
     * Create an instance of {@link AddFieldtoCategory }
     * 
     */
    public AddFieldtoCategory createAddFieldtoCategory() {
        return new AddFieldtoCategory();
    }

    /**
     * Create an instance of {@link EditCategoryResponse }
     * 
     */
    public EditCategoryResponse createEditCategoryResponse() {
        return new EditCategoryResponse();
    }

    /**
     * Create an instance of {@link RemoveChildCategoryResponse }
     * 
     */
    public RemoveChildCategoryResponse createRemoveChildCategoryResponse() {
        return new RemoveChildCategoryResponse();
    }

    /**
     * Create an instance of {@link RemoveFieldsResponse }
     * 
     */
    public RemoveFieldsResponse createRemoveFieldsResponse() {
        return new RemoveFieldsResponse();
    }

    /**
     * Create an instance of {@link FieldsDetails }
     * 
     */
    public FieldsDetails createFieldsDetails() {
        return new FieldsDetails();
    }

    /**
     * Create an instance of {@link CountryTable }
     * 
     */
    public CountryTable createCountryTable() {
        return new CountryTable();
    }

    /**
     * Create an instance of {@link StateTable }
     * 
     */
    public StateTable createStateTable() {
        return new StateTable();
    }

    /**
     * Create an instance of {@link SetVisibilityToAdResponse }
     * 
     */
    public SetVisibilityToAdResponse createSetVisibilityToAdResponse() {
        return new SetVisibilityToAdResponse();
    }

    /**
     * Create an instance of {@link AddFieldtoCategoryResponse }
     * 
     */
    public AddFieldtoCategoryResponse createAddFieldtoCategoryResponse() {
        return new AddFieldtoCategoryResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditChildCategoryResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "editChildCategoryResponse")
    public JAXBElement<EditChildCategoryResponse> createEditChildCategoryResponse(EditChildCategoryResponse value) {
        return new JAXBElement<EditChildCategoryResponse>(_EditChildCategoryResponse_QNAME, EditChildCategoryResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetVisibilityToUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "setVisibilityToUser")
    public JAXBElement<SetVisibilityToUser> createSetVisibilityToUser(SetVisibilityToUser value) {
        return new JAXBElement<SetVisibilityToUser>(_SetVisibilityToUser_QNAME, SetVisibilityToUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserTable }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "userTable")
    public JAXBElement<UserTable> createUserTable(UserTable value) {
        return new JAXBElement<UserTable>(_UserTable_QNAME, UserTable.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Persist }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "persist")
    public JAXBElement<Persist> createPersist(Persist value) {
        return new JAXBElement<Persist>(_Persist_QNAME, Persist.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveCategory }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "removeCategory")
    public JAXBElement<RemoveCategory> createRemoveCategory(RemoveCategory value) {
        return new JAXBElement<RemoveCategory>(_RemoveCategory_QNAME, RemoveCategory.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShowAllBrandResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "showAllBrandResponse")
    public JAXBElement<ShowAllBrandResponse> createShowAllBrandResponse(ShowAllBrandResponse value) {
        return new JAXBElement<ShowAllBrandResponse>(_ShowAllBrandResponse_QNAME, ShowAllBrandResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveBrandResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "removeBrandResponse")
    public JAXBElement<RemoveBrandResponse> createRemoveBrandResponse(RemoveBrandResponse value) {
        return new JAXBElement<RemoveBrandResponse>(_RemoveBrandResponse_QNAME, RemoveBrandResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShowAllBrand }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "showAllBrand")
    public JAXBElement<ShowAllBrand> createShowAllBrand(ShowAllBrand value) {
        return new JAXBElement<ShowAllBrand>(_ShowAllBrand_QNAME, ShowAllBrand.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CityTable }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "cityTable")
    public JAXBElement<CityTable> createCityTable(CityTable value) {
        return new JAXBElement<CityTable>(_CityTable_QNAME, CityTable.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BrandList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "brandList")
    public JAXBElement<BrandList> createBrandList(BrandList value) {
        return new JAXBElement<BrandList>(_BrandList_QNAME, BrandList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShowAllFieldsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "showAllFieldsResponse")
    public JAXBElement<ShowAllFieldsResponse> createShowAllFieldsResponse(ShowAllFieldsResponse value) {
        return new JAXBElement<ShowAllFieldsResponse>(_ShowAllFieldsResponse_QNAME, ShowAllFieldsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FieldCategoryRelation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "fieldCategoryRelation")
    public JAXBElement<FieldCategoryRelation> createFieldCategoryRelation(FieldCategoryRelation value) {
        return new JAXBElement<FieldCategoryRelation>(_FieldCategoryRelation_QNAME, FieldCategoryRelation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditCategory }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "editCategory")
    public JAXBElement<EditCategory> createEditCategory(EditCategory value) {
        return new JAXBElement<EditCategory>(_EditCategory_QNAME, EditCategory.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddFieldtoCategoryResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "addFieldtoCategoryResponse")
    public JAXBElement<AddFieldtoCategoryResponse> createAddFieldtoCategoryResponse(AddFieldtoCategoryResponse value) {
        return new JAXBElement<AddFieldtoCategoryResponse>(_AddFieldtoCategoryResponse_QNAME, AddFieldtoCategoryResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetVisibilityToAdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "setVisibilityToAdResponse")
    public JAXBElement<SetVisibilityToAdResponse> createSetVisibilityToAdResponse(SetVisibilityToAdResponse value) {
        return new JAXBElement<SetVisibilityToAdResponse>(_SetVisibilityToAdResponse_QNAME, SetVisibilityToAdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StateTable }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "stateTable")
    public JAXBElement<StateTable> createStateTable(StateTable value) {
        return new JAXBElement<StateTable>(_StateTable_QNAME, StateTable.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditCategoryResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "editCategoryResponse")
    public JAXBElement<EditCategoryResponse> createEditCategoryResponse(EditCategoryResponse value) {
        return new JAXBElement<EditCategoryResponse>(_EditCategoryResponse_QNAME, EditCategoryResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveChildCategoryResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "removeChildCategoryResponse")
    public JAXBElement<RemoveChildCategoryResponse> createRemoveChildCategoryResponse(RemoveChildCategoryResponse value) {
        return new JAXBElement<RemoveChildCategoryResponse>(_RemoveChildCategoryResponse_QNAME, RemoveChildCategoryResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveFieldsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "removeFieldsResponse")
    public JAXBElement<RemoveFieldsResponse> createRemoveFieldsResponse(RemoveFieldsResponse value) {
        return new JAXBElement<RemoveFieldsResponse>(_RemoveFieldsResponse_QNAME, RemoveFieldsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FieldsDetails }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "fieldsDetails")
    public JAXBElement<FieldsDetails> createFieldsDetails(FieldsDetails value) {
        return new JAXBElement<FieldsDetails>(_FieldsDetails_QNAME, FieldsDetails.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CountryTable }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "countryTable")
    public JAXBElement<CountryTable> createCountryTable(CountryTable value) {
        return new JAXBElement<CountryTable>(_CountryTable_QNAME, CountryTable.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveChildCategory }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "removeChildCategory")
    public JAXBElement<RemoveChildCategory> createRemoveChildCategory(RemoveChildCategory value) {
        return new JAXBElement<RemoveChildCategory>(_RemoveChildCategory_QNAME, RemoveChildCategory.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddFieldtoCategory }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "addFieldtoCategory")
    public JAXBElement<AddFieldtoCategory> createAddFieldtoCategory(AddFieldtoCategory value) {
        return new JAXBElement<AddFieldtoCategory>(_AddFieldtoCategory_QNAME, AddFieldtoCategory.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddNewCategoryResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "addNewCategoryResponse")
    public JAXBElement<AddNewCategoryResponse> createAddNewCategoryResponse(AddNewCategoryResponse value) {
        return new JAXBElement<AddNewCategoryResponse>(_AddNewCategoryResponse_QNAME, AddNewCategoryResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShowFiledToCategory }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "showFiledToCategory")
    public JAXBElement<ShowFiledToCategory> createShowFiledToCategory(ShowFiledToCategory value) {
        return new JAXBElement<ShowFiledToCategory>(_ShowFiledToCategory_QNAME, ShowFiledToCategory.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddNewBrand }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "addNewBrand")
    public JAXBElement<AddNewBrand> createAddNewBrand(AddNewBrand value) {
        return new JAXBElement<AddNewBrand>(_AddNewBrand_QNAME, AddNewBrand.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CategoryMaster }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "categoryMaster")
    public JAXBElement<CategoryMaster> createCategoryMaster(CategoryMaster value) {
        return new JAXBElement<CategoryMaster>(_CategoryMaster_QNAME, CategoryMaster.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddNewChildCategory }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "addNewChildCategory")
    public JAXBElement<AddNewChildCategory> createAddNewChildCategory(AddNewChildCategory value) {
        return new JAXBElement<AddNewChildCategory>(_AddNewChildCategory_QNAME, AddNewChildCategory.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddNewChildCategoryResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "addNewChildCategoryResponse")
    public JAXBElement<AddNewChildCategoryResponse> createAddNewChildCategoryResponse(AddNewChildCategoryResponse value) {
        return new JAXBElement<AddNewChildCategoryResponse>(_AddNewChildCategoryResponse_QNAME, AddNewChildCategoryResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditBrandResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "editBrandResponse")
    public JAXBElement<EditBrandResponse> createEditBrandResponse(EditBrandResponse value) {
        return new JAXBElement<EditBrandResponse>(_EditBrandResponse_QNAME, EditBrandResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetVisibilityToUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "setVisibilityToUserResponse")
    public JAXBElement<SetVisibilityToUserResponse> createSetVisibilityToUserResponse(SetVisibilityToUserResponse value) {
        return new JAXBElement<SetVisibilityToUserResponse>(_SetVisibilityToUserResponse_QNAME, SetVisibilityToUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "removeUser")
    public JAXBElement<RemoveUser> createRemoveUser(RemoveUser value) {
        return new JAXBElement<RemoveUser>(_RemoveUser_QNAME, RemoveUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveFields }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "removeFields")
    public JAXBElement<RemoveFields> createRemoveFields(RemoveFields value) {
        return new JAXBElement<RemoveFields>(_RemoveFields_QNAME, RemoveFields.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddNewBrandResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "addNewBrandResponse")
    public JAXBElement<AddNewBrandResponse> createAddNewBrandResponse(AddNewBrandResponse value) {
        return new JAXBElement<AddNewBrandResponse>(_AddNewBrandResponse_QNAME, AddNewBrandResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveFieldFromCategoryResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "removeFieldFromCategoryResponse")
    public JAXBElement<RemoveFieldFromCategoryResponse> createRemoveFieldFromCategoryResponse(RemoveFieldFromCategoryResponse value) {
        return new JAXBElement<RemoveFieldFromCategoryResponse>(_RemoveFieldFromCategoryResponse_QNAME, RemoveFieldFromCategoryResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShowAllUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "showAllUser")
    public JAXBElement<ShowAllUser> createShowAllUser(ShowAllUser value) {
        return new JAXBElement<ShowAllUser>(_ShowAllUser_QNAME, ShowAllUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditChildCategory }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "editChildCategory")
    public JAXBElement<EditChildCategory> createEditChildCategory(EditChildCategory value) {
        return new JAXBElement<EditChildCategory>(_EditChildCategory_QNAME, EditChildCategory.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveBrand }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "removeBrand")
    public JAXBElement<RemoveBrand> createRemoveBrand(RemoveBrand value) {
        return new JAXBElement<RemoveBrand>(_RemoveBrand_QNAME, RemoveBrand.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChildCategory }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "childCategory")
    public JAXBElement<ChildCategory> createChildCategory(ChildCategory value) {
        return new JAXBElement<ChildCategory>(_ChildCategory_QNAME, ChildCategory.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShowAllFields }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "showAllFields")
    public JAXBElement<ShowAllFields> createShowAllFields(ShowAllFields value) {
        return new JAXBElement<ShowAllFields>(_ShowAllFields_QNAME, ShowAllFields.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShowAllUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "showAllUserResponse")
    public JAXBElement<ShowAllUserResponse> createShowAllUserResponse(ShowAllUserResponse value) {
        return new JAXBElement<ShowAllUserResponse>(_ShowAllUserResponse_QNAME, ShowAllUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShowFiledToCategoryResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "showFiledToCategoryResponse")
    public JAXBElement<ShowFiledToCategoryResponse> createShowFiledToCategoryResponse(ShowFiledToCategoryResponse value) {
        return new JAXBElement<ShowFiledToCategoryResponse>(_ShowFiledToCategoryResponse_QNAME, ShowFiledToCategoryResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveCategoryResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "removeCategoryResponse")
    public JAXBElement<RemoveCategoryResponse> createRemoveCategoryResponse(RemoveCategoryResponse value) {
        return new JAXBElement<RemoveCategoryResponse>(_RemoveCategoryResponse_QNAME, RemoveCategoryResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditBrand }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "editBrand")
    public JAXBElement<EditBrand> createEditBrand(EditBrand value) {
        return new JAXBElement<EditBrand>(_EditBrand_QNAME, EditBrand.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PersistResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "persistResponse")
    public JAXBElement<PersistResponse> createPersistResponse(PersistResponse value) {
        return new JAXBElement<PersistResponse>(_PersistResponse_QNAME, PersistResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetVisibilityToAd }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "setVisibilityToAd")
    public JAXBElement<SetVisibilityToAd> createSetVisibilityToAd(SetVisibilityToAd value) {
        return new JAXBElement<SetVisibilityToAd>(_SetVisibilityToAd_QNAME, SetVisibilityToAd.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "removeUserResponse")
    public JAXBElement<RemoveUserResponse> createRemoveUserResponse(RemoveUserResponse value) {
        return new JAXBElement<RemoveUserResponse>(_RemoveUserResponse_QNAME, RemoveUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddNewCategory }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "addNewCategory")
    public JAXBElement<AddNewCategory> createAddNewCategory(AddNewCategory value) {
        return new JAXBElement<AddNewCategory>(_AddNewCategory_QNAME, AddNewCategory.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddNewFields }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "addNewFields")
    public JAXBElement<AddNewFields> createAddNewFields(AddNewFields value) {
        return new JAXBElement<AddNewFields>(_AddNewFields_QNAME, AddNewFields.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveFieldFromCategory }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "removeFieldFromCategory")
    public JAXBElement<RemoveFieldFromCategory> createRemoveFieldFromCategory(RemoveFieldFromCategory value) {
        return new JAXBElement<RemoveFieldFromCategory>(_RemoveFieldFromCategory_QNAME, RemoveFieldFromCategory.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddNewFieldsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "addNewFieldsResponse")
    public JAXBElement<AddNewFieldsResponse> createAddNewFieldsResponse(AddNewFieldsResponse value) {
        return new JAXBElement<AddNewFieldsResponse>(_AddNewFieldsResponse_QNAME, AddNewFieldsResponse.class, null, value);
    }

}
