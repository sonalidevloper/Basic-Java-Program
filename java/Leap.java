import java.util.*;

public class Leap{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = scanner.nextInt();
        boolean isLeap = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        System.out.println("The year " + year + " is " + (isLeap ? "a Leap Year" : "not a Leap Year"));
        
        scanner.close();
    }

    // Function to calculate GCD using recursion
    public static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}
        
