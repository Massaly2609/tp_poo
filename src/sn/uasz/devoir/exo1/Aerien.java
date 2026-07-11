package sn.uasz.devoir.exo1;

public class Aerien extends Transport {

    public Aerien(Marchandise marchandise) {
        super(marchandise);
    }

    @Override
    public double prixUnitaire() {
        return 10.0; // Tarif 10 fois supérieur à l'encombrement
    }

    @Override
    public double encombrement() {
        return this.marchandise.poids(); // Encombrement = poids
    }

    @Override
    public void afficher() {
        System.out.print("[Mode: Aérien] ");
        super.afficher();
    }
}