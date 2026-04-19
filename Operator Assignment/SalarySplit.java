import java.util.Scanner;
class SalarySplit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter total salary: ");
        int total = sc.nextInt();

        System.out.print("Enter ratio a b c: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int share = total * c / (a + b + c);
        System.out.println("Third Person Share: " + share);
    }
}