package dao;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

/**
 * Created by SSENG on 2017-02-26.
 */
public class MessageDaoProviderInit extends HttpServlet {

    public void init(ServletConfig config) throws ServletException {
        String dbms = config.getInitParameter("dbms");
        if (dbms != null) {
            MessageDaoProvider.getInstance().setDbms(dbms);
        }
    }
}
