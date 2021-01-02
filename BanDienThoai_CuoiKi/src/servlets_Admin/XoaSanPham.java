package servlets_Admin;

import java.io.IOException;
import java.sql.Connection;

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
 * Servlet implementation class XoaSanPham
 */
@WebServlet(name ="xoasanpham", urlPatterns = {"/xoasanpham"})
public class XoaSanPham extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public XoaSanPham() {
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
		request.setAttribute("tenAdmin", tenAdmin);
		request.setAttribute("maAD", maAD);
			try {
				DBUtils.deleteSanPhamDT(conn, dt.getMaDT());
			} catch (Exception e) {
				// TODO: handle exception
			}
		RequestDispatcher dispatcher = request.getServletContext()
                .getRequestDispatcher("/WEB-INF/viewAdmin/Admin.jsp");
        dispatcher.forward(request, response);
		}
		else if(lt != null)
		{
		request.setAttribute("tenAdmin", tenAdmin);
		request.setAttribute("maAD", maAD);
		try {
			DBUtils.deleteSanPhamLT(conn, maSP);
		} catch (Exception e) {
			// TODO: handle exception
		}
		RequestDispatcher dispatcher = request.getServletContext()
                .getRequestDispatcher("/WEB-INF/viewAdmin/Admin.jsp");
        dispatcher.forward(request, response);
		}
		else if(tb != null)
		{
		request.setAttribute("tenAdmin", tenAdmin);
		request.setAttribute("maAD", maAD);
		try {
			DBUtils.deleteSanPhamTB(conn, maSP);
		} catch (Exception e) {
			// TODO: handle exception
		}
		RequestDispatcher dispatcher = request.getServletContext()
                .getRequestDispatcher("/WEB-INF/viewAdmin/Admin.jsp");
        dispatcher.forward(request, response);
		}
		else if(dh != null)
		{
		request.setAttribute("tenAdmin", tenAdmin);
		request.setAttribute("maAD", maAD);
		try {
			DBUtils.deleteSanPhamDH(conn, maSP);
		} catch (Exception e) {
			// TODO: handle exception
		}
		RequestDispatcher dispatcher = request.getServletContext()
                .getRequestDispatcher("/WEB-INF/viewAdmin/Admin.jsp");
        dispatcher.forward(request, response);
		}
		else if(pc != null)
		{
		request.setAttribute("tenAdmin", tenAdmin);
		request.setAttribute("maAD", maAD);
		try {
			DBUtils.deleteSanPhamPC(conn, maSP);
		} catch (Exception e) {
			// TODO: handle exception
		}
		RequestDispatcher dispatcher = request.getServletContext()
                .getRequestDispatcher("/WEB-INF/viewAdmin/Admin.jsp");
        dispatcher.forward(request, response);
		}
		else
		{
		request.setAttribute("tenAdmin", tenAdmin);
		request.setAttribute("maAD", maAD);
		try {
			DBUtils.deleteSanPhamPK(conn, maSP);
		} catch (Exception e) {
			// TODO: handle exception
		}
		RequestDispatcher dispatcher = request.getServletContext()
                .getRequestDispatcher("/WEB-INF/viewAdmin/Admin.jsp");
        dispatcher.forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
