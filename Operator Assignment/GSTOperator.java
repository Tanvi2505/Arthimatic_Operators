import java.util.Scanner;
class GSTOperator{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Price Of Product:");
		double product = sc.nextDouble();
		System.out.println("Enter a GST:");
		double gst=sc.nextDouble();

		double price= product+(product*gst)/100;
		System.out.println("price "+price);
	}
}