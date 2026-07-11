package sn.uasz.devoir.exo2;


import java.util.ArrayList;

public class Salle {
    private String code;
    private int capacite;
    private Cinema cinema; // Relation inverse vers le Cinéma parent (Multiplicité 1)
    private ArrayList<Projection> projections; // Liste des projections dans cette salle

    // 2. Constructeur avec paramètres
    public Salle(String code, int capacite, Cinema cinema) {
        this.code = code;
        this.capacite = capacite;
        this.cinema = cinema;
        this.projections = new ArrayList<>();
    }

    // 3. Getters et Setters
    public String getCode() { return code; }
    public void setCode(String code) { this.code = code; }

    public int getCapacite() { return capacite; }
    public void setCapacite(int capacite) { this.capacite = capacite; }

    public Cinema getCinema() { return cinema; }
    public void setCinema(Cinema cinema) { this.cinema = cinema; }

    public ArrayList<Projection> getProjections() { return projections; }
    public void setProjections(ArrayList<Projection> projections) { this.projections = projections; }

    public void ajouterProjection(Projection p) {
        this.projections.add(p);
    }

    // 4. Méthode afficher
    public void afficher() {
        System.out.println("  -> Salle Code : " + code + " (Capacité : " + capacite + " places)");
    }
}