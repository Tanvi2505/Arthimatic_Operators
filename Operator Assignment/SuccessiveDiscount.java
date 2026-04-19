import java.util.Scanner;
class SuccessiveDiscount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter original price: ");
        double price = sc.nextDouble();

        System.out.print("Enter first discount %: ");
        double d1 = sc.nextDouble();

        System.out.print("Enter second discount %: ");
        double d2 = sc.nextDouble();

        double finalPrice = price * (1 - d1 / 100) * (1 - d2 / 100);
        System.out.println("Final Price: " + finalPrice);
    }
}