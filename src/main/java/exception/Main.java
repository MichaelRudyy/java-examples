package exception;

public class Main {
    public static void main(String[] args) {
        new Error();
        try{
            throw new NullPointerException();
        }catch (NullPointerException e){
            System.out.println("eee");
        }
    }
}
