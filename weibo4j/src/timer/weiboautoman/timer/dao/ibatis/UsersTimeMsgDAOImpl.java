package weiboautoman.timer.dao.ibatis;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import weiboautoman.timer.dao.UsersTimeMsgDAO;
import weiboautoman.timer.dataobject.UsersTimeMsg;

public class UsersTimeMsgDAOImpl extends SqlMapClientDaoSupport implements UsersTimeMsgDAO {

    public UsersTimeMsgDAOImpl(){
        super();
    }

    public int deleteByPrimaryKey(Long id) {
        UsersTimeMsg key = new UsersTimeMsg();
        key.setId(id);
        int rows = getSqlMapClientTemplate().delete("users_time_msg.deleteByPrimaryKey", key);
        return rows;
    }

    public void insert(UsersTimeMsg record) {
        getSqlMapClientTemplate().insert("users_time_msg.insert", record);
    }

    public void insertSelective(UsersTimeMsg record) {
        getSqlMapClientTemplate().insert("users_time_msg.insertSelective", record);
    }

    public UsersTimeMsg selectByPrimaryKey(Long id) {
        UsersTimeMsg key = new UsersTimeMsg();
        key.setId(id);
        UsersTimeMsg record = (UsersTimeMsg) getSqlMapClientTemplate().queryForObject("users_time_msg.selectByPrimaryKey",
                                                                                      key);
        return record;
    }

    @Override
    public long selectByUserIdFirstNumberLikeCount(String userIdFirstNumber) {
        userIdFirstNumber += "%";
        return (Long) getSqlMapClientTemplate().queryForObject("users_time_msg.selectByUserIdFirstNumberLikeCount",
                                                               userIdFirstNumber);
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<UsersTimeMsg> selectByUserIdFirstNumberLike(String userIdFirstNumber, long start, int pageSize) {
        userIdFirstNumber += "%";
        Map param = new HashMap();
        param.put("userIdFirstNumber", userIdFirstNumber);
        param.put("start", start);
        param.put("pageSize", pageSize);
        return getSqlMapClientTemplate().queryForList("users_time_msg.selectByUserIdFirstNumberLike", userIdFirstNumber);
    }

    public int updateByPrimaryKeySelective(UsersTimeMsg record) {
        int rows = getSqlMapClientTemplate().update("users_time_msg.updateByPrimaryKeySelective", record);
        return rows;
    }

    public int updateByPrimaryKey(UsersTimeMsg record) {
        int rows = getSqlMapClientTemplate().update("users_time_msg.updateByPrimaryKey", record);
        return rows;
    }

}
