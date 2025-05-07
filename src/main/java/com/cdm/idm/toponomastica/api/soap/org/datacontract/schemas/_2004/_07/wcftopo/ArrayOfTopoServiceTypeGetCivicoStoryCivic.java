
package com.cdm.idm.toponomastica.api.soap.org.datacontract.schemas._2004._07.wcftopo;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

/**
 * <p>
 * Classe Java per ArrayOfTopoService.typeGetCivicoStoryCivic complex type.
 * 
 * <p>
 * Il seguente frammento di schema specifica il contenuto previsto contenuto in
 * questa classe.
 * 
 * <pre>{@code
 * <complexType name="ArrayOfTopoService.typeGetCivicoStoryCivic">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="TopoService.typeGetCivicoStoryCivic" type=
"{http://schemas.datacontract.org/2004/07/WcfTopo}TopoService.typeGetCivicoStoryCivic" maxOccurs
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
@XmlType(name = "ArrayOfTopoService.typeGetCivicoStoryCivic", propOrder = {
        "topoServiceTypeGetCivicoStoryCivic"
})
public class ArrayOfTopoServiceTypeGetCivicoStoryCivic {

    @XmlElement(name = "TopoService.typeGetCivicoStoryCivic", nillable = true)
    protected List<TopoServiceTypeGetCivicoStoryCivic> topoServiceTypeGetCivicoStoryCivic;

    /**
     * Gets the value of the topoServiceTypeGetCivicoStoryCivic property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the
     * topoServiceTypeGetCivicoStoryCivic property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getTopoServiceTypeGetCivicoStoryCivic().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TopoServiceTypeGetCivicoStoryCivic }
     * 
     * 
     * @return
     *         The value of the topoServiceTypeGetCivicoStoryCivic property.
     */
    public List<TopoServiceTypeGetCivicoStoryCivic> getTopoServiceTypeGetCivicoStoryCivic() {
        if (topoServiceTypeGetCivicoStoryCivic == null) {
            topoServiceTypeGetCivicoStoryCivic = new ArrayList<>();
        }
        return this.topoServiceTypeGetCivicoStoryCivic;
    }

}
