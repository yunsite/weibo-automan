package weiboautoman.timer.bo;

import weiboautoman.timer.dao.UsersTimeMsgDAO;
import weiboautoman.timer.dataobject.UsersTimeMsg;

public class UsersTimeMsgBO {

    private UsersTimeMsgDAO usersTimeMsgDAO;

    /**
     * 更新一条已经发送的微博记录的状态为已发送
     * 
     * @param id
     */
    public void updateUserTimeMsgSendStatus(long id) {
        UsersTimeMsg msg = new UsersTimeMsg();
        msg.setId(id);
        msg.setIsSend("Y");
        usersTimeMsgDAO.updateByPrimaryKeySelective(msg);
    }

    public void setUsersTimeMsgDAO(UsersTimeMsgDAO usersTimeMsgDAO) {
        this.usersTimeMsgDAO = usersTimeMsgDAO;
    }
}
