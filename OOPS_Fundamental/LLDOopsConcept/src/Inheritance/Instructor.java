package Inheritance;

public class Instructor extends User {
    private String assignedBatch;
    private String description;

    public String getAssignedBatch() {
        getPassword(); // Inherited method from User class
        return assignedBatch;
    }

    public void setAssignedBatch(String assignedBatch) {
        this.assignedBatch = assignedBatch;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}

// even if we don not have getter and setter and the attributes of parent class
// are private then as well those private attribute will also contibute to the
// memory of child class object because of inheritance
