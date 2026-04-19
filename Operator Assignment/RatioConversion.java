import java.util.Scanner;
class RatioConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter total amount: ");
        int total = sc.nextInt();

        System.out.print("Enter ratio 1: ");
        int a = sc.nextInt();

        System.out.print("Enter ratio 2: ");
        int b = sc.nextInt();

        System.out.print("Enter ratio 3: ");
        int c = sc.nextInt();

        int sum = a + b + c;

        int share1 = total * a / sum;
        int share2 = total * b / sum;
        int share3 = total * c / sum;

        System.out.println("First Share: " + share1);
        System.out.println("Second Share: " + share2);
        System.out.println("Third Share: " + share3);
    }
}