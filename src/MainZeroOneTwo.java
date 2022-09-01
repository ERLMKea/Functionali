public class MainZeroOneTwo {

    public interface ZeroArgument {
        public void myFunc();
    }

    public static void printZero(ZeroArgument zf) {
        zf.myFunc();
    }

    public interface OneArgument {
        public void myFunc(String str);
    }

    public static void printOne(OneArgument of1, String str) {
        of1.myFunc(str);
    }

    public interface TwoArgument {
        public int myFunc(int a, int b);
    }

    public static void main(String[] args) {
        ZeroArgument z = () -> System.out.println("Hello world");
        printZero(z);
        OneArgument o = (str) -> System.out.println(str);
        o.myFunc("hej du der");
        printOne(o, "i am functionel with 1 argument");
        TwoArgument two = (x, y) -> x+y;
        int i1 = two.myFunc(5,6);
        System.out.println("i1" + i1);
        TwoArgument twomult = (x, y) -> x*y;
        int i2 = twomult.myFunc(4,5);
        System.out.println("i2" + i2);

    }


}
