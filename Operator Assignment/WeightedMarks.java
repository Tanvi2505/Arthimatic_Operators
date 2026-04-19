import java.util.Scanner;
class WeightedMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks1: ");
        double m1 = sc.nextDouble();

        System.out.print("Enter weight1: ");
        double w1 = sc.nextDouble();

        System.out.print("Enter marks2: ");
        double m2 = sc.nextDouble();

        System.out.print("Enter weight2: ");
        double w2 = sc.nextDouble();

        double score = (m1 * w1 + m2 * w2) / (w1 + w2);
        System.out.println("Final Weighted Score: " + score);
    }
}