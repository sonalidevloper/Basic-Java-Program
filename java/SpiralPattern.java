import java.util.Scanner;

public class SpiralPattern {
    static void printSpiral(int n) {
        int[][] spiral = new int[n][n];

        int value = 1, minRow = 0, maxRow = n - 1, minCol = 0, maxCol = n - 1;

        while (value <= n * n) {
            for (int i = minCol; i <= maxCol; i++) // left to right
                spiral[minRow][i] = value++;
            minRow++;

            for (int i = minRow; i <= maxRow; i++) // top to bottom
                spiral[i][maxCol] = value++;
            maxCol--;

            for (int i = maxCol; i >= minCol; i--) // right to left
                spiral[maxRow][i] = value++;
            maxRow--;

            for (int i = maxRow; i >= minRow; i--) // bottom to top
                spiral[i][minCol] = value++;
            minCol++;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%3d ", spiral[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter size of spiral (NxN): ");
        int n = scanner.nextInt();
        scanner.close();

        printSpiral(n);
    }
}

