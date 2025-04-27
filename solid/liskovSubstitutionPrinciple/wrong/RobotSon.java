package solid.liskovSubstitutionPrinciple.wrong;

public class RobotSon extends RobotDad{

    @Override
    public String makeCoffee(String request) {
        if (request.isEmpty()) {
            throw new IllegalArgumentException("Pedido vazio");
        }
        return "Here's your water order";
    }

}
