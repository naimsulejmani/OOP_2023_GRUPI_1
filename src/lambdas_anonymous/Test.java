package lambdas_anonymous;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
        String[] emrat = {"Filan", "Fistek", "Abaz", "etj"};


        List<String> emratMeF = Stream.of(emrat).filter(s -> s.startsWith("F")).toList();

        List<Integer> lengthOfNames = Stream.of(emrat).map(s -> s.length()).toList();

        lengthOfNames.stream().forEach(i -> {
            if (i > 5)
                System.out.println(i);
        });


        Power power1 = (x, y) -> x * x * x * y * y;

        //Method referencing
        Power power = Math::pow;

    }
}
