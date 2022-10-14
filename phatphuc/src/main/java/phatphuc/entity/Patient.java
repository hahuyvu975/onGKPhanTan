package phatphuc.entity;

import java.util.List;

public class Patient {
	private String patientId;
	private String bloodType;
	private String firstName;
	private String gender;
	private String lastName;
	private String telephone;
	private int yearofBirth;
	private Address address;
	private List<Test> tests;

	public String getPatientId() {
		return patientId;
	}

	public void setPatientId(String patientId) {
		this.patientId = patientId;
	}

	public String getBloodType() {
		return bloodType;
	}

	public void setBloodType(String bloodType) {
		this.bloodType = bloodType;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public int getYearofBirth() {
		return yearofBirth;
	}

	public void setYearofBirth(int yearofBirth) {
		this.yearofBirth = yearofBirth;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public List<Test> getTests() {
		return tests;
	}

	public void setTests(List<Test> tests) {
		this.tests = tests;
	}

	public Patient() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Patient [patientId=" + patientId + ", bloodType=" + bloodType + ", firstName=" + firstName + ", gender="
				+ gender + ", lastName=" + lastName + ", telephone=" + telephone + ", yearofBirth=" + yearofBirth
				+ ", address=" + address + ", tests=" + tests + "]";
	}

	
	
}
