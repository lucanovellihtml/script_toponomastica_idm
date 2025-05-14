
package org.datacontract.schemas._2004._07.wcftopo;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Classe Java per ArrayOfTopoService.typeGetCivicoChangeCivic complex type.
 * 
 * <p>
 * Il seguente frammento di schema specifica il contenuto previsto contenuto in
 * questa classe.
 * 
 * <pre>{@code
 * <complexType name="ArrayOfTopoService.typeGetCivicoChangeCivic">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="TopoService.typeGetCivicoChangeCivic" type=
"{http://schemas.datacontract.org/2004/07/WcfTopo}TopoService.typeGetCivicoChangeCivic" maxOccurs
="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfTopoService.typeGetCivicoChangeCivic", propOrder = {
        "topoServiceTypeGetCivicoChangeCivic"
})
public class ArrayOfTopoServiceTypeGetCivicoChangeCivic {

    @XmlElement(name = "TopoService.typeGetCivicoChangeCivic", nillable = true)
    protected List<TopoServiceTypeGetCivicoChangeCivic> topoServiceTypeGetCivicoChangeCivic;

    /**
     * Gets the value of the topoServiceTypeGetCivicoChangeCivic property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the javax XML Binding object.
     * This is why there is not a {@code set} method for the
     * topoServiceTypeGetCivicoChangeCivic property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getTopoServiceTypeGetCivicoChangeCivic().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TopoServiceTypeGetCivicoChangeCivic }
     * 
     * 
     * @return
     *         The value of the topoServiceTypeGetCivicoChangeCivic property.
     */
    public List<TopoServiceTypeGetCivicoChangeCivic> getTopoServiceTypeGetCivicoChangeCivic() {
        if (topoServiceTypeGetCivicoChangeCivic == null) {
            topoServiceTypeGetCivicoChangeCivic = new ArrayList<>();
        }
        return this.topoServiceTypeGetCivicoChangeCivic;
    }

}
