
package com.cdm.idm.toponomastica.api.soap.org.tempuri;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import com.cdm.idm.toponomastica.api.soap.org.datacontract.schemas._2004._07.wcftopo.TopoServiceTypeGetViaFCodeExtended;

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
 *         <element name="sitGetViaFCodeExtendedResult" type=
"{http://schemas.datacontract.org/2004/07/WcfTopo}TopoService.typeGetViaFCodeExtended" minOccurs
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
        "sitGetViaFCodeExtendedResult"
})
@XmlRootElement(name = "sitGetViaFCodeExtendedResponse")
public class SitGetViaFCodeExtendedResponse {

    @XmlElementRef(name = "sitGetViaFCodeExtendedResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<TopoServiceTypeGetViaFCodeExtended> sitGetViaFCodeExtendedResult;

    /**
     * Recupera il valore della propriet� sitGetViaFCodeExtendedResult.
     * 
     * @return
     *         possible object is
     *         {@link JAXBElement
     *         }{@code <}{@link TopoServiceTypeGetViaFCodeExtended }{@code >}
     * 
     */
    public JAXBElement<TopoServiceTypeGetViaFCodeExtended> getSitGetViaFCodeExtendedResult() {
        return sitGetViaFCodeExtendedResult;
    }

    /**
     * Imposta il valore della propriet� sitGetViaFCodeExtendedResult.
     * 
     * @param value
     *              allowed object is
     *              {@link JAXBElement
     *              }{@code <}{@link TopoServiceTypeGetViaFCodeExtended }{@code >}
     * 
     */
    public void setSitGetViaFCodeExtendedResult(JAXBElement<TopoServiceTypeGetViaFCodeExtended> value) {
        this.sitGetViaFCodeExtendedResult = value;
    }

}
