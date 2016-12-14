package client;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeConstants;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import introsde.document.ws.*;

public class PeopleClient {
	static int IDcreated;
	static PrintWriter out = null;

	public static void main(String[] args) throws Exception {

		out = new PrintWriter(new BufferedWriter(new FileWriter("client-server.log", false)));

		PeopleService service = new PeopleService();
		People people = service.getPeopleImplPort();

		out.println("WSDL Document Location: " + service.getWSDLDocumentLocation());

		method1(people);
		method2(people);
		method3(people);
		method4(people);
		method5(people);
		method6(people);
		method7(people);
		method8(people);
		method9(people);
		method10(people);

		out.close();
	}

	static void method1(People people) {
		out.println();
		out.println("Method #1: readPersonList()");

		List<Person> response = people.readPersonList();

		if (response.size() > 0) {
			out.println("Result ==> OK");
			for (int i = 0; i < response.size(); i++) {
				out.println("IdPerson: " + response.get(i).getIdPerson() + " Firstname: "
						+ response.get(i).getFirstname() + " Lastname: " + response.get(i).getLastname()
						+ " Birthdate: " + response.get(i).getBirthdate());
				List<HealthProfile> hp = response.get(i).getHealthProfile().getMeasureType();
				for (int j = 0; j < hp.size(); j++) {
					out.println("IdMeasure: " + hp.get(j).getIdMeasure() + " MeasureName: "
							+ hp.get(j).getMeasureDefinition().getMeasureName() + " Value: " + hp.get(j).getValue());
				}
				out.println();
			}
		} else {
			out.println("Result ==> ERROR");
		}
	}

	static void method2(People people) {
		out.println();
		out.println("Method #2: readPerson(1)");

		Person response = people.readPerson(1);

		if (response != null) {
			out.println("Result ==> OK");
			out.println("IdPerson: " + response.getIdPerson() + " Firstname: " + response.getFirstname() + " Lastname: "
					+ response.getLastname() + " Birthdate: " + response.getBirthdate());
			List<HealthProfile> hp = response.getHealthProfile().getMeasureType();
			for (int j = 0; j < hp.size(); j++) {
				out.println("IdMeasure: " + hp.get(j).getIdMeasure() + " MeasureName: "
						+ hp.get(j).getMeasureDefinition().getMeasureName() + " Value: " + hp.get(j).getValue());
			}
			out.println();
		} else {
			out.println("Result ==> ERROR");
		}
	}

	static void method3(People people) throws DatatypeConfigurationException, ParseException {
		out.println();
		out.println("Method #3: updatePerson(Person(Albert,Einstein,1987-11-17))");

		Date dob = null;
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		dob = df.parse("1987-11-17 11:15:00");
		GregorianCalendar cal = new GregorianCalendar();

		cal.setTime(dob);
		XMLGregorianCalendar date = DatatypeFactory.newInstance()
				.newXMLGregorianCalendar(cal.get(Calendar.YEAR), cal.get(Calendar.MONTH) + 1,
						cal.get(Calendar.DAY_OF_MONTH), dob.getHours(), dob.getMinutes(), dob.getSeconds(),
						DatatypeConstants.FIELD_UNDEFINED, cal.getTimeZone().LONG)
				.normalize();

		Person p = new Person();
		p.setFirstname("Albert");
		p.setLastname("Einstein");
		p.setBirthdate(date);
		p.setIdPerson(4);

		Person response = people.updatePerson(p);

		if (response != null) {
			out.println("Result ==> OK");
			out.println("IdPerson: " + response.getIdPerson() + " Firstname: " + response.getFirstname() + " Lastname: "
					+ response.getLastname() + " Birthdate: " + response.getBirthdate());
			List<HealthProfile> hp = response.getHealthProfile().getMeasureType();
			for (int j = 0; j < hp.size(); j++) {
				out.println("IdMeasure: " + hp.get(j).getIdMeasure() + " MeasureName: "
						+ hp.get(j).getMeasureDefinition().getMeasureName() + " Value: " + hp.get(j).getValue());
			}
			out.println();
		} else {
			out.println("Result ==> ERROR");
		}
	}

	static void method4(People people) throws DatatypeConfigurationException, ParseException {
		out.println();
		out.println("Method #4: createPerson(Person(Michael,Jordan,1980-10-15))");

		Date dob = null;
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		dob = df.parse("1980-10-15 11:15:00");
		GregorianCalendar cal = new GregorianCalendar();

		cal.setTime(dob);
		XMLGregorianCalendar date = DatatypeFactory.newInstance()
				.newXMLGregorianCalendar(cal.get(Calendar.YEAR), cal.get(Calendar.MONTH) + 1,
						cal.get(Calendar.DAY_OF_MONTH), dob.getHours(), dob.getMinutes(), dob.getSeconds(),
						DatatypeConstants.FIELD_UNDEFINED, cal.getTimeZone().LONG)
				.normalize();

		Person p = new Person();
		p.setFirstname("Michael");
		p.setLastname("Jordan");
		p.setBirthdate(date);

		Person response = people.createPerson(p);

		if (response != null) {
			out.println("Result ==> OK");
			out.println("IdPerson: " + response.getIdPerson() + " Firstname: " + response.getFirstname() + " Lastname: "
					+ response.getLastname() + " Birthdate: " + response.getBirthdate());
			IDcreated = response.getIdPerson();
		} else {
			out.println("Result ==> ERROR");
		}
		out.println();
	}

	static void method5(People people) {
		out.println();
		out.println("Method #5: deletePerson(" + IDcreated + ")");

		int response = people.deletePerson(IDcreated);

		if (response == 0) {
			out.println("Result ==> OK");
		} else {
			out.println("Result ==> ERROR");
		}
		out.println();
	}

	static void method6(People people) {
		out.println();
		out.println("Method #6: readPersonHistory(2, \"weight\")");

		List<HealthMeasureHistory> response = people.readPersonHistory(2, "weight");

		if (response.size() > 0) {
			out.println("Result ==> OK");
			for (int i = 0; i < response.size(); i++) {
				out.println("IdMeasureHistory: " + response.get(i).getIdMeasureHistory() + " Value: "
						+ response.get(i).getValue() + " Timestamp: " + response.get(i).getTimestamp());
			}
		} else {
			out.println("Result ==> ERROR");
		}
		out.println();
	}

	static void method7(People people) {
		out.println();
		out.println("Method #7: readMeasureTypes()");

		List<MeasureDefinition> response = people.readMeasureTypes();

		if (response.size() > 0) {
			out.println("Result ==> OK");
			for (int i = 0; i < response.size(); i++) {
				out.println("IdMeasureDef: " + response.get(i).getIdMeasureDef() + " MeasureName: "
						+ response.get(i).getMeasureName() + " MeasureType: " + response.get(i).getMeasureType());
			}
		} else {
			out.println("Result ==> ERROR");
		}
		out.println();
	}

	static void method8(People people) {
		out.println();
		out.println("Method #8: readPersonMeasure(1, \"weight\", 1)");

		HealthMeasureHistory response = people.readPersonMeasure(1, "weight", 1);
		if (response != null) {
			out.println("Result ==> OK");
			out.println("IdMeasure: " + response.getIdMeasureHistory() + " Value: " + response.getValue()
					+ " Timestamp: " + response.getTimestamp());
		} else {
			out.println("Result ==> ERROR");
		}
		out.println();
	}

	static void method9(People people) {
		out.println();
		out.println("Method #9: savePersonMeasure(1, HealthProfile(weight,89))");

		HealthProfile hp = new HealthProfile();
		MeasureDefinition md = new MeasureDefinition();
		md.setMeasureName("weight");
		md.setIdMeasureDef(1);
		md.setMeasureType("double");
		hp.setMeasureDefinition(md);
		hp.setValue("89");

		HealthProfile response = people.savePersonMeasure(1, hp);
		if (response != null) {
			out.println("Result ==> OK");
			out.println("IdMeasure: " + response.getIdMeasure() + " MeasureDef: "
					+ response.getMeasureDefinition().getMeasureName() + " Value: " + response.getValue());
		} else {
			out.println("Result ==> ERROR");
		}
		out.println();
	}

	static void method10(People people) {
		out.println();
		out.println("Method #10: updatePersonMeasure(1, HealthProfile(weight,47))");

		HealthProfile hp = new HealthProfile();
		MeasureDefinition md = new MeasureDefinition();
		md.setMeasureName("weight");
		md.setIdMeasureDef(1);
		md.setMeasureType("double");
		hp.setMeasureDefinition(md);
		hp.setValue("47");

		HealthProfile response = people.updatePersonMeasure(1, hp);

		if (response != null) {
			out.println("Result ==> OK");
			out.println("IdMeasure: " + response.getIdMeasure() + " MeasureDef: "
					+ response.getMeasureDefinition().getMeasureName() + " Value: " + response.getValue());
		} else {
			out.println("Result ==> ERROR");
		}
	}
}