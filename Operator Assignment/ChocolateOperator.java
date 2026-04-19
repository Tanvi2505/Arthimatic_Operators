import java.util.Scanner;
class ChocolateOperator{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number of Chocolates:");
		int chocolate = sc.nextInt();
		System.out.println("Enter a Number of Students:");
		int student=sc.nextInt();

		int total=chocolate/student	;
		int remaining= chocolate%student;
		System.out.println("remaining "+remaining);
		System.out.println("total "+total);
	}
}