import java.util.Scanner;
class MinutesToDays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter minutes: ");
        int minutes = sc.nextInt();

        int total = minutes/1440;

        System.out.println("total "+total);
    }
}