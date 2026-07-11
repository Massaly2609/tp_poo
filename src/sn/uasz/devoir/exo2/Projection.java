package sn.uasz.devoir.exo2;


public class Projection {
    private String jour;
    private String heure; // Représente le champ 'heure : Time' du diagramme
    private Salle salle;  // Lien vers la Salle associée
    private Film film;    // Lien vers le Film associé

    // 2. Constructeur avec paramètres
    public Projection(String jour, String heure, Salle salle, Film film) {
        this.jour = jour;
        this.heure = heure;
        this.salle = salle;
        this.film = film;

        // Liaison automatique pour maintenir la cohérence bidirectionnelle
        if (salle != null) salle.ajouterProjection(this);
        if (film != null) film.ajouterProjection(this);
    }

    // 3. Getters et Setters
    public String getJour() { return jour; }
    public void setJour(String jour) { this.jour = jour; }

    public String getHeure() { return heure; }
    public void setHeure(String heure) { this.heure = heure; }

    public Salle getSalle() { return salle; }
    public void setSalle(Salle salle) { this.salle = salle; }

    public Film getFilm() { return film; }
    public void setFilm(Film film) { this.film = film; }

    // 4. Méthode afficher
    public void afficher() {
        System.out.println("Projection le " + jour + " à " + heure
                + " | Salle : " + salle.getCode()
                + " | Film : " + film.getTitre());
    }
}