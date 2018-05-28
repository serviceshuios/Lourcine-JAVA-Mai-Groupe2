package service;

import domaine.Club;
import domaine.Compte;
import domaine.Login;
import domaine.Personne;

public interface IService {
	
//crée un CROUD pour la Classe Personne; Compte; Club; Mogin
	public void createPersonne(Personne p);
	public void readPersonne(Personne p);
	public void updatePersonne(Personne p);
	public void deletePersonne(Personne p);
	
	public void listPersonne();
	
	public void createCompte(Compte c);
	public void readCompte(Compte c);
	public void updateCompte(Compte c);
	public void deleteCompte(Compte c);
	
	public void createClub(Club b);
	public void readClub(Club b) ;
	public void updateClub(Club b);
	public void deleteClub(Club b);
	
	public void createlogin(Login l);
	public void readlogin(Login l);
	public void updatelogin(Login l);
	public void deletelogin(Login l);
	
	public void attribuerCompte(Personne p, Compte c);
	public void affilierClub(Personne p, Club b);
	public void crediterCompte(Compte c, double mt);
	public void ajouterTitulaire(Personne p, Compte c);
	public void ajouterPersonneClub(Personne p, Club c);
	

}
