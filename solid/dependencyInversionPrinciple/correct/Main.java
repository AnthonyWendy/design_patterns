package solid.dependencyInversionPrinciple.correct;

public class Main {

    public static void main(String[] args) {

        System.out.println("\n");
        System.out.println("-- Dependency Inversion Principle - CORRECT VERSION--");
        System.out.print("\n");

        DBConnectionInterface connection = new MySQLConnection();
        PasswordReminder reminder = new PasswordReminder(connection);
        System.out.println("Password changed successfully.");

    }
}
