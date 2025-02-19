import java.util.Scanner;

public class addbinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter two binary numbers: ");
        String bin1 = scanner.next();
        String bin2 = scanner.next();
        int sum = Integer.parseInt(bin1, 2) + Integer.parseInt(bin2, 2);
        System.out.println("Sum: " + Integer.toBinaryString(sum));
        scanner.close();
    }
}

