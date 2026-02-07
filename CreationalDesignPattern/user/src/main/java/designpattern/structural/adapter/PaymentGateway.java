package designpattern.structural.adapter;

public interface PaymentGateway {
    Long payViaCC(String cardNumber,
            int cvv,
            int expiryMonth,
            int expiryYear);

    PaymentStatus getPaymentStatus(Long transactionId);
}
