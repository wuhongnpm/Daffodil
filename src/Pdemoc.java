//Java基本数据类型,二进制,数字,布尔和字符的基本数据类型,使用各种基本数据类型.
//数字的基本数据类型:整数类型:bye(-128~127),short (-32768-32767)
//int(-2147483648~2147483647,在java中整数群省值是int类型),long(-9223372036854774808~9223372036854774807)
//浮点(小数)类型:float,有精度.double的精度是float的两倍.
//布尔和字符数据类型: bollean(true/false),char,值域是所有字符.
//2020.05.04
public class Pdemoc {
    public static void main(String[] args) {
          int a  = 10000;
          long number = 22200001;
          System.out.println(1/3.0);
          System.out.println(1>3.0);
          System.out.println(1<3.0);
          System.out.println("ABC");
          System.out.println('A');
          //''单引号只能写一个字符.
          byte bytevar = 127;
          System.out.println(bytevar);

          short shortvar = -3000;
          System.out.println(shortvar);

          int intvar  = 30000;
          System.out.println(intvar);

          long longvar = 99999;
          System.out.println(longvar);

          float floatvar = 100.111111f;
          System.out.println(floatvar);

          double doublevar = 100.11111111;
          System.out.println(doublevar);

          boolean righthing = true;
          boolean falsething = false;
          System.out.println(righthing);

          char ch = 'A';
          System.out.println(ch);

    }
}
