package intefaceEx;

public class Main {
    public static void main(String[] args) {
        Inteface ii = new IntefaceImpl();
        Inteface i2 = new IntefaceImpl();

        ii.printSMTH();
        ii.print();

        ii.setB();
        System.out.println(ii.b);
        System.out.println(i2.b);
    }

    static class IntefaceImpl implements Inteface{

        @Override
        public void printSMTH() {
            System.out.println("Hi from Implementation");
        }
    }
}
