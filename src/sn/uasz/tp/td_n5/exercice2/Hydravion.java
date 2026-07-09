package sn.uasz.tp.td_n5.exercice2;

public class Hydravion extends Vehicule implements Maritine, Aerien{

    public Hydravion(String marque, String couleur, String coordX, String coordY, String coordZ) {
        super(marque, couleur, coordX, coordY, coordZ);
    }


    @Override
    public void afficher() {
//        Afficher
    }

    @Override
    public void deplacerMer(double dx, double dy) {
        super.coordX += dx;
        super.coordY += dy;
    }

    @Override
    public void deplacerAir(double dx , double dy, double dz){
        super.coordX += dx;
        super.coordY += dy;
        super.coordZ += dz;
    }
}
