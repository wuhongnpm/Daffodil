package gui;


import javax.swing.*;

public class Testdemoa {
    public static void main(String[] args) {
        //主窗体
        JFrame f = new JFrame("KFC");

        //主窗体设置大小
        f.setSize(400,400);
        //主窗体设置位置
        f.setLocation(200,200);
        //主窗体中的组件位置为绝对定位
        f.setLayout(null);
        //按钮组件
        JButton b= new JButton("AKKK");
        //同时设置组件的大小和位置
        b.setBounds(50,50,50,50);
        //把按钮加入主窗体
        f.add(b);
        //关闭窗体时,退出程序
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //让窗体变得可见
        f.setVisible(true);
    }
}
