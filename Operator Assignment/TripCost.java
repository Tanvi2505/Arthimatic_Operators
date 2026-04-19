import java.util.Scanner;
class TripCost{
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a Distance:");
		double distance = sc.nextDouble();
		System.out.println("Enter a Mileage:");
		double mileage = sc.nextDouble();
		System.out.println("Enter a Petrol Price:");
		double petrol = sc.nextDouble();
		System.out.println("Enter a Toll:");
		double toll = sc.nextDouble();

		double totalcost = ((distance/mileage)*petrol)+toll;
		System.out.println("totalcost "+totalcost);
	}
}