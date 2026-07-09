package sn.uasz.tp.td_n6;

public class Feutre extends Pen {

    private Bouchon bouchons ;

    public Feutre (String couleur, String marque, double poids, double taille, Bouchon bouchons){
        super(couleur, marque, poids, taille);
        this.bouchons = bouchons ;
    }


    public void afficher() {
        System.out.println("Feutre:");
        super.afficher();
        bouchons.afficher(); // Afficher le bouchon

    }
}
