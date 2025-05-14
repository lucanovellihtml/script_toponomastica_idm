
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Classe Java per anonymous complex type.
 * 
 * <p>
 * Il seguente frammento di schema specifica il contenuto previsto contenuto in
 * questa classe.
 * 
 * <pre>{@code
 * <complexType>
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="pToken" type=
"{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="pCoordinateX" type=
"{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="pCoordinateY" type=
"{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="pReference" type=
"{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="pState" type=
"{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="pNumber" type=
"{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="pDistance" type=
"{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "pToken",
        "pCoordinateX",
        "pCoordinateY",
        "pReference",
        "pState",
        "pNumber",
        "pDistance"
})
@XmlRootElement(name = "sitGetCiviciFPointExtended")
public class SitGetCiviciFPointExtended {

    @XmlElementRef(name = "pToken", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pToken;
    protected Double pCoordinateX;
    protected Double pCoordinateY;
    protected Integer pReference;
    protected Integer pState;
    protected Integer pNumber;
    protected Double pDistance;

    /**
     * Recupera il valore della propriet� pToken.
     * 
     * @return
     *         possible object is
     *         {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     */
    public JAXBElement<String> getPToken() {
        return pToken;
    }

    /**
     * Imposta il valore della propriet� pToken.
     * 
     * @param value
     *              allowed object is
     *              {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     */
    public void setPToken(JAXBElement<String> value) {
        this.pToken = value;
    }

    /**
     * Recupera il valore della propriet� pCoordinateX.
     * 
     * @return
     *         possible object is
     *         {@link Double }
     * 
     */
    public Double getPCoordinateX() {
        return pCoordinateX;
    }

    /**
     * Imposta il valore della propriet� pCoordinateX.
     * 
     * @param value
     *              allowed object is
     *              {@link Double }
     * 
     */
    public void setPCoordinateX(Double value) {
        this.pCoordinateX = value;
    }

    /**
     * Recupera il valore della propriet� pCoordinateY.
     * 
     * @return
     *         possible object is
     *         {@link Double }
     * 
     */
    public Double getPCoordinateY() {
        return pCoordinateY;
    }

    /**
     * Imposta il valore della propriet� pCoordinateY.
     * 
     * @param value
     *              allowed object is
     *              {@link Double }
     * 
     */
    public void setPCoordinateY(Double value) {
        this.pCoordinateY = value;
    }

    /**
     * Recupera il valore della propriet� pReference.
     * 
     * @return
     *         possible object is
     *         {@link Integer }
     * 
     */
    public Integer getPReference() {
        return pReference;
    }

    /**
     * Imposta il valore della propriet� pReference.
     * 
     * @param value
     *              allowed object is
     *              {@link Integer }
     * 
     */
    public void setPReference(Integer value) {
        this.pReference = value;
    }

    /**
     * Recupera il valore della propriet� pState.
     * 
     * @return
     *         possible object is
     *         {@link Integer }
     * 
     */
    public Integer getPState() {
        return pState;
    }

    /**
     * Imposta il valore della propriet� pState.
     * 
     * @param value
     *              allowed object is
     *              {@link Integer }
     * 
     */
    public void setPState(Integer value) {
        this.pState = value;
    }

    /**
     * Recupera il valore della propriet� pNumber.
     * 
     * @return
     *         possible object is
     *         {@link Integer }
     * 
     */
    public Integer getPNumber() {
        return pNumber;
    }

    /**
     * Imposta il valore della propriet� pNumber.
     * 
     * @param value
     *              allowed object is
     *              {@link Integer }
     * 
     */
    public void setPNumber(Integer value) {
        this.pNumber = value;
    }

    /**
     * Recupera il valore della propriet� pDistance.
     * 
     * @return
     *         possible object is
     *         {@link Double }
     * 
     */
    public Double getPDistance() {
        return pDistance;
    }

    /**
     * Imposta il valore della propriet� pDistance.
     * 
     * @param value
     *              allowed object is
     *              {@link Double }
     * 
     */
    public void setPDistance(Double value) {
        this.pDistance = value;
    }

}
