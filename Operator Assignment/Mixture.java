import java.util.Scanner;
class Mixture {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter volume1: ");
        double v1 = sc.nextDouble();

        System.out.print("Enter concentration1: ");
        double c1 = sc.nextDouble();

        System.out.print("Enter volume2: ");
        double v2 = sc.nextDouble();

        System.out.print("Enter concentration2: ");
        double c2 = sc.nextDouble();

        double result = (v1 * c1 + v2 * c2) / (v1 + v2);
        System.out.println("Final Concentration: " + result);
    }
}