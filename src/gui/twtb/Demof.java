package gui.twtb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
//使用try-with-resource的方式自动关闭连接.
public class Demof {
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
            String sql = "insert into hero values(null,"+"'提莫3'"+","+313.0f+","+50+")";
            s.execute(sql);
        }catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
