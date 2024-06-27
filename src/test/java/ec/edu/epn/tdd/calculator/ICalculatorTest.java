package ec.edu.epn.tdd.calculator;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class ICalculatorTest {

    @Test
    public void given_to_integer_when_addition_then_ok() {
        ICalculator c = Mockito.mock(ICalculator.class);
        Mockito.when(c.addition(2,3)).thenReturn(5);
        assertEquals(5,c.addition(2,3));
    }

    @Test
    public void given_to_integer_when_subtraction_then_ok() {
        ICalculator c = Mockito.mock(ICalculator.class);
        Mockito.when(c.subtraction(6,3)).thenReturn(3);
        assertEquals(3,c.subtraction(6,3));
    }

    @Test
    public void given_to_integer_when_division_then_ok() {
        ICalculator c = Mockito.mock(ICalculator.class);
        Mockito.when(c.division(6,3)).thenReturn(2);
        assertEquals(2,c.division(6,3));
    }
    @Test
    public void given_to_integer_when_multiplication_then_ok() {
        ICalculator c = Mockito.mock(ICalculator.class);
        Mockito.when(c.multiplication(2,3)).thenReturn(6);
        assertEquals(6,c.multiplication(2,3));
    }

}