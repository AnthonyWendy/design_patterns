package desing_patterns.singleton.wrong.Singleton;

public class Singleton {

    private static Singleton uniqueInstance;

    private Singleton() {
        System.out.println("Instância criada: " + this);
    }

    public static Singleton getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }
}
