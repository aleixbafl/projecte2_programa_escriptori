import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conexioBD {
    static Connection conexioBD = null;
    String servidor = "jdbc:mysql://localhost:3307/";
    String bbdd = "#";
    String user = "root";
    String password = "#";

    try {
        conexioBD = (Connection) DriverManager.getConnection(servidor + bbdd, user, password);
    } catch (SQLException ex) {
        ex.printStackTrace();
    }
}
