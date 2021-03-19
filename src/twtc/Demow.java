package twtc;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Demow {
    public static void main(String[] args) {
        //流是一系列的数据,输入流InputStreram 输出流OutputStrream
        try {
            File f = new File("D:\\MONO\\Daffodil\\library\\Test.txt");
            //创建基于文件的输入流
            FileInputStream fis = new FileInputStream(f);
            //通过这个输入流,把数据读取到内存中
        }
        catch (IOException e ) {
            e.printStackTrace();
        }
    }
}
