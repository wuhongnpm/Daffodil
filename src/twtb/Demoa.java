package twtb;

public class Demoa {
    public static void main(String[] args) {
        //JDBC(Java data base connection)
        //初始化驱动
        try {
            //驱动类com.mysql.jdbc.Driver在mysql-connector-java-8.0.23.jar中,无则抛错
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("数据驱动加载成功");
        }catch(ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
