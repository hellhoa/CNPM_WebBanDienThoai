package beans;

public class PhuKien {
	private int maPK;
	private String ten;
	private long dongia;
	private String hinhanh;
	private String dacdiem1;
	private String dacdiem2;
	private int soluong;
	public PhuKien() {
		
	}
	public PhuKien(int maPK, String ten, long dongia, String hinhanh) {
		this.setMaPK(maPK);
		this.setTen(ten);
		this.setDongia(dongia);
		this.setHinhanh(hinhanh);
	}
	public PhuKien(int maPK, String ten, long dongia, String hinhanh,int soluong) {
		this.setMaPK(maPK);
		this.setTen(ten);
		this.setDongia(dongia);
		this.setHinhanh(hinhanh);
		this.setSoluong(soluong);
	}
	public int getMaPK() {
		return maPK;
	}
	public void setMaPK(int maPK) {
		this.maPK = maPK;
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public String getHinhanh() {
		return hinhanh;
	}
	public void setHinhanh(String hinhanh) {
		this.hinhanh = hinhanh;
	}
	public long getDongia() {
		return dongia;
	}
	public void setDongia(long dongia) {
		this.dongia = dongia;
	}
	public String getDacdiem1() {
		return dacdiem1;
	}
	public void setDacdiem1(String dacdiem1) {
		this.dacdiem1 = dacdiem1;
	}
	public String getDacdiem2() {
		return dacdiem2;
	}
	public void setDacdiem2(String dacdiem2) {
		this.dacdiem2 = dacdiem2;
	}
	public int getSoluong() {
		return soluong;
	}
	public void setSoluong(int soluong) {
		this.soluong = soluong;
	}
	
}
