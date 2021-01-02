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

import beans.LapTop;
import beans.PC;
import utils.DBUtils;
import utils.MyUtils;

/**
 * Servlet implementation class LapTopListServlet
 */
@WebServlet(name ="LTList", urlPatterns = {"/LTList"})
public class LapTopListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LapTopListServlet() {
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
		String soluong = request.getParameter("soluong");
		String errorString =null;
		List<LapTop> listLT = null;
		try {
			listLT=DBUtils.lisLapTop(conn);
		}catch(SQLException e) {
			e.printStackTrace();
			errorString = e.getMessage();
		}
		request.setAttribute("listLT", listLT);
		request.setAttribute("tenkhachhang", tenkhachhang);
		request.setAttribute("tenTK", tenTK);
		request.setAttribute("soluong", soluong);
		RequestDispatcher dispatcher = request.getServletContext().getRequestDispatcher("/WEB-INF/views/LapTopListView.jsp");
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
