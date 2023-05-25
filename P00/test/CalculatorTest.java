import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}
	
	@Test
	public final void testAdd() {
		int a = 4321;
		int b = 1234;
		
		Calculator cal = new Calculator();
		//cal.add -> called for add method inside Calculator
		int actual = cal.add(a, b);
		
		int expected = 5555;
		assertEquals(expected, actual);
	}
	
	@Test
	public final void testSubtract() {
		int a = 9876;
		int b = 4321;
		
		Calculator cal = new Calculator();
		int actual = cal.subtract(a, b);
		
		int expected = 5555;
		//assertEquals(actual,expected);
		assertEquals(actual,expected);
	}
	
	@Test
	public final void testMultiply() {
		int a = 2;
		int b = 3;
		
		Calculator cal = new Calculator();
		int actual = cal.multiply(a, b);
		
		//Result is equal to expected = correct
		int expected = 6;
		assertEquals(actual, expected);
	}
	
	@Test
	public final void testDivide() {
		int a = 10;
		int b = 5;
		
		Calculator cal = new Calculator();
		int actual = cal.divide(a, b);
		
		int expected = 2;
		assertEquals(actual, expected);
	}

	@After
	public void tearDown() throws Exception {
	}
	
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}


	


}
