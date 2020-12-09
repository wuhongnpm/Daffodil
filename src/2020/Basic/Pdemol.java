package Basic;

//流程控制-- if ..else语句
public class Pdemol {
    public static void main(String[] args) {
        int apple = 10;
        boolean applenumber = true;
        if(applenumber){
            apple = apple+2;
            System.out.println("We have"+apple+"个苹果");
        }else {
            System.out.println("Only have"+apple+"个苹果");
        }
        int a = 1000;
        int b = 20;
        int c = 30;
        if (a > b ){
            if(a>c) {
                System.out.println(a);
            }else{
                System.out.println(c);
            }

        }else if (b>c) {
            System.out.println(b);
        }else{
            System.out.println(c);
        }

    }
}
