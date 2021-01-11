package beans;


public class DienThoai {
	private int maDT;
	private String ten;
	private long dongia;
	private String hinhanh;
	private String manhinh;
	private String hedieuhanh;
	private String camerasau;
	private String cameratruoc;
	private String cpu;
	private String ram;
	private String bonhotrong;
	private String thenho;
	private String thesim;
	private String dungluongpin;
	private int soluong;
	public DienThoai() {
		
	}
	public DienThoai(int maDT, String ten,long dongia, String hinhanh, String manhinh, String hedieuhanh, String camerasau, String cameratruoc, String cpu, String ram, String bonhotrong,
			String thenho, String thesim, String dungluongpin) {
		super();
		this.setMaDT(maDT);
		this.setTen(ten);
		this.setDongia(dongia);
		this.setHinhanh(hinhanh);
		this.setManhinh(manhinh);
		this.setHedieuhanh(hedieuhanh);
		this.setCamerasau(camerasau);
		this.setCameratruoc(cameratruoc);
		this.setCpu(cpu);
		this.setRam(ram);
		this.setBonhotrong(bonhotrong);
		this.setThenho(thenho);
		this.setThesim(thesim);
		this.setDungluongpin(dungluongpin);
	}
	public DienThoai(int maDT, String ten, long dongia, String hinhanh,int soluong) {
		super();
		this.setMaDT(maDT);
		this.setTen(ten);
		this.setDongia(dongia);
		this.setHinhanh(hinhanh);
		this.setSoluong(soluong);
	}
	public DienThoai(int maDT, String ten,long dongia, String hinhanh,int soluong, String manhinh, String hedieuhanh, String camerasau, String cameratruoc, String cpu, String ram, String bonhotrong,
			String thenho, String thesim, String dungluongpin) {
		super();
		this.setMaDT(maDT);
		this.setTen(ten);
		this.setDongia(dongia);
		this.setHinhanh(hinhanh);
		this.setSoluong(soluong);
		this.setManhinh(manhinh);
		this.setHedieuhanh(hedieuhanh);
		this.setCamerasau(camerasau);
		this.setCameratruoc(cameratruoc);
		this.setCpu(cpu);
		this.setRam(ram);
		this.setBonhotrong(bonhotrong);
		this.setThenho(thenho);
		this.setThesim(thesim);
		this.setDungluongpin(dungluongpin);
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public int getMaDT() {
		return maDT;
	}
	public void setMaDT(int maDT) {
		this.maDT = maDT;
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
	public String getManhinh() {
		return manhinh;
	}
	public void setManhinh(String manhinh) {
		this.manhinh = manhinh;
	}
	public String getHedieuhanh() {
		return hedieuhanh;
	}
	public void setHedieuhanh(String hedieuhanh) {
		this.hedieuhanh = hedieuhanh;
	}
	public String getCamerasau() {
		return camerasau;
	}
	public void setCamerasau(String camerasau) {
		this.camerasau = camerasau;
	}
	public String getCameratruoc() {
		return cameratruoc;
	}
	public void setCameratruoc(String cameratruoc) {
		this.cameratruoc = cameratruoc;
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
	public String getBonhotrong() {
		return bonhotrong;
	}
	public void setBonhotrong(String bonhotrong) {
		this.bonhotrong = bonhotrong;
	}
	public String getThenho() {
		return thenho;
	}
	public void setThenho(String thenho) {
		this.thenho = thenho;
	}
	public String getThesim() {
		return thesim;
	}
	public void setThesim(String thesim) {
		this.thesim = thesim;
	}
	public String getDungluongpin() {
		return dungluongpin;
	}
	public void setDungluongpin(String dungluongpin) {
		this.dungluongpin = dungluongpin;
	}
	public int getSoluong() {
		return soluong;
	}
	public void setSoluong(int soluong) {
		this.soluong = soluong;
	}
	
}
