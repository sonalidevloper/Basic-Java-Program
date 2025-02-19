import java.util.*;

public class swap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 

        System.out.print("Enter two numbers to swap: ");
        int x = scanner.nextInt(), y = scanner.nextInt();
        System.out.println("Before Swap: x = " + x + ", y = " + y);
        int temp = x; x = y; y = temp;
        System.out.println("After Swap: x = " + x + ", y = " + y);
    }
}    