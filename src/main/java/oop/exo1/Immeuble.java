package oop.exo1;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class Immeuble extends Endroit {
    private int nbrEtage;
    List<Appartement> appartementList;

    public Immeuble(int id, String nom, int nbrEtage, List<Appartement> appartementList) {
        super(id, nom);
        this.nbrEtage = nbrEtage;
        this.appartementList = appartementList;
    }

    public Immeuble(int id, String nom, int nbrEtage) {
        super(id, nom);
        this.nbrEtage = nbrEtage;
        this.appartementList = new ArrayList<Appartement>();
    }

    public int nbrAppart(){
        return appartementList.size();
    }
}
