
package com.cdm.idm.toponomastica.api.soap.org.tempuri;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import com.cdm.idm.toponomastica.api.soap.org.datacontract.schemas._2004._07.wcftopo.TopoServiceTypeGetData;

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
 *         <element name="sitGetDataResult" type=
"{http://schemas.datacontract.org/2004/07/WcfTopo}TopoService.typeGetData" minOccurs
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
        "sitGetDataResult"
})
@XmlRootElement(name = "sitGetDataResponse")
public class SitGetDataResponse {

    @XmlElementRef(name = "sitGetDataResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<TopoServiceTypeGetData> sitGetDataResult;

    /**
     * Recupera il valore della propriet� sitGetDataResult.
     * 
     * @return
     *         possible object is
     *         {@link JAXBElement }{@code <}{@link TopoServiceTypeGetData }{@code >}
     * 
     */
    public JAXBElement<TopoServiceTypeGetData> getSitGetDataResult() {
        return sitGetDataResult;
    }

    /**
     * Imposta il valore della propriet� sitGetDataResult.
     * 
     * @param value
     *              allowed object is
     *              {@link JAXBElement }{@code <}{@link TopoServiceTypeGetData
     *              }{@code >}
     * 
     */
    public void setSitGetDataResult(JAXBElement<TopoServiceTypeGetData> value) {
        this.sitGetDataResult = value;
    }

}
