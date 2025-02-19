import java.util.Scanner;

class PrimeFinder {
    int N;

    // Constructor to initialize N
    PrimeFinder(int num) {
        this.N = num;
    }

    // Method to check if a number is prime
    boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    // Method to display prime numbers
    void displayPrimes() {
        System.out.println("Prime numbers from 1 to " + N + ":");
        for (int num = 2; num <= N; num++) {
            if (isPrime(num)) {
                System.out.print(num + " ");
            }
        }
    }
}

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number N: ");
        int N = scanner.nextInt();
        scanner.close();

        // Create object of PrimeFinder class
        PrimeFinder primeObj = new PrimeFinder(N);
        
        // Call method to display prime numbers
        primeObj.displayPrimes();
    }
}

