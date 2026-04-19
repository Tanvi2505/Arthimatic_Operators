import java.util.Scanner;
class InterestDifference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter principal: ");
        double p = sc.nextDouble();

        System.out.print("Enter rate 1: ");
        double r1 = sc.nextDouble();

        System.out.print("Enter rate 2: ");
        double r2 = sc.nextDouble();

        System.out.print("Enter time: ");
        double t = sc.nextDouble();

        double i1 = (p * r1 * t) / 100;
        double i2 = (p * r2 * t) / 100;

        double diff = i1 - i2;
        System.out.println("Interest Difference: " + diff);
    }
}