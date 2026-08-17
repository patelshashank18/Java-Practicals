package ComparableComparator;

import java.util.Comparator;

/**
 * Comparator class to sort students by marks.
 */
class MarksComparator implements Comparator<Student> {

    /**
     * Compares two students by marks.
     *
     * @param s1 first student
     * @param s2 second student
     * @return comparison result based on student marks
     */
    @Override
    public int compare(Student s1, Student s2) {
        return Integer.compare(s1.marks, s2.marks);
    }
}