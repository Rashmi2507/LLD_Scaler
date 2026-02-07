package designpattern.structural.adapter;

public class Client {
    public static void main(String[] args) {
        // Flipkart flipkart = new Flipkart(new RazorpayPaymentGatewayAdapter());
        // flipkart.makePaymentViaCC("1234-5678-9012-3456", 123, 12, 2025);

        Flipkart flipkart = new Flipkart(new PayUPaymentGatewayAdapter());
        flipkart.makePaymentViaCC("1234-5678-9012-3456", 123, 12, 2025);
    }
}
