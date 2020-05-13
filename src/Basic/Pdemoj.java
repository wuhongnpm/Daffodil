//2020/05/12
//流程控制


package Basic;

public class Pdemoj {
    public static void main(String[] args) {
        int x = 10;
        //while语句
        while(x < 20 ) {
            System.out.print("Value of x:" +x);
            x++;
            System.out.print("\n");
        }
        //do..while语句
        do{
            System.out.print("value of x :" + x);
            x++;
            System.out.print("\n");
        }while(x<30);
        //for循环
        for (int m =10; m <20;m= m+1){
            if (x == 30) {
                break;
            }
            System.out.println("Value of x:" + x);
            System.out.println("\n");
        }

    }
}
