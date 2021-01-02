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
import beans.KhachHang;
import beans.LapTop;
import beans.PC;
import beans.PhuKien;
import beans.Tablet;
import beans.GioHang;
import utils.DBUtils;
import utils.MyUtils;

/**
 * Servlet implementation class GioHang
 */
@WebServlet(name ="GioHang", urlPatterns = {"/GioHang"})
public class GioHangServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GioHangServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Connection conn = MyUtils.getStoredConnection(request);
		String tenTK = (String)request.getParameter("tenTK");
		String soluong = request.getParameter("soluong");
		String canhbao =null;
		String errorString = null;
		//truyền lại data cho trang home
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
		if(tenTK == "")
		{
			canhbao = "chưa đăng nhập";
			request.setAttribute("DHList", listDongHo);
    		request.setAttribute("PKList", listPK);
    		request.setAttribute("TBList", listtb);
    		request.setAttribute("listLT", listLT);
    		request.setAttribute("listDienThoai", listDienThoai);
    		request.setAttribute("canhbao", canhbao);
    		RequestDispatcher dispatcher = request.getServletContext()
        			.getRequestDispatcher("/WEB-INF/views/homeView.jsp");
        	dispatcher.forward(request, response);
		}
		else {
			KhachHang kh =null;
			try {
				kh = DBUtils.timkiemkhachhang(conn, tenTK);
			} catch (Exception e) {
				// TODO: handle exception
			}
			List<GioHang> giohang = null;
			try {
				giohang = DBUtils.listGioHang(conn, kh.getMaKH());
			}catch (Exception e) {
				// TODO: handle exception
			}
			request.setAttribute("soluong", soluong);
			request.setAttribute("listGioHang", giohang);
			request.setAttribute("tenkhachhang", kh.getTenkhachhang());
			request.setAttribute("tenTK", kh.getTenTK());
    		RequestDispatcher dispatcher = request.getServletContext()
        			.getRequestDispatcher("/WEB-INF/views/GioHang.jsp");
        	dispatcher.forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Connection conn = MyUtils.getStoredConnection(request);
		String tenTK = (String)request.getParameter("tenTK");
		String maDTStr = (String)request.getParameter("maDT");
		String maDHStr =(String)request.getParameter("maDH");
		String maLTStr = (String)request.getParameter("maLT");
		String maPCStr = (String)request.getParameter("maPC");
		String maPKStr = (String)request.getParameter("maPK");
		String maTBStr = (String)request.getParameter("maTB");
		String soluongString = (String)request.getParameter("soluong");
		String errorString = null;
		//truyền lại data cho trang home
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
		//thêm giỏ hàng
        if(maDTStr != null)
        {
        	int maDT = Integer.parseInt(maDTStr);
        	int soluong = Integer.parseInt(soluongString);
        	DienThoai dt = null;
        	KhachHang kh =null;
        	String thongbao = null;
        	String errorStringa = null;
        	try {
        		dt = DBUtils.findDienThoai(conn, maDT);
        		kh = DBUtils.timkiemkhachhang(conn, tenTK);
        	} catch (SQLException e) {
        		e.printStackTrace();
        		errorStringa = e.getMessage();
        	}
        	GioHang gh = new GioHang(dt.getMaDT(), kh.getMaKH(), dt.getTen(), dt.getDongia(), soluong);
        	GioHang gioHang = null;
        	try {
				gioHang=DBUtils.kiemtragiohang(conn, gh);
			} catch (Exception e) {
				// TODO: handle exception
			}
        	if(gioHang == null)
        	{
        		try {
        			DBUtils.insertGioHang(conn, gh);
        			thongbao = "thêm thành công";
        		}
        		catch(SQLException e) {
        		}
        		KhachHang khachhang =null;
        		try {
        			khachhang = DBUtils.timkiemkhachhang(conn, tenTK);
        		} catch (Exception e) {
        			// TODO: handle exception
        		}
                List<GioHang> giohang = null;
        		try {
        			giohang = DBUtils.listGioHang(conn, khachhang.getMaKH());
        		}catch (Exception e) {
        			// TODO: handle exception
        		}
        		request.setAttribute("soluong", giohang.size());
        		request.setAttribute("DHList", listDongHo);
        		request.setAttribute("PKList", listPK);
        		request.setAttribute("TBList", listtb);
        		request.setAttribute("listLT", listLT);
        		request.setAttribute("listDienThoai", listDienThoai);
        		request.setAttribute("tenkhachhang", kh.getTenkhachhang());
        		request.setAttribute("tenTK", kh.getTenTK());
        		request.setAttribute("message", thongbao);
                	RequestDispatcher dispatcher = request.getServletContext()
                			.getRequestDispatcher("/WEB-INF/views/homeView.jsp");
                	dispatcher.forward(request, response);
        	}
        	else {
        		int soluongnew = soluong + gioHang.getSlmua();
				try {
					DBUtils.updategiohang(conn, soluongnew, gioHang);	
				}catch (Exception e) {
					// TODO: handle exception
				}
				KhachHang khachhang =null;
				try {
					khachhang = DBUtils.timkiemkhachhang(conn, tenTK);
				} catch (Exception e) {
					// TODO: handle exception
				}
		        List<GioHang> giohang = null;
				try {
					giohang = DBUtils.listGioHang(conn, khachhang.getMaKH());
				}catch (Exception e) {
					// TODO: handle exception
				}
				request.setAttribute("soluong", giohang.size());
				request.setAttribute("DHList", listDongHo);
	    		request.setAttribute("PKList", listPK);
	    		request.setAttribute("TBList", listtb);
	    		request.setAttribute("listLT", listLT);
	    		request.setAttribute("listDienThoai", listDienThoai);
				request.setAttribute("tenkhachhang", kh.getTenkhachhang());
        		request.setAttribute("tenTK", kh.getTenTK());
        		request.setAttribute("message", thongbao);
                	RequestDispatcher dispatcher = request.getServletContext()
                			.getRequestDispatcher("/WEB-INF/views/homeView.jsp");
                	dispatcher.forward(request, response);
			}
        	
        	
        }
        if(maDHStr != null)
        {
        	int maDH = Integer.parseInt(maDHStr);
        	int soluong = Integer.parseInt(soluongString);
        	DongHo dh = null;
        	KhachHang kh =null;
        	String thongbao = null;
        	String errorStringa = null;
        	try {
        		dh = DBUtils.findDongHo(conn, maDH);
        		kh = DBUtils.timkiemkhachhang(conn, tenTK);
        	} catch (SQLException e) {
        		e.printStackTrace();
        		errorString = e.getMessage();
        	}
        	GioHang gh = new GioHang(dh.getMaDH(), kh.getMaKH(), dh.getTen(), dh.getDongia(), soluong);
        	GioHang gioHang = null;
        	try {
				gioHang=DBUtils.kiemtragiohang(conn, gh);
			} catch (Exception e) {
				// TODO: handle exception
			}
        	if(gioHang == null)
        	{
        		try {
        			DBUtils.insertGioHang(conn, gh);
        			thongbao = "thêm thành công";
        		}
        		catch(SQLException e) {
        		}
        		KhachHang khachhang =null;
        		try {
        			khachhang = DBUtils.timkiemkhachhang(conn, tenTK);
        		} catch (Exception e) {
        			// TODO: handle exception
        		}
                List<GioHang> giohang = null;
        		try {
        			giohang = DBUtils.listGioHang(conn, khachhang.getMaKH());
        		}catch (Exception e) {
        			// TODO: handle exception
        		}
        		request.setAttribute("soluong", giohang.size());
        		request.setAttribute("DHList", listDongHo);
        		request.setAttribute("PKList", listPK);
        		request.setAttribute("TBList", listtb);
        		request.setAttribute("listLT", listLT);
        		request.setAttribute("listDienThoai", listDienThoai);
        		request.setAttribute("tenkhachhang", kh.getTenkhachhang());
        		request.setAttribute("tenTK", kh.getTenTK());
        		request.setAttribute("message", thongbao);
                	RequestDispatcher dispatcher = request.getServletContext()
                			.getRequestDispatcher("/WEB-INF/views/homeView.jsp");
                	dispatcher.forward(request, response);
        	}
        	else {
        		int soluongnew = soluong + gioHang.getSlmua();
				try {
					DBUtils.updategiohang(conn, soluongnew, gioHang);	
				}catch (Exception e) {
					// TODO: handle exception
				}
				KhachHang khachhang =null;
        		try {
        			khachhang = DBUtils.timkiemkhachhang(conn, tenTK);
        		} catch (Exception e) {
        			// TODO: handle exception
        		}
                List<GioHang> giohang = null;
        		try {
        			giohang = DBUtils.listGioHang(conn, khachhang.getMaKH());
        		}catch (Exception e) {
        			// TODO: handle exception
        		}
        		request.setAttribute("soluong", giohang.size());
				request.setAttribute("DHList", listDongHo);
	    		request.setAttribute("PKList", listPK);
	    		request.setAttribute("TBList", listtb);
	    		request.setAttribute("listLT", listLT);
	    		request.setAttribute("listDienThoai", listDienThoai);
				request.setAttribute("tenkhachhang", kh.getTenkhachhang());
        		request.setAttribute("tenTK", kh.getTenTK());
        		request.setAttribute("message", thongbao);
                	RequestDispatcher dispatcher = request.getServletContext()
                			.getRequestDispatcher("/WEB-INF/views/homeView.jsp");
                	dispatcher.forward(request, response);
			}
        	
        	
        }
        if(maLTStr != null)
        {
        	int maLT = Integer.parseInt(maLTStr);
        	int soluong = Integer.parseInt(soluongString);
        	LapTop lt =null;
        	KhachHang kh =null;
        	String thongbao = null;
        	String errorStringa = null;
        	try {
        		lt = DBUtils.findLapTop(conn, maLT);
        		kh = DBUtils.timkiemkhachhang(conn, tenTK);
        	} catch (SQLException e) {
        		e.printStackTrace();
        		errorString = e.getMessage();
        	}
        	GioHang gh = new GioHang(lt.getMaLT(), kh.getMaKH(),lt.getTen(), lt.getDongia(), soluong);
        	GioHang gioHang = null;
        	try {
				gioHang=DBUtils.kiemtragiohang(conn, gh);
			} catch (Exception e) {
				// TODO: handle exception
			}
        	if(gioHang == null)
        	{
        		try {
        			DBUtils.insertGioHang(conn, gh);
        			thongbao = "thêm thành công";
        		}
        		catch(SQLException e) {
        		}
        		KhachHang khachhang =null;
        		try {
        			khachhang = DBUtils.timkiemkhachhang(conn, tenTK);
        		} catch (Exception e) {
        			// TODO: handle exception
        		}
                List<GioHang> giohang = null;
        		try {
        			giohang = DBUtils.listGioHang(conn, khachhang.getMaKH());
        		}catch (Exception e) {
        			// TODO: handle exception
        		}
        		request.setAttribute("soluong", giohang.size());
        		request.setAttribute("DHList", listDongHo);
        		request.setAttribute("PKList", listPK);
        		request.setAttribute("TBList", listtb);
        		request.setAttribute("listLT", listLT);
        		request.setAttribute("listDienThoai", listDienThoai);
        		request.setAttribute("tenkhachhang", kh.getTenkhachhang());
        		request.setAttribute("tenTK", kh.getTenTK());
        		request.setAttribute("message", thongbao);
                	RequestDispatcher dispatcher = request.getServletContext()
                			.getRequestDispatcher("/WEB-INF/views/homeView.jsp");
                	dispatcher.forward(request, response);
        	}
        	else {
        		int soluongnew = soluong + gioHang.getSlmua();
				try {
					DBUtils.updategiohang(conn, soluongnew, gioHang);	
				}catch (Exception e) {
					// TODO: handle exception
				}
				KhachHang khachhang =null;
        		try {
        			khachhang = DBUtils.timkiemkhachhang(conn, tenTK);
        		} catch (Exception e) {
        			// TODO: handle exception
        		}
                List<GioHang> giohang = null;
        		try {
        			giohang = DBUtils.listGioHang(conn, khachhang.getMaKH());
        		}catch (Exception e) {
        			// TODO: handle exception
        		}
        		request.setAttribute("soluong", giohang.size());
				request.setAttribute("DHList", listDongHo);
	    		request.setAttribute("PKList", listPK);
	    		request.setAttribute("TBList", listtb);
	    		request.setAttribute("listLT", listLT);
	    		request.setAttribute("listDienThoai", listDienThoai);
				request.setAttribute("tenkhachhang", kh.getTenkhachhang());
        		request.setAttribute("tenTK", kh.getTenTK());
        		request.setAttribute("message", thongbao);
                	RequestDispatcher dispatcher = request.getServletContext()
                			.getRequestDispatcher("/WEB-INF/views/homeView.jsp");
                	dispatcher.forward(request, response);
			}
        	
        	
        }
        if(maPCStr != null)
        {
        	int maPC = Integer.parseInt(maPCStr);
        	int soluong = Integer.parseInt(soluongString);
        	PC pc = null;
        	KhachHang kh =null;
        	String thongbao = null;
        	String errorStringa = null;
        	try {
        		pc = DBUtils.findPC(conn, maPC);
        		kh = DBUtils.timkiemkhachhang(conn, tenTK);
        	} catch (SQLException e) {
        		e.printStackTrace();
        		errorString = e.getMessage();
        	}
        	GioHang gh = new GioHang(pc.getMaPC(), kh.getMaKH(),pc.getTen(), pc.getDongia(), soluong);
        	GioHang gioHang = null;
        	try {
				gioHang=DBUtils.kiemtragiohang(conn, gh);
			} catch (Exception e) {
				// TODO: handle exception
			}
        	if(gioHang == null)
        	{
        		try {
        			DBUtils.insertGioHang(conn, gh);
        			thongbao = "thêm thành công";
        		}
        		catch(SQLException e) {
        		}
        		KhachHang khachhang =null;
        		try {
        			khachhang = DBUtils.timkiemkhachhang(conn, tenTK);
        		} catch (Exception e) {
        			// TODO: handle exception
        		}
                List<GioHang> giohang = null;
        		try {
        			giohang = DBUtils.listGioHang(conn, khachhang.getMaKH());
        		}catch (Exception e) {
        			// TODO: handle exception
        		}
        		request.setAttribute("soluong", giohang.size());
        		request.setAttribute("DHList", listDongHo);
        		request.setAttribute("PKList", listPK);
        		request.setAttribute("TBList", listtb);
        		request.setAttribute("listLT", listLT);
        		request.setAttribute("listDienThoai", listDienThoai);
        		request.setAttribute("tenkhachhang", kh.getTenkhachhang());
        		request.setAttribute("tenTK", kh.getTenTK());
        		request.setAttribute("message", thongbao);
                	RequestDispatcher dispatcher = request.getServletContext()
                			.getRequestDispatcher("/WEB-INF/views/homeView.jsp");
                	dispatcher.forward(request, response);
        	}
        	else {
        		int soluongnew = soluong + gioHang.getSlmua();
				try {
					DBUtils.updategiohang(conn, soluongnew, gioHang);	
				}catch (Exception e) {
					// TODO: handle exception
				}
				KhachHang khachhang =null;
        		try {
        			khachhang = DBUtils.timkiemkhachhang(conn, tenTK);
        		} catch (Exception e) {
        			// TODO: handle exception
        		}
                List<GioHang> giohang = null;
        		try {
        			giohang = DBUtils.listGioHang(conn, khachhang.getMaKH());
        		}catch (Exception e) {
        			// TODO: handle exception
        		}
        		request.setAttribute("soluong", giohang.size());
				request.setAttribute("DHList", listDongHo);
	    		request.setAttribute("PKList", listPK);
	    		request.setAttribute("TBList", listtb);
	    		request.setAttribute("listLT", listLT);
	    		request.setAttribute("listDienThoai", listDienThoai);
				request.setAttribute("tenkhachhang", kh.getTenkhachhang());
        		request.setAttribute("tenTK", kh.getTenTK());
        		request.setAttribute("message", thongbao);
                	RequestDispatcher dispatcher = request.getServletContext()
                			.getRequestDispatcher("/WEB-INF/views/homeView.jsp");
                	dispatcher.forward(request, response);
			}
        	
        	
        }
        if(maPKStr != null)
        {
        	int maPK = Integer.parseInt(maPKStr);
        	int soluong = Integer.parseInt(soluongString);
        	PhuKien pk = null;
        	KhachHang kh =null;
        	String thongbao = null;
        	String errorStringa = null;
        	try {
        		pk = DBUtils.findPhuKien(conn, maPK);
        		kh = DBUtils.timkiemkhachhang(conn, tenTK);
        	} catch (SQLException e) {
        		e.printStackTrace();
        		errorString = e.getMessage();
        	}
        	GioHang gh = new GioHang(pk.getMaPK(), kh.getMaKH(),pk.getTen(), pk.getDongia(), soluong);
        	GioHang gioHang = null;
        	try {
				gioHang=DBUtils.kiemtragiohang(conn, gh);
			} catch (Exception e) {
				// TODO: handle exception
			}
        	if(gioHang == null)
        	{
        		try {
        			DBUtils.insertGioHang(conn, gh);
        			thongbao = "thêm thành công";
        		}
        		catch(SQLException e) {
        		}
        		KhachHang khachhang =null;
        		try {
        			khachhang = DBUtils.timkiemkhachhang(conn, tenTK);
        		} catch (Exception e) {
        			// TODO: handle exception
        		}
                List<GioHang> giohang = null;
        		try {
        			giohang = DBUtils.listGioHang(conn, khachhang.getMaKH());
        		}catch (Exception e) {
        			// TODO: handle exception
        		}
        		request.setAttribute("soluong", giohang.size());
        		request.setAttribute("DHList", listDongHo);
        		request.setAttribute("PKList", listPK);
        		request.setAttribute("TBList", listtb);
        		request.setAttribute("listLT", listLT);
        		request.setAttribute("listDienThoai", listDienThoai);
        		request.setAttribute("tenkhachhang", kh.getTenkhachhang());
        		request.setAttribute("tenTK", kh.getTenTK());
        		request.setAttribute("message", thongbao);
                	RequestDispatcher dispatcher = request.getServletContext()
                			.getRequestDispatcher("/WEB-INF/views/homeView.jsp");
                	dispatcher.forward(request, response);
        	}
        	else {
        		int soluongnew = soluong + gioHang.getSlmua();
				try {
					DBUtils.updategiohang(conn, soluongnew, gioHang);	
				}catch (Exception e) {
					// TODO: handle exception
				}
				KhachHang khachhang =null;
        		try {
        			khachhang = DBUtils.timkiemkhachhang(conn, tenTK);
        		} catch (Exception e) {
        			// TODO: handle exception
        		}
                List<GioHang> giohang = null;
        		try {
        			giohang = DBUtils.listGioHang(conn, khachhang.getMaKH());
        		}catch (Exception e) {
        			// TODO: handle exception
        		}
        		request.setAttribute("soluong", giohang.size());
				request.setAttribute("DHList", listDongHo);
	    		request.setAttribute("PKList", listPK);
	    		request.setAttribute("TBList", listtb);
	    		request.setAttribute("listLT", listLT);
	    		request.setAttribute("listDienThoai", listDienThoai);
				request.setAttribute("tenkhachhang", kh.getTenkhachhang());
        		request.setAttribute("tenTK", kh.getTenTK());
        		request.setAttribute("message", thongbao);
                	RequestDispatcher dispatcher = request.getServletContext()
                			.getRequestDispatcher("/WEB-INF/views/homeView.jsp");
                	dispatcher.forward(request, response);
			}
        	
        	
        }
        if(maTBStr != null)
        {
        	int maTB = Integer.parseInt(maTBStr);
        	int soluong = Integer.parseInt(soluongString);
        	Tablet tb = null;
        	KhachHang kh =null;
        	String thongbao = null;
        	String errorStringa = null;
        	try {
        		tb = DBUtils.findTablet(conn, maTB);
        		kh = DBUtils.timkiemkhachhang(conn, tenTK);
        	} catch (SQLException e) {
        		e.printStackTrace();
        		errorString = e.getMessage();
        	}
        	GioHang gh = new GioHang(tb.getMaTB(), kh.getMaKH(),tb.getTen(), tb.getDongia(), soluong);
        	GioHang gioHang = null;
        	try {
				gioHang=DBUtils.kiemtragiohang(conn, gh);
			} catch (Exception e) {
				// TODO: handle exception
			}
        	if(gioHang == null)
        	{
        		try {
        			DBUtils.insertGioHang(conn, gh);
        			thongbao = "thêm thành công";
        		}
        		catch(SQLException e) {
        		}
        		KhachHang khachhang =null;
        		try {
        			khachhang = DBUtils.timkiemkhachhang(conn, tenTK);
        		} catch (Exception e) {
        			// TODO: handle exception
        		}
                List<GioHang> giohang = null;
        		try {
        			giohang = DBUtils.listGioHang(conn, khachhang.getMaKH());
        		}catch (Exception e) {
        			// TODO: handle exception
        		}
        		request.setAttribute("soluong", giohang.size());
        		request.setAttribute("DHList", listDongHo);
        		request.setAttribute("PKList", listPK);
        		request.setAttribute("TBList", listtb);
        		request.setAttribute("listLT", listLT);
        		request.setAttribute("listDienThoai", listDienThoai);
        		request.setAttribute("tenkhachhang", kh.getTenkhachhang());
        		request.setAttribute("tenTK", kh.getTenTK());
        		request.setAttribute("message", thongbao);
                	RequestDispatcher dispatcher = request.getServletContext()
                			.getRequestDispatcher("/WEB-INF/views/homeView.jsp");
                	dispatcher.forward(request, response);
        	}
        	else {
        		int soluongnew = soluong + gioHang.getSlmua();
				try {
					DBUtils.updategiohang(conn, soluongnew, gioHang);	
				}catch (Exception e) {
					// TODO: handle exception
				}
				KhachHang khachhang =null;
        		try {
        			khachhang = DBUtils.timkiemkhachhang(conn, tenTK);
        		} catch (Exception e) {
        			// TODO: handle exception
        		}
                List<GioHang> giohang = null;
        		try {
        			giohang = DBUtils.listGioHang(conn, khachhang.getMaKH());
        		}catch (Exception e) {
        			// TODO: handle exception
        		}
        		request.setAttribute("soluong", giohang.size());
				request.setAttribute("DHList", listDongHo);
	    		request.setAttribute("PKList", listPK);
	    		request.setAttribute("TBList", listtb);
	    		request.setAttribute("listLT", listLT);
	    		request.setAttribute("listDienThoai", listDienThoai);
				request.setAttribute("tenkhachhang", kh.getTenkhachhang());
        		request.setAttribute("tenTK", kh.getTenTK());
        		request.setAttribute("message", thongbao);
                	RequestDispatcher dispatcher = request.getServletContext()
                			.getRequestDispatcher("/WEB-INF/views/homeView.jsp");
                	dispatcher.forward(request, response);
			}
        	
        	
        }
		
	}

}
