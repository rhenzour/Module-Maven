package tn.insat.gl4.domain;

import tn.insat.gl4.domain.Calculette;
import junit.framework.TestCase;

public class Calculette_JUnit3_Test extends TestCase {

	private Calculette calculette;
	
	
	protected void setUp() throws Exception {
		calculette = new Calculette();   // Populate it ! 
	}

	protected void tearDown() throws Exception {
		calculette = null;   // mark it at collectable !
		
	}

	public final void testAdditionner() {
		
		// ARRANGE ...
		int arg1 = 10;
		int arg2 = 10;
		
		int expected = 20;
		
		// ACT ...
		int actual = calculette.additionner(arg1, arg2);
		
		// ASSERT ...
		assertEquals(expected, actual);
		
		//fail("Not yet implemented"); // TODO
	}

}
