

/**
 * Main class demonstrating Comparable and Comparator.
 */
public class ComparableComparator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Create ArrayList
        ArrayList<StudentData> list = new ArrayList<>();

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        // Take student details from the user
        for (int i = 0; i < n; i++) {

            System.out.print("Enter Roll No, Name and Marks: ");

            int roll = sc.nextInt();
            String name = sc.next();
            int marks = sc.nextInt();

            list.add(new StudentData(roll, name, marks));
        }

        System.out.println("\nOriginal List:");
        System.out.println(list);

        // Comparable - Sort by Roll Number
        Collections.sort(list);

        System.out.println("\nSorted by Roll Number:");
        System.out.println(list);

        // Comparator - Sort by Name
        Collections.sort(list, new NameComparator());

        System.out.println("\nSorted by Name:");
        System.out.println(list);

        // Comparator - Sort by Marks
        Collections.sort(list, new MarksComparator());

        System.out.println("\nSorted by Marks:");
        System.out.println(list);

        sc.close();
    }
}