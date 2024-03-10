package tp2;

import java.util.ArrayList;
import java.util.Collections;

public class Test {

	public static void main(String[] args) {
		ArrayList<Etudiant> ve=new ArrayList<>();
		Stats s=new Stats();
		ve.add(new Etudiant("1","ranim"));
		ve.get(0).addNote(new Note("math",17));
		ve.get(0).addNote(new Note("geo",14));
		
		ve.add(new Etudiant("2","rzouga"));
		ve.get(1).addNote(new Note("math",10));
		ve.get(1).addNote(new Note("geo",13));
		
		ve.add(new Etudiant("3","Amal"));
		ve.get(2).addNote(new Note("math",19));
		ve.get(2).addNote(new Note("geo",15));
		
		System.out.println("affichage de groupe:");
		s.afficherStatsEtudiants(ve);
        System.out.println("max classe"+ s.getMaximumGroupe(ve));
        System.out.println("min classe"+ s.getMinimumGroupe(ve));
        System.out.println("affichage trie:");
		System.out.println("avant trie:");
		s.afficherStatsEtudiants(ve);
		Collections.sort(ve);
		System.out.println("apres trie:");
		s.afficherStatsEtudiants(ve);
		System.out.println("affichage comparator:");
		Nomcomparator cn = new Nomcomparator();
        Collections.sort(ve,cn);
        System.out.println(ve);
	}

}
