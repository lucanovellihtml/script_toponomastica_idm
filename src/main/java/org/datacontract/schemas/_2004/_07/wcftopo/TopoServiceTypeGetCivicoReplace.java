
package org.datacontract.schemas._2004._07.wcftopo;

import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfint;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Classe Java per TopoService.typeGetCivicoReplace complex type.
 * 
 * <p>
 * Il seguente frammento di schema specifica il contenuto previsto contenuto in
 * questa classe.
 * 
 * <pre>{@code
 * <complexType name="TopoService.typeGetCivicoReplace">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Civic" type=
"{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfint" minOccurs
="0"/>
 *         <element name="Err" type=
"{http://schemas.datacontract.org/2004/07/WcfTopo}TopoService.typeError" minOccurs
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
@XmlType(name = "TopoService.typeGetCivicoReplace", propOrder = {
        "civic",
        "err"
})
public class TopoServiceTypeGetCivicoReplace {

    @XmlElementRef(name = "Civic", namespace = "http://schemas.datacontract.org/2004/07/WcfTopo", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfint> civic;
    @XmlElementRef(name = "Err", namespace = "http://schemas.datacontract.org/2004/07/WcfTopo", type = JAXBElement.class, required = false)
    protected JAXBElement<TopoServiceTypeError> err;

    /**
     * Recupera il valore della propriet� civic.
     * 
     * @return
     *         possible object is
     *         {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}
     * 
     */
    public JAXBElement<ArrayOfint> getCivic() {
        return civic;
    }

    /**
     * Imposta il valore della propriet� civic.
     * 
     * @param value
     *              allowed object is
     *              {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}
     * 
     */
    public void setCivic(JAXBElement<ArrayOfint> value) {
        this.civic = value;
    }

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

}
