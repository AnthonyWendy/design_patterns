package desing_patterns.singleton.wrong.Singleton;

public class Main {

    public static void main(String[] args) {

        System.out.println("\n-- Design Pattern Singleton - WRONG VERSION --\n");

        Singleton instanceOne = new Singleton();
        Singleton instanceTwo = new Singleton();

        Singleton instanceThree = Singleton.getInstance();
        Singleton instanceFour = Singleton.getInstance();

        System.out.println("\nVerificando se as instâncias são as mesmas:");
        System.out.println("instanceOne == instanceTwo? " + (instanceOne == instanceTwo));
        System.out.println("instanceThree == instanceFour? " + (instanceThree == instanceFour));

        System.out.println("\nPassword changed successfully.");
    }
}
