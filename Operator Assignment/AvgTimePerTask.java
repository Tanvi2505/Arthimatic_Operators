import java.util.Scanner;
class AvgTimePerTask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter total time: ");
        double totalTime = sc.nextDouble();

        System.out.print("Enter number of tasks: ");
        double tasks = sc.nextDouble();

        double avg = totalTime / tasks;
        System.out.println("Average Time per Task: " + avg);
    }
}