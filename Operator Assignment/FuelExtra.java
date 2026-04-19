import java.util.Scanner;
class FuelExtra{
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a Distance:");
		int distance = sc.nextInt();
		System.out.println("Enter a Mileage:");
		int mileage = sc.nextInt();
		System.out.println("Enter a Fuel:");
		int fuel = sc.nextInt();

		int total = (distance/mileage)+fuel;
		System.out.println("total "+total);

      }
}