package Inheritance;

public class Client {
    public static void main(String[] args) {
        Instructor instructor = new Instructor();
        // instructor.name = "Naman";
        instructor.setName("Naman");
        // instructor.description = "Super cool instructor";
        instructor.setDescription("Super cool instructor");
        instructor.saySomething();

        User user = new User();
        // user.name = "Rashmi";
        user.setName("Rashmi");

        Mentor mentor = new Mentor();
        // mentor.name = "Abhimanyu";
        mentor.setName("Abhimanyu");
        // mentor.email = "abhimanyu@gmail.com";
        mentor.setEmail("abhimanyu@gmail.com")
        // mentor.description = "HLD Mentor";
        mentor.setDescription("HLD Mentor");
    }
}
