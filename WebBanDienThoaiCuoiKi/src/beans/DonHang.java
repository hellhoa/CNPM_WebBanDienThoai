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
}
