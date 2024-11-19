package chuong3.bai2;

public class DiaChi {
	// danh sách thuộc tính
	protected String thon;
	protected String xa;
	protected String huyen;
	protected String tinh;
	
	//constructor
	public DiaChi() {
	}
	public DiaChi(String thon, String xa, String huyen, String tinh) {
		super();
		this.thon = thon;
		this.xa = xa;
		this.huyen = huyen;
		this.tinh = tinh;
	}
	
	//get, set
	public String getThon() {
		return thon;
	}
	public String getXa() {
		return xa;
	}
	public String getHuyen() {
		return huyen;
	}
	public String getTinh() {
		return tinh;
	}
	public void setThon(String thon) {
		this.thon = thon;
	}
	public void setXa(String xa) {
		this.xa = xa;
	}
	public void setHuyen(String huyen) {
		this.huyen = huyen;
	}
	public void setTinh(String tinh) {
		this.tinh = tinh;
	}
	
	//toString
	@Override
	public String toString() {
		return "DiaChi [thon=" + thon + ", xa=" + xa + ", huyen=" + huyen + ", tinh=" + tinh + "]";
	}
	
	

	
	
	

}
