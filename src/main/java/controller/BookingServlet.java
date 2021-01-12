package controller;

import dao.AdminDao.Booking.BookingDao;
import model.Booking;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "booking", urlPatterns = "/booking")
public class BookingServlet extends HttpServlet {
    BookingDao bookingDao = new BookingDao();
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        addBooking(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher rd = request.getRequestDispatcher("/booking.jsp");
        rd.forward(request, response);
    }

    private void addBooking(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String arrival_date = request.getParameter("arrival_date");
        String departure_date = request.getParameter("departure_date");
        String[] split = arrival_date.split("/");
        String[] split2 = departure_date.split("/");
        String date1 = split[2] + "-" + split[0] + "-" + split[1];
        String date2 = split2[2] + "-" + split2[0] + "-" + split2[1];
        int iduser = 1;
        int idhomestay = 2;
        int songuoi = Integer.parseInt(request.getParameter("guest"));
        int sophong = Integer.parseInt(request.getParameter("room"));
        Booking booking = new Booking(songuoi, sophong, iduser, idhomestay, date1, date2);
        bookingDao.addNewBooking(booking);
        RequestDispatcher dispatcher = request.getRequestDispatcher("booking.jsp");
        dispatcher.forward(request, response);
    }

}
