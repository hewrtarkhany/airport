package airport.backend;
import java.sql.*;

public class JavaConn {
    Connection conn = DriverManager.getConnection("jdbc:postgres://localhost:4352/postgres","darkarchlinux@gmail.com","341984");
    Statement st = conn.createStatement();
    ResultSet rs = st.executeQuery("select * from countries");
    while(){
        System.out.println(rs.getString(""));
    }
    public JavaConn() throws SQLException {
    }
}
