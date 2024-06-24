package Methods;

import java.util.Scanner;

public class MiddleCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Четене на входния низ
        String inputString = scanner.nextLine();

        // Извикване на метода за намиране и отпечатване на средните символи
        printMiddleCharacters(inputString);
    }

    public static void printMiddleCharacters(String str) {
        int length = str.length();
        int middle = length / 2;

        if (length % 2 == 0) {
            // Ако дължината на низа е четна, има два средни символа
            System.out.println(str.charAt(middle - 1) + "" + str.charAt(middle));
        } else {
            // Ако дължината на низа е нечетна, има един среден символ
            System.out.println(str.charAt(middle));
        }
    }
}
