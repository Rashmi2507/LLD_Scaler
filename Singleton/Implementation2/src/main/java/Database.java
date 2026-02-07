package Implementation2.src.main.java;

import javax.xml.crypto.Data;

public class Database {
    private static Database instance = new Database(); // Step2: create the single instance eagerly

    private Database() {
    } // Step1: Private constructor

    public static Database getInstance() {
        if (instance == null) { // Step3: Check if instance is null
            instance = new Database(); // Step4: Create new instance if null
        }
        return instance; // Step5: Return the single instance
    }

}