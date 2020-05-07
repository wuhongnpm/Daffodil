package OOP;

public class Odemob {
    public static void main(String[] args) {
        Iphone p = new Iphone("Li Hua",22);
        System.out.println(p.getName());
        System.out.println(p.getAge());
    }
}

class Iphone {
    private String name;
    private int age;

    public Iphone(String name, int age) {
        this.name = name;
        this.age  = age;
    }
    public String getName() {
        return this.name;
    }
    public int getAge() {
        return this.age;
    }
}
