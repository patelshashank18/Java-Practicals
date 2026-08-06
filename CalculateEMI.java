import java.util.Scanner;

public class Practical8 {

    double loanAmount;
    double annualInterestRate;
    int loanTenure;
    double emi;

    void calculateEmi() {

        double monthlyInterestRate = annualInterestRate / (12 * 100);

        emi = (loanAmount * monthlyInterestRate
                * Math.pow(1 + monthlyInterestRate, loanTenure))
                / (Math.pow(1 + monthlyInterestRate, loanTenure) - 1);

        System.out.printf("Monthly EMI: %.2f%n", emi);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Practical8 emiCalculator = new Practical8();

        System.out.print("Enter Loan Amount: ");
        emiCalculator.loanAmount = sc.nextDouble();

        System.out.print("Enter Annual Interest Rate (%): ");
        emiCalculator.annualInterestRate = sc.nextDouble();

        System.out.print("Enter Loan Tenure (Months): ");
        emiCalculator.loanTenure = sc.nextInt();

        emiCalculator.calculateEmi();

        sc.close();
    }
}