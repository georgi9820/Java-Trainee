package Methods;

import java.util.Scanner;

public class VowelsCount {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine().toLowerCase();

        int result = countVowels(text);
        System.out.println(result);

    }

    private static int countVowels(String text) {
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            char currSymbol = text.charAt(i);
            switch (currSymbol) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    count++;
                    break;
            }
        }
        return count;
    }
}
