package solid.dependencyInversionPrinciple.correct;

public class MySQLConnection implements DBConnectionInterface{

    @Override
    public void connect() {
        System.out.println("Connection.....");
    }
}
