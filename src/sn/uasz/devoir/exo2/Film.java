package sn.uasz.devoir.exo2;


import java.util.ArrayList;

public class Film {
    private String titre;
    private String duree;
    private String genre;
    private ArrayList<Projection> projections; // Liste des projections de ce film[cite: 6]

    // 2. Constructeur avec paramètres
    public Film(String titre, String duree, String genre) {
        this.titre = titre;
        this.duree = duree;
        this.genre = genre;
        this.projections = new ArrayList<>();
    }

    // 3. Getters et Setters
    public String getTitre() { return titre; }
    public void setTitre(String titre) { this.titre = titre; }

    public String getDuree() { return duree; }
    public void setDuree(String duree) { this.duree = duree; }

    public String getGenre() { return genre; }
    public void setGenre(String genre) { this.genre = genre; }

    public ArrayList<Projection> getProjections() { return projections; }
    public void setProjections(ArrayList<Projection> projections) { this.projections = projections; }

    public void ajouterProjection(Projection p) {
        this.projections.add(p);
    }

    // 4. Méthode afficher
    public void afficher() {
        System.out.println("Film : " + titre + " [" + genre + " - " + duree + "]");
    }
}
