package domaine;

public class ComptePayant extends Compte {
	private double taux;

	public double getTaux() {
		return taux;
	}

	public void setTaux(double taux) {
		this.taux = taux;
	}

	public ComptePayant(int id, double solde, double taux) {
		super(id,solde);
		this.taux = taux;
	}
	@Override
	public String toString() {
		return "ComptePayant " + "\t"+ super.toString() + "\t" + "decouvert= Non Authorisé" + "\t" + "Tx epargne= Aucun" + "\t" + "Taxe :" + taux  ;
	}
	
}
