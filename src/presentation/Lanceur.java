package presentation;

import java.util.Hashtable;
import java.util.Map;

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
		Map<Integer, Personne> resultats = new Hashtable<Integer, Personne>();
		System.out.println("AFFICHAGE MAP AVANT AJOUT");
		service.listPersonne(resultats);
		System.out.println("AJOUT D'UNE PERSONNE");
		Personne p = new Personne(1, "ZEC", "UNION", 20);
		Personne p2 = new Personne(2, "ZEC2", "UNION2", 22);
		resultats = service.createPersonne(p);
		resultats = service.createPersonne(p2);
		System.out.println("AFFICHAGE MAP APRES AJOUT");
		service.listPersonne(resultats);
		
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
		service.listPersonne(resultats);
		
		
	}
}
