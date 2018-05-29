package domaine;

import java.util.ArrayList;
import java.util.Collection;

public class Club {
	private int idClub;
	private String nomClub;
	private Collection<Personne> liPersonne = new ArrayList<Personne>();
	
	public Club(int idClub, String nomClub) {
		
		this.idClub = idClub;
		this.nomClub = nomClub;
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

	@Override
	public String toString() {
		return "Club [idClub=" + idClub + ", nomClub=" + nomClub + "]";
	}
	
	
	
	

}
