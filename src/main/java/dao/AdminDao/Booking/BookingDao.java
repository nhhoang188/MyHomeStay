package dao.AdminDao.Booking;

import dao.AdminDao.GenericDao.AbstractDao;
import dao.AdminDao.Mapper.BookingMapper;
import model.Booking;

import java.util.List;

public class BookingDao extends AbstractDao<Booking> implements IBookingDao {
    static String SHOW_BOOKING_INFO = "select u.name username, s.ten homestayname, d.trangthai, d.ngayden, d.ngaydi, d.songuoi, d.thanhtoan, d.sophongdat from datphong d join user u on d.iduser = u.id join stay s on d.idhomestay = s.id where d.iduser=?;";
    static String ADD_NEW_BOOKING = "insert into datphong(iduser, idhomestay, ngayden, ngaydi, songuoi, sophongdat,trangthai) values (?, ?, ?, ?, ?, ?,1);";
    static String ADD_NEW_BOOKING_BY_ID = "insert into datphong(iduser, idhomestay, ngayden, ngaydi, songuoi, sophongdat,trangthai,thanhtoan) values (?, ?, ?, ?, ?, ?,1,?);";
    @Override
    public List<Booking> findBookingInfo(int id) {
        return query(SHOW_BOOKING_INFO, new BookingMapper(), id);
    }

    @Override
    public void addNewBooking(Booking booking) {
        update(ADD_NEW_BOOKING, booking.getIduser(), booking.getIdhomestay(), booking.getNgayDen(), booking.getNgayDi(), booking.getSoNguoi(), booking.getSoPhong());
    }
    public void addNewBookingByid(Booking booking) {
        update(ADD_NEW_BOOKING_BY_ID, booking.getIduser(), booking.getIdhomestay(), booking.getNgayDen(), booking.getNgayDi(), booking.getSoNguoi(), booking.getSoPhong(), booking.getThanhToan());
    }
    @Override
    public void deleteBooking(int id) {

    }

    @Override
    public void updateBooking(Booking booking, int id) {

    }
}
