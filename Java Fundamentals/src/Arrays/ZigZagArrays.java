package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ZigZagArrays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        int[] firstArray = new int[n];
        int[] secondArray = new int[n];

        for (int i = 0; i < n; i++) {
            String[] input = scan.nextLine().split(" ");
            int num1 = Integer.parseInt(input[0]);
            int num2 = Integer.parseInt(input[1]);

            if (i % 2 == 0) {
                firstArray[i] = num1;
                secondArray[i] = num2;
            } else {
                firstArray[i] = num2;
                secondArray[i] = num1;
            }
        }

        for (int j : firstArray) {
            System.out.print(j + " ");
        }

        System.out.println();

        for (int j : secondArray) {
            System.out.print(j + " ");
        }
    }
}
