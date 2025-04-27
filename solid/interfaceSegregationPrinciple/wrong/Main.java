package solid.interfaceSegregationPrinciple.wrong;

public class Main {

    public static void main(String[] args){

        System.out.println("\n");
        System.out.println("-- INTERFACE SEGREGATION PRINCIPLE - WRONG VERSION--");
        System.out.print("\n");

        System.out.print("-- PARROT --");
        System.out.print("\n");
        Parrot parrot = new Parrot();
        parrot.fly();
        parrot.peck();
        parrot.sing();

        System.out.print("\n");
        System.out.print("-- Penguin --");
        System.out.print("\n");
        Penguin penguin = new Penguin();
        penguin.fly();
        penguin.peck();
        penguin.sing();

    }
}

