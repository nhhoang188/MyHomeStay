package dao.AdminDao.Mapper;

import model.Booking;

import java.sql.ResultSet;
import java.sql.SQLException;

public class BookingMapper implements RowMapper<Booking> {
    @Override
    public Booking mapRow(ResultSet rs) {
        Booking booking;
        try {
            String tenNguoiDat = rs.getString("username");
            String tenHomeStay = rs.getString("homestayname");
            int trangthai = rs.getInt("trangthai");
            String ngayden = rs.getString("ngayden");
            String ngaydi = rs.getString("ngaydi");
            int songuoi = rs.getInt("songuoi");
            double thanhtoan = rs.getDouble("thanhtoan");
            int soPhongDat = rs.getInt("sophongdat");
            booking = new Booking( trangthai, songuoi, soPhongDat, tenNguoiDat, tenHomeStay, ngayden, ngaydi, thanhtoan);
            return booking;
        } catch (SQLException throwables) {
            return null;
        }
    }
}
