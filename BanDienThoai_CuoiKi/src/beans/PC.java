package beans;

public class PC {
	private int maPC;
	private String ten;
	private long dongia;
	private String hinhanh;
	private String dacdiem1;
	private String dacdiem2;
	private String kichthuocmanhinh;
	private String dophangiai;
	private String congnghemanhinh;
	private String dotuongphan;
	private String thoigiandapung;
	private String gocnhin;
	private int soluong;
	
	public PC(int maPC, String ten, long dongia, String hinhanh, String kichthuocmanhinh, String dophangiai,
			String congnghemanhinh, String dotuongphan, String thoigiandapung, String gocnhin) {
		super();
		this.setMaPC(maPC);
		this.setTen(ten);
		this.setDongia(dongia);
		this.setHinhanh(hinhanh);
		this.setKichthuocmanhinh(kichthuocmanhinh);
		this.setDophangiai(dophangiai);
		this.setCongnghemanhinh(congnghemanhinh);
		this.setDotuongphan(dotuongphan);
		this.setThoigiandapung(thoigiandapung);
		this.setGocnhin(gocnhin);
	}
	public PC(int maPC, String ten, long dongia, String hinhanh, int soluong,String kichthuocmanhinh, String dophangiai,
			String congnghemanhinh, String dotuongphan, String thoigiandapung, String gocnhin) {
		super();
		this.setMaPC(maPC);
		this.setTen(ten);
		this.setDongia(dongia);
		this.setHinhanh(hinhanh);
		this.setSoluong(soluong);
		this.setKichthuocmanhinh(kichthuocmanhinh);
		this.setDophangiai(dophangiai);
		this.setCongnghemanhinh(congnghemanhinh);
		this.setDotuongphan(dotuongphan);
		this.setThoigiandapung(thoigiandapung);
		this.setGocnhin(gocnhin);
	}
	public PC() {
		
	}
	public PC(int maPC, String ten, long dongia, String hinhanh, int soluong) {
		super();
		this.setMaPC(maPC);
		this.setTen(ten);
		this.setDongia(dongia);
		this.setHinhanh(hinhanh);
		this.setSoluong(soluong);
	}
	public int getMaPC() {
		return maPC;
	}
	public void setMaPC(int maPC) {
		this.maPC = maPC;
	}
	public long getDongia() {
		return dongia;
	}
	public void setDongia(long dongia) {
		this.dongia = dongia;
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
	public String getKichthuocmanhinh() {
		return kichthuocmanhinh;
	}
	public void setKichthuocmanhinh(String kichthuocmanhinh) {
		this.kichthuocmanhinh = kichthuocmanhinh;
	}
	public String getDophangiai() {
		return dophangiai;
	}
	public void setDophangiai(String dophangiai) {
		this.dophangiai = dophangiai;
	}
	public String getCongnghemanhinh() {
		return congnghemanhinh;
	}
	public void setCongnghemanhinh(String congnghemanhinh) {
		this.congnghemanhinh = congnghemanhinh;
	}
	public String getDotuongphan() {
		return dotuongphan;
	}
	public void setDotuongphan(String dotuongphan) {
		this.dotuongphan = dotuongphan;
	}
	public String getThoigiandapung() {
		return thoigiandapung;
	}
	public void setThoigiandapung(String thoigiandapung) {
		this.thoigiandapung = thoigiandapung;
	}
	public String getGocnhin() {
		return gocnhin;
	}
	public void setGocnhin(String gocnhin) {
		this.gocnhin = gocnhin;
	}
	public int getSoluong() {
		return soluong;
	}
	public void setSoluong(int soluong) {
		this.soluong = soluong;
	}
	
}
