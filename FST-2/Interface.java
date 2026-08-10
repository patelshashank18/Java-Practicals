// Interface declaration
interface Animal {

    // Abstract method
    void sound();
}

// Class implementing the interface
class Dog implements Animal {

    // Implementing the interface method
    public void sound() {
        System.out.println("Dog barks");
    }
}

// Main class
public class Interface {
    public static void main(String[] args) {

        // Create object of Dog class
        Dog d = new Dog();

        // Call the interface method
        d.sound();
    }
}