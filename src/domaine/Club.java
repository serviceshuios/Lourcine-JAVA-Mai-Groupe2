package domaine;

import java.util.Collection;

public class Club {
	private int idClub;
	private String nomClub;
	private Collection<Personne> liPersonne;
	
	public Club(int idClub, String nomClub, Collection<Personne> liPersonne) {
		
		this.idClub = idClub;
		this.nomClub = nomClub;
		liPersonne = liPersonne;
	}

	public int getIdClub() {
		return idClub;
	}

	public void setIdClub(int idClub) {
		this.idClub = idClub;
	}

	public String getNomClub() {
		return nomClub;
	}

	public void setNomClub(String nomClub) {
		this.nomClub = nomClub;
	}

	public Collection<Personne> getLiPersonne() {
		return liPersonne;
	}

	public void setLiPersonne(Collection<Personne> liPersonne) {
		this.liPersonne = liPersonne;
	}
	
	
	
	

}
