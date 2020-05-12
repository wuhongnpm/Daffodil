package Basic;

public class Pdemoh {
    public static void main(String[] args) {
        FreshJuice juice = new FreshJuice();
        juice.size = FreshJuice.FreshJuiceSize.MEDIUM;
    }
    static class FreshJuice {
        enum FreshJuiceSize{ SMALL,MEDIUM, LARGE}
        FreshJuiceSize size;
    }
}


