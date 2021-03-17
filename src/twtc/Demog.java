package twtc;
//多态--操作符
// 操作符的多态,+可以作为算术运算(两侧为整型),也可以作为字符串连接(任意为一字符串)
//类的多态,父类引用指向子类对象

public class Demog {
    public String age;
    protected  float name;
    public static void main(String[] args) {
     System.out.println("CCL");
     int a = 10;
     int b = 11;
     int c = a + b;
     System.out.println(c);

     int d = 12;
     String e = "13";
     String f = d+e;
     System.out.println(f);

    }
}
