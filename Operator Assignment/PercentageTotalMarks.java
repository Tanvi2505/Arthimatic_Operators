import java.util.Scanner;
class PercentageTotalMarks{
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a Total Marks:");
		int totalmarks = sc.nextInt();
		System.out.println("Enter a Scored Marks:");
		int scoredmarks = sc.nextInt();

		int percent =  (scoredmarks * 100) / totalmarks;;
		System.out.println("percent "+percent);

	}

}