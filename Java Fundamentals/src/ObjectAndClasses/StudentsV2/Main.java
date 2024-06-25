package ObjectAndClasses.StudentsV2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Student> students = new ArrayList<>();
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            String firstName = input.split(" ")[0];
            String lastName = input.split(" ")[1];
            double grade = Double.parseDouble(input.split(" ")[2]);

            Student student = new Student(firstName, lastName, grade);

            students.add(student);
        }

        students.sort(Comparator.comparingDouble(Student::getGrade).reversed());

        for (Student student : students) {
            System.out.println(student);
        }
    }
}
