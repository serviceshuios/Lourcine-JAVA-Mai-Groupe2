package domaine;

public class CompteEpargne extends Compte{
	private double pourcentage;

	public double getPourcentage() {
		return pourcentage;
	}

	public void setPourcentage(double pourcentage) {
		this.pourcentage = pourcentage;
	}

	public CompteEpargne(int id, double solde, double pourcentage) {
		super(id, solde);
		this.pourcentage = pourcentage;
	}

	@Override
	public String toString() {
		return "CompteEpargne " + "\t" + super.toString() + "\t" + "decouvert= Non Authorisé" + "\t" + "Tx epargne=" + pourcentage  + "\t\t" + "Taxe : Aucune" ;
	}
	
}
