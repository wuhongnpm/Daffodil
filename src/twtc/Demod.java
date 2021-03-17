package twtc;

public class Demod {
    String name;
    float age;
    float shool;
    int days;
    public void showAddress(){
        System.out.println("打印this看到的地址:" +this);
    }

    public static void main(String[] args) {
        Demod jack = new Demod();
        jack.name = "Jack allen";

        System.out.println("打印对象看到的虚拟地址" + jack);
        jack.showAddress();

    }

}
