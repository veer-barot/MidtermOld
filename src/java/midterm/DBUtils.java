package midterm;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * A Database Utility Class
 *
 * @author <Veer barot>
 */
public class DBUtils {

    private final static String studentNumber = "c0719943";

    /**
     * Utility method used to create a Database Connection
     *
     * @return the Connection object
     * @throws SQLException
     */
    public static Connection getConnection() throws SQLException {
        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DBUtils.class.getName()).log(Level.SEVERE, null, ex);
        }
        String server = "localHost";
        String username = studentNumber;
        String password = studentNumber;
        String database = username;
        String jdbc = String.format("jdbc:derby://%s/%s", server, database);
        return DriverManager.getConnection(jdbc, username, password);
    }
}
