
/**
        package June;

import java.sql.Connection;
import java.sql.DriverManager;

public class Testb {
    public static void main(String[] args) {
        String JDBC_URL = "jdbc:mysql://39.102.42.170:3306/";
        String JDBC_USER= "root";
        String JDBC_PASSWORD = "ccl123...";

        //获取连接
        try(Connection conn = DriverManager.getConnection(JDBC_URL,JDBC_USER,JDBC_PASSWORD)){
            try(statement stmt = conn.createStatement()){
                try(ResultSet rs = stmt.executeQuery("SELECT id,grade,name,gender FROM students WHERE gender=1") ){
                    while(rs.next()) {
                        long id = rs.getlong(1);
                        long grade = rs.getLong(2);
                        String name = rs.getString(3);
                        int gender = rs.getInt(4);
                    }
                }
            }
        }

    }



}
**/