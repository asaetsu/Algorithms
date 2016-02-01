package basic;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PracticeTest {

    @Test
    public void testSum() {
        assertEquals(15, Practice.Sum());
    }

    @Test
    public void testFibonacci() {
        assertEquals(89, Practice.Fibonacci());
    }

    @Test
    public void testValidElementNum() {
        assertEquals(4, Practice.ValidElementNum());
    }

    @Test
    public void testMaxValue() {
        assertEquals(4, Practice.MaxValue());
    }

}
