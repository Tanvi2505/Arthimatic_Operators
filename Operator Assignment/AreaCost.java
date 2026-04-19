import java.util.Scanner;
class AreaCost {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter area: ");
        double area = sc.nextDouble();

        System.out.print("Enter cost per unit area: ");
        double costPerUnit = sc.nextDouble();

        double totalCost = area * costPerUnit;
        System.out.println("Total Cost: " + totalCost);
    }
}