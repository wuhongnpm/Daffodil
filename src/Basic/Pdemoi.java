package Basic;

//2020/05/12
//变量类型
public class Pdemoi {
    static  int Click=0;  //类变量
    String  str="Hello World"; //实例变量

    public Pdemoi() {

    }

    public void method(){
        int i = 0;  //局部变量
    }

    //局部变量
    public void methoda(){
        int age = 0;
        age +=7;
        System.out.println("小狗年龄时"+ age);
    }

    //声明methoda
    public static void main(String[] args) {
       Pdemoi tt = new Pdemoi();
       tt.methoda();
    }

    //实例变量
    //此实例变量仅对子类可见
    public String name;
    //私有变量,仅在该类可见
    private double sex;
    //在构造器中对name赋值
    public Pdemoi (String empName) {
        name = empName;
    }
    //设定sex的值
    public  void setSex(double empSex){
        sex = empSex;
    }
    //打印信息
    public void printEmp(){
        System.out.println("名字:"+  name);
        System.out.println("薪水" + sex);
    }
    /*
    public static void main (String[] args) {
        Pdemoi  empOne = new Pdemoi("CCL");
        empOne.setSex(100.0);
        empOne.printEmp();
    }
     */



}
