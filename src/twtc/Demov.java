package twtc;

import java.io.File;

public class Demov {
    public static void main(String[] args) {
        File f = new File("D:\\MONO\\Daffodil\\src\\twtc\\Demoi.java");

        //以字符串数组的形式,返回当前文件夹下的所有文件(不包含子文件及子文件夹)
        f.list();

        //以文件数组的形式,返回当前文件夹下的所有文件(不包含子文件及子文件夹)
        File[]fs= f.listFiles();

        //以字符串形式返回获取所在文件夹
        f.getParent();
        //以文件形式返回获取所在文件夹
        f.getParentFile();
        //创建文件夹,如果父文件夹skin不存在,创建就无效
        f.mkdir();

        //创建文件夹,如果父文件夹skin不存在,就会创建父文件夹
        f.mkdirs();

        //创建文件夹,不存在,抛出异常
        f.getParentFile().mkdirs();
        //列出所有的盘符
        f.listRoots();

        //删除文件
        f.delete();

        //JVM结束时,删除文件,常用于临时文件删除
        f.deleteOnExit();

    }
}
