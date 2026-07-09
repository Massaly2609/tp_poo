package sn.uasz.tp.td_n6;

public class Bouchon {

    protected String couleur ;


    public Bouchon(String couleur) {
        this.couleur = couleur;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }


    public void afficher() {
        System.out.println("Bouchon : " + couleur );
    }
}
