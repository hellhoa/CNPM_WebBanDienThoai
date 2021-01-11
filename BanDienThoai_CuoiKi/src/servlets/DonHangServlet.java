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

import beans.DonHang;
import beans.KhachHang;
import utils.DBUtils;
import utils.MyUtils;

/**
 * Servlet implementation class DonHangServlet
 */
@WebServlet(name ="donhang", urlPatterns = {"/donhang"})
public class DonHangServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DonHangServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Connection conn = MyUtils.getStoredConnection(request);
		String tenTK = (String)request.getParameter("tenTK");
		String soluong = request.getParameter("soluong");
		KhachHang kh =null;
		try {
			kh = DBUtils.timkiemkhachhang(conn, tenTK);
		} catch (Exception e) {
			// TODO: handle exception
		}
		List<DonHang> donHangs = null;
		try {
			donHangs = DBUtils.listDonHangsKhachHang(conn, kh.getMaKH());
		} catch (Exception e) {
			// TODO: handle exception
		}
		request.setAttribute("soluong", soluong);
		request.setAttribute("dsdonhang", donHangs);
		request.setAttribute("tenkhachhang", kh.getTenkhachhang());
		request.setAttribute("tenTK", kh.getTenTK());
		RequestDispatcher dispatcher = request.getServletContext()
    			.getRequestDispatcher("/WEB-INF/views/DonHang.jsp");
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
