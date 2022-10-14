package phatphuc.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.bson.Document;

import com.mongodb.client.FindIterable;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.InsertOneModel;

import phatphuc.connect.Connect;
import phatphuc.entity.Address;
import phatphuc.entity.Patient;
import phatphuc.entity.Test;

public class PatientDAO {

	public boolean addPatient(Patient patient) {

		Connect connect = new Connect();
		connect.db().getCollection("patient").insertOne(toDocument(patient));
		return true;
	}

	public List<Patient> listPatients(String bloodType, int age) throws NoSuchFieldException, SecurityException {
		List<Patient> patients = new ArrayList<Patient>();

		Connect connect = new Connect();
		FindIterable<Document> documents = connect.db().getCollection("patient")
				.find((Filters.and(    Filters.and(Filters.eq("blood_type", bloodType), Filters.gte("year_of_birth", age)))));
		Iterator<Document> it = documents.iterator();
		while (it.hasNext()) {
//			      System.out.println(it.next());
			patients.add(fromDocument(it.next()));
		}

		return patients;
	}
	
	
	public int getNumberOfTest(String patientId, String testType) {
		int count = 0;
		Connect connect = new Connect();
		FindIterable<Document> documents = connect.db().getCollection("patient")
				.find(Filters.and(Filters.and(Filters.eq("_id", patientId), Filters.elemMatch("tests", Filters.eq("test_type",testType)))));
//		FindIterable<Document> documents = connect.db().getCollection("patient")
//				.find(Filters.and(Filters.eq("gender","Bede"),Filters.and(Filters.eq("_id",0),Filters.eq("gender", null))));
		Iterator<Document> it = documents.iterator();
		while (it.hasNext()) {
			List<Document> list = it.next().getList("tests", Document.class);
			for (Document document : list) {
				if (document.getString("test_type").equals(testType)) {
					count+=1;
				}
			}
			break;
				
	}

	return count;
	}
	
	public boolean deleteTest(String patientId, String  testId ) {
		Connect connect = new Connect();
		connect.db().getCollection("patient").deleteOne(Filters.and(Filters.eq("_id", patientId), Filters.elemMatch("tests", Filters.eq("test_id",testId))));
		return true;
	}
	private Document toDocument(Patient patient) {
		Map<String, Object> map = new HashMap<String, Object>();

		List<Test> tests = patient.getTests();
		map.put("_id", patient.getPatientId());
		map.put("gender", patient.getGender());
		map.put("blood_type", patient.getBloodType());
		map.put("last_name", patient.getGender());
		map.put("first_name", patient.getGender());
		map.put("year_of_birth", patient.getYearofBirth());
		map.put("telephone", patient.getTelephone());
		map.put("address", new Document("city", patient.getAddress().getCity()).append("district",
				patient.getAddress().getDistict()));
		if (tests != null) {
			List<Document> phDocs = new ArrayList<Document>();
			tests.forEach(test -> {
				Document doc = new Document("test_id", test.getTestId()).append("test_type", test.getTestType())
						.append("result", test.getResult()).append("date", test.getDate());
				phDocs.add(doc);
			});
			map.put("tests", phDocs);
		}

		Document doc = new Document(map);
		return doc;
	}

	private Patient fromDocument(Document document) throws NoSuchFieldException, SecurityException {
		Patient patient = new Patient();
		Address address = new Address();
		patient.setPatientId(document.getString("_id"));
		patient.setGender(document.getString("gender"));
		patient.setFirstName(document.getString("first_name"));
		patient.setLastName(document.getString("last_name"));
		patient.setYearofBirth(document.getInteger("year_of_birth"));
		patient.setTelephone(document.getString("telephone"));
		Document document2 = (Document) document.get("address");
		address.setCity(document2.getString("city"));
		patient.setAddress(address);
		List<Test> tests = new ArrayList<>();
		List<Document> list = document.getList("tests", Document.class);
		for (Document document3 : list) {
			Test test = new Test();
			test.setTestId(document3.getString("test_id"));
			test.setTestType(document3.getString("test_type"));
			test.setResult(document3.getString("result"));
			test.setDate(document3.getDate("date"));
			tests.add(test);
		}
		patient.setTests(tests);
		System.out.println(patient.toString());

		return patient;
	}

}
