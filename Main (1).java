package test;
class Animal {
    void makeSound() {
        System.out.println("Some generic animal sound");
    }
}

// Subclass
class Cat extends Animal {
    // Overriding makeSound to "bark"
    @Override
    void makeSound() {
        System.out.println("Bark!");
    }
}

// Main class to test the program
public class Main {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        myAnimal.makeSound();  // Output: Some generic animal sound

        Cat myCat = new Cat();
        myCat.makeSound();     // Output: Bark!
    }
}
