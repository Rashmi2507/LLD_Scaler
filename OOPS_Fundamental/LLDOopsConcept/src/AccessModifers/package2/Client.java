package AccessModifers.package2;

import AccessModifers.Student;

public class Client {
    public static void main(String[] args) {
        Student s = new Student();
        // s.name = "Naman"; // default not accessible outside package (neither child
        // package nor parent package)
        // s.address = "Delhi"; // private not accessible outside class
        s.email = "naman@gmail.com"; // public accessible everywhere
    }
}
