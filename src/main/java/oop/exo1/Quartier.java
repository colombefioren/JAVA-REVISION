package oop.exo1;

import java.util.ArrayList;
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
        return nbr;}}
