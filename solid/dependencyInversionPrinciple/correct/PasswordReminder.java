package solid.dependencyInversionPrinciple.correct;

public class PasswordReminder {

    private DBConnectionInterface dbConnection;

    public PasswordReminder(DBConnectionInterface dbConnection) {
        this.dbConnection = dbConnection;
        this.dbConnection.connect();
    }

}
