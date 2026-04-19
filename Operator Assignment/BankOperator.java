import java.util.Scanner;
class BankOperator{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Bank Balance:");
		int bankbalance=sc.nextInt();
		System.out.println("Enter a Deposit:");
		int deposit=sc.nextInt();
		System.out.println("Enter a Withdraw:");
		int withdraw =sc.nextInt();

		int total=bankbalance+deposit-withdraw;
		System.out.println("total "+total);
	
	}
}