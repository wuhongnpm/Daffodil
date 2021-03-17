package twtc;

//重写:子类可以继承父类的对象方法,在继承后,重复提供该方法,叫做方法的重写,又叫覆盖override

public class Demof {
    String name;
    int price;
    public  void buy() {
        System.out.println("购买");
    }
    public void effect() {
        System.out.println("物品使用后,重复使用");
    }
    public class Lift extends Demof {
        public void  effect() {
            System.out.println("实际方法");
        }
    }
    public static void main(String[] args) {

    }

}
