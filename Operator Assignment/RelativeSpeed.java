import java.util.Scanner;
class RelativeSpeed {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter speed1: ");
        int s1 = sc.nextInt();

        System.out.print("Enter speed2: ");
        int s2 = sc.nextInt();

        System.out.println("Relative Speed: " + (s1 + s2));
    }
}