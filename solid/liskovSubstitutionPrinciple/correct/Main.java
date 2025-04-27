package solid.liskovSubstitutionPrinciple.correct;

public class Main {

    public static void main(String[] args){

        System.out.println("\n");
        System.out.println("-- LISKOV SUBSTITUTION PRINCIPLE - CORRECT VERSION--");
        System.out.print("\n");

        RobotDad dad = new RobotDad();
        PlaceOrder waiterDad = new PlaceOrder();

        RobotSon son = new RobotSon();
        PlaceOrder waiterSon = new PlaceOrder();


        System.out.println(waiterDad.blackCoffee(dad));
        System.out.println(waiterSon.blackCoffee(son));

    }
}
