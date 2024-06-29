package ObjectAndClasses.OrderByAge;

import ObjectAndClasses.Students.Student;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Person> people = new ArrayList<>();

        while (true) {
            String input = scanner.nextLine();

            if (input.equals("End")) {
                break;
            }
            
            String firstName = input.split(" ")[0];
            String id = input.split(" ")[1];
            int age = Integer.parseInt(input.split(" ")[2]);

            Person person = new Person(firstName, id, age);
            people.add(person);
        }

        people.sort(Comparator.comparing(Person::getAge));

        for (Person person : people) {
            System.out.println(person);
        }

    }
}
