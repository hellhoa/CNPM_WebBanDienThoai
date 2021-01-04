package servlets_Admin;

import java.io.IOException;
import java.sql.Connection;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.websocket.server.ServerEndpoint;

import beans.Admin;
import beans.KhachHang;
import utils.DBUtils;
import utils.MyUtils;

/**
 * Servlet implementation class DanhNhapAdmin
 */

@WebServlet(name ="admin", urlPatterns = {"/admin"})

public class DangNhapAdmin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	
    public DangNhapAdmin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		RequestDispatcher dispatcher = request.getServletContext().getRequestDispatcher("/WEB-INF/viewAdmin/dangnhapAdmin.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Connection conn = MyUtils.getStoredConnection(request);
        String tenTK = new String( request.getParameter("tenTK").getBytes("ISO-8859-1"),"UTF-8");
        String matkhau = new String( request.getParameter("matkhau").getBytes("ISO-8859-1"),"UTF-8");
        Admin admin = new Admin(tenTK, matkhau);
        Admin kiemtra = null;
        String errorString = null;
        Boolean thongbao = false;
        try {
			kiemtra = DBUtils.kiemtrataikhoanAdmin(conn, admin);
		} catch (Exception e) {
			// TODO: handle exception
		}
        if(kiemtra != null)
        {
        	request.setAttribute("tenAdmin", kiemtra.getTenAdmin());
        	request.setAttribute("maAD", kiemtra.getMaAD());
        	request.setAttribute("phanquyen", kiemtra.getPhanquyen());
        	RequestDispatcher dispatcher = request.getServletContext()
                    .getRequestDispatcher("/WEB-INF/viewAdmin/Admin.jsp");
            dispatcher.forward(request, response);
        }
        else {
        	thongbao = true;
            request.setAttribute("message", thongbao);
        	RequestDispatcher dispatcher = request.getServletContext()
                    .getRequestDispatcher("/WEB-INF/views/dangnhapAdmin.jsp");
            dispatcher.forward(request, response);
        }
	}

}
