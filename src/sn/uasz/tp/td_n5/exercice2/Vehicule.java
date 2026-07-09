package sn.uasz.tp.td_n5.exercice2;

public abstract class  Vehicule {

    protected String marque ;
    protected String couleur ;
    protected String coordX ;
    protected String coordY ;
    protected String coordZ ;

    public Vehicule(String marque, String couleur, String coordX, String coordY, String coordZ) {
        this.marque = marque;
        this.couleur = couleur;
        this.coordX = coordX;
        this.coordY = coordY;
        this.coordZ = coordZ;
    }

//     Getter et Setter

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public String getCoordX() {
        return coordX;
    }

    public void setCoordX(String coordX) {
        this.coordX = coordX;
    }

    public String getCoordY() {
        return coordY;
    }

    public void setCoordY(String coordY) {
        this.coordY = coordY;
    }

    public String getCoordZ() {
        return coordZ;
    }

    public void setCoordZ(String coordZ) {
        this.coordZ = coordZ;
    }

//    Methode abstraite
    public abstract void afficher();
}
