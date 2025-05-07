
package com.cdm.idm.toponomastica.api.soap.org.tempuri;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import com.cdm.idm.toponomastica.api.soap.org.datacontract.schemas._2004._07.wcftopo.TopoServiceTypeGetInfo;

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
 *         <element name="sitGetInfoResult" type=
"{http://schemas.datacontract.org/2004/07/WcfTopo}TopoService.typeGetInfo" minOccurs
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
        "sitGetInfoResult"
})
@XmlRootElement(name = "sitGetInfoResponse")
public class SitGetInfoResponse {

    @XmlElementRef(name = "sitGetInfoResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<TopoServiceTypeGetInfo> sitGetInfoResult;

    /**
     * Recupera il valore della propriet� sitGetInfoResult.
     * 
     * @return
     *         possible object is
     *         {@link JAXBElement }{@code <}{@link TopoServiceTypeGetInfo }{@code >}
     * 
     */
    public JAXBElement<TopoServiceTypeGetInfo> getSitGetInfoResult() {
        return sitGetInfoResult;
    }

    /**
     * Imposta il valore della propriet� sitGetInfoResult.
     * 
     * @param value
     *              allowed object is
     *              {@link JAXBElement }{@code <}{@link TopoServiceTypeGetInfo
     *              }{@code >}
     * 
     */
    public void setSitGetInfoResult(JAXBElement<TopoServiceTypeGetInfo> value) {
        this.sitGetInfoResult = value;
    }

}
