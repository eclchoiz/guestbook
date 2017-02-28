package jdbc.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by SSENG on 2017-02-26.
 */
public class ConnectionProvider {

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection("jdbc:apache:common:dbcp:/guestbook");
    }
}
