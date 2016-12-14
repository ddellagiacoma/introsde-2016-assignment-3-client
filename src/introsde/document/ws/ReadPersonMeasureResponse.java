
package introsde.document.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per readPersonMeasureResponse complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="readPersonMeasureResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="personMeasure" type="{http://ws.document.introsde/}healthMeasureHistory" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "readPersonMeasureResponse", propOrder = {
    "personMeasure"
})
public class ReadPersonMeasureResponse {

    protected HealthMeasureHistory personMeasure;

    /**
     * Recupera il valore della proprietà personMeasure.
     * 
     * @return
     *     possible object is
     *     {@link HealthMeasureHistory }
     *     
     */
    public HealthMeasureHistory getPersonMeasure() {
        return personMeasure;
    }

    /**
     * Imposta il valore della proprietà personMeasure.
     * 
     * @param value
     *     allowed object is
     *     {@link HealthMeasureHistory }
     *     
     */
    public void setPersonMeasure(HealthMeasureHistory value) {
        this.personMeasure = value;
    }

}
