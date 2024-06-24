package Methods;

import java.util.Scanner;

public class PalindromeIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // Четене на входа от потребителя
            String input = scanner.nextLine();

            // Проверка за край на входа
            if (input.equals("END")) {
                break;
            }

            // Конвертиране на входа в цяло число
            int number = Integer.parseInt(input);

            // Проверка дали числото е палиндром
            boolean isPalindrome = isPalindrome(number);

            // Отпечатване на резултата
            System.out.println(isPalindrome);
        }
    }

    public static boolean isPalindrome(int number) {
        String original = Integer.toString(number);
        String reversed = new StringBuilder(original).reverse().toString();
        return original.equals(reversed);
    }
}
