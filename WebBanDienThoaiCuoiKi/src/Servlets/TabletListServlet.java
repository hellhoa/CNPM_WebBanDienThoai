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

import beans.PC;
import beans.Tablet;
import utils.DBUtils;
import utils.MyUtils;

/**
 * Servlet implementation class TabletListServlet
 */
@WebServlet(name ="TBList", urlPatterns = {"/TBList"})
public class TabletListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TabletListServlet() {
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
		String errorString =null;
		List<Tablet> listtb = null;
		try {
			listtb=DBUtils.lisTablet(conn);
		}catch(SQLException e) {
			e.printStackTrace();
			errorString = e.getMessage();
		}
		request.setAttribute("TBList", listtb);
		request.setAttribute("tenkhachhang", tenkhachhang);
		request.setAttribute("tenTK", tenTK);
		RequestDispatcher dispatcher = request.getServletContext().getRequestDispatcher("/WEB-INF/views/TabletListView.jsp");
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
