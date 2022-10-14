package onGK.dao;

import java.util.List;

import onGK.entity.KhachHang;

public interface KhachHangDao {
	
	public boolean addCustomer(KhachHang kh);
	
	public void printByCustomerID(String maKH);
	
	public List<KhachHang> getCustomer(int fromAge, int toAge);
	
	public boolean getDeleteCustomer(String xoaMaKH);
	
	public boolean updateCustomerEmail(String maKH, String newEmail);
	
}
