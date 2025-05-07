
package com.cdm.idm.toponomastica.api.soap.org.datacontract.schemas._2004._07.wcftopo;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;

/**
 * <p>
 * Classe Java per TopoService.typeGetVieFTopo complex type.
 * 
 * <p>
 * Il seguente frammento di schema specifica il contenuto previsto contenuto in
 * questa classe.
 * 
 * <pre>{@code
 * <complexType name="TopoService.typeGetVieFTopo">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Err" type=
"{http://schemas.datacontract.org/2004/07/WcfTopo}TopoService.typeError" minOccurs
="0"/>
 *         <element name="Street" type=
"{http://schemas.datacontract.org/2004/07/WcfTopo}ArrayOfTopoService.typeGetVieFTopoStreet" minOccurs
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
@XmlType(name = "TopoService.typeGetVieFTopo", propOrder = {
        "err",
        "street"
})
public class TopoServiceTypeGetVieFTopo {

    @XmlElementRef(name = "Err", namespace = "http://schemas.datacontract.org/2004/07/WcfTopo", type = JAXBElement.class, required = false)
    protected JAXBElement<TopoServiceTypeError> err;
    @XmlElementRef(name = "Street", namespace = "http://schemas.datacontract.org/2004/07/WcfTopo", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfTopoServiceTypeGetVieFTopoStreet> street;

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
     * Recupera il valore della propriet� street.
     * 
     * @return
     *         possible object is
     *         {@link JAXBElement
     *         }{@code <}{@link ArrayOfTopoServiceTypeGetVieFTopoStreet }{@code >}
     * 
     */
    public JAXBElement<ArrayOfTopoServiceTypeGetVieFTopoStreet> getStreet() {
        return street;
    }

    /**
     * Imposta il valore della propriet� street.
     * 
     * @param value
     *              allowed object is
     *              {@link JAXBElement
     *              }{@code <}{@link ArrayOfTopoServiceTypeGetVieFTopoStreet
     *              }{@code >}
     * 
     */
    public void setStreet(JAXBElement<ArrayOfTopoServiceTypeGetVieFTopoStreet> value) {
        this.street = value;
    }

}
