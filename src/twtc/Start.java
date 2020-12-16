package twtc;

public class Start {
    String name;
    float  age;
    int number;
    void hit() {
        System.out.println("KKOO");
    }
    public static void main (String[] args) {  //主方法
        Start mike = new Start();
        mike.name = "Jim.Mike";
        mike.age = 21;
        mike.number = 001;
    }
}