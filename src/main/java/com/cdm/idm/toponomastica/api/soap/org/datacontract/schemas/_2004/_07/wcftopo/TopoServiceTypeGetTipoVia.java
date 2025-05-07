
package com.cdm.idm.toponomastica.api.soap.org.datacontract.schemas._2004._07.wcftopo;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;

/**
 * <p>
 * Classe Java per TopoService.typeGetTipoVia complex type.
 * 
 * <p>
 * Il seguente frammento di schema specifica il contenuto previsto contenuto in
 * questa classe.
 * 
 * <pre>{@code
 * <complexType name="TopoService.typeGetTipoVia">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Err" type=
"{http://schemas.datacontract.org/2004/07/WcfTopo}TopoService.typeError" minOccurs
="0"/>
 *         <element name="Type" type=
"{http://schemas.datacontract.org/2004/07/WcfTopo}ArrayOfTopoService.typeGetCivicoTipoViaType" minOccurs
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
@XmlType(name = "TopoService.typeGetTipoVia", propOrder = {
        "err",
        "type"
})
public class TopoServiceTypeGetTipoVia {

    @XmlElementRef(name = "Err", namespace = "http://schemas.datacontract.org/2004/07/WcfTopo", type = JAXBElement.class, required = false)
    protected JAXBElement<TopoServiceTypeError> err;
    @XmlElementRef(name = "Type", namespace = "http://schemas.datacontract.org/2004/07/WcfTopo", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfTopoServiceTypeGetCivicoTipoViaType> type;

    /**
     * Recupera il valore della propriet� err.
     * 
     * @return
     *         possible object is
     *         {@link JAXBElement }{@code <}{@link TopoServiceTypeError }{@code >}
     * 
     */
    public JAXBElement<TopoServiceTypeError> getErr() {
        return err;
    }

    /**
     * Imposta il valore della propriet� err.
     * 
     * @param value
     *              allowed object is
     *              {@link JAXBElement }{@code <}{@link TopoServiceTypeError
     *              }{@code >}
     * 
     */
    public void setErr(JAXBElement<TopoServiceTypeError> value) {
        this.err = value;
    }

    /**
     * Recupera il valore della propriet� type.
     * 
     * @return
     *         possible object is
     *         {@link JAXBElement
     *         }{@code <}{@link ArrayOfTopoServiceTypeGetCivicoTipoViaType
     *         }{@code >}
     * 
     */
    public JAXBElement<ArrayOfTopoServiceTypeGetCivicoTipoViaType> getType() {
        return type;
    }

    /**
     * Imposta il valore della propriet� type.
     * 
     * @param value
     *              allowed object is
     *              {@link JAXBElement
     *              }{@code <}{@link ArrayOfTopoServiceTypeGetCivicoTipoViaType
     *              }{@code >}
     * 
     */
    public void setType(JAXBElement<ArrayOfTopoServiceTypeGetCivicoTipoViaType> value) {
        this.type = value;
    }

}
