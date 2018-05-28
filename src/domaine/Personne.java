package domaine;

import java.util.Collection;

public class Personne {
	private int idPersonne, age;
	private String nom, prenom;
	private Collection<Club> liClubs;
	
	public Collection<Club> getLiClubs() {
		return liClubs;
	}
	public void setLiClubs(Collection<Club> liClubs) {
		this.liClubs = liClubs;
	}
	public int getIdPersonne() {
		return idPersonne;
	}
	public void setIdPersonne(int idPersonne) {
		this.idPersonne = idPersonne;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public Personne(int age, String nom, String prenom) {
		super();
		this.age = age;
		this.nom = nom;
		this.prenom = prenom;
	}
	
}
