package servlets_Admin;

import java.io.IOException;
import java.sql.Connection;
import java.util.Random;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.Admin;
import utils.DBUtils;
import utils.MyUtils;

/**
 * Servlet implementation class ThemAdminServlet
 */
@WebServlet(name ="themadmin", urlPatterns = {"/themadmin"})
public class ThemAdminServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ThemAdminServlet() {
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
		request.setAttribute("tenAdmin", tenAdmin);
		request.setAttribute("maAD", maAD);
		RequestDispatcher dispatcher = request.getServletContext()
                .getRequestDispatcher("/WEB-INF/viewAdmin/ThemAdmin.jsp");
        dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Connection conn = MyUtils.getStoredConnection(request);
		String tenAdmin=request.getParameter("tenAdmin");
		int maAD = Integer.parseInt(request.getParameter("maAD"));
		String tenTK = request.getParameter("tenTK");
		String matkhau = request.getParameter("matkhau");
		String tenAdminnew =new String(request.getParameter("tenAD").getBytes("ISO-8859-1"),"UTF-8");
		int tuoi = Integer.parseInt(request.getParameter("tuoi"));
		String phanquyen = request.getParameter("dropdown");
		Random rd = new Random();
		int maadmin = rd.nextInt(1000000);
		Admin ad = new Admin(maadmin, tenTK, matkhau, tenAdminnew, tuoi,phanquyen);
		try {
			DBUtils.insertAdmin(conn, ad);
		} catch (Exception e) {
			// TODO: handle exception
		}
		request.setAttribute("tenAdmin", tenAdmin);
		request.setAttribute("maAD", maAD);
		RequestDispatcher dispatcher = request.getServletContext()
                .getRequestDispatcher("/WEB-INF/viewAdmin/Admin.jsp");
        dispatcher.forward(request, response);
		
	}

}
