import java.util.Scanner;
class ShoppingOperator{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Product Amount:");
		int product=sc.nextInt();
		System.out.println("Enter a Discount Amount:");
		int discount=sc.nextInt();

		int total= product- (product*discount/100);
		System.out.println("total "+total);



			}
}