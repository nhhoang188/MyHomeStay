package dao.AdminDao.Mapper;

import model.User;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UserMapper implements RowMapper<User> {

    @Override
    public User mapRow(ResultSet rs) {
        User user;
        try {
            int id = rs.getInt("id");
            int role = rs.getInt("role");
            String acount = rs.getString("name");
            String password = rs.getString("password");
            String name = rs.getString("name");
            String age = rs.getString("age");
            String email = rs.getString("email");
            String phonenumber = rs.getString("phonenumber");
            String address = rs.getString("address");
            user = new User(id,role, name,age,email,password,acount,phonenumber,address);
            return  user;
        } catch (SQLException throwables) {
            return null;
        }
    }
}
