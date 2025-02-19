import java.util.Scanner;

class Complex {
    int real, imag;

    // Constructor
    Complex(int r, int i) {
        this.real = r;
        this.imag = i;
    }

    // Method to add two complex numbers
    Complex add(Complex c) {
        return new Complex(this.real + c.real, this.imag + c.imag);
    }

    // Method to display the complex number
    void display() {
        System.out.println(real + " + " + imag + "i");
    }
}

public class AddComplexNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input first complex number
        System.out.print("Enter real and imaginary part of first complex number: ");
        int real1 = scanner.nextInt();
        int imag1 = scanner.nextInt();
        Complex c1 = new Complex(real1, imag1);

        // Input second complex number
        System.out.print("Enter real and imaginary part of second complex number: ");
        int real2 = scanner.nextInt();
        int imag2 = scanner.nextInt();
        Complex c2 = new Complex(real2, imag2);

        // Add the two complex numbers
        Complex sum = c1.add(c2);

        // Display the result
        System.out.print("Sum of the complex numbers: ");
        sum.display();

        scanner.close();
    }
}
