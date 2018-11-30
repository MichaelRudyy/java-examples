package lamda.examples;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Example1 {
    public static void main(String[] args) {
        //func1();
        System.out.println(
                sumAll(
                        Arrays.asList(1, 2, 3, 1, 2, 3, 4, 2, 3),
                        n -> n % 2 == 0
                )
        );
        String a = "toPrint";

        Runnable r = ()-> System.out.println("running from cops");
        r.run();

    }

    private static void func1() {
        List list = Arrays.asList(1, 2, 3, 1, 2, 3, 4, 2, 3);

        list.forEach(a -> System.out.println(a));
        list.forEach(System.out::println);
    }


    public static int sumAll(List<Integer> numbers, Predicate<Integer> p) {
        int total = 0;
        for (int number : numbers) {
            if (p.test(number)) {
                total += number;
            }
        }
        return total;
    }
}
