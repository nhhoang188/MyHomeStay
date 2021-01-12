package dao.AdminDao.Mapper;

import model.HomeStay;

import java.sql.ResultSet;
import java.sql.SQLException;

public class HomeStayMapper implements RowMapper<HomeStay> {
    @Override
    public HomeStay mapRow(ResultSet rs) {
        HomeStay homeStay;
        try {
            int idhomestay = rs.getInt("id");
            String ten = rs.getString("ten");
            String diachi = rs.getString("diachi");
            String sdt = rs.getString("sdt");
            double gia = rs.getDouble("gia");
            int sophong = rs.getInt("sophong");
            String tienich = rs.getString("tienich");
            String thongtin = rs.getString("thongtin");
            String thongtin1 = rs.getString("thongtin1");
            String thongtin2 = rs.getString("thongtin2");
            String thongtin3 = rs.getString("thongtin3");
            String anh = rs.getString("anh");
            String anh1 = rs.getString("anh1");
            String anh2 = rs.getString("anh2");
            String anh3 = rs.getString("anh3");
            homeStay =new HomeStay(idhomestay, ten, diachi, sdt,  gia, sophong,tienich, anh, anh1, anh2, anh3, thongtin, thongtin1, thongtin2, thongtin3);
            return homeStay;
        } catch (SQLException throwables) {
            return null;
        }
    }
}
