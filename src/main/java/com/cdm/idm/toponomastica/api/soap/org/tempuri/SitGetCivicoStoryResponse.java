
package com.cdm.idm.toponomastica.api.soap.org.tempuri;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import com.cdm.idm.toponomastica.api.soap.org.datacontract.schemas._2004._07.wcftopo.TopoServiceTypeGetCivicoStory;

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
 *         <element name="sitGetCivicoStoryResult" type=
"{http://schemas.datacontract.org/2004/07/WcfTopo}TopoService.typeGetCivicoStory" minOccurs
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
        "sitGetCivicoStoryResult"
})
@XmlRootElement(name = "sitGetCivicoStoryResponse")
public class SitGetCivicoStoryResponse {

    @XmlElementRef(name = "sitGetCivicoStoryResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<TopoServiceTypeGetCivicoStory> sitGetCivicoStoryResult;

    /**
     * Recupera il valore della propriet� sitGetCivicoStoryResult.
     * 
     * @return
     *         possible object is
     *         {@link JAXBElement }{@code <}{@link TopoServiceTypeGetCivicoStory
     *         }{@code >}
     * 
     */
    public JAXBElement<TopoServiceTypeGetCivicoStory> getSitGetCivicoStoryResult() {
        return sitGetCivicoStoryResult;
    }

    /**
     * Imposta il valore della propriet� sitGetCivicoStoryResult.
     * 
     * @param value
     *              allowed object is
     *              {@link JAXBElement
     *              }{@code <}{@link TopoServiceTypeGetCivicoStory }{@code >}
     * 
     */
    public void setSitGetCivicoStoryResult(JAXBElement<TopoServiceTypeGetCivicoStory> value) {
        this.sitGetCivicoStoryResult = value;
    }

}
