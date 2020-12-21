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
import utils.DBUtils;
import utils.MyUtils;

/**
 * Servlet implementation class XoaGioHangServlet
 */
@WebServlet(name ="XoaGioHang", urlPatterns = {"/XoaGioHang"})
public class XoaGioHangServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public XoaGioHangServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Connection conn = MyUtils.getStoredConnection(request);
		int maKH = Integer.parseInt(request.getParameter("maKH"));
		int maSP = Integer.parseInt(request.getParameter("maSP"));
		String tenTK = request.getParameter("tenTK");
		String tenkhachhang = request.getParameter("tenkhachhang");
		GioHang gh1 = new GioHang(maSP, maKH);
			GioHang gh =null;
			
			try {
				gh = DBUtils.kiemtragiohang(conn, gh1);
			} catch (Exception e) {
				// TODO: handle exception
			}
			try {
				DBUtils.deletegiohang(conn, gh);
			} catch (Exception e) {
				// TODO: handle exception
			}
			List<GioHang> giohang = null;
			try {
				giohang = DBUtils.listGioHang(conn, maKH);
			}catch (Exception e) {
				// TODO: handle exception
			}
			request.setAttribute("listGioHang", giohang);
			request.setAttribute("tenkhachhang", tenkhachhang);
			request.setAttribute("tenTK", tenTK);
			RequestDispatcher dispatcher = request.getServletContext()
					.getRequestDispatcher("/WEB-INF/views/GioHang.jsp");
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
