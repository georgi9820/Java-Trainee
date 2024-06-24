package Methods;

import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // Четене на входа от потребителя
            String input = scanner.nextLine();

            // Проверка за край на входа
            if (input.equals("END")) {
                break;
            }

            // Проверка дали думата е палиндром
            boolean isPalindrome = isPalindrome(input);

            // Отпечатване на резултата
            System.out.println(isPalindrome);
        }
    }

    public static boolean isPalindrome(String input) {
        String reversed = new StringBuilder(input).reverse().toString();
        return input.equals(reversed);
    }
}
