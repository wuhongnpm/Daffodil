package April;

public class democ {
    public static  String string = "LOSKSD";
    public static void main(String[] args) {
        Object object1 = new Object();
        Object object2 = object1;
        System.out.println(object1 == object2);

        System.out.println(democ.string);
        democ staticTest = new democ();
    }
}
