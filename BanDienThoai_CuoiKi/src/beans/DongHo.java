package beans;

public class DongHo {
	private  int maDH;
	private String ten;
	private long dongia;
	private String hinhanh;
	private String dacdiem1;
	private String dacdiem2;
	private String congnghemanhinh;
	private String kichthuocmanhinh;
	private String thoigiansudung;
	private String hedieuhanh;
	private String chatlieumat;
	private String duongkinhmat;
	private String ketnoi;
	private String ngonngu;
	private String theodoisuckhoe;
	private int soluong;
	public DongHo() {
		
	}
	public DongHo(int maDH, String ten, long dongia, String hinhanh, int soluong) {
		super();
		this.setMaDH(maDH);
		this.setTen(ten);
		this.setDongia(dongia);
		this.setHinhanh(hinhanh);
		this.setSoluong(soluong);
	}
	public DongHo(int maDH, String ten, long dongia, String hinhanh, String congnghemanhinh, String kichthuocmanhinh,String thoigiansudung
			,String hedieuhanh, String chatlieumat, String duongkinhmat,String ketnoi,String ngonngu,String theodoisuckhoe) {
		super();
		this.setMaDH(maDH);
		this.setTen(ten);
		this.setDongia(dongia);
		this.setHinhanh(hinhanh);
		this.setDacdiem1(dacdiem1);
		this.setDacdiem2(dacdiem2);
		this.setCongnghemanhinh(congnghemanhinh);
		this.setKichthuocmanhinh(kichthuocmanhinh);
		this.setThoigiansudung(thoigiansudung);
		this.setHedieuhanh(hedieuhanh);
		this.setChatlieumat(chatlieumat);
		this.setDuongkinhmat(duongkinhmat);
		this.setKetnoi(ketnoi);
		this.setNgonngu(ngonngu);
		this.setTheodoisuckhoe(theodoisuckhoe);
	}
	public DongHo(int maDH, String ten, long dongia, String hinhanh,int soluong, String congnghemanhinh, String kichthuocmanhinh,String thoigiansudung
			,String hedieuhanh, String chatlieumat, String duongkinhmat,String ketnoi,String ngonngu,String theodoisuckhoe) {
		super();
		this.setMaDH(maDH);
		this.setTen(ten);
		this.setDongia(dongia);
		this.setHinhanh(hinhanh);
		this.setSoluong(soluong);
		this.setDacdiem1(dacdiem1);
		this.setDacdiem2(dacdiem2);
		this.setCongnghemanhinh(congnghemanhinh);
		this.setKichthuocmanhinh(kichthuocmanhinh);
		this.setThoigiansudung(thoigiansudung);
		this.setHedieuhanh(hedieuhanh);
		this.setChatlieumat(chatlieumat);
		this.setDuongkinhmat(duongkinhmat);
		this.setKetnoi(ketnoi);
		this.setNgonngu(ngonngu);
		this.setTheodoisuckhoe(theodoisuckhoe);
	}
	public int getMaDH() {
		return maDH;
	}
	public void setMaDH(int maDH) {
		this.maDH = maDH;
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public long getDongia() {
		return dongia;
	}
	public void setDongia(long dongia) {
		this.dongia = dongia;
	}
	public String getHinhanh() {
		return hinhanh;
	}
	public void setHinhanh(String hinhanh) {
		this.hinhanh = hinhanh;
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
	public String getCongnghemanhinh() {
		return congnghemanhinh;
	}
	public void setCongnghemanhinh(String congnghemanhinh) {
		this.congnghemanhinh = congnghemanhinh;
	}
	public String getKichthuocmanhinh() {
		return kichthuocmanhinh;
	}
	public void setKichthuocmanhinh(String kichthuocmanhinh) {
		this.kichthuocmanhinh = kichthuocmanhinh;
	}
	public String getThoigiansudung() {
		return thoigiansudung;
	}
	public void setThoigiansudung(String thoigiansudung) {
		this.thoigiansudung = thoigiansudung;
	}
	public String getHedieuhanh() {
		return hedieuhanh;
	}
	public void setHedieuhanh(String hedieuhanh) {
		this.hedieuhanh = hedieuhanh;
	}
	public String getChatlieumat() {
		return chatlieumat;
	}
	public void setChatlieumat(String chatlieumat) {
		this.chatlieumat = chatlieumat;
	}
	public String getDuongkinhmat() {
		return duongkinhmat;
	}
	public void setDuongkinhmat(String duongkinhmat) {
		this.duongkinhmat = duongkinhmat;
	}
	public String getNgonngu() {
		return ngonngu;
	}
	public void setNgonngu(String ngonngu) {
		this.ngonngu = ngonngu;
	}
	public String getTheodoisuckhoe() {
		return theodoisuckhoe;
	}
	public void setTheodoisuckhoe(String theodoisuckhoe) {
		this.theodoisuckhoe = theodoisuckhoe;
	}
	public String getKetnoi() {
		return ketnoi;
	}
	public void setKetnoi(String ketnoi) {
		this.ketnoi = ketnoi;
	}
	public int getSoluong() {
		return soluong;
	}
	public void setSoluong(int soluong) {
		this.soluong = soluong;
	}
}
