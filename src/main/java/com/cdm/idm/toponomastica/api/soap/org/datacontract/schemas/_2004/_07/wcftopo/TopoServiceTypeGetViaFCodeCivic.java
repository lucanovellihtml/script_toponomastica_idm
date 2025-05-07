
package com.cdm.idm.toponomastica.api.soap.org.datacontract.schemas._2004._07.wcftopo;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;

/**
 * <p>
 * Classe Java per TopoService.typeGetViaFCodeCivic complex type.
 * 
 * <p>
 * Il seguente frammento di schema specifica il contenuto previsto contenuto in
 * questa classe.
 * 
 * <pre>{@code
 * <complexType name="TopoService.typeGetViaFCodeCivic">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="CoordinateX" type=
"{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="CoordinateY" type=
"{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="IDC" type=
"{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="StateCode" type=
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
@XmlType(name = "TopoService.typeGetViaFCodeCivic", propOrder = {
        "coordinateX",
        "coordinateY",
        "idc",
        "stateCode",
        "toponym"
})
public class TopoServiceTypeGetViaFCodeCivic {

    @XmlElement(name = "CoordinateX")
    protected Double coordinateX;
    @XmlElement(name = "CoordinateY")
    protected Double coordinateY;
    @XmlElement(name = "IDC")
    protected Integer idc;
    @XmlElement(name = "StateCode")
    protected Integer stateCode;
    @XmlElementRef(name = "Toponym", namespace = "http://schemas.datacontract.org/2004/07/WcfTopo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> toponym;

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
