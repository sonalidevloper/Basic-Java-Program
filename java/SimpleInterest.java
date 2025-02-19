import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Principal, Rate (%), Time (years): ");
        double P = scanner.nextDouble(), R = scanner.nextDouble(), T = scanner.nextDouble();
        scanner.close();

        double SI = (P * R * T) / 100;
        System.out.println("Simple Interest: " + SI);
    }
}
