package sn.uasz.tp.td_n5.exercice2;

public class Hydravion extends Vehicule implements Maritime, Aerien {

    public Hydravion(String marque, String couleur, double coordX, double coordY, double coordZ) {
        super(marque, couleur, coordX, coordY, coordZ);
    }

    @Override
    public void afficher() {
        System.out.println("[Hydravion] Marque : " + marque + " | Couleur : " + couleur +
                " | Position : (" + coordX + ", " + coordY + ", " + coordZ + ")");
    }

    @Override
    public void deplacerMer(double dx, double dy) {
        this.coordX += dx;
        this.coordY += dy;
        System.out.println("L'hydravion navigue ou amerrit sur l'eau.");
    }

    @Override
    public void deplacerAir(double dx, double dy, double dz) {
        this.coordX += dx;
        this.coordY += dy;
        this.coordZ += dz;
        System.out.println("L'hydravion s'élève et vole dans les airs.");
    }
}