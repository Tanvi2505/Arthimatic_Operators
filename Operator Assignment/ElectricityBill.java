import java.util.Scanner;
class ElectricityBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter units consumed: ");
        double units = sc.nextDouble();

        System.out.print("Enter rate per unit: ");
        double rate = sc.nextDouble();

        double bill = units * rate;
        System.out.println("Electricity Bill: " + bill);
    }
}