package ec.edu.epn.tdd.payment;

import org.junit.*;
import org.mockito.Mockito;
import static org.junit.Assert.*;

public class PaymentProcessorTest {

    private IPaymentGateway gateway = null;
    private PaymentProcessor processor = null;

    @Before
    public void setUp() {
        gateway = Mockito.mock(IPaymentGateway.class);
        processor = new PaymentProcessor(gateway);
    }

    @Test
    public void give_payment_when_is_correct_then_ok() {
        Mockito.when(gateway.requestPayment(Mockito.any())).
                thenReturn(new PaymentResponse(PaymentResponse.PaymentStatus.OK));

        assertTrue(processor.makePayment(100));
    }

    @Test
    public void give_payment_when_is_wrong_then_Error() {
        Mockito.when(gateway.requestPayment(Mockito.any())).
                thenReturn(new PaymentResponse(PaymentResponse.PaymentStatus.ERROR));

        assertFalse(processor.makePayment(100));
    }
}