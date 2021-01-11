package beans;

public class GioHang {
	private int maSP;
	private int maKH;
	private String tenSP;
	private long dongia;
	private int slmua;
	public GioHang(int maSP, int maKH, String tenSP,long dongia, int slmua )
	{
		super();
		this.setMaSP(maSP);
		this.setMaKH(maKH);
		this.setTenSP(tenSP);
		this.setDongia(dongia);
		this.setSlmua(slmua);
	}
	public GioHang (int maSP, int maKH)
	{
		super();
		this.setMaSP(maSP);
		this.setMaKH(maKH);
	}
	public int getMaSP() {
		return maSP;
	}
	public void setMaSP(int maSP) {
		this.maSP = maSP;
	}
	public int getMaKH() {
		return maKH;
	}
	public void setMaKH(int maKH) {
		this.maKH = maKH;
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
	
}
