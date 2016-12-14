
package introsde.document.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per savePersonMeasure complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="savePersonMeasure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="personId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="healthProfile" type="{http://ws.document.introsde/}healthProfile" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "savePersonMeasure", propOrder = {
    "personId",
    "healthProfile"
})
public class SavePersonMeasure {

    protected long personId;
    protected HealthProfile healthProfile;

    /**
     * Recupera il valore della proprietà personId.
     * 
     */
    public long getPersonId() {
        return personId;
    }

    /**
     * Imposta il valore della proprietà personId.
     * 
     */
    public void setPersonId(long value) {
        this.personId = value;
    }

    /**
     * Recupera il valore della proprietà healthProfile.
     * 
     * @return
     *     possible object is
     *     {@link HealthProfile }
     *     
     */
    public HealthProfile getHealthProfile() {
        return healthProfile;
    }

    /**
     * Imposta il valore della proprietà healthProfile.
     * 
     * @param value
     *     allowed object is
     *     {@link HealthProfile }
     *     
     */
    public void setHealthProfile(HealthProfile value) {
        this.healthProfile = value;
    }

}
