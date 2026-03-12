import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Student {
    private String firstName;
    private String lastName;
    private int age;
    private String hometown;

    public Student(String firstName, String lastName, int age, String hometown) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.hometown = hometown;
    }

    public String getHometown() {
        return hometown;
    }

    public String toString() {
        return firstName + " " + lastName + " is " + age + " years old";
    }
}

