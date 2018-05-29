package domaine;

public class CompteSimple extends Compte{
	private double decouvert;
	
	//builder
	public CompteSimple(int id, double solde, double dec) {
		super(id, solde);
		this.decouvert = dec;
	}

	//getter & setter
	/**
	 * @return the decouvert
	 */
	public double getDecouvert() {
		return decouvert;
	}

	/**
	 * @param decouvert the decouvert to set
	 */
	public void setDecouvert(double decouvert) {
		this.decouvert = decouvert;
	}

	@Override
	public String toString() {
		return "CompteSimple " + "\t"+ super.toString() + "\t" + "decouvert=" + decouvert + "\t\t\t" + "Tx epargne= Aucun" + "\t" + "Taxe : Aucune";
	}
	
	
	
	
	
}
