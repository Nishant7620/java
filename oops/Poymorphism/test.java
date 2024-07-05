// Polymorphism achieve using method overloading

class Calculator {

    static void sum(int a, int b) {
        System.out.println(a + b);
    }

    static void sum(int a, int b, int c) {
        System.out.println(a + b + c);
    }

}

public class test {

    public static void main(String[] args) {
        Calculator sc = new Calculator();
        sc.sum(5, 3);
        sc.sum(5, 3, 2);

    }
}
