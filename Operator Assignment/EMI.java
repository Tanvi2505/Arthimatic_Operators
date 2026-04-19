import java.util.Scanner;
class EMI{
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a EMI:");
		int emi = sc.nextInt();
		System.out.println("Enter a Month:");
		int month = sc.nextInt();

		int total = emi*month;
		System.out.println("total "+total);
	}

}