import com.airplane.db.DBConnection;
import java.sql.Connection;

public class TestDBConnection {
    public static void main(String[] args) {
        Connection conn = DBConnection.getConnection();
        if (conn != null) {
            System.out.println(" Connection test passed!");
        } else {
            System.out.println("Connection test failed!");
        }
    }
}