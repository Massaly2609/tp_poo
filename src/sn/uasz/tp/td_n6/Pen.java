package sn.uasz.tp.td_n6;

import java.awt.datatransfer.SystemFlavorMap;

public class Pen {

    protected String couleur ;
    protected String marque ;
    protected Corps  corps ; // relation 1 : chaque Pen a un Corps

    public Pen (String couleur, String marque,double poids, double taille){
        this.couleur = couleur ;
        this.marque  = marque ;
        this.corps   = new Corps(poids,taille) ;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public Corps getCorps() {
        return corps;
    }

    public void setCorps(Corps corps) {
        this.corps = corps;
    }

//    Affichage
    public void afficher() {
        System.out.println("Pen : Couleur : " + couleur + " marque : " + marque);
        corps.afficher();  // Afficher les elements de Corps (poids, taille)
    }
}
