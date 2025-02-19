import java.util.*;

public class gcd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter two numbers for GCD: ");
        int num1 = scanner.nextInt(), num2 = scanner.nextInt();
        int gcdValue = gcd(num1, num2);
        System.out.println("The Greatest Common Divisor (GCD) or Highest Common Factor (HCF) of " + num1 + " and " + num2 + " is: " + gcdValue);
        
    }
}    
