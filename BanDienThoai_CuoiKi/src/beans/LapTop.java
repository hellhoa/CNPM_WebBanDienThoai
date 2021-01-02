package beans;


public class LapTop {
	private int maLT;
	private String ten;
	private long dongia;
	private String hinhanh;
	private String dacdiem1;
	private String dacdiem2;
	private String cpu;
	private String ram;
	private String ocung;
	private String manhinh;
	private String cardmanhinh;
	private String congketnoi;
	private String hedieuhanh;
	private String thietke;
	private String kichthuoc;
	private String thoidiemramat;
	private int soluong;
	public LapTop() {
		
	}
	public LapTop(int maLT, String ten, long dongia, String hinhanh, String cpu, String ram, String ocung, String manhinh, String cardmanhinh, String congketnoi, String hedieuhanh, String thietke, String kichthuoc,String thoidiemramat) {
		super();
		this.setMaLT(maLT);
		this.setTen(ten);
		this.setHinhanh(hinhanh);
		this.setDongia(dongia);
		this.setDacdiem1(dacdiem1);
		this.setDacdiem2(dacdiem2);
		this.setCpu(cpu);
		this.setRam(ram);
		this.setOcung(ocung);
		this.setManhinh(manhinh);
		this.setCardmanhinh(cardmanhinh);
		this.setCongketnoi(congketnoi);
		this.setHedieuhanh(hedieuhanh);
		this.setThietke(thietke);
		this.setKichthuoc(kichthuoc);
		this.setThoidiemramat(thoidiemramat);
	}
	public LapTop(int maLT, String ten, long dongia, String hinhanh,int soluong, String cpu, String ram, String ocung, String manhinh, String cardmanhinh, String congketnoi, String hedieuhanh, String thietke, String kichthuoc,String thoidiemramat) {
		super();
		this.setMaLT(maLT);
		this.setTen(ten);
		this.setHinhanh(hinhanh);
		this.setSoluong(soluong);
		this.setDongia(dongia);
		this.setDacdiem1(dacdiem1);
		this.setDacdiem2(dacdiem2);
		this.setCpu(cpu);
		this.setRam(ram);
		this.setOcung(ocung);
		this.setManhinh(manhinh);
		this.setCardmanhinh(cardmanhinh);
		this.setCongketnoi(congketnoi);
		this.setHedieuhanh(hedieuhanh);
		this.setThietke(thietke);
		this.setKichthuoc(kichthuoc);
		this.setThoidiemramat(thoidiemramat);
	}
	public LapTop(int maLT, String ten, long dongia, String hinhanh, int soluong) {
		super();
		this.setMaLT(maLT);
		this.setTen(ten);
		this.setDongia(dongia);
		this.setHinhanh(hinhanh);
		this.setSoluong(soluong);
	}
	public int getMaLT() {
		return maLT;
	}
	public void setMaLT(int maLT) {
		this.maLT = maLT;
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
	public String getCpu() {
		return cpu;
	}
	public void setCpu(String cpu) {
		this.cpu = cpu;
	}
	public String getRam() {
		return ram;
	}
	public void setRam(String ram) {
		this.ram = ram;
	}
	public String getOcung() {
		return ocung;
	}
	public void setOcung(String ocung) {
		this.ocung = ocung;
	}
	public String getManhinh() {
		return manhinh;
	}
	public void setManhinh(String manhinh) {
		this.manhinh = manhinh;
	}
	public String getCardmanhinh() {
		return cardmanhinh;
	}
	public void setCardmanhinh(String cardmanhinh) {
		this.cardmanhinh = cardmanhinh;
	}
	public String getCongketnoi() {
		return congketnoi;
	}
	public void setCongketnoi(String congketnoi) {
		this.congketnoi = congketnoi;
	}
	public String getHedieuhanh() {
		return hedieuhanh;
	}
	public void setHedieuhanh(String hedieuhanh) {
		this.hedieuhanh = hedieuhanh;
	}
	public String getThietke() {
		return thietke;
	}
	public void setThietke(String thietke) {
		this.thietke = thietke;
	}
	public String getKichthuoc() {
		return kichthuoc;
	}
	public void setKichthuoc(String kichthuoc) {
		this.kichthuoc = kichthuoc;
	}
	public String getThoidiemramat() {
		return thoidiemramat;
	}
	public void setThoidiemramat(String thoidiemramat) {
		this.thoidiemramat = thoidiemramat;
	}
	public int getSoluong() {
		return soluong;
	}
	public void setSoluong(int soluong) {
		this.soluong = soluong;
	}
	
}
