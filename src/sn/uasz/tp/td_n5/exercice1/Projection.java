package sn.uasz.tp.td_n5.exercice1;


public class Projection {

    private String jour  ;
    private String heure ;
    private Salle salles;
    private Film films;

    public Projection(String heure, String jour, Salle salles, Film films) {
        this.heure  = heure;
        this.jour = jour ;
        this.salles = salles;
        this.films  = films;
    }

    public String getJour() {
        return jour;
    }

    public void setJour(String jour) {
        this.jour = jour;
    }

    public String getHeure() {
        return heure;
    }

    public void setHeure(String heure) {
        this.heure = heure;
    }

    public Salle getSalles() {
        return salles;
    }

    public void setSalles(Salle salles) {
        this.salles = salles;
    }

    public Film getFilms() {
        return films;
    }

    public void setFilms(Film films) {
        this.films = films;
    }

//    Afficher
    public void afficher(){
        System.out.println("Projection : " +heure+ "  " + jour + " Salle: " +salles + " Film : " +films);
     }

}
