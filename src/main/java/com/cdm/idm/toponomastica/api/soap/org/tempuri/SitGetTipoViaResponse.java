
package com.cdm.idm.toponomastica.api.soap.org.tempuri;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import com.cdm.idm.toponomastica.api.soap.org.datacontract.schemas._2004._07.wcftopo.TopoServiceTypeGetTipoVia;

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
 *         <element name="sitGetTipoViaResult" type=
"{http://schemas.datacontract.org/2004/07/WcfTopo}TopoService.typeGetTipoVia" minOccurs
="0"/>
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
        "sitGetTipoViaResult"
})
@XmlRootElement(name = "sitGetTipoViaResponse")
public class SitGetTipoViaResponse {

    @XmlElementRef(name = "sitGetTipoViaResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<TopoServiceTypeGetTipoVia> sitGetTipoViaResult;

    /**
     * Recupera il valore della propriet� sitGetTipoViaResult.
     * 
     * @return
     *         possible object is
     *         {@link JAXBElement }{@code <}{@link TopoServiceTypeGetTipoVia
     *         }{@code >}
     * 
     */
    public JAXBElement<TopoServiceTypeGetTipoVia> getSitGetTipoViaResult() {
        return sitGetTipoViaResult;
    }

    /**
     * Imposta il valore della propriet� sitGetTipoViaResult.
     * 
     * @param value
     *              allowed object is
     *              {@link JAXBElement }{@code <}{@link TopoServiceTypeGetTipoVia
     *              }{@code >}
     * 
     */
    public void setSitGetTipoViaResult(JAXBElement<TopoServiceTypeGetTipoVia> value) {
        this.sitGetTipoViaResult = value;
    }

}
