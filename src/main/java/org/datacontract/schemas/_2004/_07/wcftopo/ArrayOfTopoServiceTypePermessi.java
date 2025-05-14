
package org.datacontract.schemas._2004._07.wcftopo;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Classe Java per ArrayOfTopoService.typePermessi complex type.
 * 
 * <p>
 * Il seguente frammento di schema specifica il contenuto previsto contenuto in
 * questa classe.
 * 
 * <pre>{@code
 * <complexType name="ArrayOfTopoService.typePermessi">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="TopoService.typePermessi" type=
"{http://schemas.datacontract.org/2004/07/WcfTopo}TopoService.typePermessi" maxOccurs
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
@XmlType(name = "ArrayOfTopoService.typePermessi", propOrder = {
        "topoServiceTypePermessi"
})
public class ArrayOfTopoServiceTypePermessi {

    @XmlElement(name = "TopoService.typePermessi", nillable = true)
    protected List<TopoServiceTypePermessi> topoServiceTypePermessi;

    /**
     * Gets the value of the topoServiceTypePermessi property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the javax XML Binding object.
     * This is why there is not a {@code set} method for the topoServiceTypePermessi
     * property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getTopoServiceTypePermessi().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TopoServiceTypePermessi }
     * 
     * 
     * @return
     *         The value of the topoServiceTypePermessi property.
     */
    public List<TopoServiceTypePermessi> getTopoServiceTypePermessi() {
        if (topoServiceTypePermessi == null) {
            topoServiceTypePermessi = new ArrayList<>();
        }
        return this.topoServiceTypePermessi;
    }

}
