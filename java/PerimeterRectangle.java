import java.util.Scanner;

public class PerimeterRectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter length and width: ");
        double length = scanner.nextDouble(), width = scanner.nextDouble();
        scanner.close();

        System.out.println("Perimeter: " + (2 * (length + width)));
    }
}

