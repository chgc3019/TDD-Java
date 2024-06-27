package ec.edu.epn.tdd.payment;

public class PaymentProcessor {

    private IPaymentGateway gateway;

    public PaymentProcessor(IPaymentGateway gateway) {
        this.gateway = gateway;
    }

    public boolean makePayment(double amount){
        PaymentResponse response = gateway.requestPayment(new PaymentRequest(amount));
        if(response.getStatus() == PaymentResponse.PaymentStatus.OK)
            return true;
        else
            return false;
    }
}
