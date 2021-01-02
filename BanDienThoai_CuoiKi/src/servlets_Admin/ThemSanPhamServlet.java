package servlets_Admin;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.Date;
import java.util.Base64;
import java.util.Random;

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
 * Servlet implementation class ThemSanPhamServlet
 */
@WebServlet(name ="themsanpham", urlPatterns = {"/themsanpham"})
public class ThemSanPhamServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ThemSanPhamServlet() {
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
		int maAD = Integer.parseInt(request.getParameter("maAD"));
		String tenAdmin = request.getParameter("tenAdmin");
		Random rd = new Random();
		int maSP = rd.nextInt(10000000);
        request.setAttribute("maAD", maAD);
        request.setAttribute("tenAdmin", tenAdmin);
        request.setAttribute("maSP", maSP);
		RequestDispatcher dispatcher = request.getServletContext()
                .getRequestDispatcher("/WEB-INF/viewAdmin/ThemSanPham.jsp");
        dispatcher.forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Connection conn = MyUtils.getStoredConnection(request);
		int maAD = Integer.parseInt(request.getParameter("maAD"));
		String tenAdmin = request.getParameter("tenAdmin");
		 String theloai = new String( request.getParameter("theloai").getBytes("ISO-8859-1"),"UTF-8");
		int maSP = Integer.parseInt(request.getParameter("maSP"));
		if(theloai.equals("1"))
		{
			String message1 ="chưa chọn thể loại";
			Random rd = new Random();
			int maSPnew = rd.nextInt(10000000);
	        request.setAttribute("maAD", maAD);
	        request.setAttribute("tenAdmin", tenAdmin);
	        request.setAttribute("maSP", maSPnew);
	        request.setAttribute("message1", message1);
			RequestDispatcher dispatcher = request.getServletContext()
	                .getRequestDispatcher("/WEB-INF/viewAdmin/ThemSanPham.jsp");
	        dispatcher.forward(request, response);
		}
		else if(theloai.equals("2"))
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
				DienThoai dienThoai =new DienThoai(maSP, ten, dongia, hinhanhnew,soluong, manhinh, hedieuhanh, camerasau, cameratruoc, cpu, ram, bonhotrong, thenho, thesim, dungluongpin);
				try {
					DBUtils.insertDienThoai(conn, dienThoai);
				} catch (Exception e) {
					// TODO: handle exception
				}
				request.setAttribute("tenAdmin", tenAdmin);
				request.setAttribute("maAD", maAD);
				RequestDispatcher dispatcher = request.getServletContext()
						.getRequestDispatcher("/WEB-INF/viewAdmin/Admin.jsp");
				dispatcher.forward(request, response);
			}
			else {
				System.out.println(duongdan);
				String thongbao = "hãy chọn ảnh cho sản phẩm";
				request.setAttribute("tenAdmin", tenAdmin);
				request.setAttribute("maAD", maAD);
				request.setAttribute("thongbao", thongbao);
				RequestDispatcher dispatcher = request.getServletContext()
						.getRequestDispatcher("/WEB-INF/viewAdmin/Admin.jsp");
				dispatcher.forward(request, response);
			}
		}
		else if(theloai.equals("3"))
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
					DBUtils.insertLapTop(conn, lTop);
				} catch (Exception e) {
					// TODO: handle exception
				}
	             request.setAttribute("tenAdmin", tenAdmin);
					request.setAttribute("maAD", maAD);
					RequestDispatcher dispatcher = request.getServletContext()
							.getRequestDispatcher("/WEB-INF/viewAdmin/Admin.jsp");
					dispatcher.forward(request, response);
			}
			else {
				System.out.println(duongdan);
				String thongbao = "hãy chọn ảnh cho sản phẩm";
				request.setAttribute("tenAdmin", tenAdmin);
				request.setAttribute("maAD", maAD);
				request.setAttribute("thongbao", thongbao);
				RequestDispatcher dispatcher = request.getServletContext()
						.getRequestDispatcher("/WEB-INF/viewAdmin/Admin.jsp");
				dispatcher.forward(request, response);
			}
		}
		else if(theloai.equals("4"))
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
					DBUtils.insertTablet(conn, tbTablet);
				} catch (Exception e) {
					// TODO: handle exception
				}
	             request.setAttribute("tenAdmin", tenAdmin);
					request.setAttribute("maAD", maAD);
					RequestDispatcher dispatcher = request.getServletContext()
							.getRequestDispatcher("/WEB-INF/viewAdmin/Admin.jsp");
					dispatcher.forward(request, response);
			}
			else {
				System.out.println(duongdan);
				String thongbao = "hãy chọn ảnh cho sản phẩm";
				request.setAttribute("tenAdmin", tenAdmin);
				request.setAttribute("maAD", maAD);
				request.setAttribute("thongbao", thongbao);
				RequestDispatcher dispatcher = request.getServletContext()
						.getRequestDispatcher("/WEB-INF/viewAdmin/Admin.jsp");
				dispatcher.forward(request, response);
			}
		}
		else if(theloai.equals("5"))
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
					DBUtils.insertDongHo(conn, dongHo);
				} catch (Exception e) {
					// TODO: handle exception
				}
	             request.setAttribute("tenAdmin", tenAdmin);
					request.setAttribute("maAD", maAD);
					RequestDispatcher dispatcher = request.getServletContext()
							.getRequestDispatcher("/WEB-INF/viewAdmin/Admin.jsp");
					dispatcher.forward(request, response);
			}
			else {
				System.out.println(duongdan);
				String thongbao = "hãy chọn ảnh cho sản phẩm";
				request.setAttribute("tenAdmin", tenAdmin);
				request.setAttribute("maAD", maAD);
				request.setAttribute("thongbao", thongbao);
				RequestDispatcher dispatcher = request.getServletContext()
						.getRequestDispatcher("/WEB-INF/viewAdmin/Admin.jsp");
				dispatcher.forward(request, response);
			}
		}
		else if(theloai.equals("6"))
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
					DBUtils.insertPC(conn, pc2);
				} catch (Exception e) {
					// TODO: handle exception
				}
	             request.setAttribute("tenAdmin", tenAdmin);
					request.setAttribute("maAD", maAD);
					RequestDispatcher dispatcher = request.getServletContext()
							.getRequestDispatcher("/WEB-INF/viewAdmin/Admin.jsp");
					dispatcher.forward(request, response);
			}
			else {
				System.out.println(duongdan);
				String thongbao = "hãy chọn ảnh cho sản phẩm";
				request.setAttribute("tenAdmin", tenAdmin);
				request.setAttribute("maAD", maAD);
				request.setAttribute("thongbao", thongbao);
				RequestDispatcher dispatcher = request.getServletContext()
						.getRequestDispatcher("/WEB-INF/viewAdmin/Admin.jsp");
				dispatcher.forward(request, response);
			}
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
					DBUtils.insertPhuKien(conn, phuKien);
				} catch (Exception e) {
					// TODO: handle exception
				}
	             request.setAttribute("tenAdmin", tenAdmin);
					request.setAttribute("maAD", maAD);
					RequestDispatcher dispatcher = request.getServletContext()
							.getRequestDispatcher("/WEB-INF/viewAdmin/Admin.jsp");
					dispatcher.forward(request, response);
			}
			else {
				System.out.println("aaaaa" + theloai);
				String thongbao = "hãy chọn ảnh cho sản phẩm";
				request.setAttribute("tenAdmin", tenAdmin);
				request.setAttribute("maAD", maAD);
				request.setAttribute("thongbao", thongbao);
				RequestDispatcher dispatcher = request.getServletContext()
						.getRequestDispatcher("/WEB-INF/viewAdmin/Admin.jsp");
				dispatcher.forward(request, response);
			}
		}
	}

}
