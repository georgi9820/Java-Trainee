package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayModifier {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] numbers = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        String command = scan.nextLine();

        while (!command.equals("end")) {
            String[] commands = command.split("\\s+");
            String operation = commands[0];

            int index1 = 0;
            int index2 = 0;
            switch (operation) {
                case "swap":
                    index1 = Integer.parseInt(commands[1]);
                    index2 = Integer.parseInt(commands[2]);
                    int temp = numbers[index1];
                    numbers[index1] = numbers[index2];
                    numbers[index2] = temp;
                    break;
                case "multiply":
                    index1 = Integer.parseInt(commands[1]);
                    index2 = Integer.parseInt(commands[2]);

                    numbers[index1] *= numbers[index2];
                    break;
                case "decrease":
                    for (int i = 0; i < numbers.length; i++) {
                        numbers[i]--;
                    }
                    break;
            }
            command = scan.nextLine();
        }

        for (int i = 0; i < numbers.length; i++) {
            if (i == numbers.length - 1) {
                System.out.print(numbers[i]);
            } else {
                System.out.print(numbers[i] + ", ");
            }
        }
        System.out.println();
    }
}
