
class Animal {
    String name;

    Animal(String name) {
        this.name = name;
    }

    void makeSound() {
        System.out.println("Some generic animal sound");
    }
}

// Derived class representing a specific type of Animal - Mammal
class Mammal extends Animal {
    Mammal(String name) {
        super(name);
    }

    // Override makeSound method to provide a specific sound for mammals
    @Override
    void makeSound() {
        System.out.println("Mammal sound");
    }

    void giveBirth() {
        System.out.println("Giving birth to live young");
    }
}

// Another derived class representing a specific type of Mammal - Cat
class Cat extends Mammal {
    Cat(String name) {
        super(name);
    }

    // Override makeSound method to provide a specific sound for cats
    @Override
    void makeSound() {
        System.out.println("Meow");
    }

    void purr() {
        System.out.println("Purring");
    }
}

public class IsA {
    public static void main(String[] args) {
        // Creating instances of classes
        Animal genericAnimal = new Animal("Generic Animal");
        Mammal genericMammal = new Mammal("Generic Mammal");
        Cat myCat = new Cat("Whiskers");

        // Using the instances and demonstrating the "is-a" relationship
        genericAnimal.makeSound();   // Output: Some generic animal sound

        genericMammal.makeSound();   // Output: Mammal sound
        genericMammal.giveBirth();   // Output: Giving birth to live young

        myCat.makeSound();           // Output: Meow
        myCat.purr();                // Output: Purring
        myCat.giveBirth();           // Output: Giving birth to live young (inherited from Mammal)
    }
}
