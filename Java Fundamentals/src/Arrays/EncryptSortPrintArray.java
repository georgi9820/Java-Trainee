package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class EncryptSortPrintArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of strings
        int numStrings = Integer.parseInt(scanner.nextLine());

        // Create an array to store the encrypted values
        int[] encryptedValues = new int[numStrings];

        // Process each string
        for (int i = 0; i < numStrings; i++) {
            String currentString = scanner.nextLine().trim();
            int encryptedValue = 0;

            // Encrypt the string
            for (char ch : currentString.toCharArray()) {
                if ("aeiouAEIOU".indexOf(ch) != -1) {
                    encryptedValue += ch * currentString.length();
                } else {
                    encryptedValue += ch / currentString.length();
                }
            }

            // Store the encrypted value
            encryptedValues[i] = encryptedValue;
        }

        // Sort the array in ascending order
        Arrays.sort(encryptedValues);

        // Print the sorted array
        for (int value : encryptedValues) {
            System.out.println(value);
        }
    }
}
