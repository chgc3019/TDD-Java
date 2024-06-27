package ec.edu.epn.tdd.calculator;

import static org.junit.Assert.*;
import java.util.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;


@RunWith(value = Parameterized.class)
public class CalculatorParametersTest {
    private int a, b, expected;

    @Parameterized.Parameters
    public static Iterable<Object[]> parameters(){
        List<Object[]> list = new ArrayList<Object[]>();
        list.add(new Object[]{2,4,6});
        list.add(new Object[]{1,8,9});
        list.add(new Object[]{2,5,7});
        list.add(new Object[]{7,3,10});
        list.add(new Object[]{22,4,26});
        list.add(new Object[]{12,14,26});
        return list;
    }

    public CalculatorParametersTest(int a, int b, int expected) {
        this.a = a;
        this.b = b;
        this.expected = expected;
    }

    @Test
    public void given_parameters_when_addition_then_ok(){
        Calculator c = new Calculator();
        int actual = c.addition(a,b);
        assertEquals(expected,actual);
    }

}