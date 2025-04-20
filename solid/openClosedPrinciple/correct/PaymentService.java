package solid.openClosedPrinciple.correct;

public class PaymentService {

    public void payment(PaymentForm payMethod) {
        if (payMethod.isValid()) {
            payMethod.pay();
        } else {
            System.out.println("Payment failed");
        }
    }
}

