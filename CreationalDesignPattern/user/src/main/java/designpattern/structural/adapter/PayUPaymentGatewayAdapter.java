package designpattern.structural.adapter;

import designpattern.structural.adapter.Payu.PayUGateway;
import designpattern.structural.adapter.Payu.PayUPaymentStatus;

public class PayUPaymentGatewayAdapter implements PaymentGateway {
    private PayUGateway payUPaymentGateway = new PayUGateway();

    @Override
    public Long payViaCC(String cardNumber, int cvv, int expiryMonth, int expiryYear) {
        Long cvvLong = Long.valueOf(cvv);
        Long expiryLong = Long.valueOf(expiryMonth * 100 + expiryYear);
        String answer = payUPaymentGateway.makeCCPayment(Long.valueOf(cardNumber), cvvLong, expiryLong);
        return Long.valueOf(answer);
    }

    @Override
    public PaymentStatus getPaymentStatus(Long transactionId) {
        PayUPaymentStatus status = payUPaymentGateway.checkPaymentStatus(String.valueOf(transactionId));
        switch (status) {
            case SUCCESS:
                return PaymentStatus.SUCCESS;
            case FAILURE:
                return PaymentStatus.FAILURE;
            case PENDING:
                return PaymentStatus.PENDING;
            case ERROR:
                return PaymentStatus.ERROR;
            case UNKNOWN:
                return PaymentStatus.UNKNOWN;
            case TIMEOUT:
                return PaymentStatus.TIMEOUT;
        }
        return PaymentStatus.UNKNOWN;
    }
}