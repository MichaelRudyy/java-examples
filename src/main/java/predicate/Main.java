package predicate;

import java.util.function.Predicate;

public class Main {
    public static Predicate<String> biggerThen10 = (i) -> i.length()>10;

    public static void main(String[] args) {
        System.out.println(

                biggerThen10.test("12345")

        );
    }
}
