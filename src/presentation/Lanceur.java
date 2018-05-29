package presentation;

import java.util.Hashtable;
import java.util.Map;

import domaine.Club;
import domaine.Compte;
import domaine.CompteEpargne;
import domaine.ComptePayant;
import domaine.CompteSimple;
import domaine.Personne;
import service.IService;
import service.ServiceImpl;

public class Lanceur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// TODO Auto-generated method stub
		IService service = new ServiceImpl();
		Map<Integer, Personne> resPersonne = new Hashtable<Integer, Personne>();
		System.out.println("AFFICHAGE MAP AVANT AJOUT");
		service.listPersonne(resPersonne);
		System.out.println("AJOUT D'UNE PERSONNE");
		Personne p = new Personne(1, "Rolland", "Thierry", 20);
		Personne p2 = new Personne(2, "Zidane", "Zinedine", 22);
		resPersonne = service.createPersonne(p);
		resPersonne = service.createPersonne(p2);
		System.out.println("AFFICHAGE MAP APRES AJOUT");
		service.listPersonne(resPersonne);
		
		System.out.println("--------------Comptes--------------");
		Map<Integer, Compte> resCompte= new Hashtable<Integer, Compte>();
		System.out.println("AFFICHAGE MAP AVANT AJOUT");
		service.listCompte(resCompte);
		System.out.println("AJOUT D'UNE PERSONNE");
		Compte c1 = new CompteSimple(1,1000.0,50.0);
		Compte c2 = new CompteSimple(2,505,100);
		Compte c3 = new CompteEpargne(3,468,0.05);
		Compte c4 = new ComptePayant(4,468,0.05);
		resCompte = service.createCompte(c1);
		resCompte = service.createCompte(c2);
		resCompte = service.createCompte(c3);
		resCompte = service.createCompte(c4);
		System.out.println("AFFICHAGE MAP APRES AJOUT");
		service.listCompte(resCompte);
		
		System.out.println("\n--------------Affiliation des Comptes--------------");
		service.ajouterTitulaire(p, c1);
		service.ajouterTitulaire(p, c3);
		service.attribuerCompte(p2, c2);
		service.attribuerCompte(p2, c4);
		service.listPersonne(resPersonne);
		
		System.out.println("\n--------------Affiliation des Clubs--------------");
		Map<Integer,Club> resClub = new Hashtable<Integer,Club>();
		Club cb1 = new Club(1,"Club des écrivains imaginaires");
		resClub = service.createClub(cb1);
		Club cb2 = new Club(2,"Club des 5");
		resClub = service.createClub(cb2);
		
		Personne p3 = new Personne(3, "Lapix", "Anne-Sophie", 30);
		resPersonne=service.createPersonne(p3);
		
		service.affilierClub(p, cb1);
		service.affilierClub(p2, cb2);
		service.ajouterPersonneClub(p3, cb2);
		
		service.listClub(resClub);
		
		
		
	}
}
