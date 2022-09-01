import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Main {

    public static <T> void out(T content) {
        System.out.println(content);
    }

    static<T> void forEach(List<T> list, Consumer<T> consumer) {
        for (T t: list) {
            consumer.accept(t);
        }
    }

    public interface TwoArgument {
        public int myFunc(int a, int b);
    }

    static int sumx(List<Integer> list, TwoArgument two) {
        int sum = 0;
        for (int t: list) {
            sum += two.myFunc(t,t);
        }
    }

    static int valutacompute(List<Integer> bills, TwoArgument two, int currency) {
        int sum = 0;
        for (int t: list) {
            sum += two.myFunc(t, currency);
        }
        return sum;
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5);
        Consumer<Integer> consumer = (Integer x) -> System.out.println(x);
        //out(list);        forEach(list, consumer);
        TwoArgument twomult = (x,y) -> x*y;



    }
}
