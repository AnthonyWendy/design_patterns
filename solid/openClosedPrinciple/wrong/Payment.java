package solid.openClosedPrinciple.wrong;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Date;


public class Payment {

    private String barcode;

    private int number;
    private Integer cvc;
    private String cardholderName;

    private TypePayment type;

    public Payment(String barcode, Integer number, Integer cvc, String cardholderName, TypePayment type) {

        this.barcode = barcode;

        this.number = number;
        this.cvc = cvc;
        this.cardholderName = cardholderName;
        this.type = type;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Integer getCvc() {
        return cvc;
    }

    public void setCvc(Integer cvc) {
        this.cvc = cvc;
    }

    public String getCardholderName() {
        return cardholderName;
    }

    public void setCardholderName(String cardholderName) {
        this.cardholderName = cardholderName;
    }

    public TypePayment getType() {
        return type;
    }

    public void setType(TypePayment type) {
        this.type = type;
    }
}