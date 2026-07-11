package sn.uasz.devoir.exo1;

public class Test {
    public static void main(String[] args) {
        System.out.println("=== DEVOIR POO - EXERCICE 1 ===");

        // 1. Création d'une marchandise (Poids: 50kg, Volume: 30m³)
        Marchandise cargaison = new Marchandise(50, 30);
        cargaison.afficher();

        System.out.println("\n--- Simulation des Tarifs de Transport ---");

        // 2. Test du transport Routier
        Transport transportRoutier = new Routier(cargaison);
        transportRoutier.afficher(); // Doit afficher : 2 * 30 (volume) = 60

        // 3. Test du transport Aérien standard
        Transport transportAerien = new Aerien(cargaison);
        transportAerien.afficher(); // Doit afficher : 10 * 50 (poids) = 500

        // 4. Test du transport Aérien Urgent
        Transport transportUrgent = new Urgent(cargaison);
        transportUrgent.afficher(); // Doit afficher : 20 * 50 (poids) = 1000
    }
}