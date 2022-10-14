package onGK.entity;

public class BusinessAddress {
	private String street;
	private String city;
	private int zipcode;
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getZipcode() {
		return zipcode;
	}
	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}
	public BusinessAddress(String street, String city, int zipcode) {
		super();
		this.street = street;
		this.city = city;
		this.zipcode = zipcode;
	}
	public BusinessAddress() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "BusinessAddress [street=" + street + ", city=" + city + ", zipcode=" + zipcode + "]";
	}
	
}
