package solid.liskovSubstitutionPrinciple.correct;

public class PlaceOrder {

    public  <T extends RobotDad>String blackCoffee(T robot) {

        return robot.makeCoffee("Black coffee");
    }
}
