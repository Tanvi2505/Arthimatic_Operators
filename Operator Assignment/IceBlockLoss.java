import java.util.Scanner;
class IceBlockLoss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter original volume: ");
        double volume = sc.nextDouble();

        System.out.print("Enter loss percentage: ");
        double loss = sc.nextDouble();

        double remaining = volume * (1 - loss / 100);
        System.out.println("Remaining Volume: " + remaining);
    }
}