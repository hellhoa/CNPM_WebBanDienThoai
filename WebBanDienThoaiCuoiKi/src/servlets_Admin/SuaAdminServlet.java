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

import com.oracle.wls.shaded.org.apache.xalan.templates.ElemAttributeSet;

import beans.Admin;
import utils.DBUtils;
import utils.MyUtils;

/**
 * Servlet implementation class SuaAdminServlet
 */
@WebServlet(name ="suaadmin", urlPatterns = {"/suaadmin"})
public class SuaAdminServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SuaAdminServlet() {
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
		int maAdmin = Integer.parseInt(request.getParameter("maAdmin"));
		Admin admin = null;
		try {
			admin = DBUtils.findAdmin(conn, maAdmin);
		} catch (Exception e) {
			// TODO: handle exception
		}
		request.setAttribute("admin", admin);
		request.setAttribute("tenAdmin", tenAdmin);
		request.setAttribute("maAD", maAD);
		RequestDispatcher dispatcher = request.getServletContext()
                .getRequestDispatcher("/WEB-INF/viewAdmin/SuaAdmin.jsp");
        dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Connection conn = MyUtils.getStoredConnection(request);
		String tenAdmin=new String(request.getParameter("tenAdmin").getBytes("ISO-8859-1"),"UTF-8");
		int maAD = Integer.parseInt(request.getParameter("maAD"));
		int maadmin = Integer.parseInt(request.getParameter("maAdmin"));
		String tenTK =request.getParameter("tenTK");
		String matkhau = request.getParameter("matkhau");
		String tenAdminnew =new String( request.getParameter("tenAD").getBytes("ISO-8859-1"),"UTF-8");
		int tuoi = Integer.parseInt(request.getParameter("tuoi"));
		String phanquyen = request.getParameter("phanquyen");
		String phanquyenmoi = request.getParameter("dropdown");
		if(phanquyenmoi.equals("null"))
		{
			Admin ad = new Admin(maadmin, tenTK, matkhau, tenAdminnew, tuoi,phanquyen);
			try {
				DBUtils.chinhsuathongtinadmin(conn, ad);
			} catch (Exception e) {
				// TODO: handle exception
			}
			request.setAttribute("tenAdmin", tenAdmin);
			request.setAttribute("maAD", maAD);
			RequestDispatcher dispatcher = request.getServletContext()
	                .getRequestDispatcher("/WEB-INF/viewAdmin/Admin.jsp");
	        dispatcher.forward(request, response);
	
		}
		else
		{
			Admin ad = new Admin(maadmin, tenTK, matkhau, tenAdminnew, tuoi,phanquyenmoi);
			try {
				DBUtils.chinhsuathongtinadmin(conn, ad);
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

}
