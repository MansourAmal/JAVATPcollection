package tp2;

import java.util.ArrayList;
import java.util.Iterator;

public class Stats {
	public void afficherStatsEtudiants(ArrayList<Etudiant> l) {
		Iterator <Etudiant> i=l.iterator();
		while(i.hasNext()) {
			Etudiant E =i.next();
			System.out.println("etudiant="+E);
			System.out.println("moyenne="+E.getValue());
			System.out.println("maxnote="+E.meilleurnote());
			System.out.println("min note="+E.minnote());
		}
	}
	public float getMoyenneGroupe (ArrayList<Etudiant>l){
        float moy=0;
        for (Etudiant e:l){
            moy+=e.getValue();
        }
        return moy/l.size();
    }

    public float getMaximumGroupe (ArrayList<Etudiant>l){
        float max=l.get(0).getValue();
        for (Etudiant e:l){
            if (max< e.getValue()){
                max=e.getValue();
            }
        }
        return max;
    }

    public float getMinimumGroupe (ArrayList<Etudiant>l){
        float min=l.get(0).getValue();
        for (Etudiant e:l){
            if (min> e.getValue()){
                min=e.getValue();
            }
        }
        return min;
    }
}
