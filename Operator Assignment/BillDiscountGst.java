import java.util.Scanner;
class BillDiscountGst{
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a Price:");
		double price = sc.nextDouble();
		System.out.println("Enter a Discount:");
		double discount = sc.nextDouble();
		System.out.println("Enter a GST:");
		double gst = sc.nextDouble();

		double discountprice = price-((discount/100)*price);
		System.out.println("discount "+discount);
		double gstamount = (gst/100)*discountprice;
		System.out.println("gstamount "+gstamount);
		double total = discountprice+gstamount;
		System.out.println("total "+total);
	}
}