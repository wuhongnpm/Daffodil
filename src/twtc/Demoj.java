package twtc;
//数字和字符串,格式化输出,操纵字符串,StringBuffer
//装箱和拆箱
//所有的基本类型,都有对应的类类型,如int对应的类是Integer,即封装类.

public class Demoj {
    public static void main(String[] args) {
        int i =5;
        int i2 =10;
        //把一个基本类型的变量,转换为Integer对象,基本类型转为封装类型
        Integer it = new Integer(i);

        //把一个Integer对象,转换为一个基本类型的int,封装类型转为基本类型
        //int i2 = it.intValue();
        //数字封装类有Byte,Short,Integer,Long,Float,Double
        System.out.println(it instanceof Number);
        //Integer是Number的子类,所有打印true

        //自动装箱,不需要调用构造方法,通过=符号,自动把基本类型转换为类类型,即装箱.
        Integer it3 = new Integer(i2);
        //自动转换即装箱
        Integer it2 = i2;

        //自动拆箱
        int i4 = 15;
        //  Integer it = new Integer(i4);
        /*
        //封装类型转换成基本类型
        int i5 = it.intvalue();
        //自动转换就叫拆箱
        int i6 = it;
         */
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);


    }


}
