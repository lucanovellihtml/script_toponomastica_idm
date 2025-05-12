
package org.datacontract.schemas._2004._07.wcftopo;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per TopoService.typeGetData complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>{@code
 * <complexType name="TopoService.typeGetData">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Err" type="{http://schemas.datacontract.org/2004/07/WcfTopo}TopoService.typeError" minOccurs="0"/>
 *         <element name="Riferimento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="datajson" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TopoService.typeGetData", propOrder = {
    "err",
    "riferimento",
    "datajson"
})
public class TopoServiceTypeGetData {

    @XmlElementRef(name = "Err", namespace = "http://schemas.datacontract.org/2004/07/WcfTopo", type = JAXBElement.class, required = false)
    protected JAXBElement<TopoServiceTypeError> err;
    @XmlElementRef(name = "Riferimento", namespace = "http://schemas.datacontract.org/2004/07/WcfTopo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> riferimento;
    @XmlElementRef(name = "datajson", namespace = "http://schemas.datacontract.org/2004/07/WcfTopo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> datajson;

    /**
     * Recupera il valore della proprietà err.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TopoServiceTypeError }{@code >}
     *     
     */
    public JAXBElement<TopoServiceTypeError> getErr() {
        return err;
    }

    /**
     * Imposta il valore della proprietà err.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TopoServiceTypeError }{@code >}
     *     
     */
    public void setErr(JAXBElement<TopoServiceTypeError> value) {
        this.err = value;
    }

    /**
     * Recupera il valore della proprietà riferimento.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRiferimento() {
        return riferimento;
    }

    /**
     * Imposta il valore della proprietà riferimento.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRiferimento(JAXBElement<String> value) {
        this.riferimento = value;
    }

    /**
     * Recupera il valore della proprietà datajson.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDatajson() {
        return datajson;
    }

    /**
     * Imposta il valore della proprietà datajson.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDatajson(JAXBElement<String> value) {
        this.datajson = value;
    }

}
