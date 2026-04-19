import java.util.Scanner;
class PartyCostSplit{
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a Bill:");
		int bill = sc.nextInt();
		System.out.println("Enter a Service Percentange:");
		int service = sc.nextInt();
		System.out.println("Enter a Friends:");
		int friends = sc.nextInt();

		int total= (bill*(1+service/100))/friends;
		System.out.println("total "+total);
	}

}