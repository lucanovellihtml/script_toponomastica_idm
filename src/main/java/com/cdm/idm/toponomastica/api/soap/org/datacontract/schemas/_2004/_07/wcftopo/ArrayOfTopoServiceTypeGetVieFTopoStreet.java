
package com.cdm.idm.toponomastica.api.soap.org.datacontract.schemas._2004._07.wcftopo;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

/**
 * <p>
 * Classe Java per ArrayOfTopoService.typeGetVieFTopoStreet complex type.
 * 
 * <p>
 * Il seguente frammento di schema specifica il contenuto previsto contenuto in
 * questa classe.
 * 
 * <pre>{@code
 * <complexType name="ArrayOfTopoService.typeGetVieFTopoStreet">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="TopoService.typeGetVieFTopoStreet" type=
"{http://schemas.datacontract.org/2004/07/WcfTopo}TopoService.typeGetVieFTopoStreet" maxOccurs
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
@XmlType(name = "ArrayOfTopoService.typeGetVieFTopoStreet", propOrder = {
        "topoServiceTypeGetVieFTopoStreet"
})
public class ArrayOfTopoServiceTypeGetVieFTopoStreet {

    @XmlElement(name = "TopoService.typeGetVieFTopoStreet", nillable = true)
    protected List<TopoServiceTypeGetVieFTopoStreet> topoServiceTypeGetVieFTopoStreet;

    /**
     * Gets the value of the topoServiceTypeGetVieFTopoStreet property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the
     * topoServiceTypeGetVieFTopoStreet property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getTopoServiceTypeGetVieFTopoStreet().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TopoServiceTypeGetVieFTopoStreet }
     * 
     * 
     * @return
     *         The value of the topoServiceTypeGetVieFTopoStreet property.
     */
    public List<TopoServiceTypeGetVieFTopoStreet> getTopoServiceTypeGetVieFTopoStreet() {
        if (topoServiceTypeGetVieFTopoStreet == null) {
            topoServiceTypeGetVieFTopoStreet = new ArrayList<>();
        }
        return this.topoServiceTypeGetVieFTopoStreet;
    }

}
