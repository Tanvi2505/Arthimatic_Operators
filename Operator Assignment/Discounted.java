import java.util.Scanner;
class Discounted{
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a Final Price:");
		int finalprice = sc.nextInt();
		System.out.println("Enter a Discount:");
		int discount = sc.nextInt();

		int total = finalprice/(1-discount/100);
		System.out.println("total "+total);
	}
}