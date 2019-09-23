import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    private Calculator calc;

    @Before
    public void before(){
        calc = new Calculator();
    }

    @Test
    public void addsNumbers(){
        assertEquals(15, calc.addNumbers(10, 5), 0);
    }

    @Test
    public void subtractsNumbers(){
        assertEquals(5, calc.subtractNumbers(10, 5), 0);
    }

    @Test
    public void multipliesNumbers(){
        assertEquals(50, calc.multiplyNumbers(10, 5), 0);
    }

    @Test
    public void dividesNumbers(){
        assertEquals(4, calc.divideNumbers(8, 2), 0);
    }
}
