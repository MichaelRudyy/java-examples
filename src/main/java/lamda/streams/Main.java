package lamda.streams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        phonesExampleMap();
    }

    private static void phonesExampleFlatMap(){
        
    }

    private static void phonesExampleMap() {
        Stream<Phone> phoneStream = getPhoneStream();
        phoneStream.map(p -> "Name: " + p.getName() + " Price: " + p.getPrice()).forEach(s -> System.out.println(s));
    }

    private static void phonesExampleFilter() {
        Stream<Phone> phoneStream = getPhoneStream();

        phoneStream.filter(p -> p.getPrice() < 50000).forEach(c -> System.out.println(c.getName()));
    }

    private static Stream<Phone> getPhoneStream() {
        return Stream.of(new Phone("iPhone 6S", 54000),
                new Phone("Lumia 950", 45000),
                new Phone("Samsung Galaxy S6", 40000));
    }

    private static void citiesExample1() {
        ArrayList<String> cities = new ArrayList<String>();
        Collections.addAll(cities, "London", "Paris", "Madrid", "Saint-Entene", "Berlin", "Brussel");

        Stream<String> citiesStram = cities.stream();
        citiesStram.filter(p -> p.length() == 6).forEach(s -> System.out.println(s));
    }

    private static void citiesExample() {
        ArrayList<String> cities = new ArrayList<String>();
        Collections.addAll(cities, "London", "Paris", "Madrid", "Saint-Entene");
        cities.stream()
                .filter(p -> p.length() > 5)
                .forEach(System.out::println);
    }

    private static void numbersExample() {
        int[] numbers = {-5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5};

        long count = IntStream.of(numbers).filter(w -> w > 0).count();
        int[] plusNumbers = IntStream.of(numbers).filter(w -> w > 0).toArray();
        for (int a : plusNumbers) {
            System.out.println(a);
        }
    }
}
