import java.util.*;

public class LCM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter two numbers for LCM: ");
        int n = scanner.nextInt(), m = scanner.nextInt();

        // Calculate LCM using GCD
        int lcm = (n * m) / gcd(n, m);
        System.out.println("LCM of " + n + " and " + m + " is: " + lcm);

        scanner.close();
    }    

    // Function to calculate GCD using recursion
    public static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}
