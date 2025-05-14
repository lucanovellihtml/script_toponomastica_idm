
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.wcftopo.TopoServiceTypeGetValue;

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
 *         <element name="sitGetValueFidcResult" type=
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
        "sitGetValueFidcResult"
})
@XmlRootElement(name = "sitGetValueFidcResponse")
public class SitGetValueFidcResponse {

    @XmlElementRef(name = "sitGetValueFidcResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<TopoServiceTypeGetValue> sitGetValueFidcResult;

    /**
     * Recupera il valore della propriet� sitGetValueFidcResult.
     * 
     * @return
     *         possible object is
     *         {@link JAXBElement }{@code <}{@link TopoServiceTypeGetValue
     *         }{@code >}
     * 
     */
    public JAXBElement<TopoServiceTypeGetValue> getSitGetValueFidcResult() {
        return sitGetValueFidcResult;
    }

    /**
     * Imposta il valore della propriet� sitGetValueFidcResult.
     * 
     * @param value
     *              allowed object is
     *              {@link JAXBElement }{@code <}{@link TopoServiceTypeGetValue
     *              }{@code >}
     * 
     */
    public void setSitGetValueFidcResult(JAXBElement<TopoServiceTypeGetValue> value) {
        this.sitGetValueFidcResult = value;
    }

}
