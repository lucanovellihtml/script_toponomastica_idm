
package org.datacontract.schemas._2004._07.wcftopo;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Classe Java per TopoService.typeGetCiviciFPointBaseCivic complex type.
 * 
 * <p>
 * Il seguente frammento di schema specifica il contenuto previsto contenuto in
 * questa classe.
 * 
 * <pre>{@code
 * <complexType name="TopoService.typeGetCiviciFPointBaseCivic">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Complete" type=
"{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="CoordinateX" type=
"{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="CoordinateY" type=
"{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="Distance" type=
"{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="IDC" type=
"{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="StreetCode" type=
"{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
@XmlType(name = "TopoService.typeGetCiviciFPointBaseCivic", propOrder = {
        "complete",
        "coordinateX",
        "coordinateY",
        "distance",
        "idc",
        "streetCode",
        "toponym"
})
public class TopoServiceTypeGetCiviciFPointBaseCivic {

    @XmlElementRef(name = "Complete", namespace = "http://schemas.datacontract.org/2004/07/WcfTopo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> complete;
    @XmlElement(name = "CoordinateX")
    protected Double coordinateX;
    @XmlElement(name = "CoordinateY")
    protected Double coordinateY;
    @XmlElement(name = "Distance")
    protected Double distance;
    @XmlElement(name = "IDC")
    protected Integer idc;
    @XmlElement(name = "StreetCode")
    protected Integer streetCode;
    @XmlElementRef(name = "Toponym", namespace = "http://schemas.datacontract.org/2004/07/WcfTopo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> toponym;

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
