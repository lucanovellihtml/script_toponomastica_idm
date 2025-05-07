
package com.cdm.idm.toponomastica.api.soap.org.datacontract.schemas._2004._07.wcftopo;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;

/**
 * <p>
 * Classe Java per TopoService.typeGetCivicoStoryCivic complex type.
 * 
 * <p>
 * Il seguente frammento di schema specifica il contenuto previsto contenuto in
 * questa classe.
 * 
 * <pre>{@code
 * <complexType name="TopoService.typeGetCivicoStoryCivic">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="DateDown" type=
"{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="DateUp" type=
"{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="IDC" type=
"{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TopoService.typeGetCivicoStoryCivic", propOrder = {
        "dateDown",
        "dateUp",
        "idc"
})
public class TopoServiceTypeGetCivicoStoryCivic {

    @XmlElementRef(name = "DateDown", namespace = "http://schemas.datacontract.org/2004/07/WcfTopo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dateDown;
    @XmlElementRef(name = "DateUp", namespace = "http://schemas.datacontract.org/2004/07/WcfTopo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dateUp;
    @XmlElement(name = "IDC")
    protected Integer idc;

    /**
     * Recupera il valore della propriet� dateDown.
     * 
     * @return
     *         possible object is
     *         {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     */
    public JAXBElement<String> getDateDown() {
        return dateDown;
    }

    /**
     * Imposta il valore della propriet� dateDown.
     * 
     * @param value
     *              allowed object is
     *              {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     */
    public void setDateDown(JAXBElement<String> value) {
        this.dateDown = value;
    }

    /**
     * Recupera il valore della propriet� dateUp.
     * 
     * @return
     *         possible object is
     *         {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     */
    public JAXBElement<String> getDateUp() {
        return dateUp;
    }

    /**
     * Imposta il valore della propriet� dateUp.
     * 
     * @param value
     *              allowed object is
     *              {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     */
    public void setDateUp(JAXBElement<String> value) {
        this.dateUp = value;
    }

    /**
     * Recupera il valore della propriet� idc.
     * 
     * @return
     *         possible object is
     *         {@link Integer }
     * 
     */
    public Integer getIDC() {
        return idc;
    }

    /**
     * Imposta il valore della propriet� idc.
     * 
     * @param value
     *              allowed object is
     *              {@link Integer }
     * 
     */
    public void setIDC(Integer value) {
        this.idc = value;
    }

}
