import java.util.Scanner;
class AverageMarksOperator{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a 1st Marks:");
		int marks=sc.nextInt();
		System.out.println("Enter a 2nd Marks:");
		int marks1=sc.nextInt();
		System.out.println("Enter a 3rd Marks:");
		int marks2=sc.nextInt();

		int average=(marks+marks1+marks2)/3;
		System.out.println("average "+average );
	}
}