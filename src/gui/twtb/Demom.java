package gui.twtb;

import java.sql.*;

public class Demom {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try (
                //Connection
                Connection c = DriverManager.getConnection("jdbc:mysql://39.102.42.170:3306/twtb_database?characterEncoding=UTF-8",
                        "root", "12345678");
                Statement s = c.createStatement();)
        {
                //获取总数
                String sql = "select count(*)from hero1";
                //分页查询
                //String sql= "select * from hero limit 0,5";

        ResultSet rs =s.executeQuery(sql);
        int total = 0;
        while (rs.next()) {
            total = rs.getInt(1);
        }
        System.out.println("表共:"+total+"条数据");

       }
    catch (SQLException e) {
           e.printStackTrace();
            }
        }
}
