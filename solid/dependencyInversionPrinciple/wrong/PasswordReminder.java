package solid.dependencyInversionPrinciple.wrong;

public class PasswordReminder {

    private MySQLConnection dbConnection;

    public PasswordReminder() {
        this.dbConnection = new MySQLConnection();
    }

}
