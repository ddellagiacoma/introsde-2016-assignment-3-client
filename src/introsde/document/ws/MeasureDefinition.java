
package introsde.document.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per measureDefinition complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="measureDefinition">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idMeasureDef" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="measureName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="measureType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "measureDefinition", propOrder = {
    "idMeasureDef",
    "measureName",
    "measureType"
})
public class MeasureDefinition {

    protected int idMeasureDef;
    protected String measureName;
    protected String measureType;

    /**
     * Recupera il valore della proprietà idMeasureDef.
     * 
     */
    public int getIdMeasureDef() {
        return idMeasureDef;
    }

    /**
     * Imposta il valore della proprietà idMeasureDef.
     * 
     */
    public void setIdMeasureDef(int value) {
        this.idMeasureDef = value;
    }

    /**
     * Recupera il valore della proprietà measureName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeasureName() {
        return measureName;
    }

    /**
     * Imposta il valore della proprietà measureName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeasureName(String value) {
        this.measureName = value;
    }

    /**
     * Recupera il valore della proprietà measureType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeasureType() {
        return measureType;
    }

    /**
     * Imposta il valore della proprietà measureType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeasureType(String value) {
        this.measureType = value;
    }

}
