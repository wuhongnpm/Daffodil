package twtc;

import java.io.File;
import java.util.Date;

public class Demou {
    public static void main(String[] args) {
        File f = new File("D:\\MONO\\Daffodil\\src\\twtc\\Demod.java");
        System.out.println("当前文件是:" +f);

        //文件是否存在
        System.out.println("判断是否存在"+f.exists());
        //是否是文件夹
        System.out.println("判断是否文件夹"+f.isDirectory());
        //是否是文件(非文件夹)
        System.out.println("判断是否是文件:"+f.isFile());
        //文件长度
        System.out.println("获取文件的长度:"+f.length());
        //文件最后修改时间
        long time = f.lastModified();
        Date d = new Date(time);
        System.out.println("获取文件的最后修改时间:" +d);
        //设置文件修改时间为1970
        f.setLastModified(0);

        //文件重命名
        File f2 = new File("D:\\MONO\\Daffodil\\src\\twtc\\Demod.java");
        f.renameTo(f2);
        System.out.println("D:\\MONO\\Daffodil\\src\\twtc\\Demod.java");

        System.out.println("注意事项");
    }

}
