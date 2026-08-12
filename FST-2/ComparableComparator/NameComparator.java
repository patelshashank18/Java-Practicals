package ComparableComparator;

import java.util.Comparator;

// Comparator class to sort students by name
class NameComparator implements Comparator<Student> {

    // Compare two student names
    public int compare(Student s1, Student s2) {
        return s1.name.compareTo(s2.name);
    }
}