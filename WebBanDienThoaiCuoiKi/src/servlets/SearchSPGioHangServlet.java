package servlets;

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
 * Servlet implementation class SearchSPGioHangServlet
 */
@WebServlet(name ="SearchSPGioHang", urlPatterns = {"/SearchSPGioHang"})
public class SearchSPGioHangServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SearchSPGioHangServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Connection conn = MyUtils.getStoredConnection(request);
		int maSP = Integer.parseInt(request.getParameter("maSP"));
		String tenkhachhang = request.getParameter("tenkhachhang");
		String tenTK = request.getParameter("tenTK");
		String kiemtra = "gio hang";
		DienThoai dt = null;
		DongHo dh = null;
		LapTop lt =null;
		Tablet tb = null;
		PhuKien pk = null;
		PC pc = null;
		try {
			dt = DBUtils.findDienThoai(conn, maSP);
			lt = DBUtils.findLapTop(conn, maSP);
			tb =DBUtils.findTablet(conn, maSP);
			pk =DBUtils.findPhuKien(conn, maSP);
			dh =DBUtils.findDongHo(conn, maSP);
			pc =DBUtils.findPC(conn, maSP);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		if(dt != null)
		{
			request.setAttribute("kiemtra", kiemtra);
			request.setAttribute("dienthoai", dt);
			request.setAttribute("tenkhachhang", tenkhachhang);
			request.setAttribute("tenTK", tenTK);
			String soluong = request.getParameter("soluong");
			request.setAttribute("soluong", soluong);
			RequestDispatcher dispatcher = request.getServletContext().getRequestDispatcher("/WEB-INF/views/SanPhamDienThoai.jsp");
			dispatcher.forward(request, response);
		}
		else if(lt !=null)
		{
			request.setAttribute("kiemtra", kiemtra);
			request.setAttribute("laptop", lt);
			request.setAttribute("tenkhachhang", tenkhachhang);
			request.setAttribute("tenTK", tenTK);
			String soluong = request.getParameter("soluong");
			request.setAttribute("soluong", soluong);
			RequestDispatcher dispatcher = request.getServletContext().getRequestDispatcher("/WEB-INF/views/SanPhamLapTop.jsp");
			dispatcher.forward(request, response);
		}
		else if(tb != null)
		{
			request.setAttribute("kiemtra", kiemtra);
			request.setAttribute("tablet", tb);
			request.setAttribute("tenkhachhang", tenkhachhang);
			request.setAttribute("tenTK", tenTK);
			String soluong = request.getParameter("soluong");
			request.setAttribute("soluong", soluong);
			RequestDispatcher dispatcher = request.getServletContext().getRequestDispatcher("/WEB-INF/views/SanPhamTablet.jsp");
			dispatcher.forward(request, response);
		}
		else if(pk != null)
		{
			request.setAttribute("kiemtra", kiemtra);
			request.setAttribute("phukien", pk);
			request.setAttribute("tenkhachhang", tenkhachhang);
			request.setAttribute("tenTK", tenTK);
			String soluong = request.getParameter("soluong");
			request.setAttribute("soluong", soluong);
			RequestDispatcher dispatcher = request.getServletContext().getRequestDispatcher("/WEB-INF/views/SanPhamPhuKien.jsp");
			dispatcher.forward(request, response);
		}
		else if(dh != null)
		{
			request.setAttribute("kiemtra", kiemtra);
			request.setAttribute("dongho", dh);
			request.setAttribute("tenkhachhang", tenkhachhang);
			request.setAttribute("tenTK", tenTK);
			String soluong = request.getParameter("soluong");
			request.setAttribute("soluong", soluong);
			RequestDispatcher dispatcher = request.getServletContext().getRequestDispatcher("/WEB-INF/views/SanPhamDongHo.jsp");
			dispatcher.forward(request, response);
		}
		else
		{
			request.setAttribute("kiemtra", kiemtra);
			request.setAttribute("pc", pc);
			request.setAttribute("tenkhachhang", tenkhachhang);
			request.setAttribute("tenTK", tenTK);
			RequestDispatcher dispatcher = request.getServletContext().getRequestDispatcher("/WEB-INF/views/SanPhamPC.jsp");
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
