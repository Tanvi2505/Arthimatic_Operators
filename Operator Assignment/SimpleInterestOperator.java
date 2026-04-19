import java.util.Scanner;
class SimpleInterestOperator{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Invested Amount :");
		double invested=sc.nextInt();
		System.out.println("Enter a Tenure:");
		double tenure=sc.nextInt();
		System.out.println("Enter a Interest:");
		double interest = sc.nextInt();

		double total= (invested*interest/100)*tenure;
		System.out.println("total "+total);
	}
}