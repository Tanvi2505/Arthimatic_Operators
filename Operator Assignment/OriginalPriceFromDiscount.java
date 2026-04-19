import java.util.Scanner;

class OriginalPriceFromDiscount {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter final price:");
		double finalPrice = sc.nextDouble();

		System.out.println("Enter discount percentage:");
		double discount = sc.nextDouble();

		double originalPrice = (finalPrice * 100) / (100 - discount);

		System.out.println("Original Price = " + originalPrice);
	}
}