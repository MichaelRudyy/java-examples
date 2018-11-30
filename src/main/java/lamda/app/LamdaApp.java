package lamda.app;

public class LamdaApp {
    public static void main(String[] args) {
        Operationable operation;
        operation = (x, y) -> {
            x++;
            y++;
            return x+y;
        };

        // or (x,y) -> x+y ;


        int result = operation.calculate(10,20);
        System.out.println(result);
    }
}

@FunctionalInterface
interface Operationable {
    int calculate(int x, int y);
}
