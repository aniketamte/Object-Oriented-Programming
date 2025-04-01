/*
 *   ### Method Overriding in Inheritance
 *   =====> When a subclass provides its own implementation of a method already defined in the parent class, it is called method overriding.
 */

 

class Animal {

    void makeSound() {
        System.out.println("Animals make different sounds.");
    }
}

class Dog extends Animal {

    @Override
    void makeSound() {
        System.out.println("Dog barks.");
    }
}

public class MethodOverride {

    public static void main(String[] args) {
        Animal myAnimal = new Dog();
        myAnimal.makeSound(); // Calls overridden method in Dog class
    }
}
