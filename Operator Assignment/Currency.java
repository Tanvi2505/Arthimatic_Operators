import java.util.Scanner;
class Currency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter USD: ");
        double usd = sc.nextDouble();

        System.out.print("Enter rate: ");
        double rate = sc.nextDouble();

        System.out.print("Enter fee: ");
        double fee = sc.nextDouble();

        double result = usd * rate + fee;
        System.out.println("Final INR: " + result);
    }
}