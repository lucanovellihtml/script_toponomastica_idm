
package com.cdm.idm.toponomastica.api.soap.org.tempuri;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import com.cdm.idm.toponomastica.api.soap.org.datacontract.schemas._2004._07.wcftopo.TopoServiceTypeGetCivicoChange;

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
 *         <element name="sitGetCivicoChangeResult" type=
"{http://schemas.datacontract.org/2004/07/WcfTopo}TopoService.typeGetCivicoChange" minOccurs
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
        "sitGetCivicoChangeResult"
})
@XmlRootElement(name = "sitGetCivicoChangeResponse")
public class SitGetCivicoChangeResponse {

    @XmlElementRef(name = "sitGetCivicoChangeResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<TopoServiceTypeGetCivicoChange> sitGetCivicoChangeResult;

    /**
     * Recupera il valore della propriet� sitGetCivicoChangeResult.
     * 
     * @return
     *         possible object is
     *         {@link JAXBElement }{@code <}{@link TopoServiceTypeGetCivicoChange
     *         }{@code >}
     * 
     */
    public JAXBElement<TopoServiceTypeGetCivicoChange> getSitGetCivicoChangeResult() {
        return sitGetCivicoChangeResult;
    }

    /**
     * Imposta il valore della propriet� sitGetCivicoChangeResult.
     * 
     * @param value
     *              allowed object is
     *              {@link JAXBElement
     *              }{@code <}{@link TopoServiceTypeGetCivicoChange }{@code >}
     * 
     */
    public void setSitGetCivicoChangeResult(JAXBElement<TopoServiceTypeGetCivicoChange> value) {
        this.sitGetCivicoChangeResult = value;
    }

}
