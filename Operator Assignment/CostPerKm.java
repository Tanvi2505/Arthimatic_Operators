import java.util.Scanner;
class CostPerKm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter total fuel cost: ");
        double cost = sc.nextDouble();

        System.out.print("Enter total distance: ");
        double distance = sc.nextDouble();

        double CostPerKm= cost/distance;

        System.out.println("CostPerKm "+CostPerKm);
    }
}