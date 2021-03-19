package twtc;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Demoz {
    public static void main(String[] args) {
        //所有的流,无论是输入流还是输出流,使用完毕,都应该关闭,否则就浪费.
        //常见的方式在try中关闭,在finally中关闭.
        File f = new File("D:\\MONO\\Daffodil\\library\\Test.txt");
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(f);
            byte[] all = new byte[(int) f.length()];
            fis.read(all);
            for (byte b:all) {
                System.out.println(b);
            }
        }catch(IOException e) {
            e.printStackTrace();
        }finally {
            if (null !=fis)
                try {
                    fis.close();
                }catch (IOException e) {
                    e.printStackTrace();
                }
        }


    }
}
