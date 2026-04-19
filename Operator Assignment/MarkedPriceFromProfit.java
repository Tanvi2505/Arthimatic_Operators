import java.util.Scanner;
class MarkedPriceFromProfit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter selling price: ");
        double sp = sc.nextDouble();

        System.out.print("Enter profit %: ");
        double profit = sc.nextDouble();

        double cp = sp / (1 + profit / 100);
        System.out.println("Cost Price: " + cp);
    }
}