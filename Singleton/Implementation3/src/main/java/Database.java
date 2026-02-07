package Implementation3.src.main.java;

import javax.xml.crypto.Data;

public class Database {
    private static Database instance; // Step2: Static variable to hold the single instance, volatile for
                                      // thread safety

    private Database() {
    } // Step1: Private constructor

    public static Database getInstance() {
        if (instance == null) { // Step3: First check (no locking)
            synchronized (Database.class) { // Step4: Synchronize on the class
                if (instance == null) { // Step5: Double check inside synchronized block
                    instance = new Database(); // Step6: Create new instance if null
                }
            }
        }
        return instance; // Step7: Return the single instance
    }

}