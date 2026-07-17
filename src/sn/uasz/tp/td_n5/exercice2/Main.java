package sn.uasz.tp.td_n5.exercice2;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- Début du test des Véhicules --- \n");

        // 1. Création d'un Hydroglisseur positionné en (10.0, 5.0, 0.0)
        Hydroglisseur monHydro = new Hydroglisseur("Yamaha", "Rouge", 10.0, 5.0, 0.0);
        monHydro.afficher();

        // Mouvements de l'hydroglisseur
        monHydro.deplacerTerre(5.5, 2.0);
        monHydro.deplacerMer(10.0, -3.0);
        monHydro.afficher(); // Vérification de la nouvelle position

        System.out.println("\n-----------------------------------\n");

        // 2. Création d'un Hydravion positionné en (0.0, 0.0, 0.0)
        Hydravion monHydravion = new Hydravion("Canadair", "Jaune", 0.0, 0.0, 0.0);
        monHydravion.afficher();

        // Mouvements de l'hydravion
        monHydravion.deplacerAir(50.0, 120.0, 350.0); // Il s'envole en altitude (Z)
        monHydravion.deplacerMer(20.0, 10.0);         // Il revient sur l'eau
        monHydravion.afficher();
    }
}