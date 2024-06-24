package Medthods;

import java.util.Scanner;

public class PrintingTriangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int input = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < input; i++) {
            printTriangle(i);
        }

        printTriangle(input);

        for (int i = input - 1; i >= 1 ; i--) {
            printTriangle(i);
        }

    }

    private static void printTriangle(int end) {
        for (int i = 1; i <= end ; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
