// src/Main.java
import Pack.*;

public class Main {
    public static void main(String[] args) {
        DatabaseConnection.getConnection(); // Initialize the connection
        new modifyUser();
    }
}