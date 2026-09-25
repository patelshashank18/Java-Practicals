package ComparableComparator;

import java.util.Comparator;

/**
 * Comparator: Sort elements by name.
 *
 * This class sorts Element objects alphabetically
 * according to their names.
 */
public class SortByName implements Comparator<Element> {

    /*
     * Compares two elements by name.
     * The comparison is performed alphabetically.
     */
    @Override
    public int compare(Element a, Element b) {

        // Compare the names of two elements
        return a.name.compareTo(b.name);
    }
}
