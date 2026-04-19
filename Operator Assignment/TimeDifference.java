import java.util.Scanner;
class TimeDifference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter start time: ");
        int start = sc.nextInt();

        System.out.print("Enter end time: ");
        int end = sc.nextInt();

        int diff = end - start;
        System.out.println("Time Spent: " + diff);
    }
}