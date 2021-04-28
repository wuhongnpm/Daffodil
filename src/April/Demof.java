package April;
//方法重载
public class Demof {
    void f(int i) {
        System.out.println("i=" +i);
    }
    void f(float f) {
        System.out.println("f==" +f);
    }
    public static void main(String[] args) {
        Demof test = new Demof();
        test.f(1312);
        test.f(3123);

    }
}
