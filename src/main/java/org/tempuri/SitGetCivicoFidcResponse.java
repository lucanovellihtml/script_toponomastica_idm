
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.wcftopo.TopoServiceTypeGetCivicoFidc;

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
 *         <element name="sitGetCivicoFidcResult" type=
"{http://schemas.datacontract.org/2004/07/WcfTopo}TopoService.typeGetCivicoFidc" minOccurs
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
        "sitGetCivicoFidcResult"
})
@XmlRootElement(name = "sitGetCivicoFidcResponse")
public class SitGetCivicoFidcResponse {

    @XmlElementRef(name = "sitGetCivicoFidcResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<TopoServiceTypeGetCivicoFidc> sitGetCivicoFidcResult;

    /**
     * Recupera il valore della propriet� sitGetCivicoFidcResult.
     * 
     * @return
     *         possible object is
     *         {@link JAXBElement }{@code <}{@link TopoServiceTypeGetCivicoFidc
     *         }{@code >}
     * 
     */
    public JAXBElement<TopoServiceTypeGetCivicoFidc> getSitGetCivicoFidcResult() {
        return sitGetCivicoFidcResult;
    }

    /**
     * Imposta il valore della propriet� sitGetCivicoFidcResult.
     * 
     * @param value
     *              allowed object is
     *              {@link JAXBElement }{@code <}{@link TopoServiceTypeGetCivicoFidc
     *              }{@code >}
     * 
     */
    public void setSitGetCivicoFidcResult(JAXBElement<TopoServiceTypeGetCivicoFidc> value) {
        this.sitGetCivicoFidcResult = value;
    }

}
