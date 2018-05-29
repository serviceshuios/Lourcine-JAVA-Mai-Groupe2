package domaine;

import java.util.ArrayList;
import java.util.Collection;

public class Personne {
	private int idPersonne, age;
	private String nom, prenom;
	private Collection<Club> liClubs = new ArrayList();
	private Collection<Compte> liComptes= new ArrayList();
	private Login log;
	
	
	
	public Collection<Compte> getLiComptes() {
		return liComptes;
	}
	public void setLiComptes(Collection<Compte> liComptes) {
		this.liComptes = liComptes;
	}
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
	public Personne(int id, String nom, String prenom, int age) {
		super();
		this.idPersonne = id;
		this.age = age;
		this.nom = nom;
		this.prenom = prenom;
	}
	@Override
	public String toString() {
		
		String str="";
		if (this.liComptes!=null) {
			for(Compte cpt:this.liComptes) {
				str = str + "\n" + cpt.toString();
			}
		}
			
		return "Personne [age=" + age + ", nom=" + nom + ", prenom=" + prenom + "]" + str;
	}
	
}
