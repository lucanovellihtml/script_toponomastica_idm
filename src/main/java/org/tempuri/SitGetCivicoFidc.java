
package org.tempuri;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
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
 *         <element name="pIDC" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="pReference" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
    "pidc",
    "pReference"
})
@XmlRootElement(name = "sitGetCivicoFidc")
public class SitGetCivicoFidc {

    @XmlElementRef(name = "pToken", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pToken;
    @XmlElement(name = "pIDC")
    protected Integer pidc;
    protected Integer pReference;

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
     * Recupera il valore della proprietà pidc.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPIDC() {
        return pidc;
    }

    /**
     * Imposta il valore della proprietà pidc.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPIDC(Integer value) {
        this.pidc = value;
    }

    /**
     * Recupera il valore della proprietà pReference.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPReference() {
        return pReference;
    }

    /**
     * Imposta il valore della proprietà pReference.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPReference(Integer value) {
        this.pReference = value;
    }

}
