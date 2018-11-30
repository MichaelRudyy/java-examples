import java.util.function.Predicate;

public class Main {
    static class A extends B {

        int count = 2;
        int bnInt;

        public A(int anInt, int bnInt) {
            super(anInt);
            this.bnInt = bnInt;
        }

        int dance() {
            return anInt + bnInt;
        }
    }

    static class B {
        int anInt;

        public B(int anInt) {
            this.anInt = anInt;
        }
    }

    public static void main(String[] args) {
        /*A a = new A(12,21);
        System.out.println(a.getClass());
        System.out.println(a instanceof A);
        System.out.println(a.anInt);
        System.out.println(a.dance());*/

/*        B b = new B(12);*/


        // Creating predicate
        Predicate<Integer> lesserthan = i -> (i < 18);

        // Calling Predicate method
        System.out.println(lesserthan.negate().test(20));

    }
}
