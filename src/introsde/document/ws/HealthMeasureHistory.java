
package introsde.document.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java per healthMeasureHistory complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="healthMeasureHistory">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idMeasureHistory" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="measureDef" type="{http://ws.document.introsde/}measureDefinition" minOccurs="0"/>
 *         &lt;element name="person" type="{http://ws.document.introsde/}person" minOccurs="0"/>
 *         &lt;element name="timestamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "healthMeasureHistory", propOrder = {
    "idMeasureHistory",
    "measureDef",
    "person",
    "timestamp",
    "value"
})
public class HealthMeasureHistory {

    protected int idMeasureHistory;
    protected MeasureDefinition measureDef;
    protected Person person;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timestamp;
    protected String value;

    /**
     * Recupera il valore della proprietà idMeasureHistory.
     * 
     */
    public int getIdMeasureHistory() {
        return idMeasureHistory;
    }

    /**
     * Imposta il valore della proprietà idMeasureHistory.
     * 
     */
    public void setIdMeasureHistory(int value) {
        this.idMeasureHistory = value;
    }

    /**
     * Recupera il valore della proprietà measureDef.
     * 
     * @return
     *     possible object is
     *     {@link MeasureDefinition }
     *     
     */
    public MeasureDefinition getMeasureDef() {
        return measureDef;
    }

    /**
     * Imposta il valore della proprietà measureDef.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureDefinition }
     *     
     */
    public void setMeasureDef(MeasureDefinition value) {
        this.measureDef = value;
    }

    /**
     * Recupera il valore della proprietà person.
     * 
     * @return
     *     possible object is
     *     {@link Person }
     *     
     */
    public Person getPerson() {
        return person;
    }

    /**
     * Imposta il valore della proprietà person.
     * 
     * @param value
     *     allowed object is
     *     {@link Person }
     *     
     */
    public void setPerson(Person value) {
        this.person = value;
    }

    /**
     * Recupera il valore della proprietà timestamp.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTimestamp() {
        return timestamp;
    }

    /**
     * Imposta il valore della proprietà timestamp.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTimestamp(XMLGregorianCalendar value) {
        this.timestamp = value;
    }

    /**
     * Recupera il valore della proprietà value.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Imposta il valore della proprietà value.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

}
