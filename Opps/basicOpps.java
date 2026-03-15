package Opps;

import java.util.Set; // Importing Set class from java.util package (not used in this code)

public class basicOpps {

    public static void main(String[] args) {

        // Creating the first object of Student class
        Student s1 = new Student();

        // Assigning values to the attributes of s1 object
        s1.name = "Aditya";
        s1.age = 20;
        s1.rollNo = 1;
        s1.collegeName = "IIT Bombay";

        // Calling method to mark attendance for s1
        s1.markAttended();

        // Calling method to print details of s1
        s1.printDetails();

        // Creating the second object of Student class
        Student s2 = new Student();

        // Assigning values to the attributes of s2 object
        s2.name = "Adarsh";
        s2.age = 21;
        s2.rollNo = 2;
        s2.collegeName = "IIT Bombay";

        // Calling method to mark attendance for s2
        s2.markAttended();

        // Calling method to print details of s2
        s2.printDetails();

    }
}

// Student class definition
class Student {

    // Attributes (properties) of Student
    String name;
    int age;
    int rollNo;
    String collegeName;

    // Method to mark attendance of the student
    void markAttended() {
        System.out.println("Mark Attended by " + name);
    }

    // Method to print student details
    void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Roll No: " + rollNo);
        System.out.println("College Name: " + collegeName);
    }
}