
package org.datacontract.schemas._2004._07.wcftopo;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per TopoService.typeGetViaFCodeExtended complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>{@code
 * <complexType name="TopoService.typeGetViaFCodeExtended">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Civic" type="{http://schemas.datacontract.org/2004/07/WcfTopo}ArrayOfTopoService.typeGetViaFCodeCivicExtended" minOccurs="0"/>
 *         <element name="Err" type="{http://schemas.datacontract.org/2004/07/WcfTopo}TopoService.typeError" minOccurs="0"/>
 *         <element name="StateCode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="StreetCode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="Topo1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="Topo2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="Topo3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="Topo4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="Topo5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="TopoVia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="Toponym" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TopoService.typeGetViaFCodeExtended", propOrder = {
    "civic",
    "err",
    "stateCode",
    "streetCode",
    "topo1",
    "topo2",
    "topo3",
    "topo4",
    "topo5",
    "topoVia",
    "toponym"
})
public class TopoServiceTypeGetViaFCodeExtended {

    @XmlElementRef(name = "Civic", namespace = "http://schemas.datacontract.org/2004/07/WcfTopo", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfTopoServiceTypeGetViaFCodeCivicExtended> civic;
    @XmlElementRef(name = "Err", namespace = "http://schemas.datacontract.org/2004/07/WcfTopo", type = JAXBElement.class, required = false)
    protected JAXBElement<TopoServiceTypeError> err;
    @XmlElement(name = "StateCode")
    protected Integer stateCode;
    @XmlElement(name = "StreetCode")
    protected Integer streetCode;
    @XmlElementRef(name = "Topo1", namespace = "http://schemas.datacontract.org/2004/07/WcfTopo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> topo1;
    @XmlElementRef(name = "Topo2", namespace = "http://schemas.datacontract.org/2004/07/WcfTopo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> topo2;
    @XmlElementRef(name = "Topo3", namespace = "http://schemas.datacontract.org/2004/07/WcfTopo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> topo3;
    @XmlElementRef(name = "Topo4", namespace = "http://schemas.datacontract.org/2004/07/WcfTopo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> topo4;
    @XmlElementRef(name = "Topo5", namespace = "http://schemas.datacontract.org/2004/07/WcfTopo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> topo5;
    @XmlElementRef(name = "TopoVia", namespace = "http://schemas.datacontract.org/2004/07/WcfTopo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> topoVia;
    @XmlElementRef(name = "Toponym", namespace = "http://schemas.datacontract.org/2004/07/WcfTopo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> toponym;

    /**
     * Recupera il valore della proprietà civic.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfTopoServiceTypeGetViaFCodeCivicExtended }{@code >}
     *     
     */
    public JAXBElement<ArrayOfTopoServiceTypeGetViaFCodeCivicExtended> getCivic() {
        return civic;
    }

    /**
     * Imposta il valore della proprietà civic.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfTopoServiceTypeGetViaFCodeCivicExtended }{@code >}
     *     
     */
    public void setCivic(JAXBElement<ArrayOfTopoServiceTypeGetViaFCodeCivicExtended> value) {
        this.civic = value;
    }

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
     * Recupera il valore della proprietà stateCode.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getStateCode() {
        return stateCode;
    }

    /**
     * Imposta il valore della proprietà stateCode.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setStateCode(Integer value) {
        this.stateCode = value;
    }

    /**
     * Recupera il valore della proprietà streetCode.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getStreetCode() {
        return streetCode;
    }

    /**
     * Imposta il valore della proprietà streetCode.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setStreetCode(Integer value) {
        this.streetCode = value;
    }

    /**
     * Recupera il valore della proprietà topo1.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTopo1() {
        return topo1;
    }

    /**
     * Imposta il valore della proprietà topo1.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTopo1(JAXBElement<String> value) {
        this.topo1 = value;
    }

    /**
     * Recupera il valore della proprietà topo2.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTopo2() {
        return topo2;
    }

    /**
     * Imposta il valore della proprietà topo2.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTopo2(JAXBElement<String> value) {
        this.topo2 = value;
    }

    /**
     * Recupera il valore della proprietà topo3.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTopo3() {
        return topo3;
    }

    /**
     * Imposta il valore della proprietà topo3.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTopo3(JAXBElement<String> value) {
        this.topo3 = value;
    }

    /**
     * Recupera il valore della proprietà topo4.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTopo4() {
        return topo4;
    }

    /**
     * Imposta il valore della proprietà topo4.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTopo4(JAXBElement<String> value) {
        this.topo4 = value;
    }

    /**
     * Recupera il valore della proprietà topo5.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTopo5() {
        return topo5;
    }

    /**
     * Imposta il valore della proprietà topo5.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTopo5(JAXBElement<String> value) {
        this.topo5 = value;
    }

    /**
     * Recupera il valore della proprietà topoVia.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTopoVia() {
        return topoVia;
    }

    /**
     * Imposta il valore della proprietà topoVia.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTopoVia(JAXBElement<String> value) {
        this.topoVia = value;
    }

    /**
     * Recupera il valore della proprietà toponym.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getToponym() {
        return toponym;
    }

    /**
     * Imposta il valore della proprietà toponym.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setToponym(JAXBElement<String> value) {
        this.toponym = value;
    }

}
