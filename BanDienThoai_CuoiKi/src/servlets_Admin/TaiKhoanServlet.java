package servlets_Admin;

import java.io.IOException;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.Admin;
import beans.KhachHang;
import utils.DBUtils;
import utils.MyUtils;

/**
 * Servlet implementation class TaiKhoanServlet
 */
@WebServlet(name ="taikhoan", urlPatterns = {"/taikhoan"})
public class TaiKhoanServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TaiKhoanServlet() {
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
		List<KhachHang> listkhachhangs = new ArrayList<KhachHang>();
		List<Admin> listAdmins = new ArrayList<Admin>();
		try {
			listAdmins = DBUtils.listAdmin(conn);
		} catch (Exception e) {
			// TODO: handle exception
		}
		try {
			listkhachhangs = DBUtils.listkhachhang(conn);
		} catch (Exception e) {
			// TODO: handle exception
		}
		request.setAttribute("danhsachtaikhoan", listAdmins);
		request.setAttribute("tenAdmin", tenAdmin);
		request.setAttribute("maAD", maAD);
		request.setAttribute("danhsachtaikhoanKH", listkhachhangs);
		RequestDispatcher dispatcher = request.getServletContext()
                .getRequestDispatcher("/WEB-INF/viewAdmin/TaiKhoan.jsp");
        dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
