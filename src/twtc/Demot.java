package twtc;

import java.io.File;

public class Demot {
    public static void main(String[] args) {
        //文件和文件夹都是用File代表
        //绝对路径
        File f1 = new File("D:\\MONO\\Daffodil\\library");
        System.out.println("f1的绝对路径:" +f1.getAbsolutePath());

        //相对路径
        File f2 = new File("library");
        System.out.println("f2的绝对路径" +f2.getAbsolutePath());

        //把f1作为父目录创建文件对象
        File f3 = new File(f1,"Library");

        System.out.println("f3的绝对路径:" +f3.getAbsolutePath());


    }
}
