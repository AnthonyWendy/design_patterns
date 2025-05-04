package solid.dependencyInversionPrinciple.wrong;

public class Main {

    public static void main(String[] args) {

        System.out.println("\n");
        System.out.println("-- Dependency Inversion Principle - WRONG VERSION--");
        System.out.print("\n");

        PasswordReminder reminder = new PasswordReminder();
        System.out.println("Password changed successfully.");

    }
}
