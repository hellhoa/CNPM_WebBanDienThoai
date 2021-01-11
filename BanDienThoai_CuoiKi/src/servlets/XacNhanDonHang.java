package servlets;

import java.io.IOException;
import java.sql.Connection;
import java.sql.Date;
import java.time.LocalDate;
import java.util.List;
import java.util.Random;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oracle.wls.shaded.org.apache.xml.utils.FastStringBuffer;

import beans.DonHang;
import beans.GioHang;
import beans.KhachHang;
import utils.DBUtils;
import utils.MyUtils;

/**
 * Servlet implementation class XacNhanDonHang
 */
@WebServlet(name ="XacNhanDonHang", urlPatterns = {"/XacNhanDonHang"})
public class XacNhanDonHang extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public XacNhanDonHang() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Connection conn = MyUtils.getStoredConnection(request);
		String tenTK = request.getParameter("tenTK");
		KhachHang kh =null;
		try {
			kh= DBUtils.timkiemkhachhang(conn, tenTK);
		} catch (Exception e) {
			// TODO: handle exception
		}
		List<GioHang> gh =null;
		try {
			gh= DBUtils.listGioHang(conn, kh.getMaKH());
		} catch (Exception e) {
			// TODO: handle exception
		}
		String tenSP = "";
		for(int i = 0; i < gh.size();i++)
		{
			int soluong = 0;
			try {
				soluong = DBUtils.LaySoLuong(conn, gh.get(i).getMaSP());
			} catch (Exception e) {
				// TODO: handle exception
			}
			if((soluong - gh.get(i).getSlmua()) <0 )
			{
				tenSP = gh.get(i).getTenSP();
				break;
			}
		}
		if(tenSP.equals("") == false)
		{
			List<GioHang> giohang = null;
			try {
				giohang = DBUtils.listGioHang(conn, kh.getMaKH());
			}catch (Exception e) {
				// TODO: handle exception
			}
			request.setAttribute("soluong", giohang.size());
			request.setAttribute("tenSP_HetHang", tenSP);
			request.setAttribute("listGioHang", giohang);
			request.setAttribute("tenkhachhang", kh.getTenkhachhang());
			request.setAttribute("tenTK", kh.getTenTK());
    		RequestDispatcher dispatcher = request.getServletContext()
        			.getRequestDispatcher("/WEB-INF/views/GioHang.jsp");
        	dispatcher.forward(request, response);
			
		}
		else {
			
			Random rd = new Random();
			int madonhang = rd.nextInt(1000000);
			long millis = System.currentTimeMillis();
			java.sql.Date ngaymua = new java.sql.Date(millis);
			for(int j=0;j<gh.size();j++)
			{
				int soluong = 0 ;
				DonHang dh = new DonHang(madonhang, gh.get(j).getMaSP(), gh.get(j).getTenSP(), gh.get(j).getDongia(), gh.get(j).getSlmua(),gh.get(j).getMaKH(),ngaymua);
				try {
					soluong = DBUtils.LaySoLuong(conn, gh.get(j).getMaSP());
					DBUtils.insertDonHang(conn, dh);
					DBUtils.deletegiohang(conn, gh.get(j));
					DBUtils.UpdateSoLuong(conn, gh.get(j).getMaSP(), soluong - gh.get(j).getSlmua());
				} catch (Exception e) {
					// TODO: handle exception
				}
			}
			List<GioHang> giohang = null;
			try {
				giohang = DBUtils.listGioHang(conn, kh.getMaKH());
			}catch (Exception e) {
				// TODO: handle exception
			}
			request.setAttribute("soluong", giohang.size());
			request.setAttribute("tenTK", tenTK);
			request.setAttribute("tenkhachhang", kh.getTenkhachhang());
			RequestDispatcher dispatcher = request.getServletContext().getRequestDispatcher("/WEB-INF/views/DatHangThanhCong.jsp");
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
