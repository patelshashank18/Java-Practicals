package ComparableComparator;

import java.util.Comparator;

/**
 * Comparator class to sort students by name.
 */
class NameComparator implements Comparator<Student> {

    /**
     * Compares two students by name.
     *
     * @param s1 first student
     * @param s2 second student
     * @return comparison result based on student names
     */
    @Override
    public int compare(Student s1, Student s2) {
        return s1.name.compareTo(s2.name);
    }
}