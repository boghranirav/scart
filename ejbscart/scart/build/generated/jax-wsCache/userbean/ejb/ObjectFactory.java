
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

    private final static QName _AddBidActivity_QNAME = new QName("http://ejb/", "addBidActivity");
    private final static QName _RemoveBidActivityResponse_QNAME = new QName("http://ejb/", "removeBidActivityResponse");
    private final static QName _UserTable_QNAME = new QName("http://ejb/", "userTable");
    private final static QName _Persist_QNAME = new QName("http://ejb/", "persist");
    private final static QName _UserChat_QNAME = new QName("http://ejb/", "userChat");
    private final static QName _ShowUserDetailsResponse_QNAME = new QName("http://ejb/", "showUserDetailsResponse");
    private final static QName _AddAuctionImageResponse_QNAME = new QName("http://ejb/", "addAuctionImageResponse");
    private final static QName _RemoveUserChatResponse_QNAME = new QName("http://ejb/", "removeUserChatResponse");
    private final static QName _AddDetailsForAdResponse_QNAME = new QName("http://ejb/", "addDetailsForAdResponse");
    private final static QName _MaintainProfileResponse_QNAME = new QName("http://ejb/", "maintainProfileResponse");
    private final static QName _RemoveAutionImage_QNAME = new QName("http://ejb/", "removeAutionImage");
    private final static QName _CityTable_QNAME = new QName("http://ejb/", "cityTable");
    private final static QName _AddImageForAdResponse_QNAME = new QName("http://ejb/", "addImageForAdResponse");
    private final static QName _AdTable_QNAME = new QName("http://ejb/", "adTable");
    private final static QName _EditAd_QNAME = new QName("http://ejb/", "editAd");
    private final static QName _EditImageOfAdResponse_QNAME = new QName("http://ejb/", "editImageOfAdResponse");
    private final static QName _AddNewAdResponse_QNAME = new QName("http://ejb/", "addNewAdResponse");
    private final static QName _EditAutionDetailResponse_QNAME = new QName("http://ejb/", "editAutionDetailResponse");
    private final static QName _RemoveAdResponse_QNAME = new QName("http://ejb/", "removeAdResponse");
    private final static QName _StateTable_QNAME = new QName("http://ejb/", "stateTable");
    private final static QName _CountryTable_QNAME = new QName("http://ejb/", "countryTable");
    private final static QName _AddBidActivityResponse_QNAME = new QName("http://ejb/", "addBidActivityResponse");
    private final static QName _AddAuctionDetail_QNAME = new QName("http://ejb/", "addAuctionDetail");
    private final static QName _ShowUserDetails_QNAME = new QName("http://ejb/", "showUserDetails");
    private final static QName _RemoveUserChat_QNAME = new QName("http://ejb/", "removeUserChat");
    private final static QName _CategoryMaster_QNAME = new QName("http://ejb/", "categoryMaster");
    private final static QName _AddImageForAd_QNAME = new QName("http://ejb/", "addImageForAd");
    private final static QName _EditAutionDetail_QNAME = new QName("http://ejb/", "editAutionDetail");
    private final static QName _ShowUserChatResponse_QNAME = new QName("http://ejb/", "showUserChatResponse");
    private final static QName _MaintainProfile_QNAME = new QName("http://ejb/", "maintainProfile");
    private final static QName _RemoveImageofAd_QNAME = new QName("http://ejb/", "removeImageofAd");
    private final static QName _ChildCategory_QNAME = new QName("http://ejb/", "childCategory");
    private final static QName _AddAuctionImage_QNAME = new QName("http://ejb/", "addAuctionImage");
    private final static QName _RemoveImageofAdResponse_QNAME = new QName("http://ejb/", "removeImageofAdResponse");
    private final static QName _Registration_QNAME = new QName("http://ejb/", "registration");
    private final static QName _AddNewUserChatResponse_QNAME = new QName("http://ejb/", "addNewUserChatResponse");
    private final static QName _RegistrationResponse_QNAME = new QName("http://ejb/", "registrationResponse");
    private final static QName _RemoveAutionImageResponse_QNAME = new QName("http://ejb/", "removeAutionImageResponse");
    private final static QName _AddAuctionDetailResponse_QNAME = new QName("http://ejb/", "addAuctionDetailResponse");
    private final static QName _AddDetailsForAd_QNAME = new QName("http://ejb/", "addDetailsForAd");
    private final static QName _EditAdResponse_QNAME = new QName("http://ejb/", "editAdResponse");
    private final static QName _PersistResponse_QNAME = new QName("http://ejb/", "persistResponse");
    private final static QName _RemoveBidActivity_QNAME = new QName("http://ejb/", "removeBidActivity");
    private final static QName _RemoveAutionDetailResponse_QNAME = new QName("http://ejb/", "removeAutionDetailResponse");
    private final static QName _EditAdDetailsResponse_QNAME = new QName("http://ejb/", "editAdDetailsResponse");
    private final static QName _ShowUserChat_QNAME = new QName("http://ejb/", "showUserChat");
    private final static QName _EditImageOfAd_QNAME = new QName("http://ejb/", "editImageOfAd");
    private final static QName _RemoveAd_QNAME = new QName("http://ejb/", "removeAd");
    private final static QName _EditAdDetails_QNAME = new QName("http://ejb/", "editAdDetails");
    private final static QName _AddNewUserChat_QNAME = new QName("http://ejb/", "addNewUserChat");
    private final static QName _AddNewAd_QNAME = new QName("http://ejb/", "addNewAd");
    private final static QName _RemoveAutionDetail_QNAME = new QName("http://ejb/", "removeAutionDetail");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ejb
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RemoveImageofAd }
     * 
     */
    public RemoveImageofAd createRemoveImageofAd() {
        return new RemoveImageofAd();
    }

    /**
     * Create an instance of {@link ChildCategory }
     * 
     */
    public ChildCategory createChildCategory() {
        return new ChildCategory();
    }

    /**
     * Create an instance of {@link AddAuctionImage }
     * 
     */
    public AddAuctionImage createAddAuctionImage() {
        return new AddAuctionImage();
    }

    /**
     * Create an instance of {@link RemoveImageofAdResponse }
     * 
     */
    public RemoveImageofAdResponse createRemoveImageofAdResponse() {
        return new RemoveImageofAdResponse();
    }

    /**
     * Create an instance of {@link ShowUserChatResponse }
     * 
     */
    public ShowUserChatResponse createShowUserChatResponse() {
        return new ShowUserChatResponse();
    }

    /**
     * Create an instance of {@link MaintainProfile }
     * 
     */
    public MaintainProfile createMaintainProfile() {
        return new MaintainProfile();
    }

    /**
     * Create an instance of {@link EditAutionDetail }
     * 
     */
    public EditAutionDetail createEditAutionDetail() {
        return new EditAutionDetail();
    }

    /**
     * Create an instance of {@link AddNewAd }
     * 
     */
    public AddNewAd createAddNewAd() {
        return new AddNewAd();
    }

    /**
     * Create an instance of {@link RemoveAutionDetail }
     * 
     */
    public RemoveAutionDetail createRemoveAutionDetail() {
        return new RemoveAutionDetail();
    }

    /**
     * Create an instance of {@link EditAdDetails }
     * 
     */
    public EditAdDetails createEditAdDetails() {
        return new EditAdDetails();
    }

    /**
     * Create an instance of {@link AddNewUserChat }
     * 
     */
    public AddNewUserChat createAddNewUserChat() {
        return new AddNewUserChat();
    }

    /**
     * Create an instance of {@link EditImageOfAd }
     * 
     */
    public EditImageOfAd createEditImageOfAd() {
        return new EditImageOfAd();
    }

    /**
     * Create an instance of {@link RemoveAd }
     * 
     */
    public RemoveAd createRemoveAd() {
        return new RemoveAd();
    }

    /**
     * Create an instance of {@link RemoveAutionDetailResponse }
     * 
     */
    public RemoveAutionDetailResponse createRemoveAutionDetailResponse() {
        return new RemoveAutionDetailResponse();
    }

    /**
     * Create an instance of {@link EditAdDetailsResponse }
     * 
     */
    public EditAdDetailsResponse createEditAdDetailsResponse() {
        return new EditAdDetailsResponse();
    }

    /**
     * Create an instance of {@link ShowUserChat }
     * 
     */
    public ShowUserChat createShowUserChat() {
        return new ShowUserChat();
    }

    /**
     * Create an instance of {@link EditAdResponse }
     * 
     */
    public EditAdResponse createEditAdResponse() {
        return new EditAdResponse();
    }

    /**
     * Create an instance of {@link PersistResponse }
     * 
     */
    public PersistResponse createPersistResponse() {
        return new PersistResponse();
    }

    /**
     * Create an instance of {@link RemoveBidActivity }
     * 
     */
    public RemoveBidActivity createRemoveBidActivity() {
        return new RemoveBidActivity();
    }

    /**
     * Create an instance of {@link RemoveAutionImageResponse }
     * 
     */
    public RemoveAutionImageResponse createRemoveAutionImageResponse() {
        return new RemoveAutionImageResponse();
    }

    /**
     * Create an instance of {@link AddAuctionDetailResponse }
     * 
     */
    public AddAuctionDetailResponse createAddAuctionDetailResponse() {
        return new AddAuctionDetailResponse();
    }

    /**
     * Create an instance of {@link AddDetailsForAd }
     * 
     */
    public AddDetailsForAd createAddDetailsForAd() {
        return new AddDetailsForAd();
    }

    /**
     * Create an instance of {@link Registration }
     * 
     */
    public Registration createRegistration() {
        return new Registration();
    }

    /**
     * Create an instance of {@link AddNewUserChatResponse }
     * 
     */
    public AddNewUserChatResponse createAddNewUserChatResponse() {
        return new AddNewUserChatResponse();
    }

    /**
     * Create an instance of {@link RegistrationResponse }
     * 
     */
    public RegistrationResponse createRegistrationResponse() {
        return new RegistrationResponse();
    }

    /**
     * Create an instance of {@link EditAd }
     * 
     */
    public EditAd createEditAd() {
        return new EditAd();
    }

    /**
     * Create an instance of {@link EditImageOfAdResponse }
     * 
     */
    public EditImageOfAdResponse createEditImageOfAdResponse() {
        return new EditImageOfAdResponse();
    }

    /**
     * Create an instance of {@link AddNewAdResponse }
     * 
     */
    public AddNewAdResponse createAddNewAdResponse() {
        return new AddNewAdResponse();
    }

    /**
     * Create an instance of {@link AdTable }
     * 
     */
    public AdTable createAdTable() {
        return new AdTable();
    }

    /**
     * Create an instance of {@link AddImageForAdResponse }
     * 
     */
    public AddImageForAdResponse createAddImageForAdResponse() {
        return new AddImageForAdResponse();
    }

    /**
     * Create an instance of {@link RemoveAutionImage }
     * 
     */
    public RemoveAutionImage createRemoveAutionImage() {
        return new RemoveAutionImage();
    }

    /**
     * Create an instance of {@link CityTable }
     * 
     */
    public CityTable createCityTable() {
        return new CityTable();
    }

    /**
     * Create an instance of {@link AddAuctionImageResponse }
     * 
     */
    public AddAuctionImageResponse createAddAuctionImageResponse() {
        return new AddAuctionImageResponse();
    }

    /**
     * Create an instance of {@link RemoveUserChatResponse }
     * 
     */
    public RemoveUserChatResponse createRemoveUserChatResponse() {
        return new RemoveUserChatResponse();
    }

    /**
     * Create an instance of {@link AddDetailsForAdResponse }
     * 
     */
    public AddDetailsForAdResponse createAddDetailsForAdResponse() {
        return new AddDetailsForAdResponse();
    }

    /**
     * Create an instance of {@link MaintainProfileResponse }
     * 
     */
    public MaintainProfileResponse createMaintainProfileResponse() {
        return new MaintainProfileResponse();
    }

    /**
     * Create an instance of {@link UserChat }
     * 
     */
    public UserChat createUserChat() {
        return new UserChat();
    }

    /**
     * Create an instance of {@link ShowUserDetailsResponse }
     * 
     */
    public ShowUserDetailsResponse createShowUserDetailsResponse() {
        return new ShowUserDetailsResponse();
    }

    /**
     * Create an instance of {@link AddBidActivity }
     * 
     */
    public AddBidActivity createAddBidActivity() {
        return new AddBidActivity();
    }

    /**
     * Create an instance of {@link RemoveBidActivityResponse }
     * 
     */
    public RemoveBidActivityResponse createRemoveBidActivityResponse() {
        return new RemoveBidActivityResponse();
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
     * Create an instance of {@link AddImageForAd }
     * 
     */
    public AddImageForAd createAddImageForAd() {
        return new AddImageForAd();
    }

    /**
     * Create an instance of {@link CategoryMaster }
     * 
     */
    public CategoryMaster createCategoryMaster() {
        return new CategoryMaster();
    }

    /**
     * Create an instance of {@link AddAuctionDetail }
     * 
     */
    public AddAuctionDetail createAddAuctionDetail() {
        return new AddAuctionDetail();
    }

    /**
     * Create an instance of {@link ShowUserDetails }
     * 
     */
    public ShowUserDetails createShowUserDetails() {
        return new ShowUserDetails();
    }

    /**
     * Create an instance of {@link RemoveUserChat }
     * 
     */
    public RemoveUserChat createRemoveUserChat() {
        return new RemoveUserChat();
    }

    /**
     * Create an instance of {@link AddBidActivityResponse }
     * 
     */
    public AddBidActivityResponse createAddBidActivityResponse() {
        return new AddBidActivityResponse();
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
     * Create an instance of {@link RemoveAdResponse }
     * 
     */
    public RemoveAdResponse createRemoveAdResponse() {
        return new RemoveAdResponse();
    }

    /**
     * Create an instance of {@link EditAutionDetailResponse }
     * 
     */
    public EditAutionDetailResponse createEditAutionDetailResponse() {
        return new EditAutionDetailResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddBidActivity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "addBidActivity")
    public JAXBElement<AddBidActivity> createAddBidActivity(AddBidActivity value) {
        return new JAXBElement<AddBidActivity>(_AddBidActivity_QNAME, AddBidActivity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveBidActivityResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "removeBidActivityResponse")
    public JAXBElement<RemoveBidActivityResponse> createRemoveBidActivityResponse(RemoveBidActivityResponse value) {
        return new JAXBElement<RemoveBidActivityResponse>(_RemoveBidActivityResponse_QNAME, RemoveBidActivityResponse.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link UserChat }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "userChat")
    public JAXBElement<UserChat> createUserChat(UserChat value) {
        return new JAXBElement<UserChat>(_UserChat_QNAME, UserChat.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShowUserDetailsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "showUserDetailsResponse")
    public JAXBElement<ShowUserDetailsResponse> createShowUserDetailsResponse(ShowUserDetailsResponse value) {
        return new JAXBElement<ShowUserDetailsResponse>(_ShowUserDetailsResponse_QNAME, ShowUserDetailsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddAuctionImageResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "addAuctionImageResponse")
    public JAXBElement<AddAuctionImageResponse> createAddAuctionImageResponse(AddAuctionImageResponse value) {
        return new JAXBElement<AddAuctionImageResponse>(_AddAuctionImageResponse_QNAME, AddAuctionImageResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveUserChatResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "removeUserChatResponse")
    public JAXBElement<RemoveUserChatResponse> createRemoveUserChatResponse(RemoveUserChatResponse value) {
        return new JAXBElement<RemoveUserChatResponse>(_RemoveUserChatResponse_QNAME, RemoveUserChatResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddDetailsForAdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "addDetailsForAdResponse")
    public JAXBElement<AddDetailsForAdResponse> createAddDetailsForAdResponse(AddDetailsForAdResponse value) {
        return new JAXBElement<AddDetailsForAdResponse>(_AddDetailsForAdResponse_QNAME, AddDetailsForAdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MaintainProfileResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "maintainProfileResponse")
    public JAXBElement<MaintainProfileResponse> createMaintainProfileResponse(MaintainProfileResponse value) {
        return new JAXBElement<MaintainProfileResponse>(_MaintainProfileResponse_QNAME, MaintainProfileResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveAutionImage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "removeAutionImage")
    public JAXBElement<RemoveAutionImage> createRemoveAutionImage(RemoveAutionImage value) {
        return new JAXBElement<RemoveAutionImage>(_RemoveAutionImage_QNAME, RemoveAutionImage.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link AddImageForAdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "addImageForAdResponse")
    public JAXBElement<AddImageForAdResponse> createAddImageForAdResponse(AddImageForAdResponse value) {
        return new JAXBElement<AddImageForAdResponse>(_AddImageForAdResponse_QNAME, AddImageForAdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdTable }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "adTable")
    public JAXBElement<AdTable> createAdTable(AdTable value) {
        return new JAXBElement<AdTable>(_AdTable_QNAME, AdTable.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditAd }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "editAd")
    public JAXBElement<EditAd> createEditAd(EditAd value) {
        return new JAXBElement<EditAd>(_EditAd_QNAME, EditAd.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditImageOfAdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "editImageOfAdResponse")
    public JAXBElement<EditImageOfAdResponse> createEditImageOfAdResponse(EditImageOfAdResponse value) {
        return new JAXBElement<EditImageOfAdResponse>(_EditImageOfAdResponse_QNAME, EditImageOfAdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddNewAdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "addNewAdResponse")
    public JAXBElement<AddNewAdResponse> createAddNewAdResponse(AddNewAdResponse value) {
        return new JAXBElement<AddNewAdResponse>(_AddNewAdResponse_QNAME, AddNewAdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditAutionDetailResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "editAutionDetailResponse")
    public JAXBElement<EditAutionDetailResponse> createEditAutionDetailResponse(EditAutionDetailResponse value) {
        return new JAXBElement<EditAutionDetailResponse>(_EditAutionDetailResponse_QNAME, EditAutionDetailResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveAdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "removeAdResponse")
    public JAXBElement<RemoveAdResponse> createRemoveAdResponse(RemoveAdResponse value) {
        return new JAXBElement<RemoveAdResponse>(_RemoveAdResponse_QNAME, RemoveAdResponse.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link CountryTable }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "countryTable")
    public JAXBElement<CountryTable> createCountryTable(CountryTable value) {
        return new JAXBElement<CountryTable>(_CountryTable_QNAME, CountryTable.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddBidActivityResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "addBidActivityResponse")
    public JAXBElement<AddBidActivityResponse> createAddBidActivityResponse(AddBidActivityResponse value) {
        return new JAXBElement<AddBidActivityResponse>(_AddBidActivityResponse_QNAME, AddBidActivityResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddAuctionDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "addAuctionDetail")
    public JAXBElement<AddAuctionDetail> createAddAuctionDetail(AddAuctionDetail value) {
        return new JAXBElement<AddAuctionDetail>(_AddAuctionDetail_QNAME, AddAuctionDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShowUserDetails }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "showUserDetails")
    public JAXBElement<ShowUserDetails> createShowUserDetails(ShowUserDetails value) {
        return new JAXBElement<ShowUserDetails>(_ShowUserDetails_QNAME, ShowUserDetails.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveUserChat }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "removeUserChat")
    public JAXBElement<RemoveUserChat> createRemoveUserChat(RemoveUserChat value) {
        return new JAXBElement<RemoveUserChat>(_RemoveUserChat_QNAME, RemoveUserChat.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link AddImageForAd }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "addImageForAd")
    public JAXBElement<AddImageForAd> createAddImageForAd(AddImageForAd value) {
        return new JAXBElement<AddImageForAd>(_AddImageForAd_QNAME, AddImageForAd.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditAutionDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "editAutionDetail")
    public JAXBElement<EditAutionDetail> createEditAutionDetail(EditAutionDetail value) {
        return new JAXBElement<EditAutionDetail>(_EditAutionDetail_QNAME, EditAutionDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShowUserChatResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "showUserChatResponse")
    public JAXBElement<ShowUserChatResponse> createShowUserChatResponse(ShowUserChatResponse value) {
        return new JAXBElement<ShowUserChatResponse>(_ShowUserChatResponse_QNAME, ShowUserChatResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MaintainProfile }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "maintainProfile")
    public JAXBElement<MaintainProfile> createMaintainProfile(MaintainProfile value) {
        return new JAXBElement<MaintainProfile>(_MaintainProfile_QNAME, MaintainProfile.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveImageofAd }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "removeImageofAd")
    public JAXBElement<RemoveImageofAd> createRemoveImageofAd(RemoveImageofAd value) {
        return new JAXBElement<RemoveImageofAd>(_RemoveImageofAd_QNAME, RemoveImageofAd.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link AddAuctionImage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "addAuctionImage")
    public JAXBElement<AddAuctionImage> createAddAuctionImage(AddAuctionImage value) {
        return new JAXBElement<AddAuctionImage>(_AddAuctionImage_QNAME, AddAuctionImage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveImageofAdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "removeImageofAdResponse")
    public JAXBElement<RemoveImageofAdResponse> createRemoveImageofAdResponse(RemoveImageofAdResponse value) {
        return new JAXBElement<RemoveImageofAdResponse>(_RemoveImageofAdResponse_QNAME, RemoveImageofAdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Registration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "registration")
    public JAXBElement<Registration> createRegistration(Registration value) {
        return new JAXBElement<Registration>(_Registration_QNAME, Registration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddNewUserChatResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "addNewUserChatResponse")
    public JAXBElement<AddNewUserChatResponse> createAddNewUserChatResponse(AddNewUserChatResponse value) {
        return new JAXBElement<AddNewUserChatResponse>(_AddNewUserChatResponse_QNAME, AddNewUserChatResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegistrationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "registrationResponse")
    public JAXBElement<RegistrationResponse> createRegistrationResponse(RegistrationResponse value) {
        return new JAXBElement<RegistrationResponse>(_RegistrationResponse_QNAME, RegistrationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveAutionImageResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "removeAutionImageResponse")
    public JAXBElement<RemoveAutionImageResponse> createRemoveAutionImageResponse(RemoveAutionImageResponse value) {
        return new JAXBElement<RemoveAutionImageResponse>(_RemoveAutionImageResponse_QNAME, RemoveAutionImageResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddAuctionDetailResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "addAuctionDetailResponse")
    public JAXBElement<AddAuctionDetailResponse> createAddAuctionDetailResponse(AddAuctionDetailResponse value) {
        return new JAXBElement<AddAuctionDetailResponse>(_AddAuctionDetailResponse_QNAME, AddAuctionDetailResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddDetailsForAd }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "addDetailsForAd")
    public JAXBElement<AddDetailsForAd> createAddDetailsForAd(AddDetailsForAd value) {
        return new JAXBElement<AddDetailsForAd>(_AddDetailsForAd_QNAME, AddDetailsForAd.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditAdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "editAdResponse")
    public JAXBElement<EditAdResponse> createEditAdResponse(EditAdResponse value) {
        return new JAXBElement<EditAdResponse>(_EditAdResponse_QNAME, EditAdResponse.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveBidActivity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "removeBidActivity")
    public JAXBElement<RemoveBidActivity> createRemoveBidActivity(RemoveBidActivity value) {
        return new JAXBElement<RemoveBidActivity>(_RemoveBidActivity_QNAME, RemoveBidActivity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveAutionDetailResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "removeAutionDetailResponse")
    public JAXBElement<RemoveAutionDetailResponse> createRemoveAutionDetailResponse(RemoveAutionDetailResponse value) {
        return new JAXBElement<RemoveAutionDetailResponse>(_RemoveAutionDetailResponse_QNAME, RemoveAutionDetailResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditAdDetailsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "editAdDetailsResponse")
    public JAXBElement<EditAdDetailsResponse> createEditAdDetailsResponse(EditAdDetailsResponse value) {
        return new JAXBElement<EditAdDetailsResponse>(_EditAdDetailsResponse_QNAME, EditAdDetailsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShowUserChat }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "showUserChat")
    public JAXBElement<ShowUserChat> createShowUserChat(ShowUserChat value) {
        return new JAXBElement<ShowUserChat>(_ShowUserChat_QNAME, ShowUserChat.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditImageOfAd }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "editImageOfAd")
    public JAXBElement<EditImageOfAd> createEditImageOfAd(EditImageOfAd value) {
        return new JAXBElement<EditImageOfAd>(_EditImageOfAd_QNAME, EditImageOfAd.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveAd }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "removeAd")
    public JAXBElement<RemoveAd> createRemoveAd(RemoveAd value) {
        return new JAXBElement<RemoveAd>(_RemoveAd_QNAME, RemoveAd.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditAdDetails }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "editAdDetails")
    public JAXBElement<EditAdDetails> createEditAdDetails(EditAdDetails value) {
        return new JAXBElement<EditAdDetails>(_EditAdDetails_QNAME, EditAdDetails.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddNewUserChat }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "addNewUserChat")
    public JAXBElement<AddNewUserChat> createAddNewUserChat(AddNewUserChat value) {
        return new JAXBElement<AddNewUserChat>(_AddNewUserChat_QNAME, AddNewUserChat.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddNewAd }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "addNewAd")
    public JAXBElement<AddNewAd> createAddNewAd(AddNewAd value) {
        return new JAXBElement<AddNewAd>(_AddNewAd_QNAME, AddNewAd.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveAutionDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "removeAutionDetail")
    public JAXBElement<RemoveAutionDetail> createRemoveAutionDetail(RemoveAutionDetail value) {
        return new JAXBElement<RemoveAutionDetail>(_RemoveAutionDetail_QNAME, RemoveAutionDetail.class, null, value);
    }

}
