package org.examen;

import java.util.ArrayList;
import java.util.List;

public class Quartier extends Endroit {
    private List<Immeuble> immeubleList;

     @Override
    public int nbrAppart() {
         int apparts = 0;
        for(Immeuble i : immeubleList){
            apparts += i.nbrAppart();
        }
        return apparts;
    }

    public List<Immeuble> getImmeubleList() {
        return immeubleList;
    }

    public Quartier(int id, String nom,List<Immeuble> immeubleList) {
        this.immeubleList = immeubleList;
        this.id = id;
        this.nom = nom;
    }

    public boolean appartDansQuartier(Appartement appartement) {
         List<Appartement> appartDansImmeuble;
         for(Immeuble i : immeubleList){
             appartDansImmeuble = i.getListAppartement();
             for(Appartement a : appartDansImmeuble){
                 if(a.equals(appartement)){
                     return true;
                 }
             }
         }
         return false;
    }
}
