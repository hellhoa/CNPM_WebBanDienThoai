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

import org.apache.jasper.tagplugins.jstl.core.ForEach;

import beans.GioHang;
import beans.KhachHang;
import utils.DBUtils;
import utils.MyUtils;

/**
 * Servlet implementation class ThanhToanServlet
 */
@WebServlet(name ="ThanhToan", urlPatterns = {"/ThanhToan"})
public class ThanhToanServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ThanhToanServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Connection conn = MyUtils.getStoredConnection(request);
		String tenkhachhang = request.getParameter("tenkhachhang");
		String tenTK = request.getParameter("tenTK");
		KhachHang kh = null;
		try {
			kh = DBUtils.timkiemkhachhang(conn, tenTK);
		} catch (Exception e) {
			// TODO: handle exception
		}
		List<GioHang> gh = null;
		try {
			gh = DBUtils.listGioHang(conn, kh.getMaKH());
		} catch (Exception e) {
			// TODO: handle exception
		}
		long tongtien = 0;
		long giatamtinh = 0;
		for(int i=0;i<gh.size();i++)
		{
			giatamtinh = giatamtinh + gh.get(i).getDongia() * gh.get(i).getSlmua();
		}
		tongtien = giatamtinh + 22000;
		request.setAttribute("diachi", kh.getDiachigiaohang());
		request.setAttribute("tenkhachhang", kh.getTenkhachhang());
		request.setAttribute("tongtien", tongtien);
		request.setAttribute("giatamtinh", giatamtinh);
		request.setAttribute("tenkhachhang", tenkhachhang);
		request.setAttribute("tenTK", tenTK);
		request.setAttribute("soluong", gh.size());
		RequestDispatcher dispatcher = request.getServletContext().getRequestDispatcher("/WEB-INF/views/ThanhToan.jsp");
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
