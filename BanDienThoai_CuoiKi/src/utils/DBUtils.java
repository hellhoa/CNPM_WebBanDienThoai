package utils;
import java.sql.*;
import java.sql.Date;
import java.util.*;


import beans.Admin;
import beans.BaiViet;
import beans.DienThoai;
import beans.DonHang;
import beans.DongHo;
import beans.GioHang;
import beans.KhachHang;
import beans.LapTop;
import beans.PC;
import beans.PhuKien;
import beans.Tablet;
public class DBUtils {
	public static List<PC> listPC(Connection conn) throws SQLException {
		String sql= "Select * from dbo.SanPham where loaiSP='PC'";
		PreparedStatement pstm = conn.prepareStatement(sql);
		ResultSet rs = pstm.executeQuery();
		List<PC> list = new ArrayList<PC>();
		while	(rs.next()) {
			int maPC = rs.getInt("maSP");
			String ten = rs.getString("ten");
			long dongia = rs.getLong("dongia");
			String hinhanh = rs.getString("hinhanh");
			String dacdiem1 = rs.getString("dacdiem1");
			String dacdiem2 = rs.getString("dacdiem2");
			PC pc = new PC();
			pc.setMaPC(maPC);
			pc.setTen(ten);
			pc.setDongia(dongia);
			pc.setHinhanh(hinhanh);
			pc.setDacdiem1(dacdiem1);
			pc.setDacdiem2(dacdiem2);
			list.add(pc);
		}
		return list;
	}
	public static List<PC> listPC_SoLuong(Connection conn) throws SQLException{
		String sql= "Select SanPham.maSP,ten,dongia,hinhanh,SL from dbo.SanPham,SoLuong where loaiSP ='PC' and SanPham.maSP = SoLuong.maSP";
		PreparedStatement pstm = conn.prepareStatement(sql);
		ResultSet rs = pstm.executeQuery();
		List<PC> listdt = new ArrayList<PC>();
		while	(rs.next()) {
			int maDienThoai = rs.getInt("maSP");
			String ten = rs.getString("ten");
			long dongia = rs.getLong("dongia");
			String hinhanh = rs.getString("hinhanh");
			int SL = rs.getInt("SL");
			PC pc = new PC(maDienThoai, ten, dongia, hinhanh, SL);
			listdt.add(pc);
		}
		return listdt;
	}
	public static List<DienThoai> listDienThoai(Connection conn) throws SQLException{
		String sql= "Select * from dbo.SanPham where loaiSP ='DienThoai'";
		PreparedStatement pstm = conn.prepareStatement(sql);
		ResultSet rs = pstm.executeQuery();
		List<DienThoai> listdt = new ArrayList<DienThoai>();
		while	(rs.next()) {
			int maDienThoai = rs.getInt("maSP");
			String ten = rs.getString("ten");
			long dongia = rs.getLong("dongia");
			String hinhanh = rs.getString("hinhanh");
			DienThoai dt = new DienThoai();
			dt.setMaDT(maDienThoai);
			dt.setTen(ten);
			dt.setDongia(dongia);
			dt.setHinhanh(hinhanh);
			listdt.add(dt);
		}
		return listdt;
	}
	public static List<DienThoai> listDienThoai_SoLuong(Connection conn) throws SQLException{
		String sql= "Select SanPham.maSP,ten,dongia,hinhanh,SL from dbo.SanPham,SoLuong where loaiSP ='DienThoai' and SanPham.maSP = SoLuong.maSP";
		PreparedStatement pstm = conn.prepareStatement(sql);
		ResultSet rs = pstm.executeQuery();
		List<DienThoai> listdt = new ArrayList<DienThoai>();
		while	(rs.next()) {
			int maDienThoai = rs.getInt("maSP");
			String ten = rs.getString("ten");
			long dongia = rs.getLong("dongia");
			String hinhanh = rs.getString("hinhanh");
			int SL = rs.getInt("SL");
			DienThoai dt = new DienThoai(maDienThoai, ten, dongia, hinhanh, SL);
			listdt.add(dt);
		}
		return listdt;
	}
	public static List<LapTop> lisLapTop(Connection conn) throws SQLException{
		String sql ="Select * from dbo.SanPham where loaiSP='LapTop'";
		PreparedStatement pstm = conn.prepareStatement(sql);
		ResultSet rs = pstm.executeQuery();
		List<LapTop> listlt = new ArrayList<LapTop>();
		while	(rs.next()) {
			int maLapTop = rs.getInt("maSP");
			String ten = rs.getString("ten");
			long dongia = rs.getLong("dongia");
			String hinhanh = rs.getString("hinhanh");
			String dacdiem1 = rs.getString("dacdiem1");
			String dacdiem2 = rs.getString("dacdiem2");
			LapTop lt = new LapTop();
			lt.setMaLT(maLapTop);
			lt.setTen(ten);
			lt.setDongia(dongia);
			lt.setHinhanh(hinhanh);
			lt.setDacdiem1(dacdiem1);
			lt.setDacdiem2(dacdiem2);
			listlt.add(lt);
		}
		return listlt;
	}
	public static List<LapTop> listLapTop_SoLuong(Connection conn) throws SQLException{
		String sql= "Select SanPham.maSP,ten,dongia,hinhanh,SL from dbo.SanPham,SoLuong where loaiSP ='LapTop' and SanPham.maSP = SoLuong.maSP";
		PreparedStatement pstm = conn.prepareStatement(sql);
		ResultSet rs = pstm.executeQuery();
		List<LapTop> listdt = new ArrayList<LapTop>();
		while	(rs.next()) {
			int maDienThoai = rs.getInt("maSP");
			String ten = rs.getString("ten");
			long dongia = rs.getLong("dongia");
			String hinhanh = rs.getString("hinhanh");
			int SL = rs.getInt("SL");
			LapTop lt = new LapTop(maDienThoai, ten, dongia, hinhanh, SL);
			listdt.add(lt);
		}
		return listdt;
	}
	public static List<Tablet> lisTablet(Connection conn)throws SQLException{
		String sql = "Select * from dbo.SanPham where loaiSP='Tablet'";
		PreparedStatement pstm = conn.prepareStatement(sql);
		ResultSet rs = pstm.executeQuery();
		List<Tablet> listtb = new ArrayList<Tablet>();
		while	(rs.next()) {
			int maTB = rs.getInt("maSP");
			String ten = rs.getString("ten");
			long dongia = rs.getLong("dongia");
			String hinhanh = rs.getString("hinhanh");
			Tablet tb = new Tablet();
			tb.setMaTB(maTB);
			tb.setTen(ten);
			tb.setDongia(dongia);
			tb.setHinhanh(hinhanh);
			listtb.add(tb);
		}
		return listtb;
	}
	public static List<Tablet> listTablet_SoLuong(Connection conn) throws SQLException{
		String sql= "Select SanPham.maSP,ten,dongia,hinhanh,SL from dbo.SanPham,SoLuong where loaiSP ='Tablet' and SanPham.maSP = SoLuong.maSP";
		PreparedStatement pstm = conn.prepareStatement(sql);
		ResultSet rs = pstm.executeQuery();
		List<Tablet> listdt = new ArrayList<Tablet>();
		while	(rs.next()) {
			int maDienThoai = rs.getInt("maSP");
			String ten = rs.getString("ten");
			long dongia = rs.getLong("dongia");
			String hinhanh = rs.getString("hinhanh");
			int SL = rs.getInt("SL");
			Tablet tb = new Tablet(maDienThoai, ten, dongia, hinhanh, SL);
			listdt.add(tb);
		}
		return listdt;
	}
	public static List<PhuKien> listPhuKien(Connection conn) throws SQLException{
		String sql = "Select * from dbo.SanPham where loaiSP='PhuKien'";
		PreparedStatement pstm = conn.prepareStatement(sql);
		ResultSet rs = pstm.executeQuery();
		List<PhuKien> listpk = new ArrayList<PhuKien>();
		while	(rs.next()) {
			int maPK = rs.getInt("maSP");
			String ten = rs.getString("ten");
			long dongia = rs.getLong("dongia");
			String hinhanh = rs.getString("hinhanh");
			String dacdiem1 = rs.getString("dacdiem1");
			String dacdiem2 = rs.getString("dacdiem2");
			PhuKien pk = new PhuKien();
			pk.setMaPK(maPK);
			pk.setTen(ten);
			pk.setDongia(dongia);
			pk.setHinhanh(hinhanh);
			pk.setDacdiem1(dacdiem1);
			pk.setDacdiem2(dacdiem2);
			listpk.add(pk);
		}
		return listpk;
	}
	
	public static List<PhuKien> listPhuKien_SoLuong(Connection conn) throws SQLException{
		String sql= "Select SanPham.maSP,ten,dongia,hinhanh,SL from dbo.SanPham,SoLuong where loaiSP ='PhuKien' and SanPham.maSP = SoLuong.maSP";
		PreparedStatement pstm = conn.prepareStatement(sql);
		ResultSet rs = pstm.executeQuery();
		List<PhuKien> listdt = new ArrayList<PhuKien>();
		while	(rs.next()) {
			int maDienThoai = rs.getInt("maSP");
			String ten = rs.getString("ten");
			long dongia = rs.getLong("dongia");
			String hinhanh = rs.getString("hinhanh");
			int SL = rs.getInt("SL");
			PhuKien pk = new PhuKien(maDienThoai, ten, dongia, hinhanh, SL);
			listdt.add(pk);
		}
		return listdt;
	}
	public static List<DongHo> listDongHo(Connection conn) throws SQLException{
		String sql = "Select * from dbo.SanPham where loaiSP='DongHo'";
		PreparedStatement pstm = conn.prepareStatement(sql);
		ResultSet rs = pstm.executeQuery();
		List<DongHo> listdh = new ArrayList<DongHo>();
		while	(rs.next()) {
			int maDH = rs.getInt("maSP");
			String ten = rs.getString("ten");
			long dongia = rs.getLong("dongia");
			String hinhanh = rs.getString("hinhanh");
			String dacdiem1 = rs.getString("dacdiem1");
			String dacdiem2 = rs.getString("dacdiem2");
			DongHo dh = new DongHo();
			dh.setMaDH(maDH);
			dh.setTen(ten);
			dh.setDongia(dongia);
			dh.setHinhanh(hinhanh);
			dh.setDacdiem1(dacdiem1);
			dh.setDacdiem2(dacdiem2);
			listdh.add(dh);
		}
		return listdh;
	}
	public static List<DongHo> listDongHo_SoLuong(Connection conn) throws SQLException{
		String sql= "Select SanPham.maSP,ten,dongia,hinhanh,SL from dbo.SanPham,SoLuong where loaiSP ='DongHo' and SanPham.maSP = SoLuong.maSP";
		PreparedStatement pstm = conn.prepareStatement(sql);
		ResultSet rs = pstm.executeQuery();
		List<DongHo> listdt = new ArrayList<DongHo>();
		while	(rs.next()) {
			int maDienThoai = rs.getInt("maSP");
			String ten = rs.getString("ten");
			long dongia = rs.getLong("dongia");
			String hinhanh = rs.getString("hinhanh");
			int SL = rs.getInt("SL");
			DongHo dh = new DongHo(maDienThoai, ten, dongia, hinhanh, SL);
			listdt.add(dh);
		}
		return listdt;
	}
	public static List<PC> findlistPC(Connection conn,String search) throws SQLException {
		String sql= "Select * from dbo.SanPham where loaiSP='PC' and ten LIKE ?";
		String searchnew = "%"+search+"%";
		PreparedStatement pstm = conn.prepareStatement(sql);
		pstm.setString(1, searchnew);
		ResultSet rs = pstm.executeQuery();
		List<PC> list = new ArrayList<PC>();
		while	(rs.next()) {
			int maPC = rs.getInt("maSP");
			String ten = rs.getString("ten");
			long dongia = rs.getLong("dongia");
			String hinhanh = rs.getString("hinhanh");
			String dacdiem1 = rs.getString("dacdiem1");
			String dacdiem2 = rs.getString("dacdiem2");
			PC pc = new PC();
			pc.setMaPC(maPC);
			pc.setTen(ten);
			pc.setDongia(dongia);
			pc.setHinhanh(hinhanh);
			pc.setDacdiem1(dacdiem1);
			pc.setDacdiem2(dacdiem2);
			list.add(pc);
		}
		return list;
	}
	public static List<DienThoai> findlistDienThoai(Connection conn,String search) throws SQLException{
		String sql= "Select * from dbo.SanPham where loaiSP ='DienThoai' and ten LIKE ?";
		String searchnew = "%"+search+"%";
		PreparedStatement pstm = conn.prepareStatement(sql);
		pstm.setString(1, searchnew);
		ResultSet rs = pstm.executeQuery();
		List<DienThoai> listdt = new ArrayList<DienThoai>();
		while	(rs.next()) {
			int maDienThoai = rs.getInt("maSP");
			String ten = rs.getString("ten");
			long dongia = rs.getLong("dongia");
			String hinhanh = rs.getString("hinhanh");
			DienThoai dt = new DienThoai();
			dt.setMaDT(maDienThoai);
			dt.setTen(ten);
			dt.setDongia(dongia);
			dt.setHinhanh(hinhanh);
			listdt.add(dt);
		}
		return listdt;
	}
	public static List<LapTop> findlistLapTop(Connection conn,String search) throws SQLException{
		String sql ="Select * from dbo.SanPham where loaiSP='LapTop' and ten LIKE ?";
		String searchnew = "%"+search+"%";
		PreparedStatement pstm = conn.prepareStatement(sql);
		pstm.setString(1, searchnew);
		ResultSet rs = pstm.executeQuery();
		List<LapTop> listlt = new ArrayList<LapTop>();
		while	(rs.next()) {
			int maLapTop = rs.getInt("maSP");
			String ten = rs.getString("ten");
			long dongia = rs.getLong("dongia");
			String hinhanh = rs.getString("hinhanh");
			String dacdiem1 = rs.getString("dacdiem1");
			String dacdiem2 = rs.getString("dacdiem2");
			LapTop lt = new LapTop();
			lt.setMaLT(maLapTop);
			lt.setTen(ten);
			lt.setDongia(dongia);
			lt.setHinhanh(hinhanh);
			lt.setDacdiem1(dacdiem1);
			lt.setDacdiem2(dacdiem2);
			listlt.add(lt);
		}
		return listlt;
	}
	public static List<Tablet> findlistTablet(Connection conn, String search)throws SQLException{
		String sql = "Select * from dbo.SanPham where loaiSP='Tablet' and ten LIKE ?";
		String searchnew = "%"+search+"%";
		PreparedStatement pstm = conn.prepareStatement(sql);
		pstm.setString(1, searchnew);
		ResultSet rs = pstm.executeQuery();
		List<Tablet> listtb = new ArrayList<Tablet>();
		while	(rs.next()) {
			int maTB = rs.getInt("maSP");
			String ten = rs.getString("ten");
			long dongia = rs.getLong("dongia");
			String hinhanh = rs.getString("hinhanh");
			Tablet tb = new Tablet();
			tb.setMaTB(maTB);
			tb.setTen(ten);
			tb.setDongia(dongia);
			tb.setHinhanh(hinhanh);
			listtb.add(tb);
		}
		return listtb;
	}
	public static List<PhuKien> findlistPhuKien(Connection conn, String search) throws SQLException{
		String sql = "Select * from dbo.SanPham where loaiSP='PhuKien' and ten LIKE ?";
		String searchnew = "%"+search+"%";
		PreparedStatement pstm = conn.prepareStatement(sql);
		pstm.setString(1, searchnew);
		ResultSet rs = pstm.executeQuery();
		List<PhuKien> listpk = new ArrayList<PhuKien>();
		while	(rs.next()) {
			int maPK = rs.getInt("maSP");
			String ten = rs.getString("ten");
			long dongia = rs.getLong("dongia");
			String hinhanh = rs.getString("hinhanh");
			String dacdiem1 = rs.getString("dacdiem1");
			String dacdiem2 = rs.getString("dacdiem2");
			PhuKien pk = new PhuKien();
			pk.setMaPK(maPK);
			pk.setTen(ten);
			pk.setDongia(dongia);
			pk.setHinhanh(hinhanh);
			pk.setDacdiem1(dacdiem1);
			pk.setDacdiem2(dacdiem2);
			listpk.add(pk);
		}
		return listpk;
	}
	public static List<DongHo> findlistDongHo(Connection conn,String search) throws SQLException{
		String sql = "Select * from dbo.SanPham where loaiSP='DongHo' and ten LIKE ?";
		String searchnew = "%"+search+"%";
		PreparedStatement pstm = conn.prepareStatement(sql);
		pstm.setString(1, searchnew);
		ResultSet rs = pstm.executeQuery();
		List<DongHo> listdh = new ArrayList<DongHo>();
		while	(rs.next()) {
			int maDH = rs.getInt("maSP");
			String ten = rs.getString("ten");
			long dongia = rs.getLong("dongia");
			String hinhanh = rs.getString("hinhanh");
			String dacdiem1 = rs.getString("dacdiem1");
			String dacdiem2 = rs.getString("dacdiem2");
			DongHo dh = new DongHo();
			dh.setMaDH(maDH);
			dh.setTen(ten);
			dh.setDongia(dongia);
			dh.setHinhanh(hinhanh);
			dh.setDacdiem1(dacdiem1);
			dh.setDacdiem2(dacdiem2);
			listdh.add(dh);
		}
		return listdh;
	}
	public static DienThoai findDienThoai(Connection conn, int idIn) throws SQLException {
        String sql = "Select a.maSP, a.ten, a.dongia, a.hinhanh, b.manhinh,b.hedieuhanh, b.camerasau, b.cameratruoc, b.cpu, b.ram, b.bonhotrong, b.thenho, b.thesim,b.dungluongpin"
        		+ " from SanPham a,ThongSoKiThuat_DT b where b.maDT=? and a.maSP=?";
 
        PreparedStatement pstm = conn.prepareStatement(sql);
        pstm.setInt(1, idIn);
        pstm.setInt(2, idIn);
        ResultSet rs = pstm.executeQuery();
 
        while (rs.next()) {
            String ten = rs.getString("ten");
            int maSP = rs.getInt("maSP");
            long dongia = rs.getLong("dongia");
            String hinhanh = rs.getString("hinhanh");
            String manhinh = rs.getString("manhinh");
            String hedieuhanh = rs.getString("hedieuhanh");
            String camerasau = rs.getString("camerasau");
            String cameratruoc = rs.getString("cameratruoc");
            String cpu = rs.getString("cpu");
            String ram = rs.getString("ram");
            String bonhotrong = rs.getString("bonhotrong");
            String thenho = rs.getString("thenho");
            String thesim = rs.getString("thesim");
            String dungluong = rs.getString("dungluongpin");
            DienThoai dt = new DienThoai(maSP,ten, dongia, hinhanh,manhinh,hedieuhanh, camerasau,cameratruoc, cpu,ram,bonhotrong,thenho,thesim,dungluong);
            return dt;
        }
        return null;
    }
	public static DienThoai findDienThoai_soluong(Connection conn, int idIn) throws SQLException {
        String sql = "Select a.maSP, a.ten, a.dongia, a.hinhanh,c.SL, b.manhinh,b.hedieuhanh, b.camerasau, b.cameratruoc, b.cpu, b.ram, b.bonhotrong, b.thenho, b.thesim,b.dungluongpin"
        		+ " from SanPham a,ThongSoKiThuat_DT b,SoLuong c where b.maDT=? and a.maSP=? and c.maSP = ?";
 
        PreparedStatement pstm = conn.prepareStatement(sql);
        pstm.setInt(1, idIn);
        pstm.setInt(2, idIn);
        pstm.setInt(3, idIn);
        ResultSet rs = pstm.executeQuery();
 
        while (rs.next()) {
            String ten = rs.getString("ten");
            int maSP = rs.getInt("maSP");
            long dongia = rs.getLong("dongia");
            String hinhanh = rs.getString("hinhanh");
            int soluong = rs.getInt("SL");
            String manhinh = rs.getString("manhinh");
            String hedieuhanh = rs.getString("hedieuhanh");
            String camerasau = rs.getString("camerasau");
            String cameratruoc = rs.getString("cameratruoc");
            String cpu = rs.getString("cpu");
            String ram = rs.getString("ram");
            String bonhotrong = rs.getString("bonhotrong");
            String thenho = rs.getString("thenho");
            String thesim = rs.getString("thesim");
            String dungluong = rs.getString("dungluongpin");
            DienThoai dt = new DienThoai(maSP, ten, dongia, hinhanh, soluong, manhinh, hedieuhanh, camerasau, cameratruoc, cpu, ram, bonhotrong, thenho, thesim, dungluong);
            return dt;
        }
        return null;
    }
	public static void updateDienThoai(Connection conn, DienThoai dt) throws SQLException{
		String updateSanPham = "update SanPham set ten =?,dongia=?, hinhanh=? where maSP=?";
		String updateThongSo = "update ThongSoKiThuat_DT set manhinh=?, hedieuhanh=?, camerasau=?,cameratruoc=?, cpu=?, ram=?, bonhotrong=?, thenho=?, thesim=?, dungluongpin=? where maDT=?";
		String updateSoLuong ="update SoLuong set SL=? where maSP=?";
		PreparedStatement pstm1 = conn.prepareStatement(updateSanPham);
		PreparedStatement pstm2 = conn.prepareStatement(updateThongSo);
		PreparedStatement pstm3 = conn.prepareStatement(updateSoLuong);
		pstm1.setString(1, dt.getTen());
		pstm1.setLong(2, dt.getDongia());
		pstm1.setString(3, dt.getHinhanh());
		pstm1.setInt(4, dt.getMaDT());
		pstm2.setString(1, dt.getManhinh());
		pstm2.setString(2, dt.getHedieuhanh());
		pstm2.setString(3, dt.getCamerasau());
		pstm2.setString(4, dt.getCameratruoc());
		pstm2.setString(5, dt.getCpu());
		pstm2.setString(6, dt.getRam());
		pstm2.setString(7, dt.getBonhotrong());
		pstm2.setString(8, dt.getThenho());
		pstm2.setString(9, dt.getThesim());
		pstm2.setString(10, dt.getDungluongpin());
		pstm2.setInt(11, dt.getMaDT());
		pstm3.setInt(1, dt.getSoluong());
		pstm3.setInt(2, dt.getMaDT());
		pstm1.executeUpdate();
		pstm2.executeUpdate();
		pstm3.executeUpdate();
	}
	public static void insertDienThoai(Connection conn, DienThoai dt) throws SQLException{
		String insertSanPham = "insert into SanPham(maSP,loaiSP,ten,dongia,hinhanh) values (?,'DienThoai',?,?,?)";
		String insertThongSo = "insert into ThongSoKiThuat_DT values (?,?,?,?,?,?,?,?,?,?,?)";
		String insertSoLuong = "insert into SoLuong values (?,?)";
		
		PreparedStatement pstm1 = conn.prepareStatement(insertSanPham);
		PreparedStatement pstm2 = conn.prepareStatement(insertThongSo);
		PreparedStatement pstm3 = conn.prepareStatement(insertSoLuong);
		pstm1.setInt(1, dt.getMaDT());
		pstm1.setString(2, dt.getTen());
		pstm1.setLong(3, dt.getDongia());
		pstm1.setString(4, dt.getHinhanh());
		pstm2.setInt(1, dt.getMaDT());
		pstm2.setString(2, dt.getManhinh());
		pstm2.setString(3, dt.getHedieuhanh());
		pstm2.setString(4, dt.getCamerasau());
		pstm2.setString(5, dt.getCameratruoc());
		pstm2.setString(6, dt.getCpu());
		pstm2.setString(7, dt.getRam());
		pstm2.setString(8, dt.getBonhotrong());
		pstm2.setString(9, dt.getThenho());
		pstm2.setString(10, dt.getThesim());
		pstm2.setString(11, dt.getDungluongpin());
		pstm3.setInt(1, dt.getMaDT());
		pstm3.setInt(2, dt.getSoluong());
		
		pstm1.executeUpdate();
		pstm2.executeUpdate();
		pstm3.executeUpdate();
		String insertBaiViet ="insert into BaiViet (maBaiViet,maSP) values(?,?)"; 
		PreparedStatement pstm4 =conn.prepareStatement(insertBaiViet);
		pstm4.setInt(1, dt.getMaDT());
		pstm4.setInt(2, dt.getMaDT());
		pstm4.executeUpdate();
	}
	public static void updateLapTop(Connection conn, LapTop lt) throws SQLException{
		String updateSanPham = "update SanPham set ten =?,dongia=?, hinhanh=? where maSP=?";
		String updateThongSo = "update ThongSoKiThuat_LT set cpu=?, ram=?,ocung=?, manhinh=?, cardmanhinh=?, congketnoi=?,hedieuhanh=?, thietke=?,kichthuoc=?,thoidiemramat=? where maLT=?";
		String updateSoLuong ="update SoLuong set SL=? where maSP=?";
		PreparedStatement pstm1 = conn.prepareStatement(updateSanPham);
		PreparedStatement pstm2 = conn.prepareStatement(updateThongSo);
		PreparedStatement pstm3 = conn.prepareStatement(updateSoLuong);
		pstm1.setString(1, lt.getTen());
		pstm1.setLong(2, lt.getDongia());
		pstm1.setString(3, lt.getHinhanh());
		pstm1.setInt(4, lt.getMaLT());
		pstm2.setString(1, lt.getCpu());
		pstm2.setString(2, lt.getRam());
		pstm2.setString(3, lt.getOcung());
		pstm2.setString(4, lt.getManhinh());
		pstm2.setString(5, lt.getCardmanhinh());
		pstm2.setString(6, lt.getCongketnoi());
		pstm2.setString(7, lt.getHedieuhanh());
		pstm2.setString(8, lt.getThietke());
		pstm2.setString(9, lt.getKichthuoc());
		pstm2.setString(10, lt.getThoidiemramat());
		pstm2.setInt(11, lt.getMaLT());
		pstm3.setInt(1, lt.getSoluong());
		pstm3.setInt(2, lt.getMaLT());
		pstm1.executeUpdate();
		pstm2.executeUpdate();
		pstm3.executeUpdate();
	}
	public static void insertLapTop(Connection conn, LapTop lt) throws SQLException{
		String insertSanPham = "insert into SanPham(maSP,loaiSP,ten,dongia,hinhanh) values (?,'LapTop',?,?,?)";
		String insertThongSo = "insert into ThongSoKiThuat_LT values (?,?,?,?,?,?,?,?,?,?,?)";
		String insertSoLuong = "insert into SoLuong values (?,?)";
		
		PreparedStatement pstm1 = conn.prepareStatement(insertSanPham);
		PreparedStatement pstm2 = conn.prepareStatement(insertThongSo);
		PreparedStatement pstm3 = conn.prepareStatement(insertSoLuong);
		pstm1.setInt(1, lt.getMaLT());
		pstm1.setString(2, lt.getTen());
		pstm1.setLong(3, lt.getDongia());
		pstm1.setString(4, lt.getHinhanh());
		pstm2.setInt(1, lt.getMaLT());
		pstm2.setString(2, lt.getCpu());
		pstm2.setString(3, lt.getRam());
		pstm2.setString(4, lt.getOcung());
		pstm2.setString(5, lt.getManhinh());
		pstm2.setString(6, lt.getCardmanhinh());
		pstm2.setString(7, lt.getCongketnoi());
		pstm2.setString(8, lt.getHedieuhanh());
		pstm2.setString(9, lt.getThietke());
		pstm2.setString(10, lt.getKichthuoc());
		pstm2.setString(11, lt.getThoidiemramat());
		pstm3.setInt(1, lt.getMaLT());
		pstm3.setInt(2, lt.getSoluong());
		
		pstm1.executeUpdate();
		pstm2.executeUpdate();
		pstm3.executeUpdate();
		
		String insertBaiViet ="insert into BaiViet (maBaiViet,maSP) values(?,?)"; 
		PreparedStatement pstm4 =conn.prepareStatement(insertBaiViet);
		pstm4.setInt(1, lt.getMaLT());
		pstm4.setInt(2, lt.getMaLT());
		pstm4.executeUpdate();
	}
	public static void updateTablet(Connection conn, Tablet tb) throws SQLException{
		String updateSanPham = "update SanPham set ten =?,dongia=?, hinhanh=? where maSP=?";
		String updateThongSo = "update ThongSoKiThuat_TB set manhinh=?, hedieuhanh=?, cpu=?, ram=?, bonhotrong=?,camerasau =?, cameratruoc=?,damthoai=?,trongluong=?,mucNLtieuthu=? where maTB=?";
		String updateSoLuong ="update SoLuong set SL=? where maSP=?";
		PreparedStatement pstm1 = conn.prepareStatement(updateSanPham);
		PreparedStatement pstm2 = conn.prepareStatement(updateThongSo);
		PreparedStatement pstm3 = conn.prepareStatement(updateSoLuong);
		pstm1.setString(1, tb.getTen());
		pstm1.setLong(2, tb.getDongia());
		pstm1.setString(3, tb.getHinhanh());
		pstm1.setInt(4, tb.getMaTB());
		pstm2.setString(1, tb.getManhinh());
		pstm2.setString(2, tb.getHedieuhanh());
		pstm2.setString(3, tb.getCpu());
		pstm2.setString(4, tb.getRam());
		pstm2.setString(5, tb.getBonhotrong());
		pstm2.setString(6, tb.getCamerasau());
		pstm2.setString(7, tb.getCameratruoc());
		pstm2.setString(8, tb.getDamthoai());
		pstm2.setString(9, tb.getTrongluong());
		pstm2.setString(10, tb.getMucNLtieuthu());
		pstm2.setInt(11, tb.getMaTB());
		pstm3.setInt(1, tb.getSoluong());
		pstm3.setInt(2, tb.getMaTB());
		pstm1.executeUpdate();
		pstm2.executeUpdate();
		pstm3.executeUpdate();
	}
	public static void insertTablet(Connection conn, Tablet tb) throws SQLException{
		String insertSanPham = "insert into SanPham(maSP,loaiSP,ten,dongia,hinhanh) values (?,'Tablet',?,?,?)";
		String insertThongSo = "insert into ThongSoKiThuat_TB values (?,?,?,?,?,?,?,?,?,?,?)";
		String insertSoLuong ="insert into SoLuong values (?,?)";
		
		PreparedStatement pstm1 = conn.prepareStatement(insertSanPham);
		PreparedStatement pstm2 = conn.prepareStatement(insertThongSo);
		PreparedStatement pstm3 = conn.prepareStatement(insertSoLuong);
		pstm1.setInt(1, tb.getMaTB());
		pstm1.setString(2, tb.getTen());
		pstm1.setLong(3, tb.getDongia());
		pstm1.setString(4, tb.getHinhanh());
		pstm2.setInt(1, tb.getMaTB());
		pstm2.setString(2, tb.getManhinh());
		pstm2.setString(3, tb.getHedieuhanh());
		pstm2.setString(4, tb.getCpu());
		pstm2.setString(5, tb.getRam());
		pstm2.setString(6, tb.getBonhotrong());
		pstm2.setString(7, tb.getCamerasau());
		pstm2.setString(8, tb.getCameratruoc());
		pstm2.setString(9, tb.getDamthoai());
		pstm2.setString(10, tb.getTrongluong());
		pstm2.setString(11, tb.getMucNLtieuthu());
		pstm3.setInt(1, tb.getMaTB());
		pstm3.setInt(2, tb.getSoluong());
		
		pstm1.executeUpdate();
		pstm2.executeUpdate();
		pstm3.executeUpdate();
		
		String insertBaiViet ="insert into BaiViet (maBaiViet,maSP) values(?,?)"; 
		PreparedStatement pstm4 =conn.prepareStatement(insertBaiViet);
		pstm4.setInt(1, tb.getMaTB());
		pstm4.setInt(2, tb.getMaTB());
		pstm4.executeUpdate();
	}
	public static void updateDongHo(Connection conn, DongHo dh) throws SQLException{
		String updateSanPham = "update SanPham set ten =?,dongia=?, hinhanh=? where maSP=?";
		String updateThongSo = "update ThongSoKiThuat_DH set congnghemanhinh=?,kichthuocmanhinh=?,thoigiansudung=?,hedieuhanh=?,chatlieumat=?,duongkinhmat=?,ketnoi=?,ngonngu=?,theodoisuckhoe=? where maDH=?";
		String updateSoLuong ="update SoLuong set SL=? where maSP=?";
		PreparedStatement pstm1 = conn.prepareStatement(updateSanPham);
		PreparedStatement pstm2 = conn.prepareStatement(updateThongSo);
		PreparedStatement pstm3 = conn.prepareStatement(updateSoLuong);
		pstm1.setString(1, dh.getTen());
		pstm1.setLong(2, dh.getDongia());
		pstm1.setString(3, dh.getHinhanh());
		pstm1.setInt(4, dh.getMaDH());
		pstm2.setString(1, dh.getCongnghemanhinh());
		pstm2.setString(2, dh.getKichthuocmanhinh());
		pstm2.setString(3, dh.getThoigiansudung());
		pstm2.setString(4, dh.getHedieuhanh());
		pstm2.setString(5, dh.getChatlieumat());
		pstm2.setString(6, dh.getDuongkinhmat());
		pstm2.setString(7, dh.getKetnoi());
		pstm2.setString(8, dh.getNgonngu());
		pstm2.setString(9, dh.getTheodoisuckhoe());
		pstm2.setInt(10, dh.getMaDH());
		pstm3.setInt(1, dh.getSoluong());
		pstm3.setInt(2, dh.getMaDH());
		pstm1.executeUpdate();
		pstm2.executeUpdate();
		pstm3.executeUpdate();
	}
	public static void insertDongHo(Connection conn, DongHo dh) throws SQLException{
		String insertSanPham = "insert into SanPham(maSP,loaiSP,ten,dongia,hinhanh) values (?,'DongHo',?,?,?)";
		String insertThongSo = "insert into ThongSoKiThuat_DH values (?,?,?,?,?,?,?,?,?,?)";
		String insertSoLuong ="insert into SoLuong values (?,?)";
		
		PreparedStatement pstm1 = conn.prepareStatement(insertSanPham);
		PreparedStatement pstm2 = conn.prepareStatement(insertThongSo);
		PreparedStatement pstm3 = conn.prepareStatement(insertSoLuong);
		pstm1.setInt(1, dh.getMaDH());
		pstm1.setString(2, dh.getTen());
		pstm1.setLong(3, dh.getDongia());
		pstm1.setString(4, dh.getHinhanh());
		pstm2.setInt(1, dh.getMaDH());
		pstm2.setString(2, dh.getCongnghemanhinh());
		pstm2.setString(3, dh.getKichthuocmanhinh());
		pstm2.setString(4, dh.getThoigiansudung());
		pstm2.setString(5, dh.getHedieuhanh());
		pstm2.setString(6, dh.getChatlieumat());
		pstm2.setString(7, dh.getDuongkinhmat());
		pstm2.setString(8, dh.getKetnoi());
		pstm2.setString(9, dh.getNgonngu());
		pstm2.setString(10, dh.getTheodoisuckhoe());
		pstm3.setInt(1, dh.getMaDH());
		pstm3.setInt(2, dh.getSoluong());
		
		pstm1.executeUpdate();
		pstm2.executeUpdate();
		pstm3.executeUpdate();
		
		String insertBaiViet ="insert into BaiViet (maBaiViet,maSP) values(?,?)"; 
		PreparedStatement pstm4 =conn.prepareStatement(insertBaiViet);
		pstm4.setInt(1, dh.getMaDH());
		pstm4.setInt(2, dh.getMaDH());
		pstm4.executeUpdate();
	}
	public static void updatePC(Connection conn, PC pc) throws SQLException{
		String updateSanPham = "update SanPham set ten =?,dongia=?, hinhanh=? where maSP=?";
		String updateThongSo = "update ThongSoKiThuat_PC set kichthuocmanhinh=?, dophangiai=?, congnghemanhinh=?,dotuongphan=?,thoigiandapung=?,gocnhin=? where maPC=?";
		String updateSoLuong ="update SoLuong set SL=? where maSP=?";
		PreparedStatement pstm1 = conn.prepareStatement(updateSanPham);
		PreparedStatement pstm2 = conn.prepareStatement(updateThongSo);
		PreparedStatement pstm3 =conn.prepareStatement(updateSoLuong);
		pstm1.setString(1, pc.getTen());
		pstm1.setLong(2, pc.getDongia());
		pstm1.setString(3, pc.getHinhanh());
		pstm1.setInt(4, pc.getMaPC());
		pstm2.setString(1, pc.getKichthuocmanhinh());
		pstm2.setString(2, pc.getDophangiai());
		pstm2.setString(3, pc.getCongnghemanhinh());
		pstm2.setString(4, pc.getDotuongphan());
		pstm2.setString(5, pc.getThoigiandapung());
		pstm2.setString(6, pc.getGocnhin());
		pstm2.setInt(7, pc.getMaPC());
		pstm3.setInt(1, pc.getSoluong());
		pstm3.setInt(2, pc.getMaPC());
		pstm1.executeUpdate();
		pstm2.executeUpdate();
		pstm3.executeUpdate();
	}
	public static void insertPC(Connection conn, PC pc ) throws SQLException{
		String insertSanPham = "insert into SanPham(maSP,loaiSP,ten,dongia,hinhanh) values (?,'PC',?,?,?)";
		String insertThongSo = "insert into ThongSoKiThuat_PC values (?,?,?,?,?,?,?)";
		String insertSoLuong = "insert into SoLuong values (?,?)";
		
		PreparedStatement pstm1 = conn.prepareStatement(insertSanPham);
		PreparedStatement pstm2 = conn.prepareStatement(insertThongSo);
		PreparedStatement pstm3 =conn.prepareStatement(insertSoLuong);
		pstm1.setInt(1, pc.getMaPC());
		pstm1.setString(2, pc.getTen());
		pstm1.setLong(3, pc.getDongia());
		pstm1.setString(4, pc.getHinhanh());
		pstm2.setInt(1, pc.getMaPC());
		pstm2.setString(2, pc.getKichthuocmanhinh());
		pstm2.setString(3, pc.getDophangiai());
		pstm2.setString(4, pc.getCongnghemanhinh());
		pstm2.setString(5, pc.getDotuongphan());
		pstm2.setString(6, pc.getThoigiandapung());
		pstm2.setString(7, pc.getGocnhin());
		pstm3.setInt(1, pc.getMaPC());
		pstm3.setInt(2, pc.getSoluong());
		
		pstm1.executeUpdate();
		pstm2.executeUpdate();
		pstm3.executeUpdate();
		
		String insertBaiViet ="insert into BaiViet (maBaiViet,maSP) values(?,?)"; 
		PreparedStatement pstm4 =conn.prepareStatement(insertBaiViet);
		pstm4.setInt(1, pc.getMaPC());
		pstm4.setInt(2, pc.getMaPC());
		pstm4.executeUpdate();
	}
	public static void updatePhuKien(Connection conn, PhuKien pk) throws SQLException{
		String updateSanPham = "update SanPham set ten =?,dongia=?, hinhanh=? where maSP=?";
		String updateSoLuong ="update SoLuong set SL=? where maSP=?";
		PreparedStatement pstm1 = conn.prepareStatement(updateSanPham);
		PreparedStatement pstm2 = conn.prepareStatement(updateSoLuong);
		pstm1.setString(1, pk.getTen());
		pstm1.setLong(2, pk.getDongia());
		pstm1.setString(3, pk.getHinhanh());
		pstm1.setInt(4, pk.getMaPK());
		pstm2.setInt(1, pk.getSoluong());
		pstm2.setInt(2, pk.getMaPK());
		pstm1.executeUpdate();
		pstm2.executeUpdate();
	}
	public static void insertPhuKien(Connection conn, PhuKien pk) throws SQLException{
		String insertSanPham = "insert into SanPham(maSP,loaiSP,ten,dongia,hinhanh) values (?,'PhuKien',?,?,?)";
		String insertSoLuong = "insert into SoLuong values (?,?)";
		
		PreparedStatement pstm1 = conn.prepareStatement(insertSanPham);
		PreparedStatement pstm2 = conn.prepareStatement(insertSoLuong);
		pstm1.setInt(1, pk.getMaPK());
		pstm1.setString(2, pk.getTen());
		pstm1.setLong(3, pk.getDongia());
		pstm1.setString(4, pk.getHinhanh());
		pstm2.setInt(1, pk.getMaPK());
		pstm2.setInt(2, pk.getSoluong());
		
		pstm1.executeUpdate();
		pstm2.executeUpdate();
		
		String insertBaiViet ="insert into BaiViet (maBaiViet,maSP) values(?,?)"; 
		PreparedStatement pstm3 =conn.prepareStatement(insertBaiViet);
		pstm3.setInt(1, pk.getMaPK());
		pstm3.setInt(2, pk.getMaPK());
		pstm3.executeUpdate();
	}
	public static LapTop findLapTop(Connection conn, int idIn) throws SQLException{
		String sql = "Select a.maSP, a.ten, a.dongia, a.hinhanh, b.cpu,b.ram, b.ocung, b.manhinh, b.cardmanhinh, b.congketnoi, b.hedieuhanh, b.thietke, b.kichthuoc,b.thoidiemramat"
        		+ " from SanPham a,ThongSoKiThuat_LT b where b.maLT=? and a.maSP=?";
 
        PreparedStatement pstm = conn.prepareStatement(sql);
        pstm.setInt(1, idIn);
        pstm.setInt(2, idIn);
        ResultSet rs = pstm.executeQuery();
 
        while (rs.next()) {
            String ten = rs.getString("ten");
            int maSP = rs.getInt("maSP");
            long dongia = rs.getLong("dongia");
            String hinhanh = rs.getString("hinhanh");
            String cpu = rs.getString("cpu");
            String ram = rs.getString("ram");
            String ocung = rs.getString("ocung");
            String manhinh = rs.getString("manhinh");
            String cardmanhinh = rs.getString("cardmanhinh");
            String congketnoi = rs.getString("congketnoi");
            String hedieuhanh = rs.getString("hedieuhanh");
            String thietke = rs.getString("thietke");
            String kichthuoc = rs.getString("kichthuoc");
            String thoidiemramat = rs.getString("thoidiemramat");
            LapTop lt = new LapTop(maSP,ten, dongia, hinhanh,cpu,ram, ocung,manhinh, cardmanhinh,congketnoi,hedieuhanh,thietke,kichthuoc,thoidiemramat);
            return lt;
        }
        return null;
	}
	public static LapTop findLapTop_SoLuong(Connection conn, int idIn) throws SQLException{
		String sql = "Select a.maSP, a.ten, a.dongia, a.hinhanh,c.SL, b.cpu,b.ram, b.ocung, b.manhinh, b.cardmanhinh, b.congketnoi, b.hedieuhanh, b.thietke, b.kichthuoc,b.thoidiemramat"
        		+ " from SanPham a,ThongSoKiThuat_LT b,SoLuong c where b.maLT=? and a.maSP=? and c.maSP=?";
 
        PreparedStatement pstm = conn.prepareStatement(sql);
        pstm.setInt(1, idIn);
        pstm.setInt(2, idIn);
        pstm.setInt(3, idIn);
        ResultSet rs = pstm.executeQuery();
 
        while (rs.next()) {
            String ten = rs.getString("ten");
            int maSP = rs.getInt("maSP");
            long dongia = rs.getLong("dongia");
            String hinhanh = rs.getString("hinhanh");
            int soluong = rs.getInt("SL");
            String cpu = rs.getString("cpu");
            String ram = rs.getString("ram");
            String ocung = rs.getString("ocung");
            String manhinh = rs.getString("manhinh");
            String cardmanhinh = rs.getString("cardmanhinh");
            String congketnoi = rs.getString("congketnoi");
            String hedieuhanh = rs.getString("hedieuhanh");
            String thietke = rs.getString("thietke");
            String kichthuoc = rs.getString("kichthuoc");
            String thoidiemramat = rs.getString("thoidiemramat");
            LapTop lt = new LapTop(maSP, ten, dongia, hinhanh, soluong, cpu, ram, ocung, manhinh, cardmanhinh, congketnoi, hedieuhanh, thietke, kichthuoc, thoidiemramat);
            return lt;
        }
        return null;
	}
	public static Tablet findTablet(Connection conn, int idIn) throws SQLException{
		String sql = "Select a.maSP, a.ten, a.dongia, a.hinhanh, b.manhinh,b.hedieuhanh, b.cpu, b.ram, b.bonhotrong, b.camerasau, b.cameratruoc, b.damthoai, b.trongluong,b.mucNLtieuthu"
        		+ " from SanPham a,ThongSoKiThuat_TB b where b.maTB=? and a.maSP=?";
 
        PreparedStatement pstm = conn.prepareStatement(sql);
        pstm.setInt(1, idIn);
        pstm.setInt(2, idIn);
        ResultSet rs = pstm.executeQuery();
 
        while (rs.next()) {
            String ten = rs.getString("ten");
            int maSP = rs.getInt("maSP");
            long dongia = rs.getLong("dongia");
            String hinhanh = rs.getString("hinhanh");
            String manhinh = rs.getString("manhinh");
            String hedieuhanh = rs.getString("hedieuhanh");
            String cpu = rs.getString("cpu");
            String ram = rs.getString("ram");
            String bonhotrong = rs.getString("bonhotrong");
            String camerasau = rs.getString("camerasau");
            String cameratruoc = rs.getString("cameratruoc");
            String damthoai = rs.getString("damthoai");
            String trongluong = rs.getString("trongluong");
            String mucNLtieuthu = rs.getString("mucNLtieuthu");
            Tablet tb = new Tablet(maSP,ten, dongia, hinhanh,manhinh,hedieuhanh,cpu, ram,bonhotrong,camerasau,cameratruoc,damthoai,trongluong,mucNLtieuthu);
            return tb;
        }
        return null;
	}
	public static Tablet findTablet_SoLuong(Connection conn, int idIn) throws SQLException{
		String sql = "Select a.maSP, a.ten, a.dongia, a.hinhanh,c.SL, b.manhinh,b.hedieuhanh, b.cpu, b.ram, b.bonhotrong, b.camerasau, b.cameratruoc, b.damthoai, b.trongluong,b.mucNLtieuthu"
        		+ " from SanPham a,ThongSoKiThuat_TB b,SoLuong c where b.maTB=? and a.maSP=? and c.maSP=?";
 
        PreparedStatement pstm = conn.prepareStatement(sql);
        pstm.setInt(1, idIn);
        pstm.setInt(2, idIn);
        pstm.setInt(3, idIn);
        ResultSet rs = pstm.executeQuery();
 
        while (rs.next()) {
            String ten = rs.getString("ten");
            int maSP = rs.getInt("maSP");
            long dongia = rs.getLong("dongia");
            String hinhanh = rs.getString("hinhanh");
            int soluong = rs.getInt("SL");
            String manhinh = rs.getString("manhinh");
            String hedieuhanh = rs.getString("hedieuhanh");
            String cpu = rs.getString("cpu");
            String ram = rs.getString("ram");
            String bonhotrong = rs.getString("bonhotrong");
            String camerasau = rs.getString("camerasau");
            String cameratruoc = rs.getString("cameratruoc");
            String damthoai = rs.getString("damthoai");
            String trongluong = rs.getString("trongluong");
            String mucNLtieuthu = rs.getString("mucNLtieuthu");
            Tablet tb = new Tablet(maSP, ten, dongia, hinhanh, soluong, manhinh, hedieuhanh, cpu, ram, bonhotrong, camerasau, cameratruoc, damthoai, trongluong, mucNLtieuthu);
            return tb;
        }
        return null;
	}
	public static PhuKien findPhuKien(Connection conn, int idIn) throws SQLException{
		String sql = "Select a.maSP, a.ten, a.dongia, a.hinhanh"
        		+ " from SanPham a where a.maSP=?";
 
        PreparedStatement pstm = conn.prepareStatement(sql);
        pstm.setInt(1, idIn);
        ResultSet rs = pstm.executeQuery();
 
        while (rs.next()) {
            String ten = rs.getString("ten");
            int maSP = rs.getInt("maSP");
            long dongia = rs.getLong("dongia");
            String hinhanh = rs.getString("hinhanh");
            PhuKien pk = new PhuKien(maSP,ten, dongia, hinhanh);
            return pk;
        }
        return null;
	}
	public static PhuKien findPhuKien_SoLuong(Connection conn, int idIn) throws SQLException{
		String sql = "Select a.maSP, a.ten, a.dongia, a.hinhanh,b.SL"
        		+ " from SanPham a, SoLuong b where a.maSP=? and b.maSP=?";
 
        PreparedStatement pstm = conn.prepareStatement(sql);
        pstm.setInt(1, idIn);
        pstm.setInt(2, idIn);
        ResultSet rs = pstm.executeQuery();
 
        while (rs.next()) {
            String ten = rs.getString("ten");
            int maSP = rs.getInt("maSP");
            long dongia = rs.getLong("dongia");
            String hinhanh = rs.getString("hinhanh");
            int soluong = rs.getInt("SL");
            PhuKien pk = new PhuKien(maSP, ten, dongia, hinhanh, soluong);
            return pk;
        }
        return null;
	}
	public static DongHo findDongHo(Connection conn, int idIn) throws SQLException{
		String sql = "Select a.maSP, a.ten, a.dongia, a.hinhanh, b.congnghemanhinh,b.kichthuocmanhinh, b.thoigiansudung, b.hedieuhanh, b.chatlieumat, b.duongkinhmat, b.ketnoi, b.ngonngu, b.theodoisuckhoe"
        		+ " from SanPham a,ThongSoKiThuat_DH b where b.maDH=? and a.maSP=?";
 
        PreparedStatement pstm = conn.prepareStatement(sql);
        pstm.setInt(1, idIn);
        pstm.setInt(2, idIn);
        ResultSet rs = pstm.executeQuery();
 
        while (rs.next()) {
            String ten = rs.getString("ten");
            int maSP = rs.getInt("maSP");
            long dongia = rs.getLong("dongia");
            String hinhanh = rs.getString("hinhanh");
            String congnghemanhinh = rs.getString("congnghemanhinh");
            String kichthuocmanhinh = rs.getString("kichthuocmanhinh");
            String thoigiansudung = rs.getString("thoigiansudung");
            String hedieuhanh = rs.getString("hedieuhanh");
            String chatlieumat = rs.getString("chatlieumat");
            String duongkinhmat = rs.getString("duongkinhmat");
            String ketnoi = rs.getString("ketnoi");
            String ngonngu = rs.getString("ngonngu");
            String theodoisuckhoe = rs.getString("theodoisuckhoe");
            DongHo dh = new DongHo(maSP,ten, dongia, hinhanh,congnghemanhinh,kichthuocmanhinh,thoigiansudung, hedieuhanh,chatlieumat,duongkinhmat,ketnoi,ngonngu,theodoisuckhoe);
            return dh;
        }
        return null;
	}
	public static DongHo findDongHo_SoLuong(Connection conn, int idIn) throws SQLException{
		String sql = "Select a.maSP, a.ten, a.dongia, a.hinhanh,c.SL, b.congnghemanhinh,b.kichthuocmanhinh, b.thoigiansudung, b.hedieuhanh, b.chatlieumat, b.duongkinhmat, b.ketnoi, b.ngonngu, b.theodoisuckhoe"
        		+ " from SanPham a,ThongSoKiThuat_DH b,SoLuong c where b.maDH=? and a.maSP=? and c.maSP=?";
 
        PreparedStatement pstm = conn.prepareStatement(sql);
        pstm.setInt(1, idIn);
        pstm.setInt(2, idIn);
        pstm.setInt(3, idIn);
        ResultSet rs = pstm.executeQuery();
 
        while (rs.next()) {
            String ten = rs.getString("ten");
            int maSP = rs.getInt("maSP");
            long dongia = rs.getLong("dongia");
            String hinhanh = rs.getString("hinhanh");
            int soluong = rs.getInt("SL");
            String congnghemanhinh = rs.getString("congnghemanhinh");
            String kichthuocmanhinh = rs.getString("kichthuocmanhinh");
            String thoigiansudung = rs.getString("thoigiansudung");
            String hedieuhanh = rs.getString("hedieuhanh");
            String chatlieumat = rs.getString("chatlieumat");
            String duongkinhmat = rs.getString("duongkinhmat");
            String ketnoi = rs.getString("ketnoi");
            String ngonngu = rs.getString("ngonngu");
            String theodoisuckhoe = rs.getString("theodoisuckhoe");
            DongHo dh = new DongHo(maSP, ten, dongia, hinhanh, soluong, congnghemanhinh, kichthuocmanhinh, thoigiansudung, hedieuhanh, chatlieumat, duongkinhmat, ketnoi, ngonngu, theodoisuckhoe);
            return dh;
        }
        return null;
	}
	public static PC findPC(Connection conn, int idIn) throws SQLException{
		String sql = "Select a.maSP, a.ten, a.dongia, a.hinhanh, b.kichthuocmanhinh,b.dophangiai, b.congnghemanhinh, b.dotuongphan, b.thoigiandapung, b.gocnhin"
        		+ " from SanPham a,ThongSoKiThuat_PC b where b.maPC=? and a.maSP=?";
 
        PreparedStatement pstm = conn.prepareStatement(sql);
        pstm.setInt(1, idIn);
        pstm.setInt(2, idIn);
        ResultSet rs = pstm.executeQuery();
 
        while (rs.next()) {
            String ten = rs.getString("ten");
            int maSP = rs.getInt("maSP");
            long dongia = rs.getLong("dongia");
            String hinhanh = rs.getString("hinhanh");
            String kichthuocmanhinh = rs.getString("kichthuocmanhinh");
            String dophangiai = rs.getString("dophangiai");
            String congnghemanhinh = rs.getString("congnghemanhinh");
            String dotuongphan = rs.getString("dotuongphan");
            String thoigiandapung = rs.getString("thoigiandapung");
            String gocnhin = rs.getString("gocnhin");
            PC pc = new PC(maSP,ten, dongia, hinhanh,kichthuocmanhinh,dophangiai,congnghemanhinh, dotuongphan,thoigiandapung,gocnhin);
            return pc;
        }
        return null;
	}
	public static PC findPC_SoLuong(Connection conn, int idIn) throws SQLException{
		String sql = "Select a.maSP, a.ten, a.dongia, a.hinhanh,c.SL, b.kichthuocmanhinh,b.dophangiai, b.congnghemanhinh, b.dotuongphan, b.thoigiandapung, b.gocnhin"
        		+ " from SanPham a,ThongSoKiThuat_PC b,SoLuong c where b.maPC=? and a.maSP=? and c.maSP=?";
 
        PreparedStatement pstm = conn.prepareStatement(sql);
        pstm.setInt(1, idIn);
        pstm.setInt(2, idIn);
        pstm.setInt(3, idIn);
        ResultSet rs = pstm.executeQuery();
 
        while (rs.next()) {
            String ten = rs.getString("ten");
            int maSP = rs.getInt("maSP");
            long dongia = rs.getLong("dongia");
            String hinhanh = rs.getString("hinhanh");
            int soluong = rs.getInt("SL");
            String kichthuocmanhinh = rs.getString("kichthuocmanhinh");
            String dophangiai = rs.getString("dophangiai");
            String congnghemanhinh = rs.getString("congnghemanhinh");
            String dotuongphan = rs.getString("dotuongphan");
            String thoigiandapung = rs.getString("thoigiandapung");
            String gocnhin = rs.getString("gocnhin");
            PC pc = new PC(maSP, ten, dongia, hinhanh, soluong, kichthuocmanhinh, dophangiai, congnghemanhinh, dotuongphan, thoigiandapung, gocnhin);
            return pc;
        }
        return null;
	}
	public static BaiViet findBaiViet(Connection conn, int idIn) throws SQLException {
        String sql = "Select a.maSP, a.tieude, a.noidung1, a.noidung2, a.noidung3, a.noidung4, a.noidung5, a.noidung6, a.noidung7, a.noidung8"
        		+ ",a.hinhanh1, a.hinhanh2, a.hinhanh3, a.hinhanh4, a.hinhanh5, a.hinhanh6, a.hinhanh7, a.hinhanh8"
        		+ " from BaiViet a where a.maSP=?";
 
        PreparedStatement pstm = conn.prepareStatement(sql);
        pstm.setInt(1, idIn);
 
        ResultSet rs = pstm.executeQuery();
 
        while (rs.next()) {
            int maSP = rs.getInt("maSP");
            String tieude = rs.getString("tieude");
            String noidung1 = rs.getString("noidung1");
            String noidung2 = rs.getString("noidung2");
            String noidung3 = rs.getString("noidung3");
            String noidung4 = rs.getString("noidung4");
            String noidung5 = rs.getString("noidung5");
            String noidung6 = rs.getString("noidung6");
            String noidung7 = rs.getString("noidung7");
            String noidung8 = rs.getString("noidung8");
            String hinhanh1 = rs.getString("hinhanh1");
            String hinhanh2 = rs.getString("hinhanh2");
            String hinhanh3 = rs.getString("hinhanh3");
            String hinhanh4 = rs.getString("hinhanh4");
            String hinhanh5 = rs.getString("hinhanh5");
            String hinhanh6 = rs.getString("hinhanh6");
            String hinhanh7 = rs.getString("hinhanh7");
            String hinhanh8 = rs.getString("hinhanh8");
            BaiViet bv = new BaiViet(maSP, tieude, noidung1,noidung2, noidung3, noidung4, noidung5,noidung6,noidung7, noidung8, hinhanh1,hinhanh2, hinhanh3, hinhanh4, hinhanh5, hinhanh6,hinhanh7, hinhanh8);
            return bv;
        }
        return null;
    }
	public static void updateBaiViet(Connection conn, int maBaiViet, String noidung1, String noidung2, String noidung3, String noidung4, String noidung5,
			String noidung6, String noidung7, String noidung8, String hinhanh1, String hinhanh2, String hinhanh3, String hinhanh4, String hinhanh5,
			String hinhanh6,String hinhanh7, String hinhanh8) throws SQLException
	{
		String sql = "update BaiViet set noidung1 = ?,noidung2 = ? , noidung3=?,noidung4=?, noidung5=?,noidung6=?,noidung7=?,noidung8=?"
				+ ",hinhanh1=?,hinhanh2=?,hinhanh3=?,hinhanh4=?,hinhanh5=?,hinhanh6=?, hinhanh7=?,hinhanh8=? where maBaiViet=?";
		PreparedStatement pstm = conn.prepareStatement(sql);
		pstm.setString(1, noidung1);
		pstm.setString(2, noidung2);
		pstm.setString(3, noidung3);
		pstm.setString(4, noidung4);
		pstm.setString(5, noidung5);
		pstm.setString(6, noidung6);
		pstm.setString(7, noidung7);
		pstm.setString(8, noidung8);
		pstm.setString(9, hinhanh1);
		pstm.setString(10, hinhanh2);
		pstm.setString(11, hinhanh3);
		pstm.setString(12, hinhanh4);
		pstm.setString(13, hinhanh5);
		pstm.setString(14, hinhanh6);
		pstm.setString(15, hinhanh7);
		pstm.setString(16, hinhanh8);
		pstm.setInt(17, maBaiViet);
		pstm.executeUpdate();
		
	}
	
	public static void deleteBaiViet(Connection conn, int maBaiViet) throws SQLException{
		String sql = "delete BaiViet where maBaiViet = ?";
		PreparedStatement pstm = conn.prepareStatement(sql);
		pstm.setInt(1, maBaiViet);
		pstm.executeUpdate();
	}
	public static void insertKhachHang(Connection conn, KhachHang kh) throws SQLException {
        String sql = "Insert into KhachHang values (?, ?, ?,?)";
 
        PreparedStatement pstm = conn.prepareStatement(sql);
 
        pstm.setString(1, kh.getTenTK());
        pstm.setString(2, kh.getMatkhau());
        pstm.setString(3, kh.getDiachigiaohang());
        pstm.setString(4, kh.getTenkhachhang());
     
        pstm.executeUpdate();
    }
	public static void insertGioHang(Connection conn, GioHang gh) throws SQLException{
		String sql ="Insert into GioHang values (?,?,?,?,?)";
		PreparedStatement pstm = conn.prepareStatement(sql);
		pstm.setInt(1, gh.getMaSP());
		pstm.setInt(2, gh.getMaKH());
		pstm.setString(3, gh.getTenSP());
		pstm.setLong(4, gh.getDongia());         
		pstm.setInt(5, gh.getSlmua());
		pstm.executeUpdate();
	}
	public static GioHang kiemtragiohang(Connection conn, GioHang gh) throws SQLException{
		String sql = "select * from GioHang where maSP =? and maKH =?";
		PreparedStatement pstm = conn.prepareStatement(sql);
		pstm.setInt(1, gh.getMaSP());
		pstm.setInt(2, gh.getMaKH());
		ResultSet rs =pstm.executeQuery();
		while (rs.next()) {
            int maSP = rs.getInt("maSP");
            int maKH = rs.getInt("maKH");
            String tenSP = rs.getString("tenSP");
            long dongia =rs.getLong("dongia");
            int slmua =rs.getInt("slmua");
            GioHang giohang  =new GioHang(maSP, maKH, tenSP, dongia, slmua);
            return giohang;
        }
        return null;
	}
	public static void updategiohang(Connection conn, int soluong, GioHang gh) throws SQLException{
		String sql ="update GioHang set slmua = ? where maSP =? and maKH =?";
		PreparedStatement pstm = conn.prepareStatement(sql);
		pstm.setInt(1, soluong);
		pstm.setInt(2, gh.getMaSP());
		pstm.setInt(3, gh.getMaKH());
		pstm.executeUpdate();
	}
	public static void deletegiohang(Connection conn, GioHang gh) throws SQLException{
		String sql ="delete GioHang where maSP =? and maKH =?";
		PreparedStatement pstm = conn.prepareStatement(sql);
		pstm.setInt(1, gh.getMaSP());
		pstm.setInt(2, gh.getMaKH());
		pstm.executeUpdate();
	}
	public static KhachHang  kiemtrataikhoan(Connection conn, KhachHang kh) throws SQLException{
		String sql = "select * from KhachHang where tenTK = ? and matkhau =?";
		PreparedStatement pstm = conn.prepareStatement(sql);
		pstm.setString(1, kh.getTenTK());
		pstm.setString(2, kh.getMatkhau());
		ResultSet rs = pstm.executeQuery();
		while (rs.next()) {
            String tenkhachhang = rs.getString("tenkhachhang");
            String tenTK = rs.getString("tenTK");
            String matkhau = rs.getString("matkhau");
            String diachigiaohang =rs.getString("diachigiaohang");
            KhachHang khachhang= new KhachHang(tenkhachhang, tenTK, matkhau, diachigiaohang);
            return khachhang;
        }
        return null;
	}
	public static Admin  kiemtrataikhoanAdmin(Connection conn, Admin ad) throws SQLException{
		String sql = "select * from Admin where tenTK = ? and matkhau =?";
		PreparedStatement pstm = conn.prepareStatement(sql);
		pstm.setString(1, ad.getTenTK());
		pstm.setString(2, ad.getMatkhau());
		ResultSet rs = pstm.executeQuery();
		while (rs.next()) {
			int maAD = rs.getInt("maAD");
            String tenTK = rs.getString("tenTK");
            String matkhau = rs.getString("matkhau");
            String tenAdmin = rs.getString("tenAdmin");
            int tuoi = rs.getInt("tuoi");
            String phanquyen = rs.getString("phanquyen");
            //String diachigiaohang =rs.getString("diachigiaohang");
            Admin admin = new Admin(maAD, tenTK, matkhau, tenAdmin, tuoi,phanquyen);
            return admin;
        }
        return null;
	}
	public static List<Admin> listAdmin(Connection conn) throws SQLException {
		String sql= "Select * from dbo.Admin";
		PreparedStatement pstm = conn.prepareStatement(sql);
		ResultSet rs = pstm.executeQuery();
		List<Admin> list = new ArrayList<Admin>();
		while	(rs.next()) {
			int maAD = rs.getInt("maAD");
			String tenTK = rs.getString("tenTK");
			String matkhau = rs.getString("matkhau");
			String tenAdmin = rs.getString("tenAdmin");
			int tuoi = rs.getInt("tuoi");
			String phanquyen = rs.getString("phanquyen");
			Admin ad = new Admin(maAD, tenTK, matkhau, tenAdmin, tuoi,phanquyen);
			list.add(ad);
		}
		return list;
	}
	public static void chinhsuathongtinkhachhang(Connection conn, String tenTK, String tenkhachhang, String diachigiaohang ) throws SQLException
	{
		String sql = "update KhachHang set tenkhachhang=?,diachigiaohang=? where tenTK = ?";
		PreparedStatement pstm = conn.prepareStatement(sql);
		pstm.setString(1, tenkhachhang);
		pstm.setString(2, diachigiaohang);
		pstm.setString(3,tenTK);
		pstm.executeUpdate();
	}
	public static KhachHang  timkiemkhachhang(Connection conn, String ten) throws SQLException{
		String sql = "select * from KhachHang where tenTK = ?";
		PreparedStatement pstm = conn.prepareStatement(sql);
		pstm.setString(1, ten);
		ResultSet rs = pstm.executeQuery();
		while (rs.next()) {
			int maKH =rs.getInt("maKH");
            String tenkhachhang = rs.getString("tenkhachhang");
            String tenTK = rs.getString("tenTK");
            String matkhau = rs.getString("matkhau");
            String diachigiaohang =rs.getString("diachigiaohang");
            KhachHang khachhang= new KhachHang(maKH,tenkhachhang, tenTK, matkhau, diachigiaohang);
            return khachhang;
        }
        return null;
	}
	public static List<GioHang> listGioHang(Connection conn,int maKHr) throws SQLException {
		String sql= "Select * from dbo.GioHang where maKH=?";
		PreparedStatement pstm = conn.prepareStatement(sql);
		pstm.setInt(1, maKHr);
		ResultSet rs = pstm.executeQuery();
		List<GioHang> list = new ArrayList<GioHang>();
		while	(rs.next()) {
			int maSP = rs.getInt("maSP");
			int maKH =rs.getInt("maKH");
			String tenSP = rs.getString("tenSP");
			long dongia = rs.getLong("dongia");
			int slmua =rs.getInt("slmua");
			GioHang gh = new GioHang(maSP, maKH, tenSP, dongia, slmua);
			list.add(gh);
		}
		return list;
	}
	public static List<DonHang> listDonHangs(Connection conn) throws SQLException{
		String sql ="Select * from dbo.DonHang";
		PreparedStatement pstm = conn.prepareStatement(sql);
		ResultSet rs = pstm.executeQuery();
		List<DonHang> list = new ArrayList<DonHang>();
		while(rs.next()) {
			int maDonHang = rs.getInt("maDonHang");
			int maSP = rs.getInt("maSP");
			String tenSP = rs.getString("tenSP");
			long dongia = rs.getLong("dongia");
			int slmua = rs.getInt("slmua");
			int maKH = rs.getInt("maKH");
			Date ngayMua = rs.getDate("ngayMua");
			String tinhtrang = rs.getString("tinhtrang");
			DonHang dh = new DonHang(maDonHang, maSP, tenSP, dongia, slmua, maKH, ngayMua, tinhtrang);
			list.add(dh);
		}
		return list;
	}
	public static List<KhachHang> listkhachhang(Connection conn) throws SQLException{
		String sql ="Select * from dbo.KhachHang";
		PreparedStatement pstm = conn.prepareStatement(sql);
		ResultSet rs = pstm.executeQuery();
		List<KhachHang> list = new ArrayList<KhachHang>();
		while(rs.next()) {
			int maKH = rs.getInt("maKH");
			String tenTK = rs.getString("tenTK");
			String matkhau = rs.getString("matkhau");
			String diachigiaohang = rs.getString("diachigiaohang");
			String tenkhachhang = rs.getString("tenkhachhang");
			KhachHang kh = new KhachHang(maKH, tenkhachhang, tenTK, matkhau, diachigiaohang);
			list.add(kh);
		}
		return list;
	}
	public static List<BaiViet> listBaiViet_tieude(Connection conn) throws SQLException{
		String sql ="Select maBaiViet,maSP,tieude from dbo.BaiViet";
		PreparedStatement pstm = conn.prepareStatement(sql);
		ResultSet rs = pstm.executeQuery();
		List<BaiViet> list = new ArrayList<BaiViet>();
		while(rs.next()) {
			int maBaiViet = rs.getInt("maBaiViet");
			int maSP = rs.getInt("maSP");
			String tieude = rs.getString("tieude");
			BaiViet bv = new BaiViet(maBaiViet, maSP, tieude);
			list.add(bv);
		}
		return list;
	}
	public static void insertDonHang(Connection conn, DonHang dh) throws SQLException{
		String sql = "insert into DonHang values (?,?,?,?,?,?,?,N'Đang xác nhận')";
		PreparedStatement pstm = conn.prepareStatement(sql);
		pstm.setInt(1, dh.getMaDonHang());
		pstm.setInt(2, dh.getMaSP());
		pstm.setString(3, dh.getTenSP());
		pstm.setLong(4, dh.getDongia());
		pstm.setInt(5, dh.getSlmua());
		pstm.setInt(6, dh.getMaKH());
		pstm.setDate(7, dh.getNgayMua());
		pstm.executeUpdate();
	}
	public static void insertAdmin(Connection conn, Admin ad) throws SQLException{
		String sql = "insert into Admin values (?,?,?,?,?,?)";
		PreparedStatement pstm = conn.prepareStatement(sql);
		pstm.setInt(1, ad.getMaAD());
		pstm.setString(2, ad.getTenTK());
		pstm.setString(3, ad.getMatkhau());
		pstm.setString(4, ad.getTenAdmin());
		pstm.setInt(5, ad.getTuoi());
		pstm.setString(6, ad.getPhanquyen());
		pstm.executeUpdate();
	}
	public static void deleteAdmin(Connection conn, int maAD) throws SQLException{
		String sql = "delete Admin where maAD = ?";
		PreparedStatement pstm = conn.prepareStatement(sql);
		pstm.setInt(1, maAD);
		pstm.executeUpdate();
	}
	public static void deleteSanPhamTB(Connection conn, int maSP) throws SQLException{
		String xoaDonHang ="delete DonHang where maSP = ?";
		String xoaGioHang = "delete GioHang where maSP = ?";
		String xoaThongSo = "delete ThongSoKiThuat_TB where maTB = ?";
		String xoaSoLuong = "delete SoLuong where maSP = ?";
		String xoaBaiViet = "delete BaiViet where maSP = ?";
		
		PreparedStatement pstm1 = conn.prepareStatement(xoaDonHang);
		PreparedStatement pstm2 = conn.prepareStatement(xoaGioHang);
		PreparedStatement pstm3 = conn.prepareStatement(xoaThongSo);
		PreparedStatement pstm4 = conn.prepareStatement(xoaSoLuong);
		PreparedStatement pstm5 = conn.prepareStatement(xoaBaiViet);
		
		pstm1.setInt(1, maSP);
		pstm2.setInt(1, maSP);
		pstm3.setInt(1, maSP);
		pstm4.setInt(1, maSP);
		pstm5.setInt(1, maSP);
		
		pstm1.executeUpdate();
		pstm2.executeUpdate();
		pstm3.executeUpdate();
		pstm4.executeUpdate();
		pstm5.executeUpdate();
		
		
		String xoaSanPham = "delete SanPham where maSP =?";
		PreparedStatement pstm6 = conn.prepareStatement(xoaSanPham);
		pstm6.setInt(1, maSP);
		pstm6.executeUpdate();
	}
	public static void deleteSanPhamLT(Connection conn, int maSP) throws SQLException{
		String xoaDonHang ="delete DonHang where maSP = ?";
		String xoaGioHang = "delete GioHang where maSP = ?";
		String xoaThongSo = "delete ThongSoKiThuat_LT where maLT = ?";
		String xoaSoLuong = "delete SoLuong where maSP = ?";
		String xoaBaiViet = "delete BaiViet where maSP = ?";
		
		PreparedStatement pstm1 = conn.prepareStatement(xoaDonHang);
		PreparedStatement pstm2 = conn.prepareStatement(xoaGioHang);
		PreparedStatement pstm3 = conn.prepareStatement(xoaThongSo);
		PreparedStatement pstm4 = conn.prepareStatement(xoaSoLuong);
		PreparedStatement pstm5 = conn.prepareStatement(xoaBaiViet);
		
		pstm1.setInt(1, maSP);
		pstm2.setInt(1, maSP);
		pstm3.setInt(1, maSP);
		pstm4.setInt(1, maSP);
		pstm5.setInt(1, maSP);
		
		pstm1.executeUpdate();
		pstm2.executeUpdate();
		pstm3.executeUpdate();
		pstm4.executeUpdate();
		pstm5.executeUpdate();
		
		String xoaSanPham = "delete SanPham where maSP =?";
		PreparedStatement pstm6 = conn.prepareStatement(xoaSanPham);
		pstm6.setInt(1, maSP);
		pstm6.executeUpdate();
	}
	public static void deleteSanPhamDT(Connection conn, int maSP) throws SQLException{
		String xoaDonHang ="delete DonHang where maSP = ?";
		String xoaGioHang = "delete GioHang where maSP = ?";
		String xoaThongSo = "delete ThongSoKiThuat_DT where maDT = ?";
		String xoaSoLuong = "delete SoLuong where maSP = ?";
		String xoaBaiViet = "delete BaiViet where maSP = ?";
		
		PreparedStatement pstm1 = conn.prepareStatement(xoaDonHang);
		PreparedStatement pstm2 = conn.prepareStatement(xoaGioHang);
		PreparedStatement pstm3 = conn.prepareStatement(xoaThongSo);
		PreparedStatement pstm4 = conn.prepareStatement(xoaSoLuong);
		PreparedStatement pstm5 = conn.prepareStatement(xoaBaiViet);
		
		pstm1.setInt(1, maSP);
		pstm2.setInt(1, maSP);
		pstm3.setInt(1, maSP);
		pstm4.setInt(1, maSP);
		pstm5.setInt(1, maSP);
		
		pstm1.executeUpdate();
		pstm2.executeUpdate();
		pstm3.executeUpdate();
		pstm4.executeUpdate();
		pstm5.executeUpdate();
		
		String xoaSanPham = "delete SanPham where maSP =?";
		PreparedStatement pstm6 = conn.prepareStatement(xoaSanPham);
		pstm6.setInt(1, maSP);
		pstm6.executeUpdate();
	}
	public static void deleteSanPhamDH(Connection conn, int maSP) throws SQLException{
		String xoaDonHang ="delete DonHang where maSP = ?";
		String xoaGioHang = "delete GioHang where maSP = ?";
		String xoaThongSo = "delete ThongSoKiThuat_DH where maDH = ?";
		String xoaSoLuong = "delete SoLuong where maSP = ?";
		String xoaBaiViet = "delete BaiViet where maSP = ?";
		
		PreparedStatement pstm1 = conn.prepareStatement(xoaDonHang);
		PreparedStatement pstm2 = conn.prepareStatement(xoaGioHang);
		PreparedStatement pstm3 = conn.prepareStatement(xoaThongSo);
		PreparedStatement pstm4 = conn.prepareStatement(xoaSoLuong);
		PreparedStatement pstm5 = conn.prepareStatement(xoaBaiViet);
		
		pstm1.setInt(1, maSP);
		pstm2.setInt(1, maSP);
		pstm3.setInt(1, maSP);
		pstm4.setInt(1, maSP);
		pstm5.setInt(1, maSP);
		
		pstm1.executeUpdate();
		pstm2.executeUpdate();
		pstm3.executeUpdate();
		pstm4.executeUpdate();
		pstm5.executeUpdate();
		
		String xoaSanPham = "delete SanPham where maSP =?";
		PreparedStatement pstm6 = conn.prepareStatement(xoaSanPham);
		pstm6.setInt(1, maSP);
		pstm6.executeUpdate();
	}
	public static void deleteSanPhamPC(Connection conn, int maSP) throws SQLException{
		String xoaDonHang ="delete DonHang where maSP = ?";
		String xoaGioHang = "delete GioHang where maSP = ?";
		String xoaThongSo = "delete ThongSoKiThuat_PC where maPC = ?";
		String xoaSoLuong = "delete SoLuong where maSP = ?";
		String xoaBaiViet = "delete BaiViet where maSP = ?";
		
		PreparedStatement pstm1 = conn.prepareStatement(xoaDonHang);
		PreparedStatement pstm2 = conn.prepareStatement(xoaGioHang);
		PreparedStatement pstm3 = conn.prepareStatement(xoaThongSo);
		PreparedStatement pstm4 = conn.prepareStatement(xoaSoLuong);
		PreparedStatement pstm5 = conn.prepareStatement(xoaBaiViet);
		
		pstm1.setInt(1, maSP);
		pstm2.setInt(1, maSP);
		pstm3.setInt(1, maSP);
		pstm4.setInt(1, maSP);
		pstm5.setInt(1, maSP);
		
		pstm1.executeUpdate();
		pstm2.executeUpdate();
		pstm3.executeUpdate();
		pstm4.executeUpdate();
		pstm5.executeUpdate();
		
		String xoaSanPham = "delete SanPham where maSP =?";
		PreparedStatement pstm6 = conn.prepareStatement(xoaSanPham);
		pstm6.setInt(1, maSP);
		pstm6.executeUpdate();
		
	}
	public static void deleteSanPhamPK(Connection conn, int maSP) throws SQLException{
		String xoaDonHang ="delete DonHang where maSP = ?";
		String xoaGioHang = "delete GioHang where maSP = ?";
		String xoaSoLuong = "delete SoLuong where maSP = ?";
		String xoaBaiViet = "delete BaiViet where maSP = ?";
		
		PreparedStatement pstm1 = conn.prepareStatement(xoaDonHang);
		PreparedStatement pstm2 = conn.prepareStatement(xoaGioHang);
		PreparedStatement pstm4 = conn.prepareStatement(xoaSoLuong);
		PreparedStatement pstm5 = conn.prepareStatement(xoaBaiViet);
		
		pstm1.setInt(1, maSP);
		pstm2.setInt(1, maSP);
		pstm4.setInt(1, maSP);
		pstm5.setInt(1, maSP);
		
		pstm1.executeUpdate();
		pstm2.executeUpdate();
		pstm4.executeUpdate();
		pstm5.executeUpdate();
		
		String xoaSanPham = "delete SanPham where maSP =?";
		PreparedStatement pstm6 = conn.prepareStatement(xoaSanPham);
		pstm6.setInt(1, maSP);
		pstm6.executeUpdate();
	}
	public static Admin findAdmin(Connection conn, int maAD) throws SQLException{
		String sql = "select * from Admin where maAD =?";
		PreparedStatement pstm = conn.prepareStatement(sql);
		pstm.setInt(1, maAD);
		ResultSet rs = pstm.executeQuery();
		while(rs.next())
		{
		int maadmin = rs.getInt("maAD");
		String tenTK = rs.getString("tenTK");
		String matkhau = rs.getString("matkhau");
		String tenAdmin = rs.getString("tenAdmin");
		int tuoi = rs.getInt("tuoi");
		String phanquyen = rs.getString("phanquyen");
		Admin admin = new Admin(maadmin, tenTK, matkhau, tenAdmin, tuoi,phanquyen);
		return admin;
		}
		return null;
		
		
	}
	public static void chinhsuathongtinadmin(Connection conn, Admin ad ) throws SQLException
	{
		String sql = "update Admin set tenTK=?,matkhau=?,tenAdmin=?,tuoi=?,phanquyen=? where maAD = ?";
		PreparedStatement pstm = conn.prepareStatement(sql);
		pstm.setString(1, ad.getTenTK());
		pstm.setString(2, ad.getMatkhau());
		pstm.setString(3,ad.getTenAdmin());
		pstm.setInt(4, ad.getTuoi());
		pstm.setString(5, ad.getPhanquyen());
		pstm.setInt(6, ad.getMaAD());
		pstm.executeUpdate();
	}
	public static void capnhapdonhang(Connection conn, int maDonHang, int maSP ,String tinhtrang ) throws SQLException
	{
		String sql = "update DonHang set tinhtrang=? where maDonHang= ? and maSP =?";
		PreparedStatement pstm = conn.prepareStatement(sql);
		pstm.setString(1, tinhtrang);
		pstm.setInt(2, maDonHang);
		pstm.setInt(3,maSP);
		pstm.executeUpdate();
	}
	public static DonHang findDonHang(Connection conn, int maDonHang, int maSP) throws SQLException{
		String sql ="select * from DonHang where maDonHang=? and maSP=?";
		PreparedStatement pstm = conn.prepareStatement(sql);
		pstm.setInt(1, maDonHang);
		pstm.setInt(2, maSP);
		ResultSet rs = pstm.executeQuery();
		while(rs.next())
		{
		int maDonHangnew = rs.getInt("maDonHang");
		int maSPnew = rs.getInt("maSP");
		String tenSP = rs.getString("tenSP");
		long dongia = rs.getLong("dongia");
		int slmua = rs.getInt("slmua");
		int maKH = rs.getInt("maKH");
		Date ngayMua = rs.getDate("ngayMua");
		String tinhtrang = rs.getString("tinhtrang");
		DonHang dh = new DonHang(maDonHangnew, maSPnew, tenSP, dongia, slmua, maKH, ngayMua,tinhtrang);
		return dh;
		}
		return null;
	}
	public static DonHang findDonHang_KhachHang(Connection conn, int maDonHang, int maSP) throws SQLException{
		String sql ="select * from DonHang,KhachHang where maDonHang=? and maSP=? and DonHang.maKH = KhachHang.maKH";
		PreparedStatement pstm = conn.prepareStatement(sql);
		pstm.setInt(1, maDonHang);
		pstm.setInt(2, maSP);
		ResultSet rs = pstm.executeQuery();
		while(rs.next())
		{
		int maDonHangnew = rs.getInt("maDonHang");
		int maSPnew = rs.getInt("maSP");
		String tenSP = rs.getString("tenSP");
		long dongia = rs.getLong("dongia");
		int slmua = rs.getInt("slmua");
		String tenKH = rs.getString("tenkhachhang");
		String diachi = rs.getString("diachigiaohang");
		Date ngayMua = rs.getDate("ngayMua");
		String tinhtrang = rs.getString("tinhtrang");
		DonHang dh = new DonHang(maDonHangnew, maSPnew, tenSP, dongia, slmua, tenKH, diachi, ngayMua, tinhtrang);
		return dh;
		}
		return null;
	}
	public static List<DonHang> listDonHangsKhachHang(Connection conn, int maKH) throws SQLException{
		String sql ="Select * from dbo.DonHang where maKH = ?";
		PreparedStatement pstm = conn.prepareStatement(sql);
		pstm.setInt(1, maKH);
		ResultSet rs = pstm.executeQuery();
		List<DonHang> list = new ArrayList<DonHang>();
		while(rs.next()) {
			int maDonHang = rs.getInt("maDonHang");
			int maSP = rs.getInt("maSP");
			String tenSP = rs.getString("tenSP");
			long dongia = rs.getLong("dongia");
			int slmua = rs.getInt("slmua");
			Date ngayMua = rs.getDate("ngayMua");
			String tinhtrang = rs.getString("tinhtrang");
			DonHang dh = new DonHang(maDonHang, maSP, tenSP, dongia, slmua, maKH, ngayMua, tinhtrang);
			list.add(dh);
		}
		return list;
	}
	public static List<DonHang> listDonHangs_TenKhachhang(Connection conn) throws SQLException{
		String sql ="Select * from dbo.DonHang,KhachHang where KhachHang.maKH=DonHang.maKH";
		PreparedStatement pstm = conn.prepareStatement(sql);
		ResultSet rs = pstm.executeQuery();
		List<DonHang> list = new ArrayList<DonHang>();
		while(rs.next()) {
			int maDonHang = rs.getInt("maDonHang");
			int maSP = rs.getInt("maSP");
			String tenSP = rs.getString("tenSP");
			long dongia = rs.getLong("dongia");
			String tenKH = rs.getString("tenkhachhang");
			String diachi = rs.getString("diachigiaohang");
			int slmua = rs.getInt("slmua");
			Date ngayMua = rs.getDate("ngayMua");
			String tinhtrang = rs.getString("tinhtrang");
			DonHang dh = new DonHang(maDonHang, maSP, tenSP, dongia, slmua, tenKH, diachi, ngayMua, tinhtrang);
			list.add(dh);
		}
		return list;
	}
	public static int LaySoLuong(Connection conn, int maSP) throws SQLException{
		String sql = "select * from SoLuong where maSP = ?";
		PreparedStatement pstm = conn.prepareStatement(sql);
		pstm.setInt(1, maSP);
		ResultSet rs = pstm.executeQuery();
		int soluong = 0;
		while(rs.next()) {
			soluong = rs.getInt("SL");
		}
		return soluong;
	}
	public static void UpdateSoLuong(Connection conn, int maSP,int soluong) throws SQLException{
		String sql ="update SoLuong set SL = ? where maSP =?";
		PreparedStatement pstm = conn.prepareStatement(sql);
		pstm.setInt(1, soluong);
		pstm.setInt(2, maSP);
		pstm.executeUpdate();
	}
}
