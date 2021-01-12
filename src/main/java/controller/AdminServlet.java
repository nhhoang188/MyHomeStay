package controller;

import dao.AdminDao.HomeStay.HomeStayDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet(name = "HomeStay", urlPatterns = "/admin")
public class AdminServlet extends HttpServlet {
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
                break;
            case "edit":
                break;
            case "add":
                break;
            case "update":
                break;
            default:

                break;
        }

    }
}
