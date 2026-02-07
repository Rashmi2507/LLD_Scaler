package designpattern.structural.adapter;

import designpattern.structural.adapter.razorPay.RazorpayGateway;

public class RazorpayPaymentGatewayAdapter implements PaymentGateway {
    private RazorpayGateway razorpayGateway = new RazorpayGateway();

    @Override
    public Long payViaCC(String cardNumber, int cvv, int expiryMonth, int expiryYear) {
        String cvvString = String.valueOf(cvv);
        String expiryString = String.valueOf(expiryMonth) + "/" + String.valueOf(expiryYear);
        String answer = razorpayGateway.payByCreditCard(cardNumber, cvvString, expiryString);
        return Long.valueOf(answer);
    }

    @Override
    public PaymentStatus getPaymentStatus(Long transactionId) {
        boolean status = razorpayGateway.isPaymentSuccessful(String.valueOf(transactionId));
        return status ? PaymentStatus.SUCCESS : PaymentStatus.FAILURE;
    }

}
