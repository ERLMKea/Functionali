import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {

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

    public static void main(String[] args) {
        ZeroArgument z = () -> System.out.println("Hello world");
        printZero(z);
        OneArgument o = (str) -> System.out.println(str);
        o.myFunc("hej du der");
        printOne(o, "i am functionel with 1 argument");
    }
}
