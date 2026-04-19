import java.util.Scanner;
class MonthlySavings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter monthly income: ");
        double income = sc.nextDouble();

        System.out.print("Enter monthly expenses: ");
        double expenses = sc.nextDouble();

        double savings = income - expenses;
        double yearlySavings = savings * 12;

        System.out.println("Monthly Savings: " + savings);
        System.out.println("Yearly Savings: " + yearlySavings);
    }
}