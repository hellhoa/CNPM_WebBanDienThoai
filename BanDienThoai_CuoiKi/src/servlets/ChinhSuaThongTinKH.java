package servlets;

import java.io.IOException;
import java.sql.Connection;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.GioHang;
import beans.KhachHang;
import utils.DBUtils;
import utils.MyUtils;

/**
 * Servlet implementation class ChinhSuaThongTinKH
 */
@WebServlet(name ="SuaThongTin", urlPatterns = {"/SuaThongTin"})
public class ChinhSuaThongTinKH extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ChinhSuaThongTinKH() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Connection conn = MyUtils.getStoredConnection(request);
		String tenTK = request.getParameter("tenTK");
		KhachHang kh = null;
		try {
			kh = DBUtils.timkiemkhachhang(conn, tenTK);
		} catch (Exception e) {
			// TODO: handle exception
		}
		request.setAttribute("tenTK", tenTK);
		request.setAttribute("tenkhachhang", kh.getTenkhachhang());
		request.setAttribute("diachigiaohang", kh.getDiachigiaohang());
		RequestDispatcher dispatcher = request.getServletContext()
                .getRequestDispatcher("/WEB-INF/views/ChinhSuaThongTinKhachHang.jsp");
        dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Connection conn = MyUtils.getStoredConnection(request);
		String tenTK = request.getParameter("tenTK");
		String tenkhachhang = new String(request.getParameter("tenkhachhang").getBytes("ISO-8859-1"),"UTF-8");
		String diachigiaohang =new String(request.getParameter("diachigiaohang").getBytes("ISO-8859-1"),"UTF-8");
		try {
			DBUtils.chinhsuathongtinkhachhang(conn, tenTK, tenkhachhang, diachigiaohang);
		} catch (Exception e) {
			// TODO: handle exception
		}
		KhachHang kh =null;
		try {
			kh = DBUtils.timkiemkhachhang(conn, tenTK);
		} catch (Exception e) {
			// TODO: handle exception
		}
		List<GioHang> giohang = null;
		try {
			giohang = DBUtils.listGioHang(conn, kh.getMaKH());
		}catch (Exception e) {
			// TODO: handle exception
		}
		request.setAttribute("listGioHang", giohang);
		request.setAttribute("tenkhachhang", kh.getTenkhachhang());
		request.setAttribute("tenTK", kh.getTenTK());
		RequestDispatcher dispatcher = request.getServletContext()
    			.getRequestDispatcher("/WEB-INF/views/GioHang.jsp");
    	dispatcher.forward(request, response);
	}

}
