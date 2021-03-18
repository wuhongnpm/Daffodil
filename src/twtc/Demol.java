package twtc;
//java.lang.Math提供一些数学运算方法,以静态方法的形式存在
public class Demol {
    public static void main(String[] args) {
        float f1 = 5.4f;
        float f2 = 5.4f;

        //四舍五入
        System.out.println(Math.round(f1));
        System.out.println(Math.round(f2));

        //取0到1之间的随机浮点数
        System.out.println(Math.random());

        //取0到10之间的随机整数
        System.out.println((int)(Math.random()*10));

        //开方
        System.out.println(Math.sqrt(9));

        //次方
        System.out.println(Math.pow(2,4));

        //π
        System.out.println(Math.PI);

        //自然常数
        System.out.println(Math.E);

    }
}
