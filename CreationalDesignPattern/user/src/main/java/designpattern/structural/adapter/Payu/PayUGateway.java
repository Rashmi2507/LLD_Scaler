package designpattern.structural.adapter.Payu;

public class PayUGateway {
    public String makeCCPayment(Long creditCard,
            Long cvv,
            Long expiry) {

        System.out.println("Payment is being processed by PayU...");
        return "transactionId";
    }

    public PayUPaymentStatus checkPaymentStatus(String transactionId) {
        return PayUPaymentStatus.FAILURE;
    }
}
