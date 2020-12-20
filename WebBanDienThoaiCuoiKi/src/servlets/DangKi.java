package servlets;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.KhachHang;
import utils.DBUtils;
import utils.MyUtils;

/**
 * Servlet implementation class DangKi
 */
@WebServlet(name ="DangKi", urlPatterns = {"/DangKi"})
public class DangKi extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DangKi() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		RequestDispatcher dispatcher = request.getServletContext().getRequestDispatcher("/WEB-INF/views/dangki.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Connection conn = MyUtils.getStoredConnection(request);
		 
        String tenkhachhang= new String(request.getParameter("tenkhachhang").getBytes("ISO-8859-1"),"UTF-8");
        String tenTK = new String( request.getParameter("tenTK").getBytes("ISO-8859-1"),"UTF-8");
        String matkhau = new String( request.getParameter("matkhau").getBytes("ISO-8859-1"),"UTF-8");
        String diachigiaohang = new String( request.getParameter("diachigiaohang").getBytes("ISO-8859-1"),"UTF-8");
        KhachHang kh = new KhachHang(tenkhachhang,tenTK, matkhau, diachigiaohang);
 
        String errorString = null;
        String thongbao = null;
        try {
            DBUtils.insertKhachHang(conn, kh);
        } catch (SQLException e) {
            e.printStackTrace();
            errorString = e.getMessage();
            thongbao = "Tạo tài khoản không thành công";
        }
        // LÆ°u thÃ´ng tin vÃ o request attribute trÆ°á»›c khi forward sang views.
        request.setAttribute("errorString", errorString);
        request.setAttribute("message", thongbao);
        if (errorString != null) {
            RequestDispatcher dispatcher = request.getServletContext()
                    .getRequestDispatcher("/WEB-INF/views/dangki.jsp");
            dispatcher.forward(request, response);
        }
        // Náº¿u má»�i thá»© tá»‘t Ä‘áº¹p.
        // Redirect sang trang danh sÃ¡ch sáº£n pháº©m.
        else {
            response.sendRedirect(request.getContextPath() + "/DangNhap");
        }
	}

}
