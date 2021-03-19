package twtb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//建立数据库的连接


public class Demob {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            //Connection
            Connection c = DriverManager.getConnection("jdbc:mysql://39.102.42.170:3306/twtb_database?characterEncoding=UTF-8",
                    "root","12345678");
            System.out.println("连接成功,获取连接对象:" + c);
        }catch (ClassNotFoundException e) {
            e.printStackTrace();
        }catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
