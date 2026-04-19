import java.util.Scanner;
class VolumeCost {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length: ");
        double l = sc.nextDouble();

        System.out.print("Enter width: ");
        double w = sc.nextDouble();

        System.out.print("Enter height: ");
        double h = sc.nextDouble();

        System.out.print("Enter cost per unit cube: ");
        double cost = sc.nextDouble();

        double volume = l * w * h;
        double totalCost = volume * cost;

        System.out.println("Total Cost: " + totalCost);
    }
}