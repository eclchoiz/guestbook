package dao;

import dao.mysql.MySQLMessageDao;

/**
 * Created by SSENG on 2017-02-26.
 */
public class MessageDaoProvider {
    private static MessageDaoProvider instance = new MessageDaoProvider();

    public static MessageDaoProvider getInstance() {
        return instance;
    }

    private MessageDaoProvider() {}

    private MySQLMessageDao mysqlDao = new MySQLMessageDao();
    private String dbms;

    void setDbms(String dbms) {
        this.dbms = dbms;
    }

    public MessageDao getMessageDao(){
        if ("mysql".equals(dbms)) {
            return mysqlDao;
        }
        return null;
    }
}
