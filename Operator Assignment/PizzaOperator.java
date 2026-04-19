import java.util.Scanner;
class PizzaOperator{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number Of Slices:");
		int slice= sc.nextInt();
		System.out.println("Enter a Number of People:");
		int people=sc.nextInt();

		int total= slice/people;
		int rem=slice%people;
		System.out.println("total "+total);
		System.out.println("rem "+rem);
	}
}