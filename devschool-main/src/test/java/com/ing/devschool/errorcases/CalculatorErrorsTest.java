package com.ing.devschool.errorcases;

import com.ing.devschool.Calculator;
import org.junit.Before;
import org.junit.Test;

public class CalculatorErrorsTest {

    private Calculator calculator;

    @Before
    public void setUp() throws Exception {
        calculator = new Calculator();
    }

    @Test(expected = Exception.class)
    public void testErrorDivide() throws Exception {
        calculator.divide(5,0);
    }

    @Test(expected = Exception.class)
    public void testErrorSubstractEquals() throws Exception {
        calculator.substract(5,5);
    }
}
