package phatphuc.entity;

public class Address {
	private String city;
	private String distict;
	private String street;
	private String ward;
	public Address() {
		// TODO Auto-generated constructor stub
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getDistict() {
		return distict;
	}
	public void setDistict(String distict) {
		this.distict = distict;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getWard() {
		return ward;
	}
	public void setWard(String ward) {
		this.ward = ward;
	}
	@Override
	public String toString() {
		return "Address [city=" + city + ", distict=" + distict + ", street=" + street + ", ward=" + ward + "]";
	}
	
	
	
}
