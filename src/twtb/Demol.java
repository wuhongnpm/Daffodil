package twtb;

import java.sql.*;

public class Demol {
    public static void main(String[] args) {
        /*
        创建用户表,插入数据
        CREATE TABLE user (
              id int(11) AUTO_INCREMENT,
              name varchar(30) ,
              password varchar(30),
             PRIMARY KEY (id)
              ) ;
         insert into user values(null,'dashen','thisispassword');
         */
        //SQL语句判断账号密码是否正确,去表里根据账号密码查询
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
                //判断语句
        {
            String name = "dd";
            String password = "pass";
            String sql = "select * from user where name = '" + name +"' and password = '" + password+"'";

            //执行查询语句
            ResultSet rs = s.executeQuery(sql);

            if(rs.next())
                System.out.println("账号密码正确");
            else
                System.out.println("账号密码错误");
        }catch (SQLException e) {
            e.printStackTrace();
        }

    }
}

