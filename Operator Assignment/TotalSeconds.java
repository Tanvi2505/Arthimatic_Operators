import java.util.Scanner;
class TotalSeconds {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter hours: ");
        int hours = sc.nextInt();

        System.out.print("Enter minutes: ");
        int minutes = sc.nextInt();

        int totalSeconds = hours * 3600 + minutes * 60;
        System.out.println("Total Seconds: " + totalSeconds);
    }
}