package ComparableComparator;

import java.util.Comparator;

/**
 * Comparator: Sort elements by marks.
 */
public class SortByMarks implements Comparator<Element> {

    /**
     * Compares two elements by marks.
     */
    public int compare(Element a, Element b) {
        return Double.compare(b.marks, a.marks);
    }
}