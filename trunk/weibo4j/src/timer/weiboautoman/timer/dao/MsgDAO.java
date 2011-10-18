package weiboautoman.timer.dao;

import weiboautoman.timer.dataobject.Msg;

public interface MsgDAO {
    int deleteByPrimaryKey(Long id);

    void insert(Msg record);

    void insertSelective(Msg record);

    Msg selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Msg record);

    int updateByPrimaryKey(Msg record);
}