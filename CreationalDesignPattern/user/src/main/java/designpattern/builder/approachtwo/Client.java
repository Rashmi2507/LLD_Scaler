package designpattern.builder.approachtwo;

public class Client {
    public static void main(String[] args) {
        UserExam userExam;

        try {
            UserExam userExam2 = UserExam.getBuilder()
                    .setEnglishMarks(85)
                    .setMathMarks(60)
                    .setScienceMarks(70)
                    .setName("Rashmi")
                    .build();
            System.out.println("User Exam created: " + userExam2);

        } catch (Exception e) {
            System.out.println("Some parameter is invalid: " + e.getMessage());
        }

    }
}