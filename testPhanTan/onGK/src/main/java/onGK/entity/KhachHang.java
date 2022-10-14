package onGK.entity;

public class KhachHang {
	private String customerID;
	private String name;
	private int age;
	private String email;
	private String phone;
	private HomeAddress homeAddress;
	private BusinessAddress businessAddress;
	public String getCustomerID() {
		return customerID;
	}
	public void setCustomerID(String customerID) {
		this.customerID = customerID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public HomeAddress getHomeAddress() {
		return homeAddress;
	}
	public void setHomeAddress(HomeAddress homeAddress) {
		this.homeAddress = homeAddress;
	}
	public BusinessAddress getBusinessAddress() {
		return businessAddress;
	}
	public void setBusinessAddress(BusinessAddress businessAddress) {
		this.businessAddress = businessAddress;
	}
	public KhachHang(String customerID, String name, int age, String email, String phone, HomeAddress homeAddress,
			BusinessAddress businessAddress) {
		super();
		this.customerID = customerID;
		this.name = name;
		this.age = age;
		this.email = email;
		this.phone = phone;
		this.homeAddress = homeAddress;
		this.businessAddress = businessAddress;
	}
	public KhachHang() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "KhachHang [customerID=" + customerID + ", name=" + name + ", age=" + age + ", email=" + email
				+ ", phone=" + phone + ", homeAddress=" + homeAddress + ", businessAddress=" + businessAddress + "]";
	}
}
