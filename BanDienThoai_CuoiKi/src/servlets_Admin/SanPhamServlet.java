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

import beans.DienThoai;
import beans.DongHo;
import beans.LapTop;
import beans.PC;
import beans.PhuKien;
import beans.Tablet;
import utils.DBUtils;
import utils.MyUtils;

/**
 * Servlet implementation class SanPhamServlet
 */
@WebServlet(name ="sanphamadmin", urlPatterns = {"/sanphamadmin"})
public class SanPhamServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SanPhamServlet() {
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
		List<DienThoai> dt = new ArrayList<DienThoai>();
		List<LapTop> lt = new ArrayList<LapTop>();
		List<Tablet> tb = new ArrayList<Tablet>();
		List<DongHo> dh = new ArrayList<DongHo>();
		List<PhuKien> pk = new ArrayList<PhuKien>();
		List<PC> pc = new ArrayList<PC>();
		try {
			dt = DBUtils.listDienThoai_SoLuong(conn);
			lt = DBUtils.listLapTop_SoLuong(conn);
			tb = DBUtils.listTablet_SoLuong(conn);
			dh = DBUtils.listDongHo_SoLuong(conn);
			pk = DBUtils.listPhuKien_SoLuong(conn);
			pc = DBUtils.listPC_SoLuong(conn);
		} catch (Exception e) {
			// TODO: handle exception
		}
		request.setAttribute("tenAdmin", tenAdmin);
		request.setAttribute("maAD", maAD);
		request.setAttribute("listdienthoai", dt);
		request.setAttribute("listlaptop", lt);
		request.setAttribute("listtablet", tb);
		request.setAttribute("listdongho", dh);
		request.setAttribute("listphukien", pk);
		request.setAttribute("listpc", pc);
		request.setAttribute("phanquyen", phanquyen);
		RequestDispatcher dispatcher = request.getServletContext()
                .getRequestDispatcher("/WEB-INF/viewAdmin/SanPham.jsp");
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
