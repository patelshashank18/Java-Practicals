import java.util.Scanner;

/**
 * Demonstrates the calculation of a monthly EMI
 * based on loan amount, interest rate, and tenure.
 */
public class CalculateEMI {

    double loanAmount;
    double annualInterestRate;
    int loanTenure;
    double emi;

    /**
     * Calculates the monthly EMI using
     * the standard EMI formula.
     */
    void calculateEmi() {

        // Convert annual interest rate into monthly interest rate.
        double monthlyInterestRate = annualInterestRate / (12 * 100);

        /*
         * Calculate EMI using the loan amount,
         * monthly interest rate, and loan tenure.
         */
        emi = (loanAmount * monthlyInterestRate
                * Math.pow(1 + monthlyInterestRate, loanTenure))
                / (Math.pow(1 + monthlyInterestRate, loanTenure) - 1);

        // Display the calculated monthly EMI.
        System.out.printf("Monthly EMI: %.2f%n", emi);
    }

    /**
     * Main method to take loan details
     * from the user and calculate EMI.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {

        // Create a Scanner object for user input.
        Scanner sc = new Scanner(System.in);

        /*
         * Create an object of CalculateEMI
         * to store loan details and calculate EMI.
         */
        CalculateEMI emiCalculator = new CalculateEMI();

        // Read the loan amount from the user.
        System.out.print("Enter Loan Amount: ");
        emiCalculator.loanAmount = sc.nextDouble();

        // Read the annual interest rate from the user.
        System.out.print("Enter Annual Interest Rate (%): ");
        emiCalculator.annualInterestRate = sc.nextDouble();

        /**
         * Read the loan tenure in months
         * from the user.
         */
        System.out.print("Enter Loan Tenure (Months): ");
        emiCalculator.loanTenure = sc.nextInt();

        // Calculate and display the monthly EMI.
        emiCalculator.calculateEmi();

        /* Close the Scanner object after reading input. */
        sc.close();
    }
}
