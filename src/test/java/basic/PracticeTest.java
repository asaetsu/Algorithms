package basic;

import static org.junit.Assert.*;

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
}
