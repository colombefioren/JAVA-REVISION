package org.examen;

import java.util.ArrayList;
import java.util.List;

public class Immeuble extends Endroit {
    private int nombreEtage;
    private List<Appartement> listAppartement;

    public int getNombreEtage() {
        return nombreEtage;
    }

    @Override
   public int nbrAppart(){
        return listAppartement.size();
   }

    public List<Appartement> getListAppartement() {
        return listAppartement;
    }

    public Immeuble(int id, String nom,int nombreEtage, List<Appartement> listAppartement) {
        this.nombreEtage = nombreEtage;
        this.listAppartement = listAppartement;
        this.id = id;
        this.nom = nom;
    }

    public Immeuble(int nombreEtage) {
        this.nombreEtage = nombreEtage;
        this.listAppartement = new ArrayList<Appartement>();
    }
}
