package twtc;

public class Demoh {
    String name;
    int price;
    public  void buy(){
        System.out.println("购买");
    }
    public  void effect() {
        System.out.println("效果图");
    }
    public static void main(String[] args) {
        Demoh a1= new Lifea();
        Demoh a2 = new Lifeb();
        System.out.print("SS");
        a1.effect();
        System.out.println("S2");
        a2.effect();

    }
}
