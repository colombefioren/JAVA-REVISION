package oop.exo1;

import lombok.Getter;
import lombok.ToString;

@ToString
@Getter
public abstract class Endroit {
    protected int id;
    protected String nom;

    public Endroit(int id, String nom) {
        this.id = id;
        this.nom = nom;
    }

    public abstract int nbrAppart();
}
