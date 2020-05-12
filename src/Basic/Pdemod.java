package Basic;

//2020.05.04
//运算符:
//运算符对一个或者多个值进行运算,并得出一个运算结果.运算结果的类型有时是固定的,有时候会根据被计算的值变化,运算符本身不会更改变量的值.
//取模运算符 % 用来计算余数,负数,小数皆可取模.
//整数的除法运算 int除以int还是int,不会变成浮点数.
//比较运算符和布尔运算符,比较运算符:(> >=,< <= != ==),布尔运算符:! & && | ||
//小括号运算符: 可以包含任何元素符,绝对运算符的顺序.
//运算符的优先级别:见txt.
//位运算符,以0开头的整数位八进制,05则为十进制的5,以0x开头的整数位为十六进制.0xF为15
//按位运算符: 并&  或|  亦或^  取反~
//位移运算符: >>符号位不动,其余位右移,符号位后边补0,又称带符号右移. >>>符号位一起右移,左边补0,又称无符号右移.
//左移,右边补0,左移没有带符号位一说,因为符号位在最右侧.
//按位运算符和位移运算符不会改变原本的变量的值. 按位运算用以掩码mask,位移运算符则用以高效除以2
public class Pdemod {
    public static void main(String[] args) {
        int a = 100;
        System.out.println(a+1);
        System.out.println(a);

        a = a + 7 ;
        a +=a;
        System.out.println(a);

        //取模运算
        int  num  = 100;
        System.out.println(num % 2);
        System.out.println(num % -3);
        System.out.println(num % 4);
        System.out.println(num % 5);
        System.out.println(num % -6);

        //整数的除法运算
        int numa  = 10;
        int numc = 3;
        double numb = 3.0;
        System.out.println(numa / numb);
        System.out.println(numa / numc);

        //比较运算和布尔运算
        int numf = 10;
        int numg = 11;
        int numi = 10;
        System.out.println(numf > numi);
        System.out.println(numf >= numi);
        System.out.println(numf < numi);
        System.out.println(numf <= numi);
        System.out.println(numf != numi);
        System.out.println(numf == numi);

        boolean numhi = true;
        boolean numha = false;
        System.out.println(numhi && numha);
        System.out.println(numhi & numha);
        System.out.println(numhi || numha);
        System.out.println(numhi  | numha);

        //小括号元素父
        long numh;
        numh = numi * numf /(numa+numc-numf/numi*numc);
        System.out.println(numh);

        //位运算
         int wsa = 05;
         int wsb = 011;
         int wsc = 0xF;
         int wsd = 0x11;
        System.out.println(wsa);
        System.out.println(wsb);
        System.out.println(wsc);
        System.out.println(wsd);

        System.out.println(wsa & wsb);
        System.out.println(wsa | wsb);
        System.out.println(wsa ^ wsb);

        System.out.println(wsd >> 1);
        System.out.println(wsd >>> 1);
        System.out.println(wsd >>> 2);



    }
}
