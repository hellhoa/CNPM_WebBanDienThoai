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

import beans.DonHang;
import utils.DBUtils;
import utils.MyUtils;

/**
 * Servlet implementation class GioHangServlet
 */
@WebServlet(name ="donhangadmin", urlPatterns = {"/donhangadmin"})
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
		String tenAdmin = request.getParameter("tenAdmin");
		int maAD = Integer.parseInt(request.getParameter("maAD"));
		String phanquyen = request.getParameter("phanquyen");
		List<DonHang> dh = new ArrayList<DonHang>();
		try {
			dh = DBUtils.listDonHangs_TenKhachhang(conn);
		} catch (Exception e) {
			// TODO: handle exception
		}
		request.setAttribute("phanquyen", phanquyen);
		request.setAttribute("tenAdmin", tenAdmin);
		request.setAttribute("maAD", maAD);
		request.setAttribute("danhsachdonhang", dh);
		RequestDispatcher dispatcher = request.getServletContext()
                .getRequestDispatcher("/WEB-INF/viewAdmin/DonHang.jsp");
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
