package April;

public class demob {
    //方法
    private  static  void methodDemoa() {
        int a1 = 100;
        int b1 = 1200;
        System.out.println("Hello ShiYu "+a1);
    }

    public static void main(String[] args) {
        System.out.println("Hello Dave Allen");
        //变量

        int a = 101;
        System.out.println(a);
        int b = 22 ;
        int c = (a - b +a )/2 *10;
        System.out.println(c);
        if (c < a+b){
            System.out.println(c);
        }else{
            System.out.println(a);
        }
        //常量
        final double PI = 3.131;
        System.out.println(PI);

        //方法调用
        methodDemoa();

        //if语句
        if (a > b) {
            System.out.println("Luck");
        }else if (a == b) {
            System.out.println("COMO");
        }else {
            System.out.println("TOMO");
        }

        //switch语句
        switch(a) {
            case 1:
                System.out.println("MOKO");
                break;
            case 101:
                System.out.println("Feibo");
                break;
            default:
                System.out.println("Mobby");
        }
        //计算1--1000中所有偶数的和
        int sum = 0;
        for (int i =1; i<1000; i++) {
           if(0 == i % 2) {
               sum += i;
           }
           System.out.println(sum);
        }

    }
}
