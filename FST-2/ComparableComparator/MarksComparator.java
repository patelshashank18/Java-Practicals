

class MarksComparator implements Comparator<StudentData> {

    // Compare student marks
    public int compare(StudentData s1, StudentData s2) {
        return Integer.compare(s1.marks, s2.marks);
    }
}

