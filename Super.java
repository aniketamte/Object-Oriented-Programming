
public class Super {

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
    }
}

class Animal {

    Animal() {
        System.out.println("Animal constructor called.");
    }

    void eat() {
        System.out.println("Animal is eating.");
    }
}

class Dog extends Animal {

    Dog() {
        super(); // Calls parent class constructor
        System.out.println("Dog constructor called.");
    }

    void eat() {
        super.eat(); // Calls parent class method
        System.out.println("Dog is eating.");
    }
}
