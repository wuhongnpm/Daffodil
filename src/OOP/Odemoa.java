package OOP;

public class Odemoa {
    public static void main(String[] args) {
        Person ming = new Person();
        // ming.name = "Xiao Ming"; // 对字段name赋值
        //ming.age = 12; // 对字段age赋值
        ming.setName("Fogbow");
        ming.setBirth(2020);
        System.out.println(ming.getName());
    }
}

class Person {
    private String name;
    public int age;
    public int birth;
    public String id;

    public void setBirth(int birth) {
        this.birth = birth;
    }

    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }


    public int getAge() {
        return calAge(2019);
    }
    //private方法
    private int calAge(int currentYear) {
        return currentYear - this.birth;
    }

    /*省略this
    public String getid() {
        return  id;
    }
     */
    public void setId(String id) {
        this.id = id;
    }
}

