package Else;

import java.sql.Driver;
import java.sql.DriverManager;

public class JDBCmysql {
    //注册mysql驱动程序
    try {
        Class.forName("com.mysql.jdbc.Driver");
    }
    catch(ClassNotFoundException ex) {
        System.out.println("Error:unable to load driver class!");
        System.exit(1);
    }
    Driver driver = new com.mysql.jdbc.Driver();
    DriverManager.registerDriver(driver);
    

}
