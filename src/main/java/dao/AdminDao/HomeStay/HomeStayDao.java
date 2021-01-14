package dao.AdminDao.HomeStay;

import dao.AdminDao.GenericDao.AbstractDao;
import dao.AdminDao.Mapper.HomeStayMapper;
import model.HomeStay;

import java.util.List;

public class HomeStayDao extends AbstractDao<HomeStay> implements IHomeStayDAO {
    static String SHOW_ALL_HOME_STAY = "SELECT * FROM stay;";
    static String SHOW_HOME_STAY_INFOR = "SELECT * FROM stay where id = ?;";
    static String DELETE_HOME_STAY ="DELETE FROM STAY WHERE ID = ?;";
    static String EDIT_HOME_STAY = "UPDATE STAY SET TEN =?, DIACHI=?, SDT=?, GIA=?, SOPHONG=?, TIENICH=?, ANH=?, ANH1=?, ANH2=?, ANH3=?, THONGTIN=?, THONGTIN1=?, THONGTIN2=?, THONGTIN3=? WHERE ID =?;";
    static String ADD_NEW_HOME_STAY = "INSERT INTO STAY (TEN, DIACHI, SDT, GIA, SOPHONG, TIENICH, ANH, ANH1, ANH2, ANH3, THONGTIN, THONGTIN1, THONGTIN2, THONGTIN3) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";

    @Override
    public List<HomeStay> findAllHomeStay() {
        return query(SHOW_ALL_HOME_STAY, new HomeStayMapper());
    }

    @Override
    public List<HomeStay> findHomeStayInfoById(int id) {
        return query(SHOW_HOME_STAY_INFOR, new HomeStayMapper(), id);
    }

    @Override
    public void addNewHomeStay(HomeStay homeStay) {
        update(ADD_NEW_HOME_STAY, homeStay.getTenhomestay(), homeStay.getDiachi(), homeStay.getSdt(), homeStay.getGiaphong(), homeStay.getSophong(),homeStay.getTienich(),homeStay.getAnh(),homeStay.getAnh1(),homeStay.getAnh2(),homeStay.getAnh3(),homeStay.getThongtin(),homeStay.getThongtin1(),homeStay.getThongtin2(),homeStay.getThongtin3());
    }

    @Override
    public void deleteHomeStay(int id) {
        update(DELETE_HOME_STAY, id);
    }

    @Override
    public void updateHomeStay(HomeStay homeStay, int id) {
        update(EDIT_HOME_STAY, homeStay.getTenhomestay(), homeStay.getDiachi(), homeStay.getSdt(), homeStay.getGiaphong(), homeStay.getSophong(), homeStay.getTienich(), homeStay.getAnh(), homeStay.getAnh1(), homeStay.getAnh2(),homeStay.getAnh3(),homeStay.getThongtin(),homeStay.getThongtin1(),homeStay.getThongtin2(),homeStay.getThongtin3(), id);
    }
}
