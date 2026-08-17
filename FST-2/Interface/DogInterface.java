/*
 * Dog class implements Animal interface.
 */

/**
 * Dog provides implementation of sound().
 */
package Interface;

public class DogInterface implements AnimalInterface {

    // Implement interface method
    @Override
    public void sound() {
        System.out.println("Dog says Bark.");
    }
}