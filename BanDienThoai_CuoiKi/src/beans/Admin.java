package beans;

public class Admin {
	private int maAD;
	private String tenTK;
	private String matkhau;
	private String tenAdmin;
	private int tuoi;
	private String phanquyen;
	public Admin(String tenTK, String matkhau) {
		super();
		this.setTenTK(tenTK);
		this.setMatkhau(matkhau);
	}
	public Admin() {
		super();
	}
	public Admin(int maAD, String tenTK, String matkhau, String tenAdmin, int tuoi,String phanquyen ) {
		super();
		this.setMaAD(maAD);
		this.setTenTK(tenTK);
		this.setMatkhau(matkhau);
		this.setTenAdmin(tenAdmin);
		this.setTuoi(tuoi);
		this.setPhanquyen(phanquyen);
	}
	public String getTenAdmin() {
		return tenAdmin;
	}
	public void setTenAdmin(String tenAdmin) {
		this.tenAdmin = tenAdmin;
	}
	public String getTenTK() {
		return tenTK;
	}
	public void setTenTK(String tenTK) {
		this.tenTK = tenTK;
	}
	public int getMaAD() {
		return maAD;
	}
	public void setMaAD(int maAD) {
		this.maAD = maAD;
	}
	public String getMatkhau() {
		return matkhau;
	}
	public void setMatkhau(String matkhau) {
		this.matkhau = matkhau;
	}
	public int getTuoi() {
		return tuoi;
	}
	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}
	public String getPhanquyen() {
		return phanquyen;
	}
	public void setPhanquyen(String phanquyen) {
		this.phanquyen = phanquyen;
	}
	
}
