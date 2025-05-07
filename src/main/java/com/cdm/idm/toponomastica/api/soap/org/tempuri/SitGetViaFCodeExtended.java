
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
 *         <element name="pStreetCode" type=
"{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="pCivic" type=
"{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="pState" type=
"{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
        "pStreetCode",
        "pCivic",
        "pState",
        "pReference"
})
@XmlRootElement(name = "sitGetViaFCodeExtended")
public class SitGetViaFCodeExtended {

    @XmlElementRef(name = "pToken", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pToken;
    protected Integer pStreetCode;
    @XmlElementRef(name = "pCivic", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pCivic;
    protected Integer pState;
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
     * Recupera il valore della propriet� pStreetCode.
     * 
     * @return
     *         possible object is
     *         {@link Integer }
     * 
     */
    public Integer getPStreetCode() {
        return pStreetCode;
    }

    /**
     * Imposta il valore della propriet� pStreetCode.
     * 
     * @param value
     *              allowed object is
     *              {@link Integer }
     * 
     */
    public void setPStreetCode(Integer value) {
        this.pStreetCode = value;
    }

    /**
     * Recupera il valore della propriet� pCivic.
     * 
     * @return
     *         possible object is
     *         {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     */
    public JAXBElement<String> getPCivic() {
        return pCivic;
    }

    /**
     * Imposta il valore della propriet� pCivic.
     * 
     * @param value
     *              allowed object is
     *              {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     */
    public void setPCivic(JAXBElement<String> value) {
        this.pCivic = value;
    }

    /**
     * Recupera il valore della propriet� pState.
     * 
     * @return
     *         possible object is
     *         {@link Integer }
     * 
     */
    public Integer getPState() {
        return pState;
    }

    /**
     * Imposta il valore della propriet� pState.
     * 
     * @param value
     *              allowed object is
     *              {@link Integer }
     * 
     */
    public void setPState(Integer value) {
        this.pState = value;
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
