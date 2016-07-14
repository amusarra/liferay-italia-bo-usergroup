
package com.predic8.wsdl.crm.crmservice._1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.predic8.wsdl.crm.crmservice._1 package. 
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

    private final static QName _Create_QNAME = new QName("http://predic8.com/wsdl/crm/CRMService/1/", "create");
    private final static QName _GetAll_QNAME = new QName("http://predic8.com/wsdl/crm/CRMService/1/", "getAll");
    private final static QName _Get_QNAME = new QName("http://predic8.com/wsdl/crm/CRMService/1/", "get");
    private final static QName _GetResponse_QNAME = new QName("http://predic8.com/wsdl/crm/CRMService/1/", "getResponse");
    private final static QName _GetAllResponse_QNAME = new QName("http://predic8.com/wsdl/crm/CRMService/1/", "getAllResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.predic8.wsdl.crm.crmservice._1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetAllType }
     * 
     */
    public GetAllType createGetAllType() {
        return new GetAllType();
    }

    /**
     * Create an instance of {@link GetResponseType }
     * 
     */
    public GetResponseType createGetResponseType() {
        return new GetResponseType();
    }

    /**
     * Create an instance of {@link GetAllResponseType }
     * 
     */
    public GetAllResponseType createGetAllResponseType() {
        return new GetAllResponseType();
    }

    /**
     * Create an instance of {@link GetType }
     * 
     */
    public GetType createGetType() {
        return new GetType();
    }

    /**
     * Create an instance of {@link CreateResponse }
     * 
     */
    public CreateResponse createCreateResponse() {
        return new CreateResponse();
    }

    /**
     * Create an instance of {@link CreateType }
     * 
     */
    public CreateType createCreateType() {
        return new CreateType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://predic8.com/wsdl/crm/CRMService/1/", name = "create")
    public JAXBElement<CreateType> createCreate(CreateType value) {
        return new JAXBElement<CreateType>(_Create_QNAME, CreateType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://predic8.com/wsdl/crm/CRMService/1/", name = "getAll")
    public JAXBElement<GetAllType> createGetAll(GetAllType value) {
        return new JAXBElement<GetAllType>(_GetAll_QNAME, GetAllType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://predic8.com/wsdl/crm/CRMService/1/", name = "get")
    public JAXBElement<GetType> createGet(GetType value) {
        return new JAXBElement<GetType>(_Get_QNAME, GetType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://predic8.com/wsdl/crm/CRMService/1/", name = "getResponse")
    public JAXBElement<GetResponseType> createGetResponse(GetResponseType value) {
        return new JAXBElement<GetResponseType>(_GetResponse_QNAME, GetResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://predic8.com/wsdl/crm/CRMService/1/", name = "getAllResponse")
    public JAXBElement<GetAllResponseType> createGetAllResponse(GetAllResponseType value) {
        return new JAXBElement<GetAllResponseType>(_GetAllResponse_QNAME, GetAllResponseType.class, null, value);
    }

}
