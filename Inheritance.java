/*
 * 1) Multilevel Inheritance
 * =====> A class inherits from another class, which itself inherits from another class.
 */

 /*
  * 2) Single Inheritance
  =====> A subclass (child class) inherits from a single superclass (parent class).
  */

  /*
   * 3) Hierarchical Inheritance
   * ====> Multiple child classes inherit from a single parent class.
   */
class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

class Mammal extends Animal {
    void walk() {
        System.out.println("Mammals can walk.");
    }
}

class Dog extends Mammal {

    void bark() {
        System.out.println("Dog barks.");
    }
}

public class Inheritance {

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();  // Inherited from Animal
        dog.walk(); // Inherited from Mammal
        dog.bark(); // Own method
    }
}
