import java.util.*;

public class multiply {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first float: ");
        float a = scanner.nextFloat();
        System.out.print("Enter second float: ");
        float b = scanner.nextFloat();
        float product = a * b;
        System.out.println("Product of " + a + " and " + b + " is: " + product);
    }
}
