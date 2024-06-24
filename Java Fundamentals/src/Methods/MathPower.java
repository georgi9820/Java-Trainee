package Methods;

import java.util.Scanner;

public class MathPower {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = Integer.parseInt(scan.nextLine());
        int power = Integer.parseInt(scan.nextLine());

        int result = mathPower(number, power);
        System.out.println(result);

    }

    private static int mathPower(int number, int power) {
        return (int) Math.pow(number,power);
    }
}
