import java.util.Scanner;

class CompoundGrowth3Times {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter principal amount:");
		double p = sc.nextDouble();

		System.out.println("Enter rate:");
		double r = sc.nextDouble();

		double amount = p * (1 + r/100) * (1 + r/100) * (1 + r/100);

		System.out.println("Final Amount = " + amount);
	}
}