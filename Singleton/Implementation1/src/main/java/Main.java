package Implementation1.src.main.java;

import javax.xml.crypto.Data;

public class Main {
    public static void main(String[] args) {
        Database db1 = Database.getInstance();
        Database db2 = Database.getInstance();

        RandomClass rc = new RandomClass();
        System.out.println(db1);
        System.out.println(db2);
        System.out.println(rc.db);
    }
}