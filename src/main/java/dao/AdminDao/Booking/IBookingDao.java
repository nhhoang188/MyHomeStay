package dao.AdminDao.Booking;

import dao.AdminDao.GenericDao.GenericDao;
import model.Booking;
import model.HomeStay;

import java.util.List;

public interface IBookingDao extends GenericDao<Booking> {
    List<Booking> findBookingInfo(int id);

    void addNewBooking(Booking booking);

    void deleteBooking(int id);

    void updateBooking(Booking booking, int id);
}
