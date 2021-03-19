package twtc;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demoy {
    public static void main(String[] args) {
        //InputStream是字节输入流,也是抽象类,只提供方法声明,不提供方法的具体实现
        //写入
        try {
          File f = new File("D:\\MONO\\Daffodil\\library\\Test.txt");
          byte data[] = {120,101};

          //创建基于文件的输出流
            FileOutputStream fos = new FileOutputStream(f);
             //写入
            fos.write(data);
            //关闭输出流
            fos.close();
      }
        catch (IOException e) {
            e.printStackTrace();
        }

    }
}
