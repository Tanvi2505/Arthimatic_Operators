import java.util.Scanner;
class OriginalBeforeTax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter final amount: ");
        double finalAmount = sc.nextDouble();

        System.out.print("Enter tax %: ");
        double tax = sc.nextDouble();

        double original = finalAmount / (1 + tax / 100);
        System.out.println("Original Amount: " + original);
    }
}