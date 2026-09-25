package ComparableComparator;

import java.util.Comparator;

/**
 * Comparator: Sort elements by marks.
 *
 * This class sorts Element objects in descending
 * order according to their marks.
 */
public class SortByMarks implements Comparator<Element> {

    /**
     * Compares two elements by marks.
     *
     * @param a first element
     * @param b second element
     * @return comparison result based on marks
     */
    @Override
    public int compare(Element a, Element b) {

        // Compare marks in descending order
        return Double.compare(b.marks, a.marks);
    }
}
