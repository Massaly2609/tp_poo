package sn.uasz.tp.td_n5.exercice2;

public class Hydroglisseur extends Vehicule implements Terrestre, Maritime {

    public Hydroglisseur(String marque, String couleur, double coordX, double coordY, double coordZ) {
        super(marque, couleur, coordX, coordY, coordZ);
    }

    @Override
    public void afficher() {
        System.out.println("[Hydroglisseur] Marque : " + marque + " | Couleur : " + couleur +
                " | Position : (" + coordX + ", " + coordY + ", " + coordZ + ")");
    }

    @Override
    public void deplacerMer(double dx, double dy) {
        super.coordX += dx;
        this.coordY += dy;
        System.out.println("L'hydroglisseur glisse sur l'eau.");
    }

    @Override
    public void deplacerTerre(double dx, double dy) {
        this.coordX += dx;
        this.coordY += dy;
        System.out.println("L'hydroglisseur se déplace sur terre.");
    }
}