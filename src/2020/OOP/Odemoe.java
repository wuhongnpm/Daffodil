//2020/05/11

package OOP;

public class Odemoe {
    int demoeAge;
    public Odemoe(String name) {
        System.out.println("小狗的名字是:" + name);
    }
    public void setDemoeAge(int age) {
        demoeAge = age;
    }
    public  int getDemoeAge() {
        System.out.println("小狗的年龄为:" + demoeAge);
        return demoeAge;
    }
    public static void main(String[] args) {
        /*创建对象*/
        Odemoe mydemo = new Odemoe("Tommy");
        //通过方法来设定age
        mydemo.setDemoeAge(2);
        //调用另一个方法获取age
        mydemo.getDemoeAge();
        //或者下面这样访问成员变量
        System.out.println("变量值:" + mydemo.demoeAge);
    }


}