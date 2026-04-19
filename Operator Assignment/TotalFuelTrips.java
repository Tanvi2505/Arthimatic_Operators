import java.util.Scanner;
class TotalFuelTrips {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter distance 1: ");
        double d1 = sc.nextDouble();

        System.out.print("Enter distance 2: ");
        double d2 = sc.nextDouble();

        System.out.print("Enter distance 3: ");
        double d3 = sc.nextDouble();

        System.out.print("Enter mileage: ");
        double mileage = sc.nextDouble();

        double totalFuel = (d1 + d2 + d3) / mileage;
        System.out.println("Total Fuel Used: " + totalFuel);
    }
}