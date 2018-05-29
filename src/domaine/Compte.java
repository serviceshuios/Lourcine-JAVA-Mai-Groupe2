package domaine;

public abstract class Compte {
	//declarer les variables
	private int idCompte;
	private double solde;
	private Personne personne;
	
	//Constructeur
	public Compte(int idCompte, double solde) {
		super();
		this.idCompte = idCompte;
		this.solde = solde;
	}
	/**
	//getter & setter
	/**
	 * @return the idCompte
	 */
	public int getIdCompte() {
		return idCompte;
	}

	 /*@param idCompte the idCompte to set
	 */
	public void setIdCompte(int idCompte) {
		this.idCompte = idCompte;
	}
	/**
	 * @return the solde
	 */
	public double getSolde() {
		return solde;
	}
	/**
	 * @param solde the solde to set
	 */
	public void setSolde(double solde) {
		this.solde = solde;
	}
	/**
	 * @return the solde
	 */
	public Personne getpersonne() {
		return personne;
	}
	/**
	 * @param solde the solde to set
	 */
	public void setPersonne(Personne personne) {
		this.personne = personne;
	}
	@Override
	public String toString() {
		return "ID=" + idCompte + "\t" + "solde=" + solde;
	}

	

}
