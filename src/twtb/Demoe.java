package twtb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import static javax.swing.text.html.HTML.Tag.S;

public class Demoe {
    public static void main(String[] args) {
        Connection c = null;
        Statement s = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            //Connection
            c = DriverManager.getConnection("jdbc:mysql://39.102.42.170:3306/twtb_database?characterEncoding=UTF-8",
                    "root","12345678");
            s = c.createStatement();
            String sql = "insert into hero values(null," + "'提莫2'" + "," + 323.0f + "," + 51 + ")";
            s.execute(sql);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }catch (SQLException e) {
            e.printStackTrace();
        }finally {
            //数据库操作完后要关闭
            //先关闭statement
            if (S != null)
                try {
                    s.close();
                }catch (SQLException e) {
                    e.printStackTrace();
                }
            //后关闭Connection
            if (c !=null)
                try {
                    c.close();
                }catch (SQLException e) {
                    e.printStackTrace();
                }
        }
    }
}
