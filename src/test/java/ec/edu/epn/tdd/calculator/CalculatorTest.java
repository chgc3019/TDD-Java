package ec.edu.epn.tdd.calculator;

//import org.testng.annotations.*;

import org.junit.*;
import static org.junit.Assert.*;

public class CalculatorTest {

    Calculator c = null;

    @BeforeClass
    public static void setUpClass() {
        System.out.println("setUpClass()");
    }

    @Before
    public void setUp() {
        System.out.println("setUp()");
        c = new Calculator();
    }

    @Test
    public void given_to_integer_when_addition_then_ok(){
        System.out.println("Test 1");
        assertEquals(6,c.addition(4,2));
    }

    @Test
    public void given_to_integer_when_subtraction_then_ok(){
        System.out.println("Test 2");
        assertEquals(2,c.subtraction(4,2));
    }

    @Test(expected = ArithmeticException.class)
    public void given_to_integer_when_division_then_exception(){
        System.out.println("Test 3");
        assertEquals(3,c.division(6,0));
    }

    @Test(timeout = 150)
    public void given_to_integer_when_multiplication_then_timeout(){
        System.out.println("Test 4");
        assertEquals(8,c.multiplication(4,2));
    }

    @After
    public void tearDown(){
        System.out.println("TearDown()");
        c.setAns(0);
    }

    @AfterClass
    public static void tearDownClass(){
        System.out.println("TearDownClass()");
    }
}