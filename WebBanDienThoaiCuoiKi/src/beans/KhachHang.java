package beans;

public class KhachHang {
	private int maKH;
	private String tenTK;
	private String matkhau;
	private String diachigiaohang;
	private String tenkhachhang;
	public KhachHang() {
		
	}
	public KhachHang(String tenkhachhang,String tenTK, String matkhau, String diachigiaohang) {
		super();
		this.setTenTK(tenTK);
		this.setMatkhau(matkhau);
		this.setDiachigiaohang(diachigiaohang);
		this.setTenkhachhang(tenkhachhang);
	}
	public KhachHang(int maKH,String tenkhachhang,String tenTK, String matkhau, String diachigiaohang) {
		super();
		this.setMaKH(maKH);
		this.setTenTK(tenTK);
		this.setMatkhau(matkhau);
		this.setDiachigiaohang(diachigiaohang);
		this.setTenkhachhang(tenkhachhang);
	}
	public KhachHang(String tenTk, String matkhau) {
		super();
		this.setTenTK(tenTk);
		this.setMatkhau(matkhau);
	}
	public int getMaKH() {
		return maKH;
	}
	public void setMaKH(int maKH) {
		this.maKH = maKH;
	}
	public String getMatkhau() {
		return matkhau;
	}
	public void setMatkhau(String matkhau) {
		this.matkhau = matkhau;
	}
	public String getDiachigiaohang() {
		return diachigiaohang;
	}
	public void setDiachigiaohang(String diachigiaohang) {
		this.diachigiaohang = diachigiaohang;
	}
	public String getTenkhachhang() {
		return tenkhachhang;
	}
	public void setTenkhachhang(String tenkhachhang) {
		this.tenkhachhang = tenkhachhang;
	}
	public String getTenTK() {
		return tenTK;
	}
	public void setTenTK(String tenTK) {
		this.tenTK = tenTK;
	}
	
}
