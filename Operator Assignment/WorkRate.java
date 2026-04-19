import java.util.Scanner;
class WorkRate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter days for A: ");
        double a = sc.nextDouble();

        System.out.print("Enter days for B: ");
        double b = sc.nextDouble();

        double result = (a * b) / (a + b);
        System.out.println("Total Days Together: " + result);
    }
}