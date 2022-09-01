import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
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

    public interface TwoArgument {
        public int myFunc(int a, int b);
    }

    public static void main(String[] args) {
        Soldier p1 = new Soldier(5, "Hans");
        List<Soldier> soldiers = new ArrayList<>();
        soldiers.add(p1);
        soldiers.add(new Soldier(4, "Jens"));
        soldiers.add(new Soldier(3, "Jens1"));
        soldiers.add(new Soldier(3, "Jens2"));
        //soldiers.forEach(System.out::println);
        soldiers.forEach(s -> System.out.println(s));

        Predicate<Soldier> isHighRanked = sld -> sld.getRank() > 4;

        Stream<Soldier> high = soldiers.stream().filter(isHighRanked);
        System.out.println("Is high ranked");
        high.forEach(s -> System.out.println(s));

        Predicate<Soldier> startsWithJ = s -> s.getName().startsWith("J");

        Stream<Soldier> highAndJ =  soldiers.stream().filter(isHighRanked).filter(startsWithJ);
        highAndJ.forEach(System.out::println);
    }
}
