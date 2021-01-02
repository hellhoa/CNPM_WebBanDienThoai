package servlets;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.DienThoai;
import beans.DongHo;
import beans.GioHang;
import beans.KhachHang;
import beans.LapTop;
import beans.PhuKien;
import beans.Tablet;
import utils.DBUtils;
import utils.MyUtils;

/**
 * Servlet implementation class HomeServlet
 */
@WebServlet(urlPatterns = {"/home"})
public class HomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HomeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Connection conn = MyUtils.getStoredConnection(request);
		String tenkhachhang = (String)request.getParameter("tenkhachhang");
		String tenTK = (String)request.getParameter("tenTK");
		int soluong = 0;
		try {
			soluong = Integer.parseInt(request.getParameter("soluong"));
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		String errorString =null;
		List<DienThoai> listDienThoai = null;
		try {
			listDienThoai=DBUtils.listDienThoai(conn);
		}catch(SQLException e) {
			e.printStackTrace();
			errorString = e.getMessage();
		}
			//laptop
		String errorStringLT =null;
		List<LapTop> listLT = null;
		try {
			listLT=DBUtils.lisLapTop(conn);
		}catch(SQLException e) {
			e.printStackTrace();
			errorStringLT = e.getMessage();
		}
			//tablet
		String errorStringTB =null;
		List<Tablet> listtb = null;
		try {
			listtb=DBUtils.lisTablet(conn);
		}catch(SQLException e) {
			e.printStackTrace();
			errorStringTB = e.getMessage();
		}
			//phụ kiện
		String errorStringpk =null;
		List<PhuKien> listPK = null;
		try {
			listPK=DBUtils.listPhuKien(conn);
		}catch(SQLException e) {
			e.printStackTrace();
			errorStringpk = e.getMessage();
		}
			//dồng hồ
		String errorStringdh =null;
		List<DongHo> listDongHo = null;
		try {
			listDongHo=DBUtils.listDongHo(conn);
		}catch(SQLException e) {
			e.printStackTrace();
			errorStringdh = e.getMessage();
		}
		request.setAttribute("soluong", soluong);
		request.setAttribute("DHList", listDongHo);
		request.setAttribute("PKList", listPK);
		request.setAttribute("TBList", listtb);
		request.setAttribute("listLT", listLT);
		request.setAttribute("listDienThoai", listDienThoai);
		request.setAttribute("tenkhachhang", tenkhachhang);
		request.setAttribute("tenTK", tenTK);
		RequestDispatcher dispatcher = this.getServletContext().
				getRequestDispatcher("/WEB-INF/views/homeView.jsp");
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
