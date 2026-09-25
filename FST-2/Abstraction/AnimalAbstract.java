package Abstraction;

/**
 * Abstract class representing an animal.
 *
 * This class defines common behaviors
 * that must be implemented by child classes.
 */
abstract class AnimalAbstract {

    /*
     * Defines the sound behavior.
     * Child classes must provide the implementation.
     */
    abstract void sound();

    // Defines the eating behavior.
    abstract void eat();
}
