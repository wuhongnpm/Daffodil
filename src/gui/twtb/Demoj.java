package gui.twtb;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Demoj {
    public static void main(String[] args) {
//增加
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try (
                //Connection
                Connection c = DriverManager.getConnection("jdbc:mysql://39.102.42.170:3306/twtb_database?characterEncoding=UTF-8",
                        "root", "12345678");
                Statement s = c.createStatement();
        )
        //修改
        {
            String sql = "update hero1 set name = 'name2' where id = 3";
            s.execute(sql);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
