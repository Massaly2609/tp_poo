package sn.uasz.tp.td_n6;

public class Stylo extends Pen {

    public Stylo (String couleur, String marque, double poids, double taille){
        super(couleur, marque, poids, taille);
    }


    public void afficher() {
        System.out.println("Stylo:");
        super.afficher();
    }
}
