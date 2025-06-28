package org.examen;

public class Appartement {
    private int id;
    private String titre;
    private String description;
    private double loyerMensuel;
    private Endroit endroit;
    private Statut statut;

    public int getId() {
        return id;
    }

    public String getTitre() {
        return titre;
    }

    public String getDescription() {
        return description;
    }

    public double getLoyerMensuel() {
        return loyerMensuel;
    }

    public Endroit getEndroit() {
        return endroit;
    }

    public Appartement(int id, String titre, String description, double loyerMensuel, Endroit endroit, Statut statut) {
        this.id = id;
        this.titre = titre;
        this.description = description;
        this.loyerMensuel = loyerMensuel;
        this.endroit = endroit;
        this.statut = statut;
    }
}