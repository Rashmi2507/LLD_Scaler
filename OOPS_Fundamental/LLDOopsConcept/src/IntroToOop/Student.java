package IntroToOop;

public class Student {
    String name;
    String address;
    public String email;
    String batch;
    double psp;
    String state;

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
