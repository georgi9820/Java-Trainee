package Methods;

import java.util.Scanner;

public class AddAndSubtract {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int firstNum = Integer.parseInt(scan.nextLine());
        int secondNum = Integer.parseInt(scan.nextLine());
        int thirdNum = Integer.parseInt(scan.nextLine());

        System.out.println(subtract(firstNum, secondNum, thirdNum));
    }

    static int sum(int first, int second) {
        return first + second;
    }

    static int subtract(int first, int second,int third){
        return  sum(first, second) - third;
    }
}
