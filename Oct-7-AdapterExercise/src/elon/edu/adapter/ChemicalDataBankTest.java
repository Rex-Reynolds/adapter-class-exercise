/**
 * 
 */
package elon.edu.adapter;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author rreynolds3
 *
 */
public class ChemicalDataBankTest {
	private ChemicalDataBank cBank;
	private float expected;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		cBank = new ChemicalDataBank();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		cBank = null;
		expected = 0.0f;
	}

	/**
	 * Test method for
	 * {@link elon.edu.adapter.ChemicalDataBank#getCriticalPoint(java.lang.String, java.lang.String)}
	 * .
	 */
	@Test
	public void testGetCriticalPoint() {
		expected = 100.0f;
		assertEquals(expected, cBank.getCriticalPoint("Water", "F"),0);
	}

	/**
	 * Test method for
	 * {@link elon.edu.adapter.ChemicalDataBank#getMolecularStructure(java.lang.String)}
	 * .
	 */
	@Test
	public void testGetMolecularStructure() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for
	 * {@link elon.edu.adapter.ChemicalDataBank#getMolecularWeight(java.lang.String)}
	 * .
	 */
	@Test
	public void testGetMolecularWeight() {
		fail("Not yet implemented");
	}

}
