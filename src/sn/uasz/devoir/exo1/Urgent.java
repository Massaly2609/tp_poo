package sn.uasz.devoir.exo1;

public class Urgent extends Aerien {

    public Urgent(Marchandise marchandise) {
        super(marchandise);
    }

    @Override
    public double prixUnitaire() {
        return super.prixUnitaire() * 2.0; // Deux fois plus cher que l'aérien normal
    }

    @Override
    public void afficher() {
        System.out.print("[🚨 Mode: Urgent] ");
        System.out.println("Tarif Urgent Global: " + this.tarif() + " FCFA");
    }
}