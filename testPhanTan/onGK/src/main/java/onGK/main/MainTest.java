package onGK.main;

import onGK.dao.KhachHangDaoImpl;
import onGK.entity.BusinessAddress;
import onGK.entity.HomeAddress;
import onGK.entity.KhachHang;

public class MainTest {

	public static void main(String[] args) throws NoSuchFieldException {
		KhachHangDaoImpl dao = new KhachHangDaoImpl();
		
		//cau a
//		HomeAddress homeAddress = new HomeAddress();
//		homeAddress.setStreet("Phan Van Hon");
//		homeAddress.setCity("HCM");
//		homeAddress.setZipcode(95046);
//		
//		BusinessAddress businessAddress = new BusinessAddress();
//		businessAddress.setStreet("CMT8");
//		businessAddress.setCity("HCM");
//		businessAddress.setZipcode(95141);
//		
//		KhachHang khachHang = new KhachHang();
//		khachHang.setCustomerID("18082581");
//		khachHang.setName("Huy Vu");
//		khachHang.setAge(24);
//		khachHang.setEmail("huyvu2k2@gmail.com");
//		khachHang.setPhone("0901356975");
//		khachHang.setHomeAddress(homeAddress);
//		khachHang.setBusinessAddress(businessAddress);
//		
//		dao.addCustomer(khachHang);
		
		// cau b
//		dao.printByCustomerID("112233445");
		
		// cau c
//		dao.getCustomer(19, 26);
		
		// cau d
//		dao.getDeleteCustomer("123456789");
		
		// cau e
		dao.updateCustomerEmail("112233445", "phatyeutrang@gmail.com");
	}
}
