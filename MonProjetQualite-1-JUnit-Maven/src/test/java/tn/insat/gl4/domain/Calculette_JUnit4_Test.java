package tn.insat.gl4.domain;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Calculette_JUnit4_Test {

	private Calculette calculette;

	@Before
	public void setUp() throws Exception {
		calculette = new Calculette();
	}

	@After
	public void tearDown() throws Exception {
		calculette = null;
	}

	@Test
	public final void testAdditionner() {
		// ARRANGE ...
		int arg1 = 5;
		int arg2 = 5;

		int expected = 10;

		// ACT ...
		int actual = calculette.additionner(arg1, arg2);

		// ASSERT ...
		assertEquals(expected, actual);

		// fail("Not yet implemented"); // TODO
	}

	@Test
	public final void test_Successfull_Diviser() {
		// ARRANGE ...
		int arg1 = 5;
		int arg2 = 5;

		int expected = 1;

		// ACT ...
		int actual = calculette.diviser(arg1, arg2);

		// ASSERT ...
		assertEquals(expected, actual);

		// fail("Not yet implemented"); // TODO
	}
	@Test(expected=ArithmeticException.class)
    public final void test_Failing_Diviser() {
		// ARRANGE ...
		int arg1 = 5;
		int arg2 = 0;

		int expected = 1;

		// ACT ...
		int actual = calculette.diviser(arg1, arg2);

		// ASSERT ...
		//
	   assertEquals(expected, actual);

		// fail("Not yet implemented"); // TODO
	}

}
