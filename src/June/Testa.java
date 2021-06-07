/**

package June;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Testa {
    //设置JDBC驱动器与数据库地址
    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://39.102.42.170:3306/";
    static final String USER = "root";
    static final String PASS = "ccl123...";

    public static  void main(String[] args) {
        Connection conn = null;
        PreparedStatement stmt = null;
        try {
            //注册jDBC驱动器
            Class.forName("com.mysql.cj.jdbc.Driver");
            //打开连接
            System.out.println("Connecting to databases....");
            conn = DriverManager.getConnection(DB_URL,USER,PASS);

            //执行查询
            System.out.println("Creating statement...");
            //修改某人名称
            String sql= "UPDATE Students set age=? WHERE id=?";
            stmt = conn.prepareStatement(sql);
            //将值绑定到参数，参数从左到右序号为1，2...
            stmt.setInt(1,22);
            stmt.setInt(2,1);;

            int rows = stmt.executeUpdate();
            System.out.println("被影响的行数："+rows);

            //查询所有记录，并显示
            sql= "SELECT id,name,age, FROM Students";
            ResultSet rs = stmt.executeQuery(sql);

            //处理结果集
            while (rs.next () ) {
                //检索
                int id = rs.getInt("id");
                int age = rs.getInt("age");
                String name = rs.getString("name");


                //显示
                System.out.print("ID: " + id);
                System.out.print(", Age: " + age);
                System.out.print(", Name: " + name);
                System.out.println();
            }
            //清理
            rs.close();
            stmt.close();
            conn.close();
        }finally{
            try{
                if(stmt!=null)
                    stmt.close();
            }catch(SQLException se2){
            }
            try{
                if(conn!=null)
                    conn.close();
            }catch(SQLException se){
                se.printStackTrace();
            }
        }
        System.out.println("Goodbye!");
    }
}
 *
 */