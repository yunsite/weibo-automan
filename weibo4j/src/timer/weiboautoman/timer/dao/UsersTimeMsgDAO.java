package weiboautoman.timer.dao;

import java.util.List;

import weiboautoman.timer.dataobject.UsersTimeMsg;
import weiboautoman.timer.dataobject.vo.UsersTimeMsgVO;

public interface UsersTimeMsgDAO {

    int deleteByPrimaryKey(Long id);

    void insert(UsersTimeMsg record);

    void insertSelective(UsersTimeMsg record);

    UsersTimeMsg selectByPrimaryKey(Long id);

    long selectByUserIdFirstNumberLikeCount(String userIdFirstNumber);

    /**
     * 查询的时候，根据用户ID的第一个数字进行like，只查询以这个数字开始的所有微博，减少查询的内容，分批进行查询。<br>
     * 分别传入的参数1-9中一个，并得到不同前缀开始的所有定时发送的微博内容
     * 
     * @param userIdFirstNumber 用户ID的第一个数字
     * @param start 分页查询开始的记录数
     * @param pageSize 需要查询的总记录数
     * @return
     */
    List<UsersTimeMsgVO> selectByUserIdFirstNumberLike(String userIdFirstNumber, long start, int pageSize);

    int updateByPrimaryKeySelective(UsersTimeMsg record);

    int updateByPrimaryKey(UsersTimeMsg record);
}
