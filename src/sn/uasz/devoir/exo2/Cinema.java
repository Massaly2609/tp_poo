package sn.uasz.devoir.exo2;

import java.util.ArrayList;

public class Cinema {
    private String nom;
    private String adresse;
    private String ville;
    private ArrayList<Salle> salles; // Composition 1..* -> Liste de salles

    // 2. Constructeur avec paramètres
    public Cinema(String nom, String adresse, String ville) {
        this.nom = nom;
        this.adresse = adresse;
        this.ville = ville;
        this.salles = new ArrayList<>(); // Initialisation de la composition
    }

    // 3. Getters et Setters
    public String getNom() { return nom; }
    public void setNom(String nom) { this.nom = nom; }

    public String getAdresse() { return adresse; }
    public void setAdresse(String adresse) { this.adresse = adresse; }

    public String getVille() { return ville; }
    public void setVille(String ville) { this.ville = ville; }

    public ArrayList<Salle> getSalles() { return salles; }
    public void setSalles(ArrayList<Salle> salles) { this.salles = salles; }

    // Méthode spécifique à la Composition : la Salle est créée à l'intérieur
    public void ajouterSalle(String code, int capacite) {
        Salle s = new Salle(code, capacite, this); // 'this' lie la salle à ce cinéma
        this.salles.add(s);
    }

    // 4. Méthode afficher
    public void afficher() {
        System.out.println("Cinéma : " + nom + " | Adresse : " + adresse + " (" + ville + ")");
        System.out.println("--- Liste des Salles ---");
        for (Salle s : salles) {
            s.afficher(); // Délégation de l'affichage à chaque salle
        }
    }
}