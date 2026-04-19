import java.util.Scanner;
class ProfitPercentage{
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a Cost Price:");
		double cost = sc.nextDouble();
		System.out.println("Enter a Selling Price:");
		double selling = sc.nextDouble();

		double total = ((selling-cost)/cost)*100;
		System.out.println("total "+total);
	}
}