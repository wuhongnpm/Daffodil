package twtc;

public class Demoe {

    public interface grape {
        public void grapeId();
        //创建一个借口,声明一个方法
    }
    public interface  orange {
        public void orangeId();
    }

    public class grapeone extends Demoe implements grape { //使用implements方法
        @Override
        public void  grapeId() {
            System.out.println("方法1");
        }
    }
    public class orangeone extends  Demoe implements  orange {
        @Override
        public  void orangeId() {
            System.out.println("方法2");
        }
    }
    public class fruits extends  Demoe implements orange,grape {
        @Override
        public void  grapeId() {
            System.out.println("方法1");
        }
        @Override
        public  void orangeId() {
            System.out.println("方法2");
        }

    }

    public static void main(String[] args) {
        System.out.println("Hello");
    }
}
