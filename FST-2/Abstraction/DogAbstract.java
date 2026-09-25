package Abstraction;

/**
 * DogAbstract provides implementations
 * for the AnimalAbstract methods.
 *
 * This class extends AnimalAbstract and
 * implements its abstract methods.
 */
class DogAbstract extends AnimalAbstract {

    /*
     * Implements the sound method
     * defined in the parent class.
     */
    @Override
    void sound() {

        // Display the dog's sound
        System.out.println("Dog barks");
    }

    /**
     * Displays the dog's eating behavior.
     */
    @Override
    void eat() {
        System.out.println("Dog eats");
    }
}
