package tp2;

import java.util.ArrayList;

public class Etudiant implements IStatisticable,Comparable<Etudiant>{
	private String matricule;
	private String Nom;
	private ArrayList <Note> notes;
	public Etudiant(String matricule, String nom) {
		this.setMatricule(matricule);
		this.setNom(nom);
		this.notes =new ArrayList<Note>();
	}
	void addNote(Note n1) {
		notes.add(n1);
	}
	
	public String getMatricule() {
		return matricule;
	}
	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}
	public String getNom() {
		return Nom;
	}
	public void setNom(String nom) {
		Nom = nom;
	}
	@Override
	public String toString() {
		return "Etudiant [matricule=" + matricule + ", Nom=" + Nom + ", notes=" +notes+ "]";
	}
	public void affiche() {
		for(Note note:notes) {
			System.out.println(note );
		}
	}
	public float getValue(){
		double sm=0;
		int i=0;
		for(Note note:notes) {
			sm=sm+note.getNote();
			i++;
		}
		return (float)sm/i;
	}
	public double meilleurnote() {
		double max=notes.get(0).getNote();
		for (int i=0;i<notes.size();i++) {
			if(max<notes.get(i).getNote()) {
				max=notes.get(i).getNote();
			}
		}
		return max;
	}
	public double minnote() {
		double min=notes.get(0).getNote();
		for (int i=0;i<notes.size();i++) {
			if(min>notes.get(i).getNote()) {
				min=notes.get(i).getNote();
			}
		}
		return min;
	}
	
	public int compareTo(Etudiant e) {
		if(this.getValue()>e.getValue()) {
			return 1;
		}
		if(this.getValue()<e.getValue()) {
			return -1;
		}
		return 0;
	}
	
	
	
	
	
}
