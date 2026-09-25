package ComparableComparator;

/**
 * Represents an element with ID, name, and marks.
 *
 * This class implements Comparable to allow
 * elements to be sorted by ID.
 */
public class Element implements Comparable<Element> {

    int id;
    String name;
    double marks;

    /**
     * Constructor to initialize element details.
     *
     * @param id    the element ID
     * @param name  the element name
     * @param marks the element marks
     */
    Element(int id, String name, double marks) {

        // Assign values to the instance variables
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    /*
     * Comparable is used to sort elements by ID.
     */
    @Override
    public int compareTo(Element e) {
        return this.id - e.id;
    }

    // Returns element details as a String.
    @Override
    public String toString() {
        return id + " " + name + " " + marks;
    }
}
