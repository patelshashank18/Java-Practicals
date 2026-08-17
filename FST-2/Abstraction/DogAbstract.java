package Abstraction;

/**
 * DogAbstract provides implementations
 * for the AnimalAbstract methods.
 */
class DogAbstract extends AnimalAbstract {

    /**
     * Displays the dog's sound.
     */
    @Override
    void sound() {
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