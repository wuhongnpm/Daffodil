package twtc;

import java.util.Date;

public class Demop {
    public static void main(String[] args) {
        //日期 日历 格式化解析
        //Date类 java.util.Date,Java中的对应日期是1970年1月1日 8点0份0秒

        //当前时间
        Date d1 = new Date();
        System.out.println("当前时间");
        System.out.println(d1);
        System.out.println();

        //从1970年1月1日,早8点0分0秒
        Date  d2 = new Date(5000);
        System.out.println("开始");
        System.out.println(d2);

        //getTime()得到一个long型的整数
        Date d3 = new Date();
        //打印当前时间
        /*
        System.out.println("当前时间:" + now.toString());
        System.out.println("当前时间GetTime()返回值是:" +now.getTime());

        Date zero = new Date();
        System.out.println("日期"+ zero);
*/

    }
}
