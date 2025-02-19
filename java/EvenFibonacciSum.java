import java.util.Scanner;

public class EvenFibonacciSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter N: ");
        int N = scanner.nextInt();
        scanner.close();

        int a = 0, b = 1, sum = 0;
        while (b <= N) {
            if (b % 2 == 0) sum += b;
            int temp = a + b;
            a = b;
            b = temp;
        }
        System.out.println("Sum of even Fibonacci numbers till " + N + " is " + sum);
    }
}
