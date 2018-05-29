package service;
//modif pour commit
import java.util.Hashtable;
import java.util.Map;

import domaine.Club;
import domaine.Compte;
import domaine.Login;
import domaine.Personne;

public class ServiceImpl implements IService {
	
	//DECLARER ET INITIALISER LAA LISTE DES PERSONNES
	
	private Map<Integer,Personne> personnes = new Hashtable<Integer,Personne>();
	
	public Map<Integer, Personne> getPersonnes() {
		return personnes;
		}
	public void setPersonnes(Map<Integer, Personne> personnes) {
		this.personnes = personnes;
		}


	@Override
	public Map<Integer,Personne> createPersonne(Personne p) {
	// TODO Auto-generated method stub
	personnes.put(p.getIdPersonne(), p);
	return personnes;
	}

	@Override
	public void readPersonne(Personne p) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updatePersonne(Personne p) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deletePersonne(Personne p) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void listPersonne(Map<Integer,Personne> personnes) {
	// TODO Auto-generated method stub
	for (Map.Entry<Integer, Personne> entry : personnes.entrySet()) {
	System.out.println(entry);
	}
	}
	
	@Override
	public void createCompte(Compte c) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void readCompte(Compte c) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateCompte(Compte c) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteCompte(Compte c) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void listCompte() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void createClub(Club b) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void readClub(Club b) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateClub(Club b) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteClub(Club b) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void listClub() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void createlogin(Login l) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void readlogin(Login l) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updatelogin(Login l) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deletelogin(Login l) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void listLogin() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void attribuerCompte(Personne p, Compte c) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void affilierClub(Personne p, Club b) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void crediterCompte(Compte c, double mt) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ajouterTitulaire(Personne p, Compte c) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ajouterPersonneClub(Personne p, Club c) {
		// TODO Auto-generated method stub
		
	}
	
	
	

}
