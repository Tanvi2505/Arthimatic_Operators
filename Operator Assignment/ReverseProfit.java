import java.util.Scanner;
class ReverseProfit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Selling Price: ");
        double sp = sc.nextDouble();

        System.out.print("Enter Profit : ");
        double profit = sc.nextDouble();

        double cp = sp / (1 + profit / 100);
        System.out.println("Cost Price: " + cp);
    }
}