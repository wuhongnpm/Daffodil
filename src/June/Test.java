import java.sql.*;

public class Test{
    public static void main(String[] args){
        Connection connection = null;
        try {
            //加载数据库驱动
            Class.forName("com.mysql.cj.jdbc.Driver");
            //打开数据库连接 第一个参数为数据库地址  后面2个参数分别为数据库用户名和密码
            // 实验楼中 MySQL 的用户名为: root, 密码为空。
            connection = DriverManager.getConnection("jdbc:mysql://39.102.42.170:3306/","root","ccl123...");
            //创建Statement
            Statement statement = connection.createStatement();
            //执行sql
            statement.execute("create database EXAMPLE");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                //关闭连接
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}