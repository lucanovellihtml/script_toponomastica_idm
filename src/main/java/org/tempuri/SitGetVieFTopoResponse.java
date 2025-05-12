
package org.tempuri;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.wcftopo.TopoServiceTypeGetVieFTopo;


/**
 * <p>Classe Java per anonymous complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>{@code
 * <complexType>
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="sitGetVieFTopoResult" type="{http://schemas.datacontract.org/2004/07/WcfTopo}TopoService.typeGetVieFTopo" minOccurs="0"/>
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
    "sitGetVieFTopoResult"
})
@XmlRootElement(name = "sitGetVieFTopoResponse")
public class SitGetVieFTopoResponse {

    @XmlElementRef(name = "sitGetVieFTopoResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<TopoServiceTypeGetVieFTopo> sitGetVieFTopoResult;

    /**
     * Recupera il valore della proprietà sitGetVieFTopoResult.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TopoServiceTypeGetVieFTopo }{@code >}
     *     
     */
    public JAXBElement<TopoServiceTypeGetVieFTopo> getSitGetVieFTopoResult() {
        return sitGetVieFTopoResult;
    }

    /**
     * Imposta il valore della proprietà sitGetVieFTopoResult.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TopoServiceTypeGetVieFTopo }{@code >}
     *     
     */
    public void setSitGetVieFTopoResult(JAXBElement<TopoServiceTypeGetVieFTopo> value) {
        this.sitGetVieFTopoResult = value;
    }

}
