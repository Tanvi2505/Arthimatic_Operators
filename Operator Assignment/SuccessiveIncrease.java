import java.util.Scanner;
class SuccessiveIncrease {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter price: ");
        double price = sc.nextDouble();

        double result = price * 1.10 * 1.20;
        System.out.println("Final Price: " + result);
    }
}