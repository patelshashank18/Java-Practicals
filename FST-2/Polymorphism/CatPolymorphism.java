package Polymorphism;

/**
 * Child class that extends AnimalPolymorphism.
 * Demonstrates method overriding.
 */
class CatPolymorphism extends AnimalPolymorphism {

    /**
     * Overrides the sound() method of the parent class.
     * Prints the sound made by a cat.
     */
    @Override
    void sound() {
        System.out.println("Cat says Meow.");
    }
}