
package com.cdm.idm.toponomastica.api.soap.org.tempuri;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import com.cdm.idm.toponomastica.api.soap.org.datacontract.schemas._2004._07.wcftopo.TopoServiceTypeGetValue;

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
 *         <element name="sitGetValueFPolygonResult" type=
"{http://schemas.datacontract.org/2004/07/WcfTopo}TopoService.typeGetValue" minOccurs
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
        "sitGetValueFPolygonResult"
})
@XmlRootElement(name = "sitGetValueFPolygonResponse")
public class SitGetValueFPolygonResponse {

    @XmlElementRef(name = "sitGetValueFPolygonResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<TopoServiceTypeGetValue> sitGetValueFPolygonResult;

    /**
     * Recupera il valore della propriet� sitGetValueFPolygonResult.
     * 
     * @return
     *         possible object is
     *         {@link JAXBElement }{@code <}{@link TopoServiceTypeGetValue
     *         }{@code >}
     * 
     */
    public JAXBElement<TopoServiceTypeGetValue> getSitGetValueFPolygonResult() {
        return sitGetValueFPolygonResult;
    }

    /**
     * Imposta il valore della propriet� sitGetValueFPolygonResult.
     * 
     * @param value
     *              allowed object is
     *              {@link JAXBElement }{@code <}{@link TopoServiceTypeGetValue
     *              }{@code >}
     * 
     */
    public void setSitGetValueFPolygonResult(JAXBElement<TopoServiceTypeGetValue> value) {
        this.sitGetValueFPolygonResult = value;
    }

}
