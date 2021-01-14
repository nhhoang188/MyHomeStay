package controller;

import dao.AdminDao.Booking.BookingDao;
import dao.AdminDao.HomeStay.HomeStayDao;
import model.Booking;

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
    BookingDao bookingDao = new BookingDao();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "booking":
                addBookingById(request,response);
                break;
            default:
                request.setAttribute("homestays", homeStayDao.findAllHomeStay());
                RequestDispatcher rd = request.getRequestDispatcher("/allhomestay.jsp");
                rd.forward(request, response);
                break;
        }
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
            case "booking":
                bookingHomeStayById(request, response);
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
    public void bookingHomeStayById(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        request.setAttribute("homestay", homeStayDao.findHomeStayInfoById(id));
        RequestDispatcher rd = request.getRequestDispatcher("/bookingByid.jsp");
        rd.forward(request, response);
    }
    private void addBookingById(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String arrival_date = request.getParameter("arrival_date");
        int idhomestay = Integer.parseInt(request.getParameter("id"));
        String departure_date = request.getParameter("departure_date");
        int songuoi = Integer.parseInt(request.getParameter("guest"));
        int sophong = Integer.parseInt(request.getParameter("room"));
        double thanhtoan = Double.parseDouble(request.getParameter("_thanhtoan"));
        String[] split = arrival_date.split("/");
        String[] split2 = departure_date.split("/");
        String date1 = split[2] + "-" + split[0] + "-" + split[1];
        String date2 = split2[2] + "-" + split2[0] + "-" + split2[1];
        int iduser = 1;
        Booking booking = new Booking(songuoi, sophong, iduser, idhomestay, date1, date2, thanhtoan);
        bookingDao.addNewBookingByid(booking);
        RequestDispatcher dispatcher = request.getRequestDispatcher("bookingByid.jsp");
        dispatcher.forward(request, response);
    }
}
