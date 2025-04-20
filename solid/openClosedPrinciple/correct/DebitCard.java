package solid.openClosedPrinciple.correct;

public class DebitCard implements PaymentForm{

    private Integer number;
    private Integer csv;
    private String cardHolder;

    public DebitCard(String cardHolder, Integer csv, Integer number) {
        this.cardHolder = cardHolder;
        this.csv = csv;
        this.number = number;
    }

    @Override
    public boolean isValid() {
        if(this.number == null || this.csv == null || this.cardHolder.isEmpty()) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public void pay() {
        System.out.println("Payment successful");
    }
}
