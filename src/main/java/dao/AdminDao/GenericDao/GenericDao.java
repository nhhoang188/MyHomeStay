package dao.AdminDao.GenericDao;

import dao.AdminDao.Mapper.RowMapper;

import java.util.List;

public interface GenericDao<T> {
    <T> List<T> query(String sql, RowMapper<T> rowMapper, Object... parameters);
    void update(String sql, Object... parameters);
    int insert(String sql, Object... parameters);
}
