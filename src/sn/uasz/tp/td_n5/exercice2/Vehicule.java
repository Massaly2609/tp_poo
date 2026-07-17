package sn.uasz.tp.td_n5.exercice2;

public abstract class Vehicule {

    protected String marque;
    protected String couleur;
    protected double coordX;
    protected double coordY;
    protected double coordZ;

    public Vehicule(String marque, String couleur, double coordX, double coordY, double coordZ) {
        this.marque = marque;
        this.couleur = couleur;
        this.coordX = coordX;
        this.coordY = coordY;
        this.coordZ = coordZ;
    }

    // Getter et Setter mis à jour avec le type double
    public String getMarque() { return marque; }
    public void setMarque(String marque) { this.marque = marque; }

    public String getCouleur() { return couleur; }
    public void setCouleur(String couleur) { this.couleur = couleur; }

    public double getCoordX() { return coordX; }
    public void setCoordX(double coordX) { this.coordX = coordX; }

    public double getCoordY() { return coordY; }
    public void setCoordY(double coordY) { this.coordY = coordY; }

    public double getCoordZ() { return coordZ; }
    public void setCoordZ(double coordZ) { this.coordZ = coordZ; }

    public abstract void afficher();
}