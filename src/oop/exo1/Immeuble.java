package oop.exo1;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Immeuble extends Endroit {
    private int nbrEtage;
    List<Appartement> appartementList;

    public int nbrAppart(){
        return appartementList.size();
    }
}
