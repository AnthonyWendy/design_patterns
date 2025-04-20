package solid.openClosedPrinciple.wrong;

public class PaymentService {

    public void paymentProcess(Payment payment) {

        if (payment.getType() == TypePayment.BANK_SLIP) {
            if(payment.getBarcode().isEmpty()){
                System.out.println("Payment back slip fail");
            } else {
                System.out.println("Payment bank slip successful");
            }
        } else {

            if(payment.getCvc()== null && payment.getCardholderName().isEmpty() && payment.getNumber() == null){
                System.out.println("Payment card fail");
            } else {
                System.out.println("Payment card successful");
            }

        }
    }


}
