package designpattern.builder.approachtwo;

import java.security.InvalidParameterException;

public class UserExam {
    private int englishMarks;
    private int mathMarks;
    private int scienceMarks;
    private String name;

    // Private constructor to prevent direct instantiation without builder
    private UserExam() {
    }

    public static UserExamBuilder getBuilder() {
        return new UserExamBuilder();
    }

    // The purpose of static class is to access builder class without creating
    // instance (object) of UserExam
    public static class UserExamBuilder {
        private int englishMarks;
        private int mathMarks;
        private int scienceMarks;
        private String name;

        public UserExamBuilder setEnglishMarks(int englishMarks) {
            this.englishMarks = englishMarks;
            return this;
        }

        public UserExamBuilder setMathMarks(int mathMarks) {
            this.mathMarks = mathMarks;
            return this;
        }

        public UserExamBuilder setScienceMarks(int scienceMarks) {
            this.scienceMarks = scienceMarks;
            return this;
        }

        public UserExamBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public UserExam build() {
            if (englishMarks > 100 || mathMarks > 100 || scienceMarks > 100) {
                throw new InvalidParameterException("Marks cannot be greater than 100");
            }

            if (mathMarks + englishMarks > 150) {
                throw new InvalidParameterException("Total of Math and English marks cannot be greater than 150");
            }

            if (name.startsWith("0")) {
                throw new InvalidParameterException("Name cannot start with 0");
            }

            UserExam userExam = new UserExam();
            userExam.englishMarks = this.englishMarks;
            userExam.mathMarks = this.mathMarks;
            userExam.scienceMarks = this.scienceMarks;
            userExam.name = this.name;
            return userExam;
        }
    }
}
