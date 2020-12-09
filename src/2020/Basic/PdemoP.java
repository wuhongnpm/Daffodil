package Basic;

//抛出异常
public class PdemoP {
    public static  void main(String[] args) {
        Integer a = 1;
        Integer b = 2;
        //当a或者b为null时，抛出异常
        if (a == null || b == null) {
            throw new NullPointerException();
        } else {
            System.out.println(a + b);
        }
    }

}
