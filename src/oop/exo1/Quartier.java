package oop.exo1;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Getter
@AllArgsConstructor
@NoArgsConstructor
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

    public int nbrAppart(){
        int nbr = 0;
        for(Immeuble immeuble : immeubleList){
            nbr += immeuble.nbrAppart();
        }
        return nbr;
    }
}
