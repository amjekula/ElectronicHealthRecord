import com.mysql.jdbc.Connection;
import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.sql.SQLException;

/**
 *
 * @author A. Mjeks
 */
public class MyCNX {

    private static String servername = "localhost";
    private static String username = "root";
    private static String dbname = "clinicdb";
    private static Integer portnumber = 3306;
    private static String password = "";

    public static Connection getConnection() {
        Connection connect = null;

        MysqlDataSource datasource = new MysqlDataSource();
        datasource.setServerName(servername);
        datasource.setUser(username);
        datasource.setPassword(password);
        datasource.setDatabaseName(dbname);
        datasource.setPortNumber(portnumber);

        try {
            connect = (Connection) datasource.getConnection();

        } catch (SQLException ex) {
            System.out.println("SQLException: " + ex.getMessage());
        }
        return connect;
    }
}