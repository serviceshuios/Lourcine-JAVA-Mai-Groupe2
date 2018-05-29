package service;

//modif pour commit
import java.util.Hashtable;
import java.util.Map;

import domaine.Club;
import domaine.Compte;
import domaine.Login;
import domaine.Personne;

public class ServiceImpl implements IService {

	// DECLARER ET INITIALISER LAA LISTE DES PERSONNES

	private Map<Integer, Personne> personnes = new Hashtable<Integer, Personne>();
	private Map<Integer, Compte> comptes = new Hashtable<Integer, Compte>();
	private Map<Integer, Club> clubs = new Hashtable<Integer, Club>();

	// GETTERS & SETTERS
	public Map<Integer, Personne> getPersonnes() {
		return personnes;
	}

	public void setPersonnes(Map<Integer, Personne> personnes) {
		this.personnes = personnes;
	}

	public Map<Integer, Compte> getComptes() {
		return comptes;
	}

	public void setComptes(Map<Integer, Compte> comptes) {
		this.comptes = comptes;
	}

	// METHODES
	@Override
	public Map<Integer, Personne> createPersonne(Personne p) {
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
	public void listPersonne(Map<Integer, Personne> personnes) {
		for (Map.Entry<Integer, Personne> entry : personnes.entrySet()) {
			System.out.println(entry.getKey() + "\t" + entry.getValue().toString());
			if (entry.getValue().getLiComptes() != null) {
				for (Compte cpt : entry.getValue().getLiComptes()) {
					System.out.println(cpt.toString());
				}
				if (entry.getValue().getLiClubs() != null) {
					for (Club club : entry.getValue().getLiClubs()) {
						System.out.println(club.toString());
					}
				}
			}
		}
	}

	@Override
	public Map<Integer, Compte> createCompte(Compte c) {
		comptes.put(c.getIdCompte(), c);
		return comptes;
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

	public void listCompte(Map<Integer, Compte> comptes) {
		for (Map.Entry<Integer, Compte> ent : comptes.entrySet()) {
			System.out.println(ent.getKey() + "\t" + ent.toString());
		}

	}

	@Override
	public Map<Integer, Club> createClub(Club b) {
		clubs.put(b.getIdClub(), b);
		return clubs;

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
	public void listClub(Map<Integer, Club> clubs) {
		for (Map.Entry<Integer, Club> clb : clubs.entrySet()) {
			System.out.println(clb.toString());
			if(clb.getValue().getLiPersonne()!=null) {
				for(Personne p:clb.getValue().getLiPersonne()) {
					System.out.println(p.toString());
				}
			}
		}

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
		p.getLiComptes().add(c);
		c.setPersonne(p);
	}

	@Override
	public void affilierClub(Personne p, Club b) {
		p.getLiClubs().add(b);
		b.getLiPersonne().add(p);

	}

	@Override
	public void crediterCompte(Compte c, double mt) {
		// TODO Auto-generated method stub

	}

	@Override
	public void ajouterTitulaire(Personne p, Compte c) {
		p.getLiComptes().add(c);
		c.setPersonne(p);
	}

	@Override
	public void ajouterPersonneClub(Personne p, Club c) {
		p.getLiClubs().add(c);
		c.getLiPersonne().add(p);

	}

}
