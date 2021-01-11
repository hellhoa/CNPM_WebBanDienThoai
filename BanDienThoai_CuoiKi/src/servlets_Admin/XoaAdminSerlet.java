package servlets_Admin;

import java.io.IOException;
import java.sql.Connection;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import utils.DBUtils;
import utils.MyUtils;

/**
 * Servlet implementation class XoaAdminSerlet
 */
@WebServlet(name ="xoaadmin", urlPatterns = {"/xoaadmin"})
public class XoaAdminSerlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public XoaAdminSerlet() {
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
		int maAdmin =Integer.parseInt(request.getParameter("maAdmin"));
		if(maAD == maAdmin)
		{
			String thongbao = "khong the xoa admin hien tai";
			request.setAttribute("thongbao", thongbao);
			request.setAttribute("tenAdmin", tenAdmin);
			request.setAttribute("maAD", maAD);
			RequestDispatcher dispatcher = request.getServletContext()
	                .getRequestDispatcher("/WEB-INF/viewAdmin/Admin.jsp");
	        dispatcher.forward(request, response);
		}
		else {
			try {
				DBUtils.deleteAdmin(conn, maAdmin);
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

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
