package constructor;

import java.util.ArrayList;

public class Student {
    String name;
    String address;
    String email;
    String batch;
    double psp;
    String state;
    ArrayList<String> courses = new ArrayList<>();

    Student(String name, String address) {
        this.name = name;
        this.address = address;
    }

    Student() {

    }

    Student(Student other) { // copy constructor
        this.name = other.name;
        this.address = other.address;
        this.email = other.email;
        this.batch = other.batch;
        this.psp = other.psp;
        this.state = other.state;
        this.courses = other.courses;
    }

    void changeBatch(String newBatch) {
        this.batch = newBatch;
    }

    void pauseCourse() {
        this.state = "Paused";
    }

    void Karthik() {
        System.out.println("Karthik calling Karthik");
    }
}
