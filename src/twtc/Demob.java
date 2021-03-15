package twtc;
//Java的引用

public class Demob {
    String name;
    float number;
    int age;
    public static void main(String[] args) {
        new Demob(); //创建一个Demob对象,访问需要引用代表这个对象
        //a就是引用,来指向指向Demob,引用可以多个,对象只有一个.
        Demob a = new Demob();
        Demob b = new Demob();
        System.out.println("Moring");
    }
    public class  Hm {
       String name;
       float  gender;
    }
    public class Hma { //Hma不继承Hm
         String name;
         float gender;
         int age;
    }
    public class hmb  extends Hm {
        int damage;


    }

}
