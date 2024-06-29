package ObjectAndClasses.OrderByAge;

public class Person {
    private String firstName;
    private String id;
    private int age;

    public Person (String firstName, String id, int age) {
        this.firstName = firstName;
        this.id = id;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return String.format("%s with ID: %s is %d years old.", firstName, id, age);
    }
}
