package intefaceEx;

public interface Inteface {
    int a = 0;
    int b =0;

    void printSMTH();

    default void print(){
        System.out.println("Hello from inteface");
    }

    default void setB(){
        b = 10;
    }
}
