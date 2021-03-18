package twtc;
//格式化输出,%s表示字符串 %d表示数字 %n表示换行
public class Demom {
    public static void main(String[] args) {
        String name= "Jack";
        int hurt = 100;
        String title = "MUSH!";

        //使用+进行字符串连接,繁琐
        String ol = name + "他的名字" + hurt + "暴击,获得" +title;
        System.out.println(ol);

        //格式化输出,%s表示字符串,%d表示数字,%n表示换行
        String ol1 ="%s 他的名字 %d 暴击,获得%s %n";

        //printf格式化输出
        System.out.printf(ol1,name,hurt,title);
        //format格式化删除
        System.out.format(ol1,name,hurt,title);




    }

}
