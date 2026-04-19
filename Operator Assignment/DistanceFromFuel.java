import java.util.Scanner;
class DistanceFromFuel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter fuel cost: ");
        double fuelCost = sc.nextDouble();

        System.out.print("Enter price per litre: ");
        double pricePerLitre = sc.nextDouble();

        System.out.print("Enter mileage: ");
        double mileage = sc.nextDouble();

        double litres = fuelCost / pricePerLitre;
        double distance = litres * mileage;

        System.out.println("Total Distance: " + distance);
    }
}