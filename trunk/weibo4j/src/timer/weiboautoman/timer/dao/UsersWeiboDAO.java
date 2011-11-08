package weiboautoman.timer.dao;

import weiboautoman.timer.dataobject.UsersWeibo;
import weiboautoman.timer.dataobject.vo.UsersWeiboVO;

public interface UsersWeiboDAO {

    int deleteByPrimaryKey(Long id);

    void insert(UsersWeibo record);

    void insertSelective(UsersWeibo record);

    UsersWeibo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UsersWeibo record);

    int updateByPrimaryKey(UsersWeibo record);

    UsersWeiboVO selectByPrimaryKeySmall(Long id);
}
