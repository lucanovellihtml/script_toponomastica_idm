
package com.cdm.idm.toponomastica.api.soap.org.tempuri;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import com.cdm.idm.toponomastica.api.soap.org.datacontract.schemas._2004._07.wcftopo.TopoServiceTypeGetCiviciFPointExtended;

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
 *         <element name="sitGetCiviciFPointExtendedResult" type=
"{http://schemas.datacontract.org/2004/07/WcfTopo}TopoService.typeGetCiviciFPointExtended" minOccurs
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
        "sitGetCiviciFPointExtendedResult"
})
@XmlRootElement(name = "sitGetCiviciFPointExtendedResponse")
public class SitGetCiviciFPointExtendedResponse {

    @XmlElementRef(name = "sitGetCiviciFPointExtendedResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<TopoServiceTypeGetCiviciFPointExtended> sitGetCiviciFPointExtendedResult;

    /**
     * Recupera il valore della propriet� sitGetCiviciFPointExtendedResult.
     * 
     * @return
     *         possible object is
     *         {@link JAXBElement
     *         }{@code <}{@link TopoServiceTypeGetCiviciFPointExtended }{@code >}
     * 
     */
    public JAXBElement<TopoServiceTypeGetCiviciFPointExtended> getSitGetCiviciFPointExtendedResult() {
        return sitGetCiviciFPointExtendedResult;
    }

    /**
     * Imposta il valore della propriet� sitGetCiviciFPointExtendedResult.
     * 
     * @param value
     *              allowed object is
     *              {@link JAXBElement
     *              }{@code <}{@link TopoServiceTypeGetCiviciFPointExtended
     *              }{@code >}
     * 
     */
    public void setSitGetCiviciFPointExtendedResult(JAXBElement<TopoServiceTypeGetCiviciFPointExtended> value) {
        this.sitGetCiviciFPointExtendedResult = value;
    }

}
