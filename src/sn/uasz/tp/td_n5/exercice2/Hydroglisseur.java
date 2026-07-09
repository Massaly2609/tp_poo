package sn.uasz.tp.td_n5.exercice2;

public class Hydroglisseur extends Vehicule implements Terrestre, Maritine{

    public Hydroglisseur(String marque, String couleur, String coordX, String coordY, String coordZ) {
        super(marque, couleur, coordX, coordY, coordZ);
    }

    public void afficher (){
//        a implementer
    }

    @Override
    public void deplacerMer(double dx, double dy) {
        super.coordX += dx;
        super.coordY += dy;
    }

    @Override
    public void delacerTerre(double dx, double dy) {
        super.coordX += dx ;
        super.coordY += dy ;
    }
}
