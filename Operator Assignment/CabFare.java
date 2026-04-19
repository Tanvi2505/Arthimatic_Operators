import java.util.Scanner;
class CabFare{
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a Base:");
		int base = sc.nextInt();
		System.out.println("Enter a KM:");
		int km = sc.nextInt();
		System.out.println("Enter a Distance:");
		int distance = sc.nextInt();

		int total= base+(distance*km);
		System.out.println("total "+total);
	}
}