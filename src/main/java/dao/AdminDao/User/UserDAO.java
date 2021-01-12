package dao.AdminDao.User;

import dao.AdminDao.GenericDao.AbstractDao;
import dao.AdminDao.Mapper.UserMapper;
import model.User;

import java.util.List;

public class UserDAO extends AbstractDao<User> implements IUserDAO {
    private static final String INSERT_USERS = "INSERT INTO user (role, acount, password, name, age, email, phonenumber, address) VALUES (1, ?, ?, ?, ?, ?, ?, ?);";
    private static final String SELECT_USER_BY_ID = "select * from user where id =?";
    private static final String SELECT_ALL_USERS = "select * from user";
    private static final String DELETE_USERS = "delete from user where id = ?;";
    private static final String UPDATE_USERS = "update user set name = ?, age =?, email= ?, phonenumber =?, address =?  where id = ?;";
    @Override
    public void insertUser(User user) {
       update(INSERT_USERS,user.getAcount(), user.getPassword(), user.getName(), user.getAge(), user.getEmail(), user.getPhonenumber(), user.getAddress());
    }

    @Override
    public List<User> findUserById(int id) {
       return query(SELECT_USER_BY_ID, new UserMapper(), id);
    }

    @Override
    public List<User> findAllUsers() {
        return query(SELECT_ALL_USERS, new UserMapper());
    }

    @Override
    public void deleteUser(int id) {
        update(DELETE_USERS,id);
    }

    @Override
    public void updateUser(User user, int id) {
        update(UPDATE_USERS, user.getName(),user.getAge(),user.getEmail(),user.getPhonenumber(),user.getAddress(),id);
    }
}
