import java.util.Scanner;
class MixtureJuice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter total mixture in litres: ");
        double total = sc.nextDouble();

        System.out.print("Enter juice percentage: ");
        double percent = sc.nextDouble();

        System.out.print("Enter pure juice added: ");
        double addedJuice = sc.nextDouble();

        double juice = total * percent / 100;
        double newJuice = juice + addedJuice;
        double newTotal = total + addedJuice;
        double newPercent = (newJuice / newTotal) * 100;

        System.out.println("New Percentage: " + newPercent);
    }
}