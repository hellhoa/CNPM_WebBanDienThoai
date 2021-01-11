package beans;

import java.sql.Date;

public class DonHang {
	private int maDonHang;
	private int maSP;
	private String tenSP;
	private long dongia;
	private int slmua;
	private int maKH;
	private Date ngayMua;
	private String tinhtrang;
	private String tenKH;
	private String diachigiaohang;
	
	public DonHang(int maDonHang, int maSP, String tenSP, long dongia, int slmua, int maKH, Date ngayMua)
	{
		super();
		this.setMaDonHang(maDonHang);
		this.setMaSP(maSP);
		this.setTenSP(tenSP);
		this.setDongia(dongia);
		this.setSlmua(slmua);
		this.setMaKH(maKH);
		this.setNgayMua(ngayMua);
	}
	
	public DonHang(int maDonHang, int maSP, String tenSP, long dongia, int slmua, int maKH, Date ngayMua, String tinhtrang)
	{
		super();
		this.setMaDonHang(maDonHang);
		this.setMaSP(maSP);
		this.setTenSP(tenSP);
		this.setDongia(dongia);
		this.setSlmua(slmua);
		this.setMaKH(maKH);
		this.setNgayMua(ngayMua);
		this.setTinhtrang(tinhtrang);
	}
	public DonHang(int maDonHang, int maSP, String tenSP, long dongia, int slmua,String tenKH, String diachi, Date ngayMua, String tinhtrang)
	{
		super();
		this.setMaDonHang(maDonHang);
		this.setMaSP(maSP);
		this.setTenSP(tenSP);
		this.setDongia(dongia);
		this.setSlmua(slmua);
		this.setTenKH(tenKH);
		this.setDiachigiaohang(diachi);
		this.setNgayMua(ngayMua);
		this.setTinhtrang(tinhtrang);
	}
	public int getMaDonHang() {
		return maDonHang;
	}
	public void setMaDonHang(int maDonHang) {
		this.maDonHang = maDonHang;
	}
	public int getMaSP() {
		return maSP;
	}
	public void setMaSP(int maSP) {
		this.maSP = maSP;
	}
	public String getTenSP() {
		return tenSP;
	}
	public void setTenSP(String tenSP) {
		this.tenSP = tenSP;
	}
	public long getDongia() {
		return dongia;
	}
	public void setDongia(long dongia) {
		this.dongia = dongia;
	}
	public int getSlmua() {
		return slmua;
	}
	public void setSlmua(int slmua) {
		this.slmua = slmua;
	}
	public int getMaKH() {
		return maKH;
	}
	public void setMaKH(int maKH) {
		this.maKH = maKH;
	}
	public Date getNgayMua() {
		return ngayMua;
	}
	public void setNgayMua(Date ngayMua) {
		this.ngayMua = ngayMua;
	}
	public String getTinhtrang() {
		return tinhtrang;
	}
	public void setTinhtrang(String tinhtrang) {
		this.tinhtrang = tinhtrang;
	}
	public String getTenKH() {
		return tenKH;
	}
	public void setTenKH(String tenKH) {
		this.tenKH = tenKH;
	}
	public String getDiachigiaohang() {
		return diachigiaohang;
	}
	public void setDiachigiaohang(String diachigiaohang) {
		this.diachigiaohang = diachigiaohang;
	}
}
