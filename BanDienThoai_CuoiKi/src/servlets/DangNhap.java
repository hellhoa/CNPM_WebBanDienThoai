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

import beans.DienThoai;
import beans.DongHo;
import beans.GioHang;
import beans.KhachHang;
import beans.LapTop;
import beans.PhuKien;
import beans.Tablet;
import utils.DBUtils;
import utils.MyUtils;

/**
 * Servlet implementation class DangNhap
 */
@WebServlet(name ="DangNhap", urlPatterns = {"/DangNhap"})
public class DangNhap extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DangNhap() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		RequestDispatcher dispatcher = request.getServletContext().getRequestDispatcher("/WEB-INF/views/dangnhap.jsp");
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
        KhachHang kh = new KhachHang(tenTK, matkhau);
        KhachHang kiemtra = null;
        String errorString = null;
        Boolean thongbao = false;
        String tenkhachhang = null;
        List<DienThoai> listDienThoai = null;
		try {
			listDienThoai=DBUtils.listDienThoai(conn);
		}catch(SQLException e) {
			e.printStackTrace();
			errorString = e.getMessage();
		}
		//laptop
		String errorStringLT =null;
		List<LapTop> listLT = null;
		try {
			listLT=DBUtils.lisLapTop(conn);
		}catch(SQLException e) {
			e.printStackTrace();
			errorStringLT = e.getMessage();
		}
		//tablet
		String errorStringTB =null;
		List<Tablet> listtb = null;
		try {
			listtb=DBUtils.lisTablet(conn);
		}catch(SQLException e) {
			e.printStackTrace();
			errorStringTB = e.getMessage();
		}
		//phụ kiện
		String errorStringpk =null;
		List<PhuKien> listPK = null;
		try {
			listPK=DBUtils.listPhuKien(conn);
		}catch(SQLException e) {
			e.printStackTrace();
			errorStringpk = e.getMessage();
		}
		//dồng hồ
		String errorStringdh =null;
		List<DongHo> listDongHo = null;
		try {
			listDongHo=DBUtils.listDongHo(conn);
		}catch(SQLException e) {
			e.printStackTrace();
			errorStringdh = e.getMessage();
		}
		
        try {
            kiemtra = DBUtils.kiemtrataikhoan(conn, kh);
        } catch (SQLException e) {
            e.printStackTrace();
            errorString = e.getMessage();
            
        }
        KhachHang khachhang =null;
		try {
			khachhang = DBUtils.timkiemkhachhang(conn, kiemtra.getTenTK());
		} catch (Exception e) {
			// TODO: handle exception
		}
        List<GioHang> giohang = null;
		try {
			giohang = DBUtils.listGioHang(conn, khachhang.getMaKH());
		}catch (Exception e) {
			// TODO: handle exception
		}
        
        // LÆ°u thÃ´ng tin vÃ o request attribute trÆ°á»›c khi forward sang views.

        if (kiemtra != null) {
        	tenkhachhang = kiemtra.getTenkhachhang();
        	request.setAttribute("soluong", giohang.size());
        	request.setAttribute("DHList", listDongHo);
    		request.setAttribute("PKList", listPK);
    		request.setAttribute("TBList", listtb);
    		request.setAttribute("listLT", listLT);
    		request.setAttribute("listDienThoai", listDienThoai);
    		request.setAttribute("tenkhachhang", tenkhachhang);
    		request.setAttribute("tenTK", tenTK);
            RequestDispatcher dispatcher = request.getServletContext()
                    .getRequestDispatcher("/WEB-INF/views/homeView.jsp");
            dispatcher.forward(request, response);
        }
        else {
        	thongbao = true;
            request.setAttribute("message", thongbao);
        	RequestDispatcher dispatcher = request.getServletContext()
                    .getRequestDispatcher("/WEB-INF/views/dangnhap.jsp");
            dispatcher.forward(request, response);
        }
	}

}
