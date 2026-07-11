package sn.uasz.devoir.exo1;

public class Routier extends Transport {

    public Routier(Marchandise marchandise) {
        super(marchandise);
    }

    @Override
    public double prixUnitaire() {
        return 2.0; // Tarif 2 fois supérieur à l'encombrement
    }

    @Override
    public double encombrement() {
        return this.marchandise.volume(); // Encombrement = volume
    }

    @Override
    public void afficher() {
        System.out.print("[Mode: Routier] ");
        super.afficher();
    }
}