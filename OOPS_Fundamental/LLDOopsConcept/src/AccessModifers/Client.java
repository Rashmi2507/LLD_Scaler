package AccessModifers;

public class Client {
    public static void main(String[] args) {
        Student student = new Student();
        student.name = "Naman";
        // student.address = "Delhi"; // not accessible as address is private
        student.email = "naman@gmail.com";
    }
}
