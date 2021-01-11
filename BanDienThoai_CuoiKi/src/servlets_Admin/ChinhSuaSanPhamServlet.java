package servlets_Admin;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.util.Base64;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.DienThoai;
import beans.DongHo;
import beans.LapTop;
import beans.PC;
import beans.PhuKien;
import beans.Tablet;
import utils.DBUtils;
import utils.MyUtils;

/**
 * Servlet implementation class ChinhSuaSanPhamServlet
 */
@WebServlet(name ="chinhsuasanpham", urlPatterns = {"/chinhsuasanpham"})
public class ChinhSuaSanPhamServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ChinhSuaSanPhamServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    private static String encodeFileToBase64Binary(File file){
        String encodedfile = null;
        try {
            FileInputStream fileInputStreamReader = new FileInputStream(file);
            byte[] bytes = new byte[(int)file.length()];
            fileInputStreamReader.read(bytes);
            encodedfile = new String(Base64.getEncoder().encode(bytes), "UTF-8");
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return encodedfile;
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Connection conn = MyUtils.getStoredConnection(request);
		String tenAdmin=request.getParameter("tenAdmin");
		int maAD = Integer.parseInt(request.getParameter("maAD"));
		int maSP = Integer.parseInt(request.getParameter("maSP"));
		DienThoai dt = null;
		LapTop lt = null;
		Tablet tb = null;
		DongHo dh = null;
		PhuKien pk = null;
		PC pc = null;
		try {
			dt = DBUtils.findDienThoai_soluong(conn, maSP);
			lt = DBUtils.findLapTop_SoLuong(conn, maSP);
			tb= DBUtils.findTablet_SoLuong(conn, maSP);
			dh = DBUtils.findDongHo_SoLuong(conn, maSP);
			pk = DBUtils.findPhuKien_SoLuong(conn, maSP);
			pc = DBUtils.findPC_SoLuong(conn, maSP);
		} catch (Exception e) {
			// TODO: handle exception
		}
		if(dt != null)
		{
		request.setAttribute("tenAdmin", tenAdmin);
		request.setAttribute("maAD", maAD);
		request.setAttribute("dienthoai", dt);
		RequestDispatcher dispatcher = request.getServletContext()
                .getRequestDispatcher("/WEB-INF/viewAdmin/ChinhSuaSanPhamDienThoai.jsp");
        dispatcher.forward(request, response);
		}
		else if(lt != null)
		{
		request.setAttribute("tenAdmin", tenAdmin);
		request.setAttribute("maAD", maAD);
		request.setAttribute("laptop", lt);
		RequestDispatcher dispatcher = request.getServletContext()
                .getRequestDispatcher("/WEB-INF/viewAdmin/ChinhSuaSanPhamLaptop.jsp");
        dispatcher.forward(request, response);
		}
		else if(tb != null)
		{
		request.setAttribute("tenAdmin", tenAdmin);
		request.setAttribute("maAD", maAD);
		request.setAttribute("tablet", tb);
		RequestDispatcher dispatcher = request.getServletContext()
                .getRequestDispatcher("/WEB-INF/viewAdmin/ChinhSuaSanPhamTablet.jsp");
        dispatcher.forward(request, response);
		}
		else if(dh != null)
		{
		request.setAttribute("tenAdmin", tenAdmin);
		request.setAttribute("maAD", maAD);
		request.setAttribute("dongho", dh);
		RequestDispatcher dispatcher = request.getServletContext()
                .getRequestDispatcher("/WEB-INF/viewAdmin/ChinhSuaSanPhamDongHo.jsp");
        dispatcher.forward(request, response);
		}
		else if(pc != null)
		{
		request.setAttribute("tenAdmin", tenAdmin);
		request.setAttribute("maAD", maAD);
		request.setAttribute("pc", pc);
		RequestDispatcher dispatcher = request.getServletContext()
                .getRequestDispatcher("/WEB-INF/viewAdmin/ChinhSuaSanPhamPC.jsp");
        dispatcher.forward(request, response);
		}
		else
		{
		request.setAttribute("tenAdmin", tenAdmin);
		request.setAttribute("maAD", maAD);
		request.setAttribute("phukien", pk);
		RequestDispatcher dispatcher = request.getServletContext()
                .getRequestDispatcher("/WEB-INF/viewAdmin/ChinhSuaSanPhamPhuKien.jsp");
        dispatcher.forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Connection conn = MyUtils.getStoredConnection(request);
		String tenAdmin=request.getParameter("tenAdmin");
		int maAD = Integer.parseInt(request.getParameter("maAD"));
		int maSP = Integer.parseInt(request.getParameter("maSP"));
		DienThoai dt = null;
		LapTop lt = null;
		Tablet tb = null;
		DongHo dh = null;
		PhuKien pk = null;
		PC pc = null;
		try {
			dt = DBUtils.findDienThoai(conn, maSP);
			lt = DBUtils.findLapTop(conn, maSP);
			tb= DBUtils.findTablet(conn, maSP);
			dh = DBUtils.findDongHo(conn, maSP);
			pk = DBUtils.findPhuKien(conn, maSP);
			pc = DBUtils.findPC(conn, maSP);
		} catch (Exception e) {
			// TODO: handle exception
		}
		if(dt != null)
		{
			String ten= new String(request.getParameter("ten").getBytes("ISO-8859-1"),"UTF-8");
			Long dongia = Long.parseLong(request.getParameter("dongia"));
			int soluong = Integer.parseInt(request.getParameter("soluong"));
			String manhinh =new String(request.getParameter("manhinh").getBytes("ISO-8859-1"),"UTF-8");
			String hedieuhanh =new String(request.getParameter("hedieuhanh").getBytes("ISO-8859-1"),"UTF-8");
			String camerasau =new String(request.getParameter("camerasau").getBytes("ISO-8859-1"),"UTF-8");
			String cameratruoc =new String(request.getParameter("cameratruoc").getBytes("ISO-8859-1"),"UTF-8");
			String cpu =new String(request.getParameter("cpu").getBytes("ISO-8859-1"),"UTF-8");
			String ram =new String(request.getParameter("ram").getBytes("ISO-8859-1"),"UTF-8");
			String bonhotrong =new String(request.getParameter("bonhotrong").getBytes("ISO-8859-1"),"UTF-8");
			String thenho =new String(request.getParameter("thenho").getBytes("ISO-8859-1"),"UTF-8");
			String thesim =new String(request.getParameter("thesim").getBytes("ISO-8859-1"),"UTF-8");
			String dungluongpin =new String(request.getParameter("dungluongpin").getBytes("ISO-8859-1"),"UTF-8");
			String duongdan = request.getParameter("hinhanhnew");
			String hinhanhnew =null;
			if(duongdan != "")
			{
				File f =  new File(duongdan);
	             String encodstring1 = encodeFileToBase64Binary(f);
	             hinhanhnew = encodstring1;
				DienThoai dienThoai =new DienThoai(maSP, ten, dongia, hinhanhnew, soluong, manhinh, hedieuhanh, camerasau, cameratruoc, cpu, ram, bonhotrong, thenho, thesim, dungluongpin);
				try {
					DBUtils.updateDienThoai(conn, dienThoai);
				} catch (Exception e) {
					// TODO: handle exception
				}
			}
			else {
				DienThoai dThoai = new DienThoai(maSP, ten, dongia, dt.getHinhanh(), soluong,manhinh, hedieuhanh, camerasau, cameratruoc, cpu, ram, bonhotrong, thenho, thesim, dungluongpin);
				try {
					DBUtils.updateDienThoai(conn, dThoai);
				} catch (Exception e) {
					// TODO: handle exception
				}
			}
			request.setAttribute("tenAdmin", tenAdmin);
			request.setAttribute("maAD", maAD);
			RequestDispatcher dispatcher = request.getServletContext()
					.getRequestDispatcher("/WEB-INF/viewAdmin/Admin.jsp");
			dispatcher.forward(request, response);
		}
		else if(lt != null)
		{
			String ten= new String(request.getParameter("ten").getBytes("ISO-8859-1"),"UTF-8");
			Long dongia = Long.parseLong(request.getParameter("dongia"));
			int soluong = Integer.parseInt(request.getParameter("soluong"));
			String cpu = new String(request.getParameter("cpu").getBytes("ISO-8859-1"),"UTF-8");
			String ram = new String(request.getParameter("ram").getBytes("ISO-8859-1"),"UTF-8");
			String ocung = new String(request.getParameter("ocung").getBytes("ISO-8859-1"),"UTF-8");
			String manhinh = new String(request.getParameter("manhinh").getBytes("ISO-8859-1"),"UTF-8");
			String cardmanhinh = new String(request.getParameter("cardmanhinh").getBytes("ISO-8859-1"),"UTF-8");
			String congketnoi = new String(request.getParameter("congketnoi").getBytes("ISO-8859-1"),"UTF-8");
			String hedieuhanh = new String(request.getParameter("hedieuhanh").getBytes("ISO-8859-1"),"UTF-8");
			String thietke = new String(request.getParameter("thietke").getBytes("ISO-8859-1"),"UTF-8");
			String kichthuoc = new String(request.getParameter("kichthuoc").getBytes("ISO-8859-1"),"UTF-8");
			String thoidiemramat = new String(request.getParameter("thoidiemramat").getBytes("ISO-8859-1"),"UTF-8");
			
			String duongdan = request.getParameter("hinhanhnew");
			String hinhanhnew =null;
			if(duongdan != "")
			{
				File f =  new File(duongdan);
	             String encodstring1 = encodeFileToBase64Binary(f);
	             hinhanhnew = encodstring1;
	             LapTop lTop = new LapTop(maSP, ten, dongia, hinhanhnew,soluong, cpu, ram, ocung, manhinh, cardmanhinh, congketnoi, hedieuhanh, thietke, kichthuoc, thoidiemramat);
	             try {
					DBUtils.updateLapTop(conn, lTop);
				} catch (Exception e) {
					// TODO: handle exception
				}
			}
			else {
				LapTop lapTop = new LapTop(maSP, ten, dongia, lt.getHinhanh(),soluong, cpu, ram, ocung, manhinh, cardmanhinh, congketnoi, hedieuhanh, thietke, kichthuoc, thoidiemramat);
				try {
					DBUtils.updateLapTop(conn, lapTop);
				} catch (Exception e) {
					// TODO: handle exception
				}
			}
			request.setAttribute("tenAdmin", tenAdmin);
			request.setAttribute("maAD", maAD);
			RequestDispatcher dispatcher = request.getServletContext()
					.getRequestDispatcher("/WEB-INF/viewAdmin/Admin.jsp");
			dispatcher.forward(request, response);
		}
		else if(tb != null)
		{
			String ten= new String(request.getParameter("ten").getBytes("ISO-8859-1"),"UTF-8");
			Long dongia = Long.parseLong(request.getParameter("dongia"));
			int soluong = Integer.parseInt(request.getParameter("soluong"));
			String manhinh = new String(request.getParameter("manhinh").getBytes("ISO-8859-1"),"UTF-8");
			String hedieuhanh = new String(request.getParameter("hedieuhanh").getBytes("ISO-8859-1"),"UTF-8");
			String cpu = new String(request.getParameter("cpu").getBytes("ISO-8859-1"),"UTF-8");
			String ram = new String(request.getParameter("ram").getBytes("ISO-8859-1"),"UTF-8");
			String bonhotrong = new String(request.getParameter("bonhotrong").getBytes("ISO-8859-1"),"UTF-8");
			String camerasau = new String(request.getParameter("camerasau").getBytes("ISO-8859-1"),"UTF-8");
			String cameratruoc = new String(request.getParameter("cameratruoc").getBytes("ISO-8859-1"),"UTF-8");
			String damthoai = new String(request.getParameter("damthoai").getBytes("ISO-8859-1"),"UTF-8");
			String trongluong = new String(request.getParameter("trongluong").getBytes("ISO-8859-1"),"UTF-8");
			String mucNLtieuthu = new String(request.getParameter("mucNltieuthu").getBytes("ISO-8859-1"),"UTF-8");
			String duongdan = request.getParameter("hinhanhnew");
			String hinhanhnew =null;
			if(duongdan != "")
			{
				File f =  new File(duongdan);
	             String encodstring1 = encodeFileToBase64Binary(f);
	             hinhanhnew = encodstring1;
	             Tablet tbTablet = new Tablet(maSP, ten, dongia, hinhanhnew,soluong, manhinh, hedieuhanh, cpu, ram, bonhotrong, camerasau, cameratruoc, damthoai, trongluong, mucNLtieuthu);
	             try {
					DBUtils.updateTablet(conn, tbTablet);
				} catch (Exception e) {
					// TODO: handle exception
				}
			}
			else {
				Tablet tbTablet = new Tablet(maSP, ten, dongia, tb.getHinhanh(),soluong, manhinh, hedieuhanh, cpu, ram, bonhotrong, camerasau, cameratruoc, damthoai, trongluong, mucNLtieuthu);
				try {
					DBUtils.updateTablet(conn, tbTablet);
				} catch (Exception e) {
					// TODO: handle exception
				}
			}
			
		request.setAttribute("tenAdmin", tenAdmin);
		request.setAttribute("maAD", maAD);
		RequestDispatcher dispatcher = request.getServletContext()
                .getRequestDispatcher("/WEB-INF/viewAdmin/Admin.jsp");
        dispatcher.forward(request, response);
		}
		else if(dh != null)
		{
			String ten= new String(request.getParameter("ten").getBytes("ISO-8859-1"),"UTF-8");
			Long dongia = Long.parseLong(request.getParameter("dongia"));
			int soluong = Integer.parseInt(request.getParameter("soluong"));
			String congnghemanhinh = new String(request.getParameter("congnghemanhinh").getBytes("ISO-8859-1"),"UTF-8");
			String kichthuocmanhinh = new String(request.getParameter("kichthuocmanhinh").getBytes("ISO-8859-1"),"UTF-8");
			String thoigiansudung = new String(request.getParameter("thoigiansudung").getBytes("ISO-8859-1"),"UTF-8");
			String hedieuhanh = new String(request.getParameter("hedieuhanh").getBytes("ISO-8859-1"),"UTF-8");
			String chatlieumat = new String(request.getParameter("chatlieumat").getBytes("ISO-8859-1"),"UTF-8");
			String duongkinhmat = new String(request.getParameter("duongkinhmat").getBytes("ISO-8859-1"),"UTF-8");
			String ketnoi = new String(request.getParameter("ketnoi").getBytes("ISO-8859-1"),"UTF-8");
			String ngonngu = new String(request.getParameter("ngonngu").getBytes("ISO-8859-1"),"UTF-8");
			String theodoisuckhoe = new String(request.getParameter("theodoisuckhoe").getBytes("ISO-8859-1"),"UTF-8");
			
			String duongdan = request.getParameter("hinhanhnew");
			String hinhanhnew =null;
			if(duongdan != null)
			{
				File f =  new File(duongdan);
	             String encodstring1 = encodeFileToBase64Binary(f);
	             hinhanhnew = encodstring1;
	             DongHo dongHo = new DongHo(maSP, ten, dongia, hinhanhnew,soluong, congnghemanhinh, kichthuocmanhinh, thoigiansudung, hedieuhanh, chatlieumat, duongkinhmat, ketnoi, ngonngu, theodoisuckhoe);
	             try {
					DBUtils.updateDongHo(conn, dongHo);
				} catch (Exception e) {
					// TODO: handle exception
				}
			}
			else {
				DongHo dHo = new DongHo(maSP, ten, dongia, dh.getHinhanh(),soluong, congnghemanhinh, kichthuocmanhinh, thoigiansudung, hedieuhanh, chatlieumat, duongkinhmat, ketnoi, ngonngu, theodoisuckhoe);
				try {
					DBUtils.updateDongHo(conn, dHo);
				} catch (Exception e) {
					// TODO: handle exception
				}
			}
		request.setAttribute("tenAdmin", tenAdmin);
		request.setAttribute("maAD", maAD);
		RequestDispatcher dispatcher = request.getServletContext()
                .getRequestDispatcher("/WEB-INF/viewAdmin/Admin.jsp");
        dispatcher.forward(request, response);
		}
		else if(pc != null)
		{
			String ten= new String(request.getParameter("ten").getBytes("ISO-8859-1"),"UTF-8");
			Long dongia = Long.parseLong(request.getParameter("dongia"));
			int soluong = Integer.parseInt(request.getParameter("soluong"));
			String kichthuocmanhinh = new String(request.getParameter("kichthuocmanhinh").getBytes("ISO-8859-1"),"UTF-8");
			String dophangiai = new String(request.getParameter("dophangiai").getBytes("ISO-8859-1"),"UTF-8");
			String congnghemanhinh = new String(request.getParameter("congnghemanhinh").getBytes("ISO-8859-1"),"UTF-8");
			String dotuongphan = new String(request.getParameter("dotuongphan").getBytes("ISO-8859-1"),"UTF-8");
			String thoigiandapung = new String(request.getParameter("thoigiandapung").getBytes("ISO-8859-1"),"UTF-8");
			String gocnhin = new String(request.getParameter("gocnhin").getBytes("ISO-8859-1"),"UTF-8");
			
			String duongdan = request.getParameter("hinhanhnew");
			String hinhanhnew =null;
			if(duongdan != "")
			{
				File f =  new File(duongdan);
	             String encodstring1 = encodeFileToBase64Binary(f);
	             hinhanhnew = encodstring1;
	             PC pc2 = new PC(maSP, ten, dongia, hinhanhnew,soluong, kichthuocmanhinh, dophangiai, congnghemanhinh, dotuongphan, thoigiandapung, gocnhin);
	             try {
					DBUtils.updatePC(conn, pc2);
				} catch (Exception e) {
					// TODO: handle exception
				}
			}
			else {
				PC pc1 = new PC(maSP, ten, dongia, pc.getHinhanh(),soluong,kichthuocmanhinh, dophangiai, congnghemanhinh, dotuongphan, thoigiandapung, gocnhin);
				try {
					DBUtils.updatePC(conn, pc1);
				} catch (Exception e) {
					// TODO: handle exception
				}
			}
		request.setAttribute("tenAdmin", tenAdmin);
		request.setAttribute("maAD", maAD);
		RequestDispatcher dispatcher = request.getServletContext()
                .getRequestDispatcher("/WEB-INF/viewAdmin/Admin.jsp");
        dispatcher.forward(request, response);
		}
		else
		{
			String ten= new String(request.getParameter("ten").getBytes("ISO-8859-1"),"UTF-8");
			Long dongia = Long.parseLong(request.getParameter("dongia"));
			int soluong = Integer.parseInt(request.getParameter("soluong"));
			String duongdan = request.getParameter("hinhanhnew");
			String hinhanhnew =null;
			if(duongdan != "")
			{
				File f =  new File(duongdan);
	             String encodstring1 = encodeFileToBase64Binary(f);
	             hinhanhnew = encodstring1;
	             PhuKien phuKien = new PhuKien(maSP, ten, dongia, hinhanhnew,soluong);
	             try {
					DBUtils.updatePhuKien(conn, phuKien);
				} catch (Exception e) {
					// TODO: handle exception
				}
			}
			else {
				PhuKien pKien = new PhuKien(maSP, ten, dongia, pk.getHinhanh(),soluong);
				try {
					DBUtils.updatePhuKien(conn, pKien);
				} catch (Exception e) {
					// TODO: handle exception
				}
			}
		request.setAttribute("tenAdmin", tenAdmin);
		request.setAttribute("maAD", maAD);
		RequestDispatcher dispatcher = request.getServletContext()
                .getRequestDispatcher("/WEB-INF/viewAdmin/Admin.jsp");
        dispatcher.forward(request, response);
		}
	}

}
