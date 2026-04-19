import java.util.Scanner;
class BrickRequirement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter wall area: ");
        double wallArea = sc.nextDouble();

        System.out.print("Enter area covered by one brick: ");
        double brickArea = sc.nextDouble();

        double bricks = wallArea / brickArea;
        System.out.println("Bricks Needed: " + bricks);
    }
}