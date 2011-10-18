package weiboautoman.timer.dao;

import weiboautoman.timer.dataobject.UsersWeibo;

public interface UsersWeiboDAO {
    int deleteByPrimaryKey(Long id);

    void insert(UsersWeibo record);

    void insertSelective(UsersWeibo record);

    UsersWeibo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UsersWeibo record);

    int updateByPrimaryKey(UsersWeibo record);
}