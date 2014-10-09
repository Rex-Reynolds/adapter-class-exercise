package elon.edu.adapter;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CompoundTest {
  private Compound compound;
  private float expectedF;
  private String expectedS;
  private double expectedD;
  private StringBuilder builder;

	@Before
	public void setUp() throws Exception {
	  compound = new Compound("water");
	  builder = new StringBuilder();
	}

	@After
	public void tearDown() throws Exception {
	  compound = null;
	  expectedF = 0.0f;
	  expectedS = null;
	  expectedD = 0;
	}

	@Test
	public void testDisplay() {
		builder.append(compound.getMolecularFormula());
		builder.append(compound.getMolecularWeight());
		builder.append(compound.getMeltingPoint());
		builder.append(compound.getBoilingPoint());
		assertEquals(builder.toString(),compound.display());
	}

	@Test
	public void testGetBoilingPoint() {
	  expectedF = 100.0f;
		assertEquals(expectedF, compound.getBoilingPoint(),0);
	}

	@Test
	public void testGetMeltingPoint() {
	  expectedF = 0.0f;
      assertEquals(expectedF, compound.getMeltingPoint(),0);
	}

	@Test
	public void testGetMolecularFormula() {
	  expectedS = "H2O";
      assertEquals(expectedS, compound.getMolecularFormula());
	}

	@Test
	public void testGetMolecularWeight() {
	  expectedD = 18.015;
      assertEquals(expectedD, compound.getMolecularWeight(),0);
	}

}
