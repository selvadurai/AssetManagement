
package service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the service package. 
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

    private final static QName _LoginResponse_QNAME = new QName("http://service/", "LoginResponse");
    private final static QName _UserNameExistResponse_QNAME = new QName("http://service/", "userNameExistResponse");
    private final static QName _CreateUserResponse_QNAME = new QName("http://service/", "createUserResponse");
    private final static QName _GetRowCount_QNAME = new QName("http://service/", "getRowCount");
    private final static QName _GetRowCountResponse_QNAME = new QName("http://service/", "getRowCountResponse");
    private final static QName _UserNameExist_QNAME = new QName("http://service/", "userNameExist");
    private final static QName _AccountTransfer_QNAME = new QName("http://service/", "AccountTransfer");
    private final static QName _CreateUser_QNAME = new QName("http://service/", "createUser");
    private final static QName _Login_QNAME = new QName("http://service/", "Login");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Login }
     * 
     */
    public Login createLogin() {
        return new Login();
    }

    /**
     * Create an instance of {@link CreateUser }
     * 
     */
    public CreateUser createCreateUser() {
        return new CreateUser();
    }

    /**
     * Create an instance of {@link AccountTransfer }
     * 
     */
    public AccountTransfer createAccountTransfer() {
        return new AccountTransfer();
    }

    /**
     * Create an instance of {@link UserNameExist }
     * 
     */
    public UserNameExist createUserNameExist() {
        return new UserNameExist();
    }

    /**
     * Create an instance of {@link GetRowCountResponse }
     * 
     */
    public GetRowCountResponse createGetRowCountResponse() {
        return new GetRowCountResponse();
    }

    /**
     * Create an instance of {@link GetRowCount }
     * 
     */
    public GetRowCount createGetRowCount() {
        return new GetRowCount();
    }

    /**
     * Create an instance of {@link CreateUserResponse }
     * 
     */
    public CreateUserResponse createCreateUserResponse() {
        return new CreateUserResponse();
    }

    /**
     * Create an instance of {@link UserNameExistResponse }
     * 
     */
    public UserNameExistResponse createUserNameExistResponse() {
        return new UserNameExistResponse();
    }

    /**
     * Create an instance of {@link LoginResponse }
     * 
     */
    public LoginResponse createLoginResponse() {
        return new LoginResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "LoginResponse")
    public JAXBElement<LoginResponse> createLoginResponse(LoginResponse value) {
        return new JAXBElement<LoginResponse>(_LoginResponse_QNAME, LoginResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserNameExistResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "userNameExistResponse")
    public JAXBElement<UserNameExistResponse> createUserNameExistResponse(UserNameExistResponse value) {
        return new JAXBElement<UserNameExistResponse>(_UserNameExistResponse_QNAME, UserNameExistResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "createUserResponse")
    public JAXBElement<CreateUserResponse> createCreateUserResponse(CreateUserResponse value) {
        return new JAXBElement<CreateUserResponse>(_CreateUserResponse_QNAME, CreateUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRowCount }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "getRowCount")
    public JAXBElement<GetRowCount> createGetRowCount(GetRowCount value) {
        return new JAXBElement<GetRowCount>(_GetRowCount_QNAME, GetRowCount.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRowCountResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "getRowCountResponse")
    public JAXBElement<GetRowCountResponse> createGetRowCountResponse(GetRowCountResponse value) {
        return new JAXBElement<GetRowCountResponse>(_GetRowCountResponse_QNAME, GetRowCountResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserNameExist }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "userNameExist")
    public JAXBElement<UserNameExist> createUserNameExist(UserNameExist value) {
        return new JAXBElement<UserNameExist>(_UserNameExist_QNAME, UserNameExist.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccountTransfer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "AccountTransfer")
    public JAXBElement<AccountTransfer> createAccountTransfer(AccountTransfer value) {
        return new JAXBElement<AccountTransfer>(_AccountTransfer_QNAME, AccountTransfer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "createUser")
    public JAXBElement<CreateUser> createCreateUser(CreateUser value) {
        return new JAXBElement<CreateUser>(_CreateUser_QNAME, CreateUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Login }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "Login")
    public JAXBElement<Login> createLogin(Login value) {
        return new JAXBElement<Login>(_Login_QNAME, Login.class, null, value);
    }

}
