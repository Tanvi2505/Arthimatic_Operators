import java.util.Scanner;

class CompoundDeposit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Principal: ");
        double p = sc.nextDouble();

        System.out.print("Enter Rate: ");
        double r = sc.nextDouble();

        
        double amount = p * (1 + r / 100) * (1 + r / 100);

        System.out.println("Final Amount: " + amount);
    }
}