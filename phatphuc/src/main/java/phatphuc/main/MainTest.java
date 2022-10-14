package phatphuc.main;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.bson.Document;

import com.mongodb.Block;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.model.Filters;

import phatphuc.connect.Connect;
import phatphuc.dao.PatientDAO;
import phatphuc.entity.Address;
import phatphuc.entity.Patient;
import phatphuc.entity.Test;

public class MainTest {
 public static void main(String[] args) throws NoSuchFieldException, SecurityException {
	 PatientDAO patientDAO  = new PatientDAO();
	 
	 
	 // Câu b
//	 Address  address = new Address();
//	 address.setCity("123");
//	 address.setDistict("231");
//	 address.setWard("456");
//	 address.setStreet("xav");
//	 
//	 Test test = new Test();
//	 test.setDate(new Date());
//	 test.setResult("123123123");
//	 test.setTestId("1444");
//	 test.setTestType("123123213123");
//	 
//	 Test test2 = new Test();
//	 test2.setDate(new Date());
//	 test2.setResult("123123123");
//	 test2.setTestId("1445");
//	 test2.setTestType("home");
//	 Test test3 = new Test();
//	 test3.setDate(new Date());
//	 test3.setResult("123123123");
//	 test3.setTestId("1445");
//	 test3.setTestType("home");
//	 List<Test> tests = new ArrayList<>();
//	 tests.add(test);
//	 tests.add(test2);
//	 tests.add(test3);
//	 Patient patient = new Patient();
//	 patient.setPatientId("223");
//	 patient.setFirstName("haha");
//	 patient.setLastName("haha");
//	 patient.setBloodType("A");
//	 patient.setTelephone("123123123123");
//	 patient.setGender("Bede");
//	 patient.setYearofBirth(123);
//	 patient.setAddress(address);
//	 patient.setTests(tests);
//	 patientDAO.addPatient(patient);
//	 
	 
  ///  Câu a 
//	 patientDAO.listPatients("A", 123);
	 
	 // Câu c
//	System.out.println(patientDAO.getNumberOfTest("223","home")); 
	 
	 
	 //Câu d
//	 patientDAO.deleteTest("222", "1444");
	 Connect connect = new Connect();
	 System.out.println(connect.db().getCollection("patient").count());
	 
	 
}
 
}
