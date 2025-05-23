
package org.tempuri;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;

/**
 * This class was generated by the XML-WS Tools.
 * XML-WS Tools 4.0.1
 * Generated source version: 3.0
 * 
 */
@WebServiceClient(name = "Toponomastica4.5", targetNamespace = "http://tempuri.org/", wsdlLocation = "file:/home/openidm/wsdl-toponomastica/Toponomastica4.5_fixed.wsdl")
public class Toponomastica45
        extends Service {

    private static final URL TOPONOMASTICA45_WSDL_LOCATION;
    private static final WebServiceException TOPONOMASTICA45_EXCEPTION;
    private static final QName TOPONOMASTICA45_QNAME = new QName("http://tempuri.org/", "Toponomastica4.5");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL(
                    "file:/home/openidm/wsdl-toponomastica/Toponomastica4.5_fixed.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        TOPONOMASTICA45_WSDL_LOCATION = url;
        TOPONOMASTICA45_EXCEPTION = e;
    }

    public Toponomastica45() {
        super(__getWsdlLocation(), TOPONOMASTICA45_QNAME);
    }

    public Toponomastica45(WebServiceFeature... features) {
        super(__getWsdlLocation(), TOPONOMASTICA45_QNAME, features);
    }

    public Toponomastica45(URL wsdlLocation) {
        super(wsdlLocation, TOPONOMASTICA45_QNAME);
    }

    public Toponomastica45(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, TOPONOMASTICA45_QNAME, features);
    }

    public Toponomastica45(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public Toponomastica45(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *         returns Toponomastica45PortType
     */
    @WebEndpoint(name = "Toponomastica4.5HttpsSoap11Endpoint")
    public Toponomastica45PortType getToponomastica45HttpsSoap11Endpoint() {
        return super.getPort(new QName("http://tempuri.org/", "Toponomastica4.5HttpsSoap11Endpoint"),
                Toponomastica45PortType.class);
    }

    /**
     * 
     * @param features
     *                 A list of {@link jakarta.xml.ws.WebServiceFeature} to
     *                 configure on the proxy. Supported features not in the
     *                 <code>features</code> parameter will have their default
     *                 values.
     * @return
     *         returns Toponomastica45PortType
     */
    @WebEndpoint(name = "Toponomastica4.5HttpsSoap11Endpoint")
    public Toponomastica45PortType getToponomastica45HttpsSoap11Endpoint(WebServiceFeature... features) {
        return super.getPort(new QName("http://tempuri.org/", "Toponomastica4.5HttpsSoap11Endpoint"),
                Toponomastica45PortType.class, features);
    }

    private static URL __getWsdlLocation() {
        if (TOPONOMASTICA45_EXCEPTION != null) {
            throw TOPONOMASTICA45_EXCEPTION;
        }
        return TOPONOMASTICA45_WSDL_LOCATION;
    }

}
