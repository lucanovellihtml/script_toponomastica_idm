
package org.tempuri;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per anonymous complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>{@code
 * <complexType>
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="pToken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="pData1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="pData2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "pToken",
    "pData1",
    "pData2"
})
@XmlRootElement(name = "sitGetCivicoChange")
public class SitGetCivicoChange {

    @XmlElementRef(name = "pToken", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pToken;
    @XmlElementRef(name = "pData1", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pData1;
    @XmlElementRef(name = "pData2", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pData2;

    /**
     * Recupera il valore della proprietà pToken.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPToken() {
        return pToken;
    }

    /**
     * Imposta il valore della proprietà pToken.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPToken(JAXBElement<String> value) {
        this.pToken = value;
    }

    /**
     * Recupera il valore della proprietà pData1.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPData1() {
        return pData1;
    }

    /**
     * Imposta il valore della proprietà pData1.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPData1(JAXBElement<String> value) {
        this.pData1 = value;
    }

    /**
     * Recupera il valore della proprietà pData2.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPData2() {
        return pData2;
    }

    /**
     * Imposta il valore della proprietà pData2.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPData2(JAXBElement<String> value) {
        this.pData2 = value;
    }

}
