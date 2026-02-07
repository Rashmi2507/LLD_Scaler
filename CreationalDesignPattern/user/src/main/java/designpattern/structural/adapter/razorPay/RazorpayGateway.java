package designpattern.structural.adapter.razorPay;

public class RazorpayGateway {
    public String payByCreditCard(String creditCard,
            String cvv,
            String expiry) {

        System.out.println("Payment is being processed by Razorpay...");
        return "transactionId";
    }

    public boolean isPaymentSuccessful(String transactionId) {
        return false;
    }
}
