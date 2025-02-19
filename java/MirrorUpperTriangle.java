import java.util.Scanner;

public class MirrorUpperTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();
        scanner.close();

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = i; k <= rows; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
