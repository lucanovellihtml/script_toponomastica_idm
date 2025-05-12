
package org.datacontract.schemas._2004._07.wcftopo;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per ArrayOfTopoService.typeGetCiviciFPointExtendedCivic complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>{@code
 * <complexType name="ArrayOfTopoService.typeGetCiviciFPointExtendedCivic">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="TopoService.typeGetCiviciFPointExtendedCivic" type="{http://schemas.datacontract.org/2004/07/WcfTopo}TopoService.typeGetCiviciFPointExtendedCivic" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfTopoService.typeGetCiviciFPointExtendedCivic", propOrder = {
    "topoServiceTypeGetCiviciFPointExtendedCivic"
})
public class ArrayOfTopoServiceTypeGetCiviciFPointExtendedCivic {

    @XmlElement(name = "TopoService.typeGetCiviciFPointExtendedCivic", nillable = true)
    protected List<TopoServiceTypeGetCiviciFPointExtendedCivic> topoServiceTypeGetCiviciFPointExtendedCivic;

    /**
     * Gets the value of the topoServiceTypeGetCiviciFPointExtendedCivic property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the topoServiceTypeGetCiviciFPointExtendedCivic property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTopoServiceTypeGetCiviciFPointExtendedCivic().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TopoServiceTypeGetCiviciFPointExtendedCivic }
     * 
     * 
     * @return
     *     The value of the topoServiceTypeGetCiviciFPointExtendedCivic property.
     */
    public List<TopoServiceTypeGetCiviciFPointExtendedCivic> getTopoServiceTypeGetCiviciFPointExtendedCivic() {
        if (topoServiceTypeGetCiviciFPointExtendedCivic == null) {
            topoServiceTypeGetCiviciFPointExtendedCivic = new ArrayList<>();
        }
        return this.topoServiceTypeGetCiviciFPointExtendedCivic;
    }

}
