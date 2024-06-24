package Methods;

import java.util.Scanner;

public class TopNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        for (int i = 1; i <= n; i++) {
            if (isTopNumber(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean isTopNumber(int num) {
        return sumOfDigitsIsDivisibleBy8(num) && hasAtLeastOneOddDigit(num);
    }

    public static boolean sumOfDigitsIsDivisibleBy8(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum % 8 == 0;
    }

    public static boolean hasAtLeastOneOddDigit(int num) {
        while (num > 0) {
            if ((num % 10) % 2 != 0) {
                return true;
            }
            num /= 10;
        }
        return false;
    }
}
