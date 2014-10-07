package elon.edu.adapter;

public class Compound implements ChemicalCompound {

	private ChemicalCompound compound;
	private String string;
	private StringBuilder results = new StringBuilder();
	ChemicalDataBank cBank = new ChemicalDataBank();

	public Compound(String string) {
		this.string = string;
	}

	@Override
	public String display() {
		System.out.println("Compound:" + string + " -------");
		System.out.println("Molecular Formula: " + getMolecularFormula());
		System.out.println("Molecular Weight: " + getMolecularWeight());
		System.out.println("Melting Point: " + getMeltingPoint());
		System.out.println("Boiling Point: " + getBoilingPoint());
		results.append(getMolecularFormula());
		results.append(getMolecularWeight());
		results.append(getMeltingPoint());
		results.append(getBoilingPoint());
		return results.toString();
	}

	@Override
	public double getBoilingPoint() {

		return cBank.getCriticalPoint(string, "B");
	}

	@Override
	public double getMeltingPoint() {

		return cBank.getCriticalPoint(string, "M");
	}

	@Override
	public String getMolecularFormula() {

		return cBank.getMolecularStructure(string);
	}

	@Override
	public double getMolecularWeight() {

		return cBank.getMolecularWeight(string);
	}

}
