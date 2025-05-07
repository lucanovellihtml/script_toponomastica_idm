
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
        "pToken"
})
@XmlRootElement(name = "sitGetInfo")
public class SitGetInfo {

    @XmlElementRef(name = "pToken", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pToken;

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

}
