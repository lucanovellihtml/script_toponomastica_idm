
package org.datacontract.schemas._2004._07.wcftopo;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Classe Java per TopoService.typePermessi complex type.
 * 
 * <p>
 * Il seguente frammento di schema specifica il contenuto previsto contenuto in
 * questa classe.
 * 
 * <pre>{@code
 * <complexType name="TopoService.typePermessi">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="area_id" type=
"{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="geom" type=
"{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="id_via" type=
"{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="nome_area" type=
"{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="note_rel" type=
"{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="numero" type=
"{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="ordinanza" type=
"{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="tipo_area" type=
"{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="tipo_rel" type=
"{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="val_fine" type=
"{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="val_inizio" type=
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
@XmlType(name = "TopoService.typePermessi", propOrder = {
        "areaId",
        "geom",
        "idVia",
        "nomeArea",
        "noteRel",
        "numero",
        "ordinanza",
        "tipoArea",
        "tipoRel",
        "valFine",
        "valInizio"
})
public class TopoServiceTypePermessi {

    @XmlElement(name = "area_id")
    protected Integer areaId;
    @XmlElementRef(name = "geom", namespace = "http://schemas.datacontract.org/2004/07/WcfTopo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> geom;
    @XmlElement(name = "id_via")
    protected Integer idVia;
    @XmlElementRef(name = "nome_area", namespace = "http://schemas.datacontract.org/2004/07/WcfTopo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nomeArea;
    @XmlElementRef(name = "note_rel", namespace = "http://schemas.datacontract.org/2004/07/WcfTopo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> noteRel;
    @XmlElementRef(name = "numero", namespace = "http://schemas.datacontract.org/2004/07/WcfTopo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> numero;
    @XmlElementRef(name = "ordinanza", namespace = "http://schemas.datacontract.org/2004/07/WcfTopo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ordinanza;
    @XmlElementRef(name = "tipo_area", namespace = "http://schemas.datacontract.org/2004/07/WcfTopo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tipoArea;
    @XmlElement(name = "tipo_rel")
    protected Integer tipoRel;
    @XmlElementRef(name = "val_fine", namespace = "http://schemas.datacontract.org/2004/07/WcfTopo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> valFine;
    @XmlElementRef(name = "val_inizio", namespace = "http://schemas.datacontract.org/2004/07/WcfTopo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> valInizio;

    /**
     * Recupera il valore della propriet� areaId.
     * 
     * @return
     *         possible object is
     *         {@link Integer }
     * 
     */
    public Integer getAreaId() {
        return areaId;
    }

    /**
     * Imposta il valore della propriet� areaId.
     * 
     * @param value
     *              allowed object is
     *              {@link Integer }
     * 
     */
    public void setAreaId(Integer value) {
        this.areaId = value;
    }

    /**
     * Recupera il valore della propriet� geom.
     * 
     * @return
     *         possible object is
     *         {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     */
    public JAXBElement<String> getGeom() {
        return geom;
    }

    /**
     * Imposta il valore della propriet� geom.
     * 
     * @param value
     *              allowed object is
     *              {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     */
    public void setGeom(JAXBElement<String> value) {
        this.geom = value;
    }

    /**
     * Recupera il valore della propriet� idVia.
     * 
     * @return
     *         possible object is
     *         {@link Integer }
     * 
     */
    public Integer getIdVia() {
        return idVia;
    }

    /**
     * Imposta il valore della propriet� idVia.
     * 
     * @param value
     *              allowed object is
     *              {@link Integer }
     * 
     */
    public void setIdVia(Integer value) {
        this.idVia = value;
    }

    /**
     * Recupera il valore della propriet� nomeArea.
     * 
     * @return
     *         possible object is
     *         {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     */
    public JAXBElement<String> getNomeArea() {
        return nomeArea;
    }

    /**
     * Imposta il valore della propriet� nomeArea.
     * 
     * @param value
     *              allowed object is
     *              {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     */
    public void setNomeArea(JAXBElement<String> value) {
        this.nomeArea = value;
    }

    /**
     * Recupera il valore della propriet� noteRel.
     * 
     * @return
     *         possible object is
     *         {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     */
    public JAXBElement<String> getNoteRel() {
        return noteRel;
    }

    /**
     * Imposta il valore della propriet� noteRel.
     * 
     * @param value
     *              allowed object is
     *              {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     */
    public void setNoteRel(JAXBElement<String> value) {
        this.noteRel = value;
    }

    /**
     * Recupera il valore della propriet� numero.
     * 
     * @return
     *         possible object is
     *         {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     */
    public JAXBElement<String> getNumero() {
        return numero;
    }

    /**
     * Imposta il valore della propriet� numero.
     * 
     * @param value
     *              allowed object is
     *              {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     */
    public void setNumero(JAXBElement<String> value) {
        this.numero = value;
    }

    /**
     * Recupera il valore della propriet� ordinanza.
     * 
     * @return
     *         possible object is
     *         {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     */
    public JAXBElement<String> getOrdinanza() {
        return ordinanza;
    }

    /**
     * Imposta il valore della propriet� ordinanza.
     * 
     * @param value
     *              allowed object is
     *              {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     */
    public void setOrdinanza(JAXBElement<String> value) {
        this.ordinanza = value;
    }

    /**
     * Recupera il valore della propriet� tipoArea.
     * 
     * @return
     *         possible object is
     *         {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     */
    public JAXBElement<String> getTipoArea() {
        return tipoArea;
    }

    /**
     * Imposta il valore della propriet� tipoArea.
     * 
     * @param value
     *              allowed object is
     *              {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     */
    public void setTipoArea(JAXBElement<String> value) {
        this.tipoArea = value;
    }

    /**
     * Recupera il valore della propriet� tipoRel.
     * 
     * @return
     *         possible object is
     *         {@link Integer }
     * 
     */
    public Integer getTipoRel() {
        return tipoRel;
    }

    /**
     * Imposta il valore della propriet� tipoRel.
     * 
     * @param value
     *              allowed object is
     *              {@link Integer }
     * 
     */
    public void setTipoRel(Integer value) {
        this.tipoRel = value;
    }

    /**
     * Recupera il valore della propriet� valFine.
     * 
     * @return
     *         possible object is
     *         {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     */
    public JAXBElement<String> getValFine() {
        return valFine;
    }

    /**
     * Imposta il valore della propriet� valFine.
     * 
     * @param value
     *              allowed object is
     *              {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     */
    public void setValFine(JAXBElement<String> value) {
        this.valFine = value;
    }

    /**
     * Recupera il valore della propriet� valInizio.
     * 
     * @return
     *         possible object is
     *         {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     */
    public JAXBElement<String> getValInizio() {
        return valInizio;
    }

    /**
     * Imposta il valore della propriet� valInizio.
     * 
     * @param value
     *              allowed object is
     *              {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     */
    public void setValInizio(JAXBElement<String> value) {
        this.valInizio = value;
    }

}
