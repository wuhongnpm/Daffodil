package gui.twtb;

import java.sql.*;

public class Demok {
    public static void main(String[] args) {
        //查询语句 executeQuery
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
                //执行查询语句,把结果集返回给ResultSet
        {
            String sql = "select *from hero1";
            ResultSet rs = s.executeQuery(sql);
            while (rs.next()) {
                int id = rs.getInt("id");//可以使用字段名
                String name = rs.getString(2);
                float hp = rs.getFloat("hp");
                int damage = rs.getInt(4);
                System.out.printf("%d\t%s\t%f\t%d%n",id,name,hp,damage);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
