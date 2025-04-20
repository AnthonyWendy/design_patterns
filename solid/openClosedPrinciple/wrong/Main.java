package solid.openClosedPrinciple.wrong;

public class Main {
    public static void main (String[] args){

        System.out.println("\n");
        System.out.println("-- OPEN-CLOSED PRINCIPLE - WRONG VERSION--");
        System.out.print("\n");

        PaymentService service = new PaymentService();

        Payment card = new Payment("", 1234567, 123, "Anthony", TypePayment.CREDIT);

        service.paymentProcess(card);

        Payment bankSlip = new Payment("1231231212312", 0, 0,   "", TypePayment.BANK_SLIP);

        service.paymentProcess(bankSlip);
    }
}
