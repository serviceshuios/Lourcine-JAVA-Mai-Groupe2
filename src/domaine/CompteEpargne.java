package domaine;

public class CompteEpargne extends Compte{
	private double pourcentage;

	public double getPourcentage() {
		return pourcentage;
	}

	public void setPourcentage(double pourcentage) {
		this.pourcentage = pourcentage;
	}

	public CompteEpargne(double pourcentage) {
		super();
		this.pourcentage = pourcentage;
	}
	
}
