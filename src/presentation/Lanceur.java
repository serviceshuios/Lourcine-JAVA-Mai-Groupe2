package presentation;

import java.util.Hashtable;
import java.util.Map;

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
	}
}
