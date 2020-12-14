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

import com.oracle.wls.shaded.org.apache.xpath.operations.And;

import beans.DienThoai;
import beans.DongHo;
import beans.LapTop;
import beans.PC;
import beans.PhuKien;
import beans.Tablet;
import utils.DBUtils;
import utils.MyUtils;

/**
 * Servlet implementation class SearchServlet
 */
@WebServlet(name ="search", urlPatterns = {"/search"})
public class SearchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SearchServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Connection conn = MyUtils.getStoredConnection(request);
		 
        String search= (String)request.getParameter("search");
        String tenkhachhang = request.getParameter("tenkhachhang");
        String tenTK = request.getParameter("tenTK");
        List<DienThoai> listDienThoai = null;
        List<DongHo> listDongHo =null;
        List<LapTop> listLapTop = null;
        List<PC> listPC = null;
        List<PhuKien> listPhuKien = null;
        List<Tablet> listTablet = null;
        
        String errorString = null;
 
        try {
            listDienThoai = DBUtils.findlistDienThoai(conn, search);
            listDongHo = DBUtils.findlistDongHo(conn, search);
            listLapTop = DBUtils.findlistLapTop(conn, search);
            listPC = DBUtils.findlistPC(conn, search);
            listPhuKien = DBUtils.findlistPhuKien(conn, search);
            listTablet = DBUtils.findlistTablet(conn, search);
        } catch (SQLException e) {
            e.printStackTrace();
            errorString = e.getMessage();
        }
        request.setAttribute("listdienthoai", listDienThoai);
        request.setAttribute("listDongHo", listDongHo);
        request.setAttribute("listLapTop", listLapTop);
        request.setAttribute("listPC", listPC);
        request.setAttribute("listPhuKien", listPhuKien);
        request.setAttribute("listTablet", listTablet);
        request.setAttribute("tenkhachhang", tenkhachhang);
        request.setAttribute("tenTK", tenTK);
 
        if(listDienThoai == null && listDongHo ==null && listLapTop ==null && listPC == null && listPhuKien ==null && listTablet == null )
        {
        	RequestDispatcher dispatcher = request.getServletContext()
               	.getRequestDispatcher("/WEB-INF/views/NoFindSearch.jsp");
        	dispatcher.forward(request, response);
        }
        else {
        	RequestDispatcher dispatcher = request.getServletContext()
                	.getRequestDispatcher("/WEB-INF/views/Search.jsp");
        	dispatcher.forward(request, response);
		}
	}

}
