package servlets_Admin;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.util.Base64;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.BaiViet;
import utils.DBUtils;
import utils.MyUtils;

/**
 * Servlet implementation class ChinhSuaBaiVietServlet
 */
@WebServlet(name ="chinhsuabaiviet", urlPatterns = {"/chinhsuabaiviet"})
public class ChinhSuaBaiVietServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ChinhSuaBaiVietServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    private static String encodeFileToBase64Binary(File file){
        String encodedfile = null;
        try {
            FileInputStream fileInputStreamReader = new FileInputStream(file);
            byte[] bytes = new byte[(int)file.length()];
            fileInputStreamReader.read(bytes);
            encodedfile = new String(Base64.getEncoder().encode(bytes), "UTF-8");
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return encodedfile;
    }
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Connection conn = MyUtils.getStoredConnection(request);
		String tenAdmin=request.getParameter("tenAdmin");
		int maAD = Integer.parseInt(request.getParameter("maAD"));
		int masp = Integer.parseInt(request.getParameter("masp"));
		BaiViet bv = null;
		try {
			bv = DBUtils.findBaiViet(conn, masp);
		} catch (Exception e) {
			// TODO: handle exception
		}
		request.setAttribute("baiviet", bv);
		request.setAttribute("tenAdmin", tenAdmin);
		request.setAttribute("maAD", maAD);
		RequestDispatcher dispatcher = request.getServletContext()
                .getRequestDispatcher("/WEB-INF/viewAdmin/ChinhSuaBaiViet.jsp");
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
		int maBaiViet = Integer.parseInt(request.getParameter("masp"));
		BaiViet bv = null;
		try {
			bv = DBUtils.findBaiViet(conn, maBaiViet);
		} catch (Exception e) {
			// TODO: handle exception
		}
		String noidung1 = new String(request.getParameter("noidung1").getBytes("ISO-8859-1"),"UTF-8");
		String noidung2 = new String (request.getParameter("noidung2").getBytes("ISO-8859-1"),"UTF-8");
		String noidung3 = new String(request.getParameter("noidung3").getBytes("ISO-8859-1"),"UTF-8");
		String noidung4 =new String(request.getParameter("noidung4").getBytes("ISO-8859-1"),"UTF-8");
		String noidung5 =new String(request.getParameter("noidung5").getBytes("ISO-8859-1"),"UTF-8");
		String noidung6 =new String(request.getParameter("noidung6").getBytes("ISO-8859-1"),"UTF-8");
		String noidung7 =new String(request.getParameter("noidung7").getBytes("ISO-8859-1"),"UTF-8");
		String noidung8 =new String(request.getParameter("noidung8").getBytes("ISO-8859-1"),"UTF-8");
		String duongdan1 =request.getParameter("hinhanh1");
		String hinhanh1 = null;
		if(duongdan1 != "")
		{
			 File f =  new File(duongdan1);
             String encodstring1 = encodeFileToBase64Binary(f);
             hinhanh1 = encodstring1;
             try {
				DBUtils.updateBaiViet(conn, maBaiViet, noidung1, noidung2, noidung3, noidung4, noidung5, noidung6, noidung7, noidung8, hinhanh1, bv.getHinhanh2(), bv.getHinhanh3(), bv.getHinhanh4(), bv.getHinhanh5(), bv.getHinhanh6(), bv.getHinhanh7(), bv.getHinhanh8());
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		
		String duongdan2 =request.getParameter("hinhanh2");
		String hinhanh2 = null;
		if(duongdan2 != "")
		{
			try {
				bv = DBUtils.findBaiViet(conn, maBaiViet);
			} catch (Exception e) {
				// TODO: handle exception
			}
			 File f =  new File(duongdan2);
             String encodstring2 = encodeFileToBase64Binary(f);
             hinhanh2 = encodstring2;
             try {
				DBUtils.updateBaiViet(conn, maBaiViet, noidung1, noidung2, noidung3, noidung4, noidung5, noidung6, noidung7, noidung8,bv.getHinhanh1(), hinhanh2,bv.getHinhanh3(),bv.getHinhanh4(),bv.getHinhanh5(),bv.getHinhanh6(),bv.getHinhanh7(),bv.getHinhanh8());
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		String duongdan3 =request.getParameter("hinhanh3");
		String hinhanh3 = null;
		if(duongdan3 != "")
		{
			try {
				bv = DBUtils.findBaiViet(conn, maBaiViet);
			} catch (Exception e) {
				// TODO: handle exception
			}
			 File f =  new File(duongdan3);
             String encodstring3 = encodeFileToBase64Binary(f);
             hinhanh3 = encodstring3;
             try {
				DBUtils.updateBaiViet(conn, maBaiViet, noidung1, noidung2, noidung3, noidung4, noidung5, noidung6, noidung7, noidung8,bv.getHinhanh1(),bv.getHinhanh2(), hinhanh3,bv.getHinhanh4(),bv.getHinhanh5(),bv.getHinhanh6(),bv.getHinhanh7(),bv.getHinhanh8());
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		String duongdan4 =request.getParameter("hinhanh4");
		String hinhanh4 = null;
		if(duongdan4 != "")
		{
			try {
				bv = DBUtils.findBaiViet(conn, maBaiViet);
			} catch (Exception e) {
				// TODO: handle exception
			}
			 File f =  new File(duongdan4);
             String encodstring4 = encodeFileToBase64Binary(f);
             hinhanh4 = encodstring4;
             try {
				DBUtils.updateBaiViet(conn, maBaiViet, noidung1, noidung2, noidung3, noidung4, noidung5, noidung6, noidung7, noidung8,bv.getHinhanh1(),bv.getHinhanh2(),bv.getHinhanh3(), hinhanh4,bv.getHinhanh5(),bv.getHinhanh6(),bv.getHinhanh7(),bv.getHinhanh8());
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		String duongdan5 =request.getParameter("hinhanh5");
		String hinhanh5 = null;
		if(duongdan5 != "")
		{
			try {
				bv = DBUtils.findBaiViet(conn, maBaiViet);
			} catch (Exception e) {
				// TODO: handle exception
			}
			 File f =  new File(duongdan5);
             String encodstring5 = encodeFileToBase64Binary(f);
             hinhanh5 = encodstring5;
             try {
				
            	 DBUtils.updateBaiViet(conn, maBaiViet, noidung1, noidung2, noidung3, noidung4, noidung5, noidung6, noidung7, noidung8,bv.getHinhanh1(),bv.getHinhanh2(),bv.getHinhanh3(),bv.getHinhanh4(), hinhanh5,bv.getHinhanh6(),bv.getHinhanh7(),bv.getHinhanh8());
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		String duongdan6 = request.getParameter("hinhanh6");
		String hinhanh6 = null;
		if(duongdan6 != "")
		{
			try {
				bv = DBUtils.findBaiViet(conn, maBaiViet);
			} catch (Exception e) {
				// TODO: handle exception
			}
			 File f =  new File(duongdan6);
             String encodstring6 = encodeFileToBase64Binary(f);
             hinhanh6 = encodstring6;
             try {
				DBUtils.updateBaiViet(conn, maBaiViet, noidung1, noidung2, noidung3, noidung4, noidung5, noidung6, noidung7, noidung8,bv.getHinhanh1(),bv.getHinhanh2(),bv.getHinhanh3(),bv.getHinhanh4(),bv.getHinhanh5(), hinhanh6,bv.getHinhanh7(),bv.getHinhanh8());
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		String duongdan7 =request.getParameter("hinhanh7");
		String hinhanh7 = null;
		if(duongdan7 != "")
		{
			try {
				bv = DBUtils.findBaiViet(conn, maBaiViet);
			} catch (Exception e) {
				// TODO: handle exception
			}
			 File f =  new File(duongdan7);
             String encodstring7 = encodeFileToBase64Binary(f);
             hinhanh7 = encodstring7;
             try {
				DBUtils.updateBaiViet(conn, maBaiViet, noidung1, noidung2, noidung3, noidung4, noidung5, noidung6, noidung7, noidung8,bv.getHinhanh1(),bv.getHinhanh2(),bv.getHinhanh3(),bv.getHinhanh4(),bv.getHinhanh5(),bv.getHinhanh6(), hinhanh7,bv.getHinhanh8());
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		String duongdan8 =request.getParameter("hinhanh8");
		String hinhanh8 = null;
		if(duongdan8 != "")
		{
			try {
				bv = DBUtils.findBaiViet(conn, maBaiViet);
			} catch (Exception e) {
				// TODO: handle exception
			}
			 File f =  new File(duongdan8);
             String encodstring8 = encodeFileToBase64Binary(f);
             hinhanh8 = encodstring8;
             try {
				DBUtils.updateBaiViet(conn, maBaiViet, noidung1, noidung2, noidung3, noidung4, noidung5, noidung6, noidung7, noidung8,bv.getHinhanh1(),bv.getHinhanh2(),bv.getHinhanh3(),bv.getHinhanh4(),bv.getHinhanh5(),bv.getHinhanh6(),bv.getHinhanh7(), hinhanh8);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		if(duongdan1 == "" && duongdan2 == "" && duongdan3 == "" && duongdan4 == "" && duongdan5 == "" && duongdan6 == "" && duongdan7 == "" && duongdan8 == "")
		{
			try {
				bv = DBUtils.findBaiViet(conn, maBaiViet);
			} catch (Exception e) {
				// TODO: handle exception
			}
			try {
				DBUtils.updateBaiViet(conn, maBaiViet, noidung1, noidung2, noidung3, noidung4, noidung5, noidung6, noidung7, noidung8,bv.getHinhanh1(),bv.getHinhanh2(),bv.getHinhanh3(),bv.getHinhanh4(),bv.getHinhanh5(),bv.getHinhanh6(),bv.getHinhanh7(),bv.getHinhanh8());
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		//file
		request.setAttribute("tenAdmin", tenAdmin);
		request.setAttribute("maAD", maAD);
		RequestDispatcher dispatcher = request.getServletContext()
                .getRequestDispatcher("/WEB-INF/viewAdmin/Admin.jsp");
        dispatcher.forward(request, response);
	}

}
