package solid.openClosedPrinciple.correct;

import java.math.BigInteger;

public class BankSlip implements PaymentForm {

    private Integer code;


    public BankSlip(Integer code) {
        this.code = code;
    }

    @Override
    public boolean isValid() {
        return  code != null && code > 0;
    }

    @Override
    public void pay() {
        System.out.println("Payment successful");
    }
}
