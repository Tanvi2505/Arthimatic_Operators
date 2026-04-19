import java.util.Scanner;
class TimeFromDistance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter distance: ");
        double distance = sc.nextDouble();

        System.out.print("Enter speed: ");
        double speed = sc.nextDouble();

        double time = distance / speed;
        System.out.println("Time Taken: " + time);
    }
}