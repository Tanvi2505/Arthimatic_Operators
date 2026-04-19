import java.util.Scanner;
class InterestOperator{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Principal Amount:");
		double amount=sc.nextDouble();
		System.out.println("Enter a Rate of Interest:");
		double rate=sc.nextDouble();
		System.out.println("Enter a Time:");
		double time=sc.nextDouble();

		double interest= (amount*rate*time)/100;
		System.out.println("interest "+interest);
		double total= amount+interest;
		System.out.println(total);
	}
}