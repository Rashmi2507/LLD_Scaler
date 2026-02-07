package designpattern.builder.approachone;

import java.security.InvalidParameterException;

public class UserExam {
    private int englishMarks;
    private int mathMarks;
    private int scienceMarks;
    private String name;

    public UserExam(UserExamParameters parameters) {

        if (parameters.englishMarks > 100 || parameters.mathMarks > 100 || parameters.scienceMarks > 100) {
            throw new InvalidParameterException("Marks cannot be greater than 100");
        }

        if (parameters.name.startsWith("0")) {
            throw new InvalidParameterException("Name cannot start with 0");
        }

        this.englishMarks = parameters.englishMarks;
        this.mathMarks = parameters.mathMarks;
        this.scienceMarks = parameters.scienceMarks;
        this.name = parameters.name;
    }
}
