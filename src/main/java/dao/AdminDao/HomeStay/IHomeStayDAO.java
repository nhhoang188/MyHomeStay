package dao.AdminDao.HomeStay;

import dao.AdminDao.GenericDao.GenericDao;
import model.HomeStay;

import java.util.List;

public interface IHomeStayDAO extends GenericDao<HomeStay> {
    List<HomeStay> findAllHomeStay();

    List<HomeStay> findHomeStayInfoById(int id);

    void addNewHomeStay(HomeStay homeStay);

    void deleteHomeStay(int id);

    void updateHomeStay(HomeStay homeStay, int id);
}
