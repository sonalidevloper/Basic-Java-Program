import java.util.*;

public class largest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter three numbers: ");
        int n1 = scanner.nextInt(), n2 = scanner.nextInt(), n3 = scanner.nextInt();
        int largest = Math.max(n1, Math.max(n2, n3));
        System.out.println("The largest number among " + n1 + ", " + n2 + ", and " + n3 + " is: " + largest);
    }  
}        
