
package introsde.document.ws;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "People", targetNamespace = "http://ws.document.introsde/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface People {


    /**
     * 
     * @param personId
     * @param measureType
     * @return
     *     returns java.util.List<introsde.document.ws.HealthMeasureHistory>
     */
    @WebMethod
    @WebResult(name = "personHistory", targetNamespace = "")
    @RequestWrapper(localName = "readPersonHistory", targetNamespace = "http://ws.document.introsde/", className = "introsde.document.ws.ReadPersonHistory")
    @ResponseWrapper(localName = "readPersonHistoryResponse", targetNamespace = "http://ws.document.introsde/", className = "introsde.document.ws.ReadPersonHistoryResponse")
    @Action(input = "http://ws.document.introsde/People/readPersonHistoryRequest", output = "http://ws.document.introsde/People/readPersonHistoryResponse")
    public List<HealthMeasureHistory> readPersonHistory(
        @WebParam(name = "personId", targetNamespace = "")
        long personId,
        @WebParam(name = "measureType", targetNamespace = "")
        String measureType);

    /**
     * 
     * @param mid
     * @param personId
     * @param measureType
     * @return
     *     returns introsde.document.ws.HealthMeasureHistory
     */
    @WebMethod
    @WebResult(name = "personMeasure", targetNamespace = "")
    @RequestWrapper(localName = "readPersonMeasure", targetNamespace = "http://ws.document.introsde/", className = "introsde.document.ws.ReadPersonMeasure")
    @ResponseWrapper(localName = "readPersonMeasureResponse", targetNamespace = "http://ws.document.introsde/", className = "introsde.document.ws.ReadPersonMeasureResponse")
    @Action(input = "http://ws.document.introsde/People/readPersonMeasureRequest", output = "http://ws.document.introsde/People/readPersonMeasureResponse")
    public HealthMeasureHistory readPersonMeasure(
        @WebParam(name = "personId", targetNamespace = "")
        long personId,
        @WebParam(name = "measureType", targetNamespace = "")
        String measureType,
        @WebParam(name = "mid", targetNamespace = "")
        long mid);

    /**
     * 
     * @param personId
     * @param healthProfile
     * @return
     *     returns introsde.document.ws.HealthProfile
     */
    @WebMethod
    @WebResult(name = "hpId", targetNamespace = "")
    @RequestWrapper(localName = "savePersonMeasure", targetNamespace = "http://ws.document.introsde/", className = "introsde.document.ws.SavePersonMeasure")
    @ResponseWrapper(localName = "savePersonMeasureResponse", targetNamespace = "http://ws.document.introsde/", className = "introsde.document.ws.SavePersonMeasureResponse")
    @Action(input = "http://ws.document.introsde/People/savePersonMeasureRequest", output = "http://ws.document.introsde/People/savePersonMeasureResponse")
    public HealthProfile savePersonMeasure(
        @WebParam(name = "personId", targetNamespace = "")
        long personId,
        @WebParam(name = "healthProfile", targetNamespace = "")
        HealthProfile healthProfile);

    /**
     * 
     * @param personId
     * @param healthProfile
     * @return
     *     returns introsde.document.ws.HealthProfile
     */
    @WebMethod
    @WebResult(name = "hpId", targetNamespace = "")
    @RequestWrapper(localName = "updatePersonMeasure", targetNamespace = "http://ws.document.introsde/", className = "introsde.document.ws.UpdatePersonMeasure")
    @ResponseWrapper(localName = "updatePersonMeasureResponse", targetNamespace = "http://ws.document.introsde/", className = "introsde.document.ws.UpdatePersonMeasureResponse")
    @Action(input = "http://ws.document.introsde/People/updatePersonMeasureRequest", output = "http://ws.document.introsde/People/updatePersonMeasureResponse")
    public HealthProfile updatePersonMeasure(
        @WebParam(name = "personId", targetNamespace = "")
        long personId,
        @WebParam(name = "healthProfile", targetNamespace = "")
        HealthProfile healthProfile);

    /**
     * 
     * @return
     *     returns java.util.List<introsde.document.ws.Person>
     */
    @WebMethod
    @WebResult(name = "people", targetNamespace = "")
    @RequestWrapper(localName = "readPersonList", targetNamespace = "http://ws.document.introsde/", className = "introsde.document.ws.ReadPersonList")
    @ResponseWrapper(localName = "readPersonListResponse", targetNamespace = "http://ws.document.introsde/", className = "introsde.document.ws.ReadPersonListResponse")
    @Action(input = "http://ws.document.introsde/People/readPersonListRequest", output = "http://ws.document.introsde/People/readPersonListResponse")
    public List<Person> readPersonList();

    /**
     * 
     * @param person
     * @return
     *     returns introsde.document.ws.Person
     */
    @WebMethod
    @WebResult(name = "personId", targetNamespace = "")
    @RequestWrapper(localName = "updatePerson", targetNamespace = "http://ws.document.introsde/", className = "introsde.document.ws.UpdatePerson")
    @ResponseWrapper(localName = "updatePersonResponse", targetNamespace = "http://ws.document.introsde/", className = "introsde.document.ws.UpdatePersonResponse")
    @Action(input = "http://ws.document.introsde/People/updatePersonRequest", output = "http://ws.document.introsde/People/updatePersonResponse")
    public Person updatePerson(
        @WebParam(name = "person", targetNamespace = "")
        Person person);

    /**
     * 
     * @return
     *     returns java.util.List<introsde.document.ws.MeasureDefinition>
     */
    @WebMethod
    @WebResult(name = "measureTypes", targetNamespace = "")
    @RequestWrapper(localName = "readMeasureTypes", targetNamespace = "http://ws.document.introsde/", className = "introsde.document.ws.ReadMeasureTypes")
    @ResponseWrapper(localName = "readMeasureTypesResponse", targetNamespace = "http://ws.document.introsde/", className = "introsde.document.ws.ReadMeasureTypesResponse")
    @Action(input = "http://ws.document.introsde/People/readMeasureTypesRequest", output = "http://ws.document.introsde/People/readMeasureTypesResponse")
    public List<MeasureDefinition> readMeasureTypes();

    /**
     * 
     * @param person
     * @return
     *     returns introsde.document.ws.Person
     */
    @WebMethod
    @WebResult(name = "personId", targetNamespace = "")
    @RequestWrapper(localName = "createPerson", targetNamespace = "http://ws.document.introsde/", className = "introsde.document.ws.CreatePerson")
    @ResponseWrapper(localName = "createPersonResponse", targetNamespace = "http://ws.document.introsde/", className = "introsde.document.ws.CreatePersonResponse")
    @Action(input = "http://ws.document.introsde/People/createPersonRequest", output = "http://ws.document.introsde/People/createPersonResponse")
    public Person createPerson(
        @WebParam(name = "person", targetNamespace = "")
        Person person);

    /**
     * 
     * @param personId
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(name = "personId", targetNamespace = "")
    @RequestWrapper(localName = "deletePerson", targetNamespace = "http://ws.document.introsde/", className = "introsde.document.ws.DeletePerson")
    @ResponseWrapper(localName = "deletePersonResponse", targetNamespace = "http://ws.document.introsde/", className = "introsde.document.ws.DeletePersonResponse")
    @Action(input = "http://ws.document.introsde/People/deletePersonRequest", output = "http://ws.document.introsde/People/deletePersonResponse")
    public int deletePerson(
        @WebParam(name = "personId", targetNamespace = "")
        long personId);

    /**
     * 
     * @param personId
     * @return
     *     returns introsde.document.ws.Person
     */
    @WebMethod
    @WebResult(name = "person", targetNamespace = "")
    @RequestWrapper(localName = "readPerson", targetNamespace = "http://ws.document.introsde/", className = "introsde.document.ws.ReadPerson")
    @ResponseWrapper(localName = "readPersonResponse", targetNamespace = "http://ws.document.introsde/", className = "introsde.document.ws.ReadPersonResponse")
    @Action(input = "http://ws.document.introsde/People/readPersonRequest", output = "http://ws.document.introsde/People/readPersonResponse")
    public Person readPerson(
        @WebParam(name = "personId", targetNamespace = "")
        long personId);

}
