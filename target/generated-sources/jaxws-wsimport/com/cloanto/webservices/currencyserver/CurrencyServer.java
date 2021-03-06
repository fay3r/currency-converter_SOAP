
package com.cloanto.webservices.currencyserver;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * Currency Server - An exchange rate information and currency conversion Web service. This is the version 4 legacy access point. For information on the latest version, please refer to currencysystem.com/managed.
 * 
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.8
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "CurrencyServer", targetNamespace = "http://webservices.cloanto.com/currencyserver/", wsdlLocation = "http://fx.cloanto.com/webservices/CloantoCurrencyServer.asmx?WSDL")
public class CurrencyServer
    extends Service
{

    private final static URL CURRENCYSERVER_WSDL_LOCATION;
    private final static WebServiceException CURRENCYSERVER_EXCEPTION;
    private final static QName CURRENCYSERVER_QNAME = new QName("http://webservices.cloanto.com/currencyserver/", "CurrencyServer");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://fx.cloanto.com/webservices/CloantoCurrencyServer.asmx?WSDL");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        CURRENCYSERVER_WSDL_LOCATION = url;
        CURRENCYSERVER_EXCEPTION = e;
    }

    public CurrencyServer() {
        super(__getWsdlLocation(), CURRENCYSERVER_QNAME);
    }

    public CurrencyServer(WebServiceFeature... features) {
        super(__getWsdlLocation(), CURRENCYSERVER_QNAME, features);
    }

    public CurrencyServer(URL wsdlLocation) {
        super(wsdlLocation, CURRENCYSERVER_QNAME);
    }

    public CurrencyServer(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, CURRENCYSERVER_QNAME, features);
    }

    public CurrencyServer(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public CurrencyServer(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns CurrencyServerSoap
     */
    @WebEndpoint(name = "CurrencyServerSoap")
    public CurrencyServerSoap getCurrencyServerSoap() {
        return super.getPort(new QName("http://webservices.cloanto.com/currencyserver/", "CurrencyServerSoap"), CurrencyServerSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns CurrencyServerSoap
     */
    @WebEndpoint(name = "CurrencyServerSoap")
    public CurrencyServerSoap getCurrencyServerSoap(WebServiceFeature... features) {
        return super.getPort(new QName("http://webservices.cloanto.com/currencyserver/", "CurrencyServerSoap"), CurrencyServerSoap.class, features);
    }

    /**
     * 
     * @return
     *     returns CurrencyServerSoap
     */
    @WebEndpoint(name = "CurrencyServerSoap12")
    public CurrencyServerSoap getCurrencyServerSoap12() {
        return super.getPort(new QName("http://webservices.cloanto.com/currencyserver/", "CurrencyServerSoap12"), CurrencyServerSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns CurrencyServerSoap
     */
    @WebEndpoint(name = "CurrencyServerSoap12")
    public CurrencyServerSoap getCurrencyServerSoap12(WebServiceFeature... features) {
        return super.getPort(new QName("http://webservices.cloanto.com/currencyserver/", "CurrencyServerSoap12"), CurrencyServerSoap.class, features);
    }

    /**
     * 
     * @return
     *     returns CurrencyServerHttpGet
     */
    @WebEndpoint(name = "CurrencyServerHttpGet")
    public CurrencyServerHttpGet getCurrencyServerHttpGet() {
        return super.getPort(new QName("http://webservices.cloanto.com/currencyserver/", "CurrencyServerHttpGet"), CurrencyServerHttpGet.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns CurrencyServerHttpGet
     */
    @WebEndpoint(name = "CurrencyServerHttpGet")
    public CurrencyServerHttpGet getCurrencyServerHttpGet(WebServiceFeature... features) {
        return super.getPort(new QName("http://webservices.cloanto.com/currencyserver/", "CurrencyServerHttpGet"), CurrencyServerHttpGet.class, features);
    }

    /**
     * 
     * @return
     *     returns CurrencyServerHttpPost
     */
    @WebEndpoint(name = "CurrencyServerHttpPost")
    public CurrencyServerHttpPost getCurrencyServerHttpPost() {
        return super.getPort(new QName("http://webservices.cloanto.com/currencyserver/", "CurrencyServerHttpPost"), CurrencyServerHttpPost.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns CurrencyServerHttpPost
     */
    @WebEndpoint(name = "CurrencyServerHttpPost")
    public CurrencyServerHttpPost getCurrencyServerHttpPost(WebServiceFeature... features) {
        return super.getPort(new QName("http://webservices.cloanto.com/currencyserver/", "CurrencyServerHttpPost"), CurrencyServerHttpPost.class, features);
    }

    private static URL __getWsdlLocation() {
        if (CURRENCYSERVER_EXCEPTION!= null) {
            throw CURRENCYSERVER_EXCEPTION;
        }
        return CURRENCYSERVER_WSDL_LOCATION;
    }

}
