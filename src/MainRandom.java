import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainRandom {

    public static void infiniteLoop() {
        Supplier<Double> ran = () -> Math.random();
        //Stream<Double> strran = Stream.generate(ran);
        double dd = Math.random();
        Long ii =  Math.round(dd);
        Function<Double, Long> dblround = d -> Math.round(d*100);
        Predicate<Long> longEqual = l -> l % 2 == 0;
        //Stream<Long> lstr = Stream.generate(ran).map(dblround);

//        Stream<Long> lstr =
        Stream.generate(ran)
                .map(dblround)
                .filter(longEqual)
                .limit(12)
                .forEach(System.out::println);
    }


    public static void main(String[] args) {
        Supplier<Double> ran = () -> Math.random();
        Function<Double, Long> dblround = d -> Math.round(d*100);
        Predicate<Long> longEqual = l -> l % 2 == 0;

        //Stream<Long> lstr =
        ArrayList<Long> llst =
                Stream.generate(ran)
                        .map(dblround)
                        .filter(longEqual)
                        .limit(12)
                        .collect(Collectors.toCollection(ArrayList::new));

        llst.forEach(l -> System.out.println(l));
    }

}
