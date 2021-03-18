package twtc;

public class Demon {
    public static void main(String[] args) {
        //保存一个字符时使用char,char对应的封装类是Character
        char a = 'a';
        char b = '1';
        char c = '中';
        char d = 'a';
        Character  e = a;//自动装箱
        a = c; //自动拆箱

        System.out.println(Character.isLetter('a')); //判断是否为字母
        System.out.println(Character.isDigit('a')); //判断是否为数字
        System.out.println(Character.isWhitespace('a')); //判断是否是空白
        System.out.println(Character.isUpperCase('a'));//是否是大写
        System.out.println(Character.isLowerCase('a'));//是否是小写

        System.out.println(Character.toUpperCase('a')); //转换为大写
        System.out.println(Character.toLowerCase('A')); //转换为小写

        //不能直接把一个字符转换成字符串



    }
}
