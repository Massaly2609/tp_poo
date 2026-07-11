package sn.uasz.devoir.exo2;

public class Test {
    public static void main(String[] args) {
        System.out.println("=== DEVOIR POO - EXERCICE 2 ===");

        // 1. Instanciation d'un cinéma
        Cinema cinema = new Cinema("Rio", "Boucotte", "Ziguinchor");

        // 2. Ajout de salles via la méthode de composition du Cinéma
        cinema.ajouterSalle("RIO 01", 100);
        cinema.ajouterSalle("RIO 02", 150);

        // 3. Création de films
        Film film1 = new Film("Predator", "1h30", "Action");
        Film film2 = new Film("Inception", "2h28", "Sci-Fi");

        // Récupération des salles créées pour la planification
        Salle s1 = cinema.getSalles().get(0);
        Salle s2 = cinema.getSalles().get(1);

        // 4. Planification des Projections (Classes d'association)
        Projection proj1 = new Projection("15-07-2026", "18h00", s1, film1);
        Projection proj2 = new Projection("15-07-2026", "21h00", s2, film2);

        // 5. Affichage général pour vérification
        System.out.println("\n--- Informations du Complexe ---");
        cinema.afficher();

        System.out.println("\n--- Programme des Projections ---");
        proj1.afficher();
        proj2.afficher();
    }
}
