package utils;
import java.sql.*;
import java.util.*;

import beans.BaiViet;
import beans.DienThoai;
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
	
}