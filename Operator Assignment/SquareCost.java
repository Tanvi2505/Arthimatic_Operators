import java.util.Scanner;
class SquareCost {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter side of square: ");
        double side = sc.nextDouble();

        System.out.print("Enter cost per unit area: ");
        double cost = sc.nextDouble();

        double area = side * side;
        double totalCost = area * cost;

        System.out.println("Total Cost: " + totalCost);
    }
}