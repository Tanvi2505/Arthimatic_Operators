import java.util.Scanner;
class PercentageAfterExpenses{
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a revenue:");
		double revenue = sc.nextDouble();
		System.out.println("Enter a Expenses:");
		double expenses = sc.nextDouble();
		

		double total = revenue-expenses;
		System.out.println("total "+total);
		double netprofit = (total/expenses)*100;
		System.out.println("netprofit "+netprofit);
	}

}		