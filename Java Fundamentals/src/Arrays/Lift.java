package Arrays;

import java.util.Scanner;

public class Lift {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int peopleToBoard = Integer.parseInt(scanner.nextLine());
        String[] liftStateStr = scanner.nextLine().split("\\s+");
        int[] liftState = new int[liftStateStr.length];

        for (int i = 0; i < liftState.length; i++) {
            liftState[i] = Integer.parseInt(liftStateStr[i]);
        }

        for (int i = 0; i < liftState.length; i++) {
            int spacesAvailable = 4 - liftState[i];

            if (spacesAvailable > 0) {
                if (peopleToBoard > 0) {
                    if (peopleToBoard >= spacesAvailable) {
                        liftState[i] += spacesAvailable;
                        peopleToBoard -= spacesAvailable;
                    } else {
                        liftState[i] += peopleToBoard;
                        peopleToBoard = 0;
                    }
                } else {
                    break; // No more people to board
                }
            }
        }

        if (peopleToBoard == 0) {
            boolean hasEmptySpots = false;
            for (int i = 0; i < liftState.length; i++) {
                if (liftState[i] < 4) {
                    hasEmptySpots = true;
                    break;
                }
            }

            if (hasEmptySpots) {
                System.out.println("The lift has empty spots!");
            }
        } else {
            System.out.printf("There isn't enough space! %d people in a queue!\n", peopleToBoard);
        }

        System.out.println(arrayToString(liftState));
    }

    private static String arrayToString(int[] arr) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
            if (i != arr.length - 1) {
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}
