package designpattern.builder.approachone;

public class Client {
    public static void main(String[] args) {
        UserExamParameters userExamParameters = new UserExamParameters();
        userExamParameters.englishMarks = 85;
        userExamParameters.name = "Rashmi";

        UserExam userExam;

        try {
            userExam = new UserExam(userExamParameters);
        } catch (Exception e) {
            System.out.println("Error creating UserExam: " + e.getMessage());
            return;
        }

        System.out.println("User Exam created: " + userExam);
    }
}