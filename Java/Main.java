// Superclass
class Animal {
    // Method to be overridden
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Subclass
class Dog extends Animal {
    // Overriding the sound method in the Dog class
    void sound() {
        System.out.println("Dog barks");
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating an instance of the subclass
        Dog dog = new Dog();
        dog.sound();  // This will call the overridden method in the Dog class
    }
}