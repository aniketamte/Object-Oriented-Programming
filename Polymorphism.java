/*
 * #### Polymorphism in OOP (Java)
 * 
 * ====> Polymorphism is one of the core concepts of Object-Oriented Programming (OOP) that allows objects of different classes to be treated as objects of a common superclass. It enables one interface, multiple implementations, making code more flexible and reusable.
 * 
 * 
 * ###Types of Polymorphism in Java
 * 
 * 1) Compile-time Polymorphism (Method Overloading)
 * 
 * ===> Method overloading allows multiple methods in the same class to have the same name but with different parameters (number, type, or sequence).

 * ===> The compiler determines which method to call based on the method signature at compile time.
 
 
 2)  Runtime Polymorphism (Method Overriding)

 ===> Method overriding occurs when a subclass provides a specific implementation of a method that is already defined in its superclass.

 ===> The method in the subclass must have the same name, return type, and parameters as the method in the superclass.

 ===> The method that gets executed is determined at runtime based on the object's actual type (dynamic method dispatch).
 
 */
public class Polymorphism {

    public static void main(String[] args) {
        MathOperations obj = new MathOperations();
        System.out.println(obj.add(5, 10));       // Calls method with two int parameters
        System.out.println(obj.add(5, 10, 15));   // Calls method with three int parameters
        System.out.println(obj.add(5.5, 2.2));    // Calls method with double parameters

        Animal myAnimal = new Dog(); // Dog object referenced by Animal
        myAnimal.makeSound(); // Output: Dog barks

        myAnimal = new Cat(); // Cat object referenced by Animal
        myAnimal.makeSound(); // Output: Cat meows
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

class Animal {

    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {

    // Overriding the makeSound() method
    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {

    // Overriding the makeSound() method
    @Override
    void makeSound() {
        System.out.println("Cat meows");
    }
}
