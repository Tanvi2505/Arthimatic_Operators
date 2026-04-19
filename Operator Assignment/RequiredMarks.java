import java.util.Scanner;
class RequiredMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter total marks: ");
        int total = sc.nextInt();

        System.out.print("Enter scored marks: ");
        int scored = sc.nextInt();

        int RequiredMarks = total - scored;

        System.out.println("RequiredMarks "+RequiredMarks);
    }
}