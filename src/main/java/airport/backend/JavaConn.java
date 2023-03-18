package airport.backend;
import java.sql.*;

public class JavaConn {
    private final String url = "jdbc:postgresql://localhost/airport";
    private final String user = "postgres";
    private final String password = "1984";

    public Connection connect(){
        Connection conn = null;
        Statement statement = null;

        try {
            conn = DriverManager.getConnection(url,user,password);
            System.out.println("Opened database successfully");
            statement = conn.createStatement();
            String sql = "CREATE TABLE airport " +
                    "(id INT PRIMARY KEY     NOT NULL," +
                    " name               NOT NULL, " +
                    " address       CHAR(50), ";

            statement.executeUpdate(sql);
            sql = "INSERT INTO airport (id,name,address) "
                    + "VALUES (1, 'Test','Utah');";
            statement.executeUpdate(sql);
            statement.close();
            conn.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return conn;
    }


}
