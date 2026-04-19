import java.util.Scanner;
class TravelCostOperator{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Distance:");
		double distance =sc.nextDouble();
		System.out.println("Enter a Mileage:");
		double mileage=sc.nextDouble();
		System.out.println("Enter a Price:");
		double price=sc.nextDouble();


		double fuel=distance/mileage;
		double cost=fuel*price;

		System.out.println(cost);
	}
}