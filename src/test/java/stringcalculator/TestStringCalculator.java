package stringcalculator;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestStringCalculator {
    @Test
    public void testEmptyString() {
        StringCalculator calculator = new StringCalculator();
        assertEquals(0, calculator.add(""));
    }
}
