package staticExamples;

public class Book {
    private String name;
    private static String location;

    Book(String name,String location){
        System.out.println("Book name : " + name );
        this.name = name;
        this.location = location;
    }

    static{
        System.out.println("Hello");
    }



    static String getLocation(){
        return Book.location;
    }


}
