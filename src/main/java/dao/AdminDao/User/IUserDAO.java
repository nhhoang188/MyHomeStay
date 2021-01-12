package dao.AdminDao.User;


import dao.AdminDao.GenericDao.GenericDao;
import model.User;

import java.sql.SQLException;
import java.util.List;

public interface IUserDAO extends GenericDao<User> {
    public void insertUser(User user);

    public List<User> findUserById(int id);

    public List<User> findAllUsers();

    public void deleteUser(int id) ;

    public void updateUser(User user, int id) ;
}
