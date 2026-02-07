import javax.xml.crypto.Data;

public class Database {
    private static Database instance; // Step2: Static variable to hold the single instance

    private Database() {
    } // Step1: Private constructor

    public static Database getInstance() {
        if (instance == null) { // Step3: Check if instance is null
            instance = new Database(); // Step4: Create new instance if null
        }
        return instance; // Step5: Return the single instance
    }

}