package servlets_Admin;

import java.io.IOException;
import java.sql.Connection;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.Admin;
import beans.DonHang;
import utils.DBUtils;
import utils.MyUtils;

/**
 * Servlet implementation class CapNhapDonHang
 */
@WebServlet(name ="capnhapdonhang", urlPatterns = {"/capnhapdonhang"})
public class CapNhapDonHang extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CapNhapDonHang() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Connection conn = MyUtils.getStoredConnection(request);
		String tenAdmin=request.getParameter("tenAdmin");
		int maAD = Integer.parseInt(request.getParameter("maAD"));
		int maDonHang = Integer.parseInt(request.getParameter("maDonHang"));
		int maSP = Integer.parseInt(request.getParameter("maSP"));
		String phanquyen = request.getParameter("phanquyen");
		DonHang dh = null;
		
		try {
			dh=DBUtils.findDonHang_KhachHang(conn, maDonHang, maSP);
		} catch (Exception e) {
			// TODO: handle exception
		}
		request.setAttribute("tenAdmin", tenAdmin);
		request.setAttribute("maAD", maAD);
		request.setAttribute("donhang",dh);
		request.setAttribute("phanquyen", phanquyen);
		RequestDispatcher dispatcher = request.getServletContext()
                .getRequestDispatcher("/WEB-INF/viewAdmin/CapNhapDonHang.jsp");
        dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Connection conn = MyUtils.getStoredConnection(request);
		String tenAdmin=request.getParameter("tenAdmin");
		int maAD = Integer.parseInt(request.getParameter("maAD"));
		String phanquyen = request.getParameter("phanquyen");
		 String tinhtrang = new String( request.getParameter("dropdown").getBytes("ISO-8859-1"),"UTF-8");
		int maDonHang =Integer.parseInt( request.getParameter("maDonHang"));
		int maSP =Integer.parseInt(request.getParameter("maSP"));
		DonHang dh=null;
		try {
			DBUtils.capnhapdonhang(conn, maDonHang, maSP, tinhtrang);
		} catch (Exception e) {
			// TODO: handle exception
		}
		request.setAttribute("tenAdmin", tenAdmin);
		request.setAttribute("maAD", maAD);
		request.setAttribute("phanquyen", phanquyen);
		RequestDispatcher dispatcher = request.getServletContext()
                .getRequestDispatcher("/WEB-INF/viewAdmin/Admin.jsp");
        dispatcher.forward(request, response);
	}

}
