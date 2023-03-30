import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class main {
    public static void connect() {
        Connection conn = null;
        try {
            String url = "jdbc:sqlite:src/main/resources/FinalTerm.db";
            conn = DriverManager.getConnection(url);
            System.out.println("Connection to SQLite has been established.");

        }
        catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        connect();
    }
}