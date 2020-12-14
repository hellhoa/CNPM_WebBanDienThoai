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

import beans.BaiViet;
import beans.DongHo;
import beans.PC;
import utils.DBUtils;
import utils.MyUtils;

/**
 * Servlet implementation class PCServlet
 */
@WebServlet(name ="PC", urlPatterns = {"/PC"})
public class PCServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PCServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Connection conn = MyUtils.getStoredConnection(request);
		String idStr = (String) request.getParameter("maPC");
		String tenkhachhang = (String)request.getParameter("tenkhachhang");
		String tenTK = (String)request.getParameter("tenTK");
        int id = 0;
        try {
            id = Integer.parseInt(idStr);
        } catch (Exception e) {
        }
        PC pc = null;
        BaiViet bv = null;
 
        String errorString = null;
 
        try {
            pc = DBUtils.findPC(conn, id);
            bv = DBUtils.findBaiViet(conn, id);
        } catch (SQLException e) {
            e.printStackTrace();
            errorString = e.getMessage();
        }
        request.setAttribute("pc", pc);
        request.setAttribute("baiviet", bv);
        request.setAttribute("tenkhachhang", tenkhachhang);
        request.setAttribute("tenTK", tenTK);
        RequestDispatcher dispatcher = request.getServletContext().getRequestDispatcher("/WEB-INF/views/SanPhamPC.jsp");
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
