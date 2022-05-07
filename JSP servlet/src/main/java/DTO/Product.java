package DTO;

public class Product {
	private String ID;
	private String Loai;
	private String Hinh;
	private String Tensp;
	private int Gia;
	private int SoLuong;
	private String Hinh_ct;
	public Product(String ID,String loai,String hinh,String tensp,int gia,int sl,String hinhct) {
		this.ID=ID;
		this.Loai=loai;
		this.Hinh=hinh;
		this.Tensp=tensp;
		this.Gia=gia;
		this.SoLuong=sl;
		this.Hinh_ct=hinhct;
	}
	public String getID() {
		return ID;
	}
	public void setID(String id) {
		this.ID=id;
	}
	public String getLoai() {
		return Loai;
	}
	public void setLoai(String loai) {
		this.Loai=loai;
	}
	public String getHinh() {
		return Hinh;
	}
	public void setHinh(String hinh) {
		this.Hinh=hinh;
	}
	public String getTensp() {
		return Tensp;
	}
	public void setTensp(String tensp) {
		this.Tensp=tensp;
	}
	public String getHinhct() {
		return Hinh_ct;
	}
	public void setHinhct(String Hinhct) {
		this.Hinh_ct=Hinhct;
	}
	
}
