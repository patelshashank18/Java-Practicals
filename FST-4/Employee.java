public class Employee {

    /** Store employee first name */
    private String firstName;

    /** Store employee last name */
    private String lastName;

    /** Store employee email */
    private String email;

    /** Store employee phone number */
    private String phone;

    /** Store employee salary */
    private double salary;

    /** Constructor to initialize employee details */
    public Employee(String firstName, String lastName,
            String email, String phone,
            double salary) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
    }

    /** Get employee first name */
    public String getFirstName() {
        return firstName;
    }

    /** Get employee last name */
    public String getLastName() {
        return lastName;
    }

    /** Get employee email */
    public String getEmail() {
        return email;
    }

    /** Get employee phone number */
    public String getPhone() {
        return phone;
    }

    /** Get employee salary */
    public double getSalary() {
        return salary;
    }
}