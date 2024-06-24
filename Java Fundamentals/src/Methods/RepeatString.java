package Methods;

import java.util.Scanner;

public class RepeatString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        int count = Integer.parseInt(scan.nextLine());

        String result = getRepeatedString(input, count);
        System.out.println(result);
    }

    private static String getRepeatedString(String input, int count) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < count; i++) {
            result.append(input);
        }
        return result.toString();
    }
}
