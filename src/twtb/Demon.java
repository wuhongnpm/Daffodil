package twtb;

import java.sql.*;

public class Demon {
    public static void main(String[] args) {
        //使用PreparedStatement来执行语句,需要sql语句创建PreparedStatement,可设置参数,指定对应值.
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        String sql = "insert into hero1 values(null,?,?,?)";
        try (
                //Connection
                Connection c = DriverManager.getConnection("jdbc:mysql://39.102.42.170:3306/twtb_database?characterEncoding=UTF-8",
                        "root", "12345678");
               //sql语句创建PreparedStatement
                PreparedStatement ps = c.prepareStatement(sql);
        )
        {
            //设置参数
            ps.setString(1,"moMO");
            ps.setFloat(2,221.0f);
            ps.setInt(1,10);
            //执行
            ps.execute();
        }catch (SQLException e) {
            e.printStackTrace();
        }
         }
}
