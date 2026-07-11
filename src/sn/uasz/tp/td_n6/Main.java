package sn.uasz.tp.td_n6;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Gestion des Stylos et Feutres (M1 Informatique) ===");
        System.out.println("======================================================");

        // 1. Création et manipulation d'un Stylo
        // Paramètres : couleur, marque, poids du corps, taille du corps
        Stylo monStylo = new Stylo("Bleu", "Bic", 5.2, 14.5);
        System.out.println("\n--- Affichage du Stylo ---");
        monStylo.afficher();

        // Modifying attributes via setters
        monStylo.setCouleur("Noir");
        System.out.println("-> Après modification de la couleur :");
        monStylo.afficher();


        // 2. Création et manipulation d'un Feutre
        Feutre monFeutre = new Feutre("Vert", "Stabilo", 8.0, 12.0);
        System.out.println("\n--- Affichage du Feutre (Sans Bouchon) ---");
        monFeutre.afficher();

        // 3. Ajout d'un bouchon au Feutre (Agrégation)
        Bouchon unBouchon = new Bouchon("Vert");
        monFeutre.setBouchon(unBouchon);

        System.out.println("\n--- Affichage du Feutre (Avec Bouchon ajouté) ---");
        monFeutre.afficher();
    }
}