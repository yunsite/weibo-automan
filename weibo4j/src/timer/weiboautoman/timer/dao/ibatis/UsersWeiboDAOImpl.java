package weiboautoman.timer.dao.ibatis;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import weiboautoman.timer.dao.UsersWeiboDAO;
import weiboautoman.timer.dataobject.UsersWeibo;

public class UsersWeiboDAOImpl extends SqlMapClientDaoSupport implements UsersWeiboDAO {

    public UsersWeiboDAOImpl() {
        super();
    }

    public int deleteByPrimaryKey(Long id) {
        UsersWeibo key = new UsersWeibo();
        key.setId(id);
        int rows = getSqlMapClientTemplate().delete("users_weibo.deleteByPrimaryKey", key);
        return rows;
    }

    public void insert(UsersWeibo record) {
        getSqlMapClientTemplate().insert("users_weibo.insert", record);
    }

    public void insertSelective(UsersWeibo record) {
        getSqlMapClientTemplate().insert("users_weibo.insertSelective", record);
    }

    public UsersWeibo selectByPrimaryKey(Long id) {
        UsersWeibo key = new UsersWeibo();
        key.setId(id);
        UsersWeibo record = (UsersWeibo) getSqlMapClientTemplate().queryForObject("users_weibo.selectByPrimaryKey", key);
        return record;
    }

    public int updateByPrimaryKeySelective(UsersWeibo record) {
        int rows = getSqlMapClientTemplate().update("users_weibo.updateByPrimaryKeySelective", record);
        return rows;
    }

    public int updateByPrimaryKey(UsersWeibo record) {
        int rows = getSqlMapClientTemplate().update("users_weibo.updateByPrimaryKey", record);
        return rows;
    }
}