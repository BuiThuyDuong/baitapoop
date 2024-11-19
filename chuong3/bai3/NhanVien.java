package chuong3.bai3;

public class NhanVien {
	//thuoc tinh
	protected String name;
	protected DiaChi address;
	protected String dob;
	protected char gender;	//M là nam. F là nữ
	
	//constructor
	public NhanVien() {
	}
	public NhanVien(String name, DiaChi address, String dob, char gender) {
		super();
		this.name = name;
		this.address = address;
		this.dob = dob;
		this.gender = gender;
	}
	
	//get, set
	public String getName() {
		return name;
	}
	public DiaChi getAddress() {
		return address;
	}
	public String getDob() {
		return dob;
	}
	public char getGender() {
		return gender;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAddress(DiaChi address) {
		this.address = address;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	//toString
	@Override
	public String toString() {
		return "NhanVien [name=" + name + ", address=" + address + ", dob=" + dob + ", gender=" + gender + "]";
	}
}