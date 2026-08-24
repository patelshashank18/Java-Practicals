package ComparableComparator;

import java.util.Comparator;

/**
 * Comparator: Sort elements by name.
 */
public class SortByName implements Comparator<Element> {

    /**
     * Compares two elements by name.
     */
    public int compare(Element a, Element b) {
        return a.name.compareTo(b.name);
    }
}