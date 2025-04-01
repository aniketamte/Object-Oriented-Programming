public class MultipleInheritance {
      public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
        dog.play();
    }
}

interface Animal {
    void eat();
}

interface Pet {
    void play();
}

class Dog implements Animal, Pet {
    public void eat() {
        System.out.println("Dog eats food.");
    }

    public void play() {
        System.out.println("Dog plays with a ball.");
    }
}
