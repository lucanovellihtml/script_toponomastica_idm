
package com.cdm.idm.toponomastica.api.soap.org.tempuri;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;

/**
 * <p>
 * Classe Java per anonymous complex type.
 * 
 * <p>
 * Il seguente frammento di schema specifica il contenuto previsto contenuto in
 * questa classe.
 * 
 * <pre>{@code
 * <complexType>
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="pToken" type=
"{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="pCode" type=
"{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="pPolygonJson" type=
"{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="pReference" type=
"{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
        "pCode",
        "pPolygonJson",
        "pReference"
})
@XmlRootElement(name = "sitGetValueFPolygon")
public class SitGetValueFPolygon {

    @XmlElementRef(name = "pToken", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pToken;
    @XmlElementRef(name = "pCode", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pCode;
    @XmlElementRef(name = "pPolygonJson", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pPolygonJson;
    protected Integer pReference;

    /**
     * Recupera il valore della propriet� pToken.
     * 
     * @return
     *         possible object is
     *         {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     */
    public JAXBElement<String> getPToken() {
        return pToken;
    }

    /**
     * Imposta il valore della propriet� pToken.
     * 
     * @param value
     *              allowed object is
     *              {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     */
    public void setPToken(JAXBElement<String> value) {
        this.pToken = value;
    }

    /**
     * Recupera il valore della propriet� pCode.
     * 
     * @return
     *         possible object is
     *         {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     */
    public JAXBElement<String> getPCode() {
        return pCode;
    }

    /**
     * Imposta il valore della propriet� pCode.
     * 
     * @param value
     *              allowed object is
     *              {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     */
    public void setPCode(JAXBElement<String> value) {
        this.pCode = value;
    }

    /**
     * Recupera il valore della propriet� pPolygonJson.
     * 
     * @return
     *         possible object is
     *         {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     */
    public JAXBElement<String> getPPolygonJson() {
        return pPolygonJson;
    }

    /**
     * Imposta il valore della propriet� pPolygonJson.
     * 
     * @param value
     *              allowed object is
     *              {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     */
    public void setPPolygonJson(JAXBElement<String> value) {
        this.pPolygonJson = value;
    }

    /**
     * Recupera il valore della propriet� pReference.
     * 
     * @return
     *         possible object is
     *         {@link Integer }
     * 
     */
    public Integer getPReference() {
        return pReference;
    }

    /**
     * Imposta il valore della propriet� pReference.
     * 
     * @param value
     *              allowed object is
     *              {@link Integer }
     * 
     */
    public void setPReference(Integer value) {
        this.pReference = value;
    }

}
