package Basic;


//捕获异常

public class Pdemoq {
       public static void main(String[] args) {
           try {
               //下面定义一个try语句块
               System.out.println("I am So Stupid");
               Class<?> tempClass = Class.forName("");
               //声明一个空的Class对象用于引发“类未发现异常”
               System.out.println("Bye Jule");
           } catch (ClassNotFoundException e) {
               //下面定义一个catch语句块
               System.out.println("I am catch block");

               e.printStackTrace();
               //printStackTrace（）的意义在于命令行打印异常信息在程序中出错的位置及原因

               System.out.println("Goodbye! Catch block");
           } finally {
               //下面定义一个finalyy语句块
               System.out.println("I am finalyy block");

           }
       }

}
