
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.wcftopo.TopoServiceTypeGetCivicoReplace;

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
 *         <element name="sitGetCivicoReplaceResult" type=
"{http://schemas.datacontract.org/2004/07/WcfTopo}TopoService.typeGetCivicoReplace" minOccurs
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
        "sitGetCivicoReplaceResult"
})
@XmlRootElement(name = "sitGetCivicoReplaceResponse")
public class SitGetCivicoReplaceResponse {

    @XmlElementRef(name = "sitGetCivicoReplaceResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<TopoServiceTypeGetCivicoReplace> sitGetCivicoReplaceResult;

    /**
     * Recupera il valore della propriet� sitGetCivicoReplaceResult.
     * 
     * @return
     *         possible object is
     *         {@link JAXBElement }{@code <}{@link TopoServiceTypeGetCivicoReplace
     *         }{@code >}
     * 
     */
    public JAXBElement<TopoServiceTypeGetCivicoReplace> getSitGetCivicoReplaceResult() {
        return sitGetCivicoReplaceResult;
    }

    /**
     * Imposta il valore della propriet� sitGetCivicoReplaceResult.
     * 
     * @param value
     *              allowed object is
     *              {@link JAXBElement
     *              }{@code <}{@link TopoServiceTypeGetCivicoReplace }{@code >}
     * 
     */
    public void setSitGetCivicoReplaceResult(JAXBElement<TopoServiceTypeGetCivicoReplace> value) {
        this.sitGetCivicoReplaceResult = value;
    }

}
