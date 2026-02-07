package constructor;

public class Main {
    public static void main(String[] args) {

        Student Karthik = new Student("Karthik", "Bangalore");
        Karthik.state = "Active";
        Karthik.pauseCourse();
        Karthik.Karthik();
        Karthik.courses.add("Java");

        Student John = new Student();

        Student KarthikCopy = new Student(Karthik); // copy constructor
        System.out.println("Random");

        System.out.println(Karthik.name);
        KarthikCopy.name = "Naman";
        System.out.println(Karthik.name);

        System.out.println(Karthik.courses);
        KarthikCopy.courses.add("Python");
        System.out.println(Karthik.courses);
        System.out.println(KarthikCopy.courses);
    }
}
