import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Principal, Rate (%), Time (years), and Compounded per year: ");
        double P = scanner.nextDouble(), R = scanner.nextDouble(), T = scanner.nextDouble();
        int n = scanner.nextInt();
        scanner.close();

        double CI = P * Math.pow((1 + (R / (n * 100))), (n * T)) - P;
        System.out.println("Compound Interest: " + CI);
    }
}
