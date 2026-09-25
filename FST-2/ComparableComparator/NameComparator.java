package ComparableComparator;

import java.util.Comparator;

/**
 * Comparator class to sort students by name.
 *
 * This class compares Student objects based
 * on their names.
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

        // Compare the names of two students
        return s1.name.compareTo(s2.name);
    }
}
