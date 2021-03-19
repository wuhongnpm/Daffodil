package twtc;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

//字节流形式写入文件

public class Demox {
    public static void main(String[] args) {
        //InputStream字节输入流,抽象类,只提供方法声明,不提供方法的具体实现
        //OutputStream 字节输入流,用于以字节的形式读取和写入数据
        try {
            //读取文件
            File f = new File("D:\\MONO\\Daffodil\\library\\Test.txt");
            //创建基于文件的输入流
            FileInputStream fis = new FileInputStream(f);
            //创建字节数组,长度即文件的长度
            byte[] all = new byte[(int) f.length()];
            //以字节流的形式读取文件所有内容
            fis.read(all);
            for (byte b:all) {
                System.out.println(b);
            }
            //使用完流,关闭
            fis.close();
        }catch (IOException e) {
            e.printStackTrace();
        }


    }

}
