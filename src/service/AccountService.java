
package service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebService(name = "AccountService", targetNamespace = "http://service/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface AccountService {


    /**
     * 
     * @param arg0
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "userNameExist", targetNamespace = "http://service/", className = "service.UserNameExist")
    @ResponseWrapper(localName = "userNameExistResponse", targetNamespace = "http://service/", className = "service.UserNameExistResponse")
    @Action(input = "http://service/AccountService/userNameExistRequest", output = "http://service/AccountService/userNameExistResponse")
    public boolean userNameExist(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns service.AccountTransfer
     */
    @WebMethod(operationName = "Login")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "Login", targetNamespace = "http://service/", className = "service.Login")
    @ResponseWrapper(localName = "LoginResponse", targetNamespace = "http://service/", className = "service.LoginResponse")
    @Action(input = "http://service/AccountService/LoginRequest", output = "http://service/AccountService/LoginResponse")
    public AccountTransfer login(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1);

    /**
     * 
     * @param arg2
     * @param arg1
     * @param arg0
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "createUser", targetNamespace = "http://service/", className = "service.CreateUser")
    @ResponseWrapper(localName = "createUserResponse", targetNamespace = "http://service/", className = "service.CreateUserResponse")
    @Action(input = "http://service/AccountService/createUserRequest", output = "http://service/AccountService/createUserResponse")
    public boolean createUser(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        String arg2);

    /**
     * 
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getRowCount", targetNamespace = "http://service/", className = "service.GetRowCount")
    @ResponseWrapper(localName = "getRowCountResponse", targetNamespace = "http://service/", className = "service.GetRowCountResponse")
    @Action(input = "http://service/AccountService/getRowCountRequest", output = "http://service/AccountService/getRowCountResponse")
    public int getRowCount();

}
