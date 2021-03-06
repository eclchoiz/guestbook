package jdbc.loader;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import java.util.StringTokenizer;

/**
 * Created by SSENG on 2017-02-26.
 */
public class Loader extends HttpServlet {
    public void init(ServletConfig config) throws ServletException {
        try {
            String drivers = config.getInitParameter("jdbcdriver");
            StringTokenizer st = new StringTokenizer(drivers, ",");
            while (st.hasMoreTokens()) {
                String jdbcDriver = st.nextToken();
                Class.forName(jdbcDriver);
            }
        } catch (ClassNotFoundException e) {
            throw new ServletException(e);
        }
    }
}
