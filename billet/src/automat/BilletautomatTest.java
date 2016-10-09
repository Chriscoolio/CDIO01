package automat;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class BilletautomatTest {
	Billetautomat automat;

	@Before
	public void setUp() throws Exception {                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           
		automat = new Billetautomat();
	}

	@After
	public void tearDown() throws Exception {
		automat = null;

	}

	@Test
	public void testGetBilletpris() {
		int expected = 10;
		int actual = automat.getBilletpris();
		assertEquals(expected, actual);
	}

	
	// 
	@Test
	public void testIndsætPengeOverflow() {
		int expected = Integer.MAX_VALUE;

		automat.indsætPenge(Integer.MAX_VALUE - 1);
		automat.indsætPenge(22);
		int actual = automat.getBalance();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetBalanceUnderflow() {
		int expected = Integer.MIN_VALUE;
		
		automat.indsætPenge(Integer.MIN_VALUE - 1);
		automat.indsætPenge(-22);
		int actual = automat.getBalance();
		assertEquals(expected, actual);
		
			
	}

	
	// skal ikke testes
	@Test
	public void testUdskrivBillet() {
		fail("Not yet implemented");
	}

	
	// test om Returpenge kan tage imod en double
	@Test
	public void testReturpenge() {
		fail("Not yet implemented");
	}

	// test om MontørLogin kan tage imod negativ input. 
	@Test
	public void testMontørLogin() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetTotal() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetAntalBilletterSolgt() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetBilletpris() {
		fail("Not yet implemented");
	}

	@Test
	public void testNulstil() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetAntalBilletterSolgt() {
		fail("Not yet implemented");
	}

	@Test
	public void testErMontør() {
		fail("Not yet implemented");
	}

}
