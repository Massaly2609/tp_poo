package sn.uasz.tp.td_n5.exercice1;

import java.util.ArrayList;

public class Film {

    private String titre ;
    private String duree ;
    private String genre ;
    private ArrayList<Projection> projections ;

    public Film (String titre, String duree, String genre) {
        this.titre = titre ;
        this.duree = duree ;
        this.genre = genre ;
        this.projections = new ArrayList<Projection>() ;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getDuree() {
        return duree;
    }

    public void setDuree(String duree) {
        this.duree = duree;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public ArrayList<Projection> getProjections() {
        return projections;
    }

    public void setProjections(ArrayList<Projection> projections) {
        this.projections = projections;
    }

//    Afficher les info du film
    public void afficher(){
        System.out.println("Titre : "+titre);
        System.out.println("Duree : "+duree);
        System.out.println("Genre : "+genre);
    }

//    Ajouter une projection de film
    public void ajouterProjection (Projection p){
        this.projections.add(p);
    }

 @Override
    public String toString() {
        return titre + " : " + duree + " : " + genre;
 }
}
