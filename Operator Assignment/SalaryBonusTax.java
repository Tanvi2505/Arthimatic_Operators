import java.util.Scanner;
class SalaryBonusTax{
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a Salary:");
		double salary = sc.nextDouble();
		System.out.println("Enter a Bonus:");
		double bonus = sc.nextDouble();
		System.out.println("Enter a Tax:");
		double tax = sc.nextDouble();

		double totalsalary = salary+bonus;
		double taxrate= (tax/100)*totalsalary;
		double totalincome= totalsalary-taxrate;
		System.out.println("total "+totalsalary);
		System.out.println("taxrate "+taxrate);
		System.out.println("totalincome "+totalincome);
	}
}

