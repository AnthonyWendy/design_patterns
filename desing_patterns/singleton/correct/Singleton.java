public class Main {

    public static void main(String[] args) {

        System.out.println("\n-- Design Pattern Singleton - CORRECT VERSION --\n");

        // Isso não compila se o construtor for privado
        // Singleton instanceOne = new Singleton();
        // Singleton instanceTwo = new Singleton();

        Singleton instanceOne = Singleton.getInstance();
        Singleton instanceTwo = Singleton.getInstance();

        System.out.println("\nVerificando se as instâncias são as mesmas:");
        System.out.println("instanceOne == instanceTwo? " + (instanceOne == instanceTwo));

        System.out.println("\nCreated Singleton instance successfully.");
    }
}
