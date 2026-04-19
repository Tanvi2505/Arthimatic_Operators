import java.util.Scanner;
class RatioSharing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter total amount: ");
        int total = sc.nextInt();

        System.out.print("Enter ratio 1: ");
        int r1 = sc.nextInt();

        System.out.print("Enter ratio 2: ");
        int r2 = sc.nextInt();

        int share = total * r1 / (r1 + r2);
        System.out.println("First person share: " + share);
    }
}