package Methods;

import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String foodType = scan.nextLine();
        int quantity = Integer.parseInt(scan.nextLine());
        System.out.printf("%.2f", printOrder(foodType, quantity));
    }

    private static double printOrder(String foodType, int quantity) {
        double sum = 0.00;
        switch (foodType) {
            case "coffee":
                sum = quantity * 1.50;
                break;
            case "water":
                sum = quantity * 1.00;
                break;
            case "coke":
                sum = quantity * 1.40;
                break;
            case "snacks":
                sum = quantity * 2.00;
                break;
        }
        return sum;
    }
}
