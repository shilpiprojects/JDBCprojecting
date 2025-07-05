

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCDemo10 {
    public static void main(String[] args) throws Exception {

        Class.forName("com.mysql.cj.jdbc.Driver");

        // Connection details
        String url = "jdbc:mysql://localhost:3306/mydb";
        String uname = "root";
        String password = "password";


        Connection con = DriverManager.getConnection(url, uname, password);


        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("SELECT * FROM employee");


        while (rs.next()) {
            System.out.println("ID: " + rs.getInt("id"));
            System.out.println("Name: " + rs.getString("name"));
            System.out.println("Company: " + rs.getString("company"));
            System.out.println("-----------");
        }


        con.close();
    }
}



