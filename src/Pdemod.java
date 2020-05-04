//2020.05.04
//运算符:
//运算符对一个或者多个值进行运算,并得出一个运算结果.运算结果的类型有时是固定的,有时候会根据被计算的值变化,运算符本身不会更改变量的值.
//取模运算符 % 用来计算余数,负数,小数皆可取模.
//整数的除法运算 int除以int还是int,不会变成浮点数.
//比较运算符和布尔运算符,比较运算符:(> >=,< <= != ==),布尔运算符:! & && | ||
//小括号运算符: 可以包含任何元素符,绝对运算符的顺序.
//运算符的优先级别:见txt.
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

    }
}
