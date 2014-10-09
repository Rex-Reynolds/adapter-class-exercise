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
	private float expectedF;
	private String expectedS;
	private double expectedD;

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
		expectedF = 0.0f;
		expectedS = null;
		expectedD = 0;
	}

	/**
	 * Test method for
	 * {@link elon.edu.adapter.ChemicalDataBank#getCriticalPoint(java.lang.String, java.lang.String)}
	 * .
	 */
	@Test
	public void testGetCriticalPoint() {
		expectedF = 100.0f;
		assertEquals(expectedF, cBank.getCriticalPoint("Water", "F"),0);
		expectedF = 0.0f;
		assertEquals(expectedF, cBank.getCriticalPoint("Water", "M"),0);
		
	}

	/**
	 * Test method for
	 * {@link elon.edu.adapter.ChemicalDataBank#getMolecularStructure(java.lang.String)}
	 * .
	 */
	@Test
	public void testGetMolecularStructure() {
	  expectedS = "H2O";
		assertEquals(expectedS, cBank.getMolecularStructure("Water"));
	}

	/**
	 * Test method for
	 * {@link elon.edu.adapter.ChemicalDataBank#getMolecularWeight(java.lang.String)}
	 * .
	 */
	@Test
	public void testGetMolecularWeight() {
	  expectedD = 18.015;
	  assertEquals(expectedD, cBank.getMolecularWeight("water"),0);
	}

}
