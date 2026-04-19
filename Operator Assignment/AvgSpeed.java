import java.util.Scanner;
class AvgSpeed {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter speed 1: ");
        double s1 = sc.nextDouble();

        System.out.print("Enter speed 2: ");
        double s2 = sc.nextDouble();

        double avg = (2 * s1 * s2) / (s1 + s2);
        System.out.println("Average Speed: " + avg);
    }
}