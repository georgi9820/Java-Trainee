package ObjectAndClasses.Students;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Student> students = new ArrayList<>();

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("end")) {
                break;
            }
            String[] data = input.split(" ");

            String firstName = data[0];
            String lastName = data[1];
            int age = Integer.parseInt(data[2]);
            String hometown = data[3];

            Student student = new Student();
            student.setFirstName(firstName);
            student.setLastName(lastName);
            student.setAge(age);
            student.setHometown(hometown);

            students.add(student);
        }

        String cityName = scanner.nextLine();
        List<Student> filteredStudents = students.stream().filter(student -> student.getHometown().equals(cityName)).toList();

        for (Student filteredStudent : filteredStudents) {
            System.out.printf("%s %s is %d years old%n", filteredStudent.getFirstName(), filteredStudent.getLastName(), filteredStudent.getAge());
        }
    }
}
