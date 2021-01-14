package controller;

import dao.AdminDao.HomeStay.HomeStayDao;
import model.HomeStay;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(urlPatterns = "/admin")
public class AdminServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    HomeStayDao homeStayDao = new HomeStayDao();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String _username = request.getParameter("_password");
        String _password = request.getParameter("_username");
        if (_username.equals("admin") && _password.equals("admin")) {
            RequestDispatcher dispatcher = request.getRequestDispatcher("admin.jsp");
            dispatcher.forward(request, response);
        } else {
            RequestDispatcher dispatcher = request.getRequestDispatcher("login.jsp");
            dispatcher.forward(request, response);
        }
        String update = request.getParameter("action");
        if (update == null) {
            update = "";
        }
        switch (update) {
            case "edit":
                homeStayEdit(request,response);
                break;
            case "add":

                break;
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws
            ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "homestay":
                goHomeStayUpdate(request, response);
                break;
            case "delete":
                homeStayDelete(request,response);
                break;
            case "edit":
                gohomeStayEdit(request,response);
                break;
            default:
                RequestDispatcher dispatcher = request.getRequestDispatcher("login.jsp");
                dispatcher.forward(request, response);
                break;
        }

    }

    public void goHomeStayUpdate(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("homestays", homeStayDao.findAllHomeStay());
        RequestDispatcher rd = request.getRequestDispatcher("homestayupdate.jsp");
        rd.forward(request, response);
    }

    public void homeStayDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        homeStayDao.deleteHomeStay(id);
        List<HomeStay> list = homeStayDao.findAllHomeStay();
        request.setAttribute("homestays", list);
        RequestDispatcher rd = request.getRequestDispatcher("homestayupdate.jsp");
        rd.forward(request, response);
    }
    public void homeStayEdit(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        List<HomeStay> list = homeStayDao.findHomeStayInfoById(id);
        String name = request.getParameter("_name");
        String _diachi = request.getParameter("_diachi");
        String _sdt = request.getParameter("_sdt");
        double _giaphong = Double.parseDouble(request.getParameter("_giaphong"));
        int _sophong = Integer.parseInt(request.getParameter("_sophong"));
        String _anh4 = request.getParameter("_anh4");
        String _anh3 = request.getParameter("_anh3");
        String _anh2 = request.getParameter("_anh2");
        String _anh = request.getParameter("_anh");
        String _thongtin3 = request.getParameter("_thongtin3");
        String _thongtin2 = request.getParameter("_thongtin2");
        String _thongtin1 = request.getParameter("_thongtin1");
        String _thongtin = request.getParameter("_thongtin");
        String _tienich = request.getParameter("_tienich");
        HomeStay homeStay = new HomeStay(id,name,_diachi,_sdt,_giaphong, _sophong, _tienich, _anh, _anh2, _anh3, _anh4, _thongtin, _thongtin1, _thongtin2, _thongtin3);
        homeStayDao.updateHomeStay(homeStay, id);
        request.setAttribute("homestays", list);
        RequestDispatcher rd = request.getRequestDispatcher("edithomestay.jsp");
        rd.forward(request, response);
    }
    public void gohomeStayEdit(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        request.setAttribute("homestays", homeStayDao.findHomeStayInfoById(id));
        RequestDispatcher rd = request.getRequestDispatcher("edithomestay.jsp");
        rd.forward(request, response);
    }
}
