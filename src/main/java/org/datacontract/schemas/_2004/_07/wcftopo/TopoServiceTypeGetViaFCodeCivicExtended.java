
package org.datacontract.schemas._2004._07.wcftopo;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Classe Java per TopoService.typeGetViaFCodeCivicExtended complex type.
 * 
 * <p>
 * Il seguente frammento di schema specifica il contenuto previsto contenuto in
 * questa classe.
 * 
 * <pre>{@code
 * <complexType name="TopoService.typeGetViaFCodeCivicExtended">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Bar" type=
"{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="Bar2" type=
"{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="Character" type=
"{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="Complete" type=
"{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="CoordinateX" type=
"{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="CoordinateY" type=
"{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="DateDown" type=
"{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="DateUp" type=
"{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="IDC" type=
"{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="Number" type=
"{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="Residential" type=
"{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="StateCode" type=
"{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="StateDescription" type=
"{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="Toponym" type=
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
@XmlType(name = "TopoService.typeGetViaFCodeCivicExtended", propOrder = {
        "bar",
        "bar2",
        "character",
        "complete",
        "coordinateX",
        "coordinateY",
        "dateDown",
        "dateUp",
        "idc",
        "number",
        "residential",
        "stateCode",
        "stateDescription",
        "toponym"
})
public class TopoServiceTypeGetViaFCodeCivicExtended {

    @XmlElementRef(name = "Bar", namespace = "http://schemas.datacontract.org/2004/07/WcfTopo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> bar;
    @XmlElementRef(name = "Bar2", namespace = "http://schemas.datacontract.org/2004/07/WcfTopo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> bar2;
    @XmlElementRef(name = "Character", namespace = "http://schemas.datacontract.org/2004/07/WcfTopo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> character;
    @XmlElementRef(name = "Complete", namespace = "http://schemas.datacontract.org/2004/07/WcfTopo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> complete;
    @XmlElement(name = "CoordinateX")
    protected Double coordinateX;
    @XmlElement(name = "CoordinateY")
    protected Double coordinateY;
    @XmlElementRef(name = "DateDown", namespace = "http://schemas.datacontract.org/2004/07/WcfTopo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dateDown;
    @XmlElementRef(name = "DateUp", namespace = "http://schemas.datacontract.org/2004/07/WcfTopo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dateUp;
    @XmlElement(name = "IDC")
    protected Integer idc;
    @XmlElementRef(name = "Number", namespace = "http://schemas.datacontract.org/2004/07/WcfTopo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> number;
    @XmlElement(name = "Residential")
    protected Integer residential;
    @XmlElement(name = "StateCode")
    protected Integer stateCode;
    @XmlElementRef(name = "StateDescription", namespace = "http://schemas.datacontract.org/2004/07/WcfTopo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> stateDescription;
    @XmlElementRef(name = "Toponym", namespace = "http://schemas.datacontract.org/2004/07/WcfTopo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> toponym;

    /**
     * Recupera il valore della propriet� bar.
     * 
     * @return
     *         possible object is
     *         {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     */
    public JAXBElement<String> getBar() {
        return bar;
    }

    /**
     * Imposta il valore della propriet� bar.
     * 
     * @param value
     *              allowed object is
     *              {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     */
    public void setBar(JAXBElement<String> value) {
        this.bar = value;
    }

    /**
     * Recupera il valore della propriet� bar2.
     * 
     * @return
     *         possible object is
     *         {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     */
    public JAXBElement<String> getBar2() {
        return bar2;
    }

    /**
     * Imposta il valore della propriet� bar2.
     * 
     * @param value
     *              allowed object is
     *              {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     */
    public void setBar2(JAXBElement<String> value) {
        this.bar2 = value;
    }

    /**
     * Recupera il valore della propriet� character.
     * 
     * @return
     *         possible object is
     *         {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     */
    public JAXBElement<String> getCharacter() {
        return character;
    }

    /**
     * Imposta il valore della propriet� character.
     * 
     * @param value
     *              allowed object is
     *              {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     */
    public void setCharacter(JAXBElement<String> value) {
        this.character = value;
    }

    /**
     * Recupera il valore della propriet� complete.
     * 
     * @return
     *         possible object is
     *         {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     */
    public JAXBElement<String> getComplete() {
        return complete;
    }

    /**
     * Imposta il valore della propriet� complete.
     * 
     * @param value
     *              allowed object is
     *              {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     */
    public void setComplete(JAXBElement<String> value) {
        this.complete = value;
    }

    /**
     * Recupera il valore della propriet� coordinateX.
     * 
     * @return
     *         possible object is
     *         {@link Double }
     * 
     */
    public Double getCoordinateX() {
        return coordinateX;
    }

    /**
     * Imposta il valore della propriet� coordinateX.
     * 
     * @param value
     *              allowed object is
     *              {@link Double }
     * 
     */
    public void setCoordinateX(Double value) {
        this.coordinateX = value;
    }

    /**
     * Recupera il valore della propriet� coordinateY.
     * 
     * @return
     *         possible object is
     *         {@link Double }
     * 
     */
    public Double getCoordinateY() {
        return coordinateY;
    }

    /**
     * Imposta il valore della propriet� coordinateY.
     * 
     * @param value
     *              allowed object is
     *              {@link Double }
     * 
     */
    public void setCoordinateY(Double value) {
        this.coordinateY = value;
    }

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

    /**
     * Recupera il valore della propriet� number.
     * 
     * @return
     *         possible object is
     *         {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     */
    public JAXBElement<String> getNumber() {
        return number;
    }

    /**
     * Imposta il valore della propriet� number.
     * 
     * @param value
     *              allowed object is
     *              {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     */
    public void setNumber(JAXBElement<String> value) {
        this.number = value;
    }

    /**
     * Recupera il valore della propriet� residential.
     * 
     * @return
     *         possible object is
     *         {@link Integer }
     * 
     */
    public Integer getResidential() {
        return residential;
    }

    /**
     * Imposta il valore della propriet� residential.
     * 
     * @param value
     *              allowed object is
     *              {@link Integer }
     * 
     */
    public void setResidential(Integer value) {
        this.residential = value;
    }

    /**
     * Recupera il valore della propriet� stateCode.
     * 
     * @return
     *         possible object is
     *         {@link Integer }
     * 
     */
    public Integer getStateCode() {
        return stateCode;
    }

    /**
     * Imposta il valore della propriet� stateCode.
     * 
     * @param value
     *              allowed object is
     *              {@link Integer }
     * 
     */
    public void setStateCode(Integer value) {
        this.stateCode = value;
    }

    /**
     * Recupera il valore della propriet� stateDescription.
     * 
     * @return
     *         possible object is
     *         {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     */
    public JAXBElement<String> getStateDescription() {
        return stateDescription;
    }

    /**
     * Imposta il valore della propriet� stateDescription.
     * 
     * @param value
     *              allowed object is
     *              {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     */
    public void setStateDescription(JAXBElement<String> value) {
        this.stateDescription = value;
    }

    /**
     * Recupera il valore della propriet� toponym.
     * 
     * @return
     *         possible object is
     *         {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     */
    public JAXBElement<String> getToponym() {
        return toponym;
    }

    /**
     * Imposta il valore della propriet� toponym.
     * 
     * @param value
     *              allowed object is
     *              {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     */
    public void setToponym(JAXBElement<String> value) {
        this.toponym = value;
    }

}
