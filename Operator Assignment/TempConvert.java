import java.util.Scanner;
class TempConvert {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Celsius: ");
        double c = sc.nextDouble();

        System.out.print("Enter increase %: ");
        double inc = sc.nextDouble();

        double f = (c * 9/5) + 32;
        double result = f + (f * inc / 100);

        System.out.println("Final Temperature: " + result);
    }
}