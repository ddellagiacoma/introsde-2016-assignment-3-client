
package introsde.document.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per updatePersonMeasureResponse complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="updatePersonMeasureResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="hpId" type="{http://ws.document.introsde/}healthProfile" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updatePersonMeasureResponse", propOrder = {
    "hpId"
})
public class UpdatePersonMeasureResponse {

    protected HealthProfile hpId;

    /**
     * Recupera il valore della proprietà hpId.
     * 
     * @return
     *     possible object is
     *     {@link HealthProfile }
     *     
     */
    public HealthProfile getHpId() {
        return hpId;
    }

    /**
     * Imposta il valore della proprietà hpId.
     * 
     * @param value
     *     allowed object is
     *     {@link HealthProfile }
     *     
     */
    public void setHpId(HealthProfile value) {
        this.hpId = value;
    }

}
