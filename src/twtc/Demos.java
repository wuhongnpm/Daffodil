package twtc;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

//try catch处理异常
public class Demos {
    public static void main(String[] args) {
        File f = new File("D:\\MONO\\Daffodil\\src\\twtc\\Demoa.java");
        try {
            new FileInputStream(f);
            System.out.println("成功打开");
        }
        catch (FileNotFoundException e){
            System.out.println("NO exit");
            e.printStackTrace();
        }
    }
}
