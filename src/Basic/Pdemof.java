package Basic;

//2020.05.11
//Java的基本数据类型
public class Pdemof {
    public static void main(String[] args) {

        //byte
        System.out.println("基本数据类型:byte 二进制位数:" +Byte.SIZE);
        System.out.println("包装类:java.lang.Byte");
        System.out.println("最小值:Byte.MIN_VALUE=" + Byte.MIN_VALUE);
        System.out.println("最大值:Byte.MAX_VALUE=" +Byte.MAX_VALUE);

        //short
        System.out.println("基本数据类型:short 二进制位数:" +Short.SIZE);
        System.out.println("包装类:java.lang.Short");
        System.out.println("最小值:Short.MIN_VALUE=" + Short.MIN_VALUE);
        System.out.println("最大值:Short.MAX_VALUE=" +Short.MAX_VALUE);

        //int
        System.out.println("基本数据类型:int 二进制位数:" +Integer.SIZE);
        System.out.println("包装类:java.lang.Integer");
        System.out.println("最小值:Byte.MIN_VALUE=" + Integer.MIN_VALUE);
        System.out.println("最大值:Byte.MAX_VALUE=" +Integer.MAX_VALUE);

        //long
        System.out.println("基本数据类型:long 二进制数:" +Long.SIZE);
        System.out.println("包装类:java.lang.Long");
        System.out.println("最小值:Long.MIN_VALUE=" + Long.MIN_VALUE);
        System.out.println("最大值:Long.MAX_VALUE=" +Long.MAX_VALUE);

        //float
        System.out.println("基本数据类型:float  二进制数:" +Float.SIZE);
        System.out.println("包装类:java.lang.Float");
        System.out.println("最小值:Float.MIN_VALUE=" + Float.MIN_VALUE);
        System.out.println("最大值:Float.MAX_VALUE=" +Float.MAX_VALUE);

        //double
        System.out.println("基本数据类型:double 二进制数:" +Double.SIZE);
        System.out.println("包装类:java.lang.Double");
        System.out.println("最小值:Double.MIN_VALUE=" + Double.MIN_VALUE);
        System.out.println("最大值:Double.MAX_VALUE=" +Double.MAX_VALUE);

        //char
        System.out.println("基本类型: char 二进制数:"+ Character.SIZE);
        System.out.println("包装类:java.lang.Character");
        //以数值的方式而不是字符形式将Character.MIN_VALUE输出到控制台.
        System.out.println("最小值:Character.MIN_VALUE=" +(int) Character.MIN_VALUE);
        //以数值形式而不是字符形式将Character,MAX_VALUE输出到控制台.
        System.out.println("最大值:Character.MAX_VALUE=" + (int)Character.MAX_VALUE);
    }
}

