import java.util.Scanner;
class ReverseIncrease {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter final value: ");
        double finalValue = sc.nextDouble();

        System.out.print("Enter increase %: ");
        double increase = sc.nextDouble();

        double original = finalValue / (1 + increase / 100);
        System.out.println("Original Value: " + original);
    }
}