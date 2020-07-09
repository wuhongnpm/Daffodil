package Basic;

import java.util.Scanner;

public class Pdemoo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //获取用户输入的一行数据，返回字符串
        String s = in.nextLine();
        System.out.println(s);

        while(!in.hasNext("exit")) {
            System.out.println(in.nextLine());
        }
        //关闭输入
        in.close();
    }
}
