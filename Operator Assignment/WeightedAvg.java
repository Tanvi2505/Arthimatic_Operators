import java.util.Scanner;
class WeightedAvg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter qty1 & price1: ");
        double q1 = sc.nextDouble();
        double p1 = sc.nextDouble();

        System.out.print("Enter qty2 & price2: ");
        double q2 = sc.nextDouble();
        double p2 = sc.nextDouble();

        double result = (q1*p1 + q2*p2) / (q1 + q2);
        System.out.println("Average Price: " + result);
    }
}