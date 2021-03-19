package twtb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

//执行SQL语句
public class Demod {
    public static void main(String[] args) {
        //s.execute执行sql语句,执行成功后,用mysql-front进行查看,明确插入成功
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            //Connection
            Connection c = DriverManager.getConnection("jdbc:mysql://39.102.42.170:3306/twtb_database?characterEncoding=UTF-8",
                    "root","12345678");
            Statement s = c.createStatement();

            //注意sql语句,字符串要用单引号
          //  String sql = "insert into name values(10,"+"'jack'"+","1")";
           // s.execute(sql);

            System.out.println("执行插入语句成功");
        }catch (ClassNotFoundException e) {
            e.printStackTrace();
        }catch (SQLException e) {
            e.printStackTrace();
        }

    }

}
