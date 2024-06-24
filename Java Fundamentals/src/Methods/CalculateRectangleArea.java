package Methods;

import java.util.Scanner;

public class CalculateRectangleArea {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int width = Integer.parseInt(scan.nextLine());
        int height = Integer.parseInt(scan.nextLine());

        int area = rectangleArea(width, height);
        System.out.println(area);
    }

    private static int rectangleArea(int width, int height) {
        return width * height;
    }


}
