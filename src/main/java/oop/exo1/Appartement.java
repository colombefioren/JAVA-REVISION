package oop.exo1;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Appartement {
    private int id;
    private String titre;
    private String description;
    private int loyer;
    private Statut statut;
    private Endroit endroit;
}
