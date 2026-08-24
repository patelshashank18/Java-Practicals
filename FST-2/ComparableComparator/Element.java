package ComparableComparator;

/**
 * Represents an element with ID, name and marks.
 */
public class Element implements Comparable<Element> {

    int id;
    String name;
    double marks;

    /**
     * Constructor to initialize element details.
     */
    Element(int id, String name, double marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    /**
     * Comparable: Sort elements by ID.
     */
    @Override
    public int compareTo(Element e) {
        return this.id - e.id;
    }

    /**
     * Returns element details.
     */
    public String toString() {
        return id + " " + name + " " + marks;
    }
}