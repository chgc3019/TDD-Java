package ec.edu.epn.tdd.payment;

public interface IPaymentGateway {
    public PaymentResponse requestPayment(PaymentRequest paymentRequest);
}
