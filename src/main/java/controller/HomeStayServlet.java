package controller;

import dao.AdminDao.HomeStay.HomeStayDao;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/rooms")
public class HomeStayServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    HomeStayDao homeStayDao = new HomeStayDao();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "show":
                showHomeStayInfor(request, response);
                break;
            default:
                request.setAttribute("homestays", homeStayDao.findAllHomeStay());
                RequestDispatcher rd = request.getRequestDispatcher("/allhomestay.jsp");
                rd.forward(request, response);
                break;
        }
    }

    public void showHomeStayInfor(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        request.setAttribute("homestay", homeStayDao.findHomeStayInfoById(id));
        RequestDispatcher rd = request.getRequestDispatcher("/homestayinfo.jsp");
        rd.forward(request, response);
    }
}
