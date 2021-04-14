package gui.twtb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Democ {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            //Connection
            Connection c = DriverManager.getConnection("jdbc:mysql://39.102.42.170:3306/twtb_database?characterEncoding=UTF-8",
                    "root","12345678");
            Statement s = c.createStatement();
            System.out.println("获取 Statement对象: " + s);
        }catch (ClassNotFoundException e) {
            e.printStackTrace();
        }catch (SQLException e) {
            e.printStackTrace();
        }


    }

}
