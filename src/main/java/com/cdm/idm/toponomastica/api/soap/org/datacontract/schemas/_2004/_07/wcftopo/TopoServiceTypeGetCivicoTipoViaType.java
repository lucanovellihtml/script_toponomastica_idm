
package com.cdm.idm.toponomastica.api.soap.org.datacontract.schemas._2004._07.wcftopo;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;

/**
 * <p>
 * Classe Java per TopoService.typeGetCivicoTipoViaType complex type.
 * 
 * <p>
 * Il seguente frammento di schema specifica il contenuto previsto contenuto in
 * questa classe.
 * 
 * <pre>{@code
 * <complexType name="TopoService.typeGetCivicoTipoViaType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Code" type=
"{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="DescriptioShort" type=
"{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="DescriptionExtended" type=
"{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TopoService.typeGetCivicoTipoViaType", propOrder = {
        "code",
        "descriptioShort",
        "descriptionExtended"
})
public class TopoServiceTypeGetCivicoTipoViaType {

    @XmlElementRef(name = "Code", namespace = "http://schemas.datacontract.org/2004/07/WcfTopo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> code;
    @XmlElementRef(name = "DescriptioShort", namespace = "http://schemas.datacontract.org/2004/07/WcfTopo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> descriptioShort;
    @XmlElementRef(name = "DescriptionExtended", namespace = "http://schemas.datacontract.org/2004/07/WcfTopo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> descriptionExtended;

    /**
     * Recupera il valore della propriet� code.
     * 
     * @return
     *         possible object is
     *         {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     */
    public JAXBElement<String> getCode() {
        return code;
    }

    /**
     * Imposta il valore della propriet� code.
     * 
     * @param value
     *              allowed object is
     *              {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     */
    public void setCode(JAXBElement<String> value) {
        this.code = value;
    }

    /**
     * Recupera il valore della propriet� descriptioShort.
     * 
     * @return
     *         possible object is
     *         {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     */
    public JAXBElement<String> getDescriptioShort() {
        return descriptioShort;
    }

    /**
     * Imposta il valore della propriet� descriptioShort.
     * 
     * @param value
     *              allowed object is
     *              {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     */
    public void setDescriptioShort(JAXBElement<String> value) {
        this.descriptioShort = value;
    }

    /**
     * Recupera il valore della propriet� descriptionExtended.
     * 
     * @return
     *         possible object is
     *         {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     */
    public JAXBElement<String> getDescriptionExtended() {
        return descriptionExtended;
    }

    /**
     * Imposta il valore della propriet� descriptionExtended.
     * 
     * @param value
     *              allowed object is
     *              {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     */
    public void setDescriptionExtended(JAXBElement<String> value) {
        this.descriptionExtended = value;
    }

}
