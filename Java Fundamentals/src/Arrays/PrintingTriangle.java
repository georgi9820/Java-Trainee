package Arrays;

import java.util.Scanner;

public class PrintingTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        printTriangle(n);
    }

    public static void printLine(int start, int end) {
        for (int i = start; i <= end; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void printTriangle(int n) {
        // Print the first half of the triangle
        for (int i = 1; i < n; i++) {
            printLine(1, i);
        }
        // Print the middle line
        printLine(1, n);
        // Print the second half of the triangle
        for (int i = n - 1; i >= 1; i--) {
            printLine(1, i);
        }
    }
}
