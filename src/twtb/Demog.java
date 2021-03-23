package twtb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
//做0-100的循环
public class Demog {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try (
                //Connection
                Connection c = DriverManager.getConnection("jdbc:mysql://39.102.42.170:3306/twtb_database?characterEncoding=UTF-8",
                        "root","12345678");
                Statement s = c.createStatement();
        )
        {
            for (int i =0;i<100;i++) {
                String sql = "insert into hero values(null," + "'英雄"+i+"'"  + "," + 313.0f + "," + 50 + ")";
                s.execute(sql);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
