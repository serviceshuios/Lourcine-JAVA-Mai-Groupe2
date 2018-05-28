package domaine;

public class Login {
	private int idLogin;
	private String pseudo, mdp;
	
	public int getIdLogin() {
		return idLogin;
	}
	public void setIdLogin(int idLogin) {
		this.idLogin = idLogin;
	}
	public String getPseudo() {
		return pseudo;
	}
	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}
	public String getMdp() {
		return mdp;
	}
	public void setMdp(String mdp) {
		this.mdp = mdp;
	}
	
	public Login(String pseudo, String mdp) {
		super();
		this.pseudo = pseudo;
		this.mdp = mdp;
	}
	
	
}
