import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class MainG7Stream {

    public static void main(String[] args) {
        List<String> G7 = Arrays.asList("USA", "Japan", "France", "Germany", "Italy", "UK", "Canada");
        Stream<String> sss = G7.stream();
        sss.forEach(s -> System.out.println(s));
        G7.forEach(System.out::println);
    }

}
