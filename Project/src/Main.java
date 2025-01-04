// src/Main.java
import Pack.*;
import Pack.Admin.checkUsers;
import Pack.Admin.showCars;
import Pack.User.modifyUserData;

public class Main {
    public static void main(String[] args) {
        DatabaseConnection.getConnection(); // Initialize the connection
        new App();
    }
}