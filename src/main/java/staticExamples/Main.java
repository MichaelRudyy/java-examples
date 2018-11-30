package staticExamples;

public class Main {
    static {
        System.out.println("MAIN");
    }
    public static void main(String[] args) {
        Book book1 = new Book("name","loc");
        Book book2 = new Book("name1","loc2");
    }
}
