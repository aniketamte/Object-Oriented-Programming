
public class Polymorphism {

    public static void main(String[] args) {
        MathOperations obj = new MathOperations();
        System.out.println(obj.add(5, 10));       // Calls method with two int parameters
        System.out.println(obj.add(5, 10, 15));   // Calls method with three int parameters
        System.out.println(obj.add(5.5, 2.2));    // Calls method with double parameters
    }
}

class MathOperations {

    // Method with two int parameters
    int add(int a, int b) {
        return a + b;
    }

    // Method with three int parameters
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method with double parameters
    double add(double a, double b) {
        return a + b;
    }
}
