import java.util.Scanner;
class LossPrice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter original price: ");
        double cp = sc.nextDouble();

        System.out.print("Enter loss %: ");
        double loss = sc.nextDouble();

        double sp = cp * (1 - loss / 100);
        System.out.println("Selling Price: " + sp);
    }
}