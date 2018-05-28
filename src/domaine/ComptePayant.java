package domaine;

public class ComptePayant extends Compte {
	private double taux;

	public double getTaux() {
		return taux;
	}

	public void setTaux(double taux) {
		this.taux = taux;
	}

	public ComptePayant(double taux) {
		super();
		this.taux = taux;
	}
	
}
