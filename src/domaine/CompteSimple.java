package domaine;

public class CompteSimple extends Compte{
	private double decouvert;
	
	//builder
	public CompteSimple(double dec) {
		super();
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
	
	
	
	
	
}
