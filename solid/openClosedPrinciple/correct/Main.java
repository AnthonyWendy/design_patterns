package solid.openClosedPrinciple.correct;

public class Main {
    public static void main(String[] args) {

        System.out.println("\n");
        System.out.println("-- OPEN-CLOSED PRINCIPLE - WRONG VERSION--");
        System.out.print("\n");

        PaymentService service = new PaymentService();

        CreditCard credit = new CreditCard(1234, 123, "Anthony");

        DebitCard debit = new DebitCard("Anthony", 12345, 123);

        BankSlip slip = new BankSlip(4);


        service.payment(debit);

    }
}
