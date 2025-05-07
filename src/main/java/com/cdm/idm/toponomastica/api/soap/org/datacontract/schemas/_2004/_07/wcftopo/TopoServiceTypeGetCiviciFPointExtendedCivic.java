
package com.cdm.idm.toponomastica.api.soap.org.datacontract.schemas._2004._07.wcftopo;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;

/**
 * <p>
 * Classe Java per TopoService.typeGetCiviciFPointExtendedCivic complex type.
 * 
 * <p>
 * Il seguente frammento di schema specifica il contenuto previsto contenuto in
 * questa classe.
 * 
 * <pre>{@code
 * <complexType name="TopoService.typeGetCiviciFPointExtendedCivic">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Bar" type=
"{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="Bar2" type=
"{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="CAP" type=
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
 *         <element name="Distance" type=
"{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="IDC" type=
"{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="Number" type=
"{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="Replace" type=
"{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="Residential" type=
"{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="StateCode" type=
"{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="StateDescription" type=
"{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="StreetCode" type=
"{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="Topo1" type=
"{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="Topo2" type=
"{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="Topo3" type=
"{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="Topo4" type=
"{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="Topo5" type=
"{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="TopoVia" type=
"{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="Toponym" type=
"{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="URL" type=
"{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="ZDN" type=
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
@XmlType(name = "TopoService.typeGetCiviciFPointExtendedCivic", propOrder = {
        "bar",
        "bar2",
        "cap",
        "character",
        "complete",
        "coordinateX",
        "coordinateY",
        "dateDown",
        "dateUp",
        "distance",
        "idc",
        "number",
        "replace",
        "residential",
        "stateCode",
        "stateDescription",
        "streetCode",
        "topo1",
        "topo2",
        "topo3",
        "topo4",
        "topo5",
        "topoVia",
        "toponym",
        "url",
        "zdn"
})
public class TopoServiceTypeGetCiviciFPointExtendedCivic {

    @XmlElementRef(name = "Bar", namespace = "http://schemas.datacontract.org/2004/07/WcfTopo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> bar;
    @XmlElementRef(name = "Bar2", namespace = "http://schemas.datacontract.org/2004/07/WcfTopo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> bar2;
    @XmlElementRef(name = "CAP", namespace = "http://schemas.datacontract.org/2004/07/WcfTopo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cap;
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
    @XmlElement(name = "Distance")
    protected Double distance;
    @XmlElement(name = "IDC")
    protected Integer idc;
    @XmlElementRef(name = "Number", namespace = "http://schemas.datacontract.org/2004/07/WcfTopo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> number;
    @XmlElement(name = "Replace")
    protected Integer replace;
    @XmlElement(name = "Residential")
    protected Integer residential;
    @XmlElement(name = "StateCode")
    protected Integer stateCode;
    @XmlElementRef(name = "StateDescription", namespace = "http://schemas.datacontract.org/2004/07/WcfTopo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> stateDescription;
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
    @XmlElementRef(name = "URL", namespace = "http://schemas.datacontract.org/2004/07/WcfTopo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> url;
    @XmlElementRef(name = "ZDN", namespace = "http://schemas.datacontract.org/2004/07/WcfTopo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> zdn;

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
     * Recupera il valore della propriet� cap.
     * 
     * @return
     *         possible object is
     *         {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     */
    public JAXBElement<String> getCAP() {
        return cap;
    }

    /**
     * Imposta il valore della propriet� cap.
     * 
     * @param value
     *              allowed object is
     *              {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     */
    public void setCAP(JAXBElement<String> value) {
        this.cap = value;
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
     * Recupera il valore della propriet� distance.
     * 
     * @return
     *         possible object is
     *         {@link Double }
     * 
     */
    public Double getDistance() {
        return distance;
    }

    /**
     * Imposta il valore della propriet� distance.
     * 
     * @param value
     *              allowed object is
     *              {@link Double }
     * 
     */
    public void setDistance(Double value) {
        this.distance = value;
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
     * Recupera il valore della propriet� replace.
     * 
     * @return
     *         possible object is
     *         {@link Integer }
     * 
     */
    public Integer getReplace() {
        return replace;
    }

    /**
     * Imposta il valore della propriet� replace.
     * 
     * @param value
     *              allowed object is
     *              {@link Integer }
     * 
     */
    public void setReplace(Integer value) {
        this.replace = value;
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
     * Recupera il valore della propriet� streetCode.
     * 
     * @return
     *         possible object is
     *         {@link Integer }
     * 
     */
    public Integer getStreetCode() {
        return streetCode;
    }

    /**
     * Imposta il valore della propriet� streetCode.
     * 
     * @param value
     *              allowed object is
     *              {@link Integer }
     * 
     */
    public void setStreetCode(Integer value) {
        this.streetCode = value;
    }

    /**
     * Recupera il valore della propriet� topo1.
     * 
     * @return
     *         possible object is
     *         {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     */
    public JAXBElement<String> getTopo1() {
        return topo1;
    }

    /**
     * Imposta il valore della propriet� topo1.
     * 
     * @param value
     *              allowed object is
     *              {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     */
    public void setTopo1(JAXBElement<String> value) {
        this.topo1 = value;
    }

    /**
     * Recupera il valore della propriet� topo2.
     * 
     * @return
     *         possible object is
     *         {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     */
    public JAXBElement<String> getTopo2() {
        return topo2;
    }

    /**
     * Imposta il valore della propriet� topo2.
     * 
     * @param value
     *              allowed object is
     *              {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     */
    public void setTopo2(JAXBElement<String> value) {
        this.topo2 = value;
    }

    /**
     * Recupera il valore della propriet� topo3.
     * 
     * @return
     *         possible object is
     *         {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     */
    public JAXBElement<String> getTopo3() {
        return topo3;
    }

    /**
     * Imposta il valore della propriet� topo3.
     * 
     * @param value
     *              allowed object is
     *              {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     */
    public void setTopo3(JAXBElement<String> value) {
        this.topo3 = value;
    }

    /**
     * Recupera il valore della propriet� topo4.
     * 
     * @return
     *         possible object is
     *         {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     */
    public JAXBElement<String> getTopo4() {
        return topo4;
    }

    /**
     * Imposta il valore della propriet� topo4.
     * 
     * @param value
     *              allowed object is
     *              {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     */
    public void setTopo4(JAXBElement<String> value) {
        this.topo4 = value;
    }

    /**
     * Recupera il valore della propriet� topo5.
     * 
     * @return
     *         possible object is
     *         {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     */
    public JAXBElement<String> getTopo5() {
        return topo5;
    }

    /**
     * Imposta il valore della propriet� topo5.
     * 
     * @param value
     *              allowed object is
     *              {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     */
    public void setTopo5(JAXBElement<String> value) {
        this.topo5 = value;
    }

    /**
     * Recupera il valore della propriet� topoVia.
     * 
     * @return
     *         possible object is
     *         {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     */
    public JAXBElement<String> getTopoVia() {
        return topoVia;
    }

    /**
     * Imposta il valore della propriet� topoVia.
     * 
     * @param value
     *              allowed object is
     *              {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     */
    public void setTopoVia(JAXBElement<String> value) {
        this.topoVia = value;
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

    /**
     * Recupera il valore della propriet� url.
     * 
     * @return
     *         possible object is
     *         {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     */
    public JAXBElement<String> getURL() {
        return url;
    }

    /**
     * Imposta il valore della propriet� url.
     * 
     * @param value
     *              allowed object is
     *              {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     */
    public void setURL(JAXBElement<String> value) {
        this.url = value;
    }

    /**
     * Recupera il valore della propriet� zdn.
     * 
     * @return
     *         possible object is
     *         {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     */
    public JAXBElement<String> getZDN() {
        return zdn;
    }

    /**
     * Imposta il valore della propriet� zdn.
     * 
     * @param value
     *              allowed object is
     *              {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     */
    public void setZDN(JAXBElement<String> value) {
        this.zdn = value;
    }

}
