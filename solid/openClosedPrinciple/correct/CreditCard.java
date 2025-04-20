package solid.openClosedPrinciple.correct;

public class CreditCard implements PaymentForm{

    private Integer number;
    private Integer csv;
    private String cardHolder;

    public CreditCard(Integer number, Integer csv, String cardHolder) {
        this.number = number;
        this.csv = csv;
        this.cardHolder = cardHolder;
    }

    @Override
    public boolean isValid() {
        if(number == null || csv == null || cardHolder.isEmpty()) {
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

