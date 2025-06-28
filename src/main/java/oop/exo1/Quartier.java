package oop.exo1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class Quartier extends Endroit{
    private List<Immeuble> immeubleList;

    public boolean appartDansQuartier(Appartement appartement) {
       Endroit location = appartement.getEndroit();
       if(location instanceof Immeuble){
           return immeubleList.contains(location);
       }
       return false;
    }

    public Quartier(int id, String nom, List<Immeuble> immeubleList) {
        super(id, nom);
        this.immeubleList = immeubleList;
    }
    public Quartier(int id, String nom) {
        super(id, nom);
    this.immeubleList = new ArrayList<Immeuble>();
    }

    public int nbrAppart(){
        int nbr = 0;
        for(Immeuble immeuble : immeubleList){
            nbr += immeuble.nbrAppart();
        }
        return nbr;
    }

    public static void main(String[] args) {
  Quartier quartier1;
    Quartier quartier2;
    Immeuble immeuble1 = new Immeuble(1,"Cocorita",1, new ArrayList<>());
    Immeuble immeuble2 = new Immeuble(2,"Sosorita",5, new ArrayList<>());
    Appartement appartement1 = new Appartement(1, "Maison 1", "Maison 1", 100000,Statut.LIBRE, immeuble1);
    Appartement appartement2 = new Appartement(2, "Maison 2", "Maison 2", 100000,Statut.EN_COURS_LIBERATION, immeuble1);
    Appartement appartement3 = new Appartement(3, "Maison 3", "Maison 3", 100000,Statut.LIBRE, immeuble2);
    Appartement appartement4 = new Appartement(4, "Maison 4", "Maison 4", 100000, Statut.OCCUPE,immeuble2);
     quartier1 = new Quartier(1,"Ivandry", Collections.singletonList(immeuble1));
     quartier2 = new Quartier(2,"Tamatave", Collections.singletonList(immeuble2));


        System.out.println(quartier1.appartDansQuartier(appartement1));
    }
}
