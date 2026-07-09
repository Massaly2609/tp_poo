package sn.uasz.tp.td_n5.exercice1;

import java.util.ArrayList;

public class Cinema {
    private String nom ;
    private String adresse ;
    private String ville ;
    private ArrayList<Salle> salles ;

    public Cinema(String nom, String adresse, String ville ) {
        this.nom = nom  ;
        this.adresse = adresse ;
        this.ville = ville ;
        this.salles = new ArrayList<>() ;
    }

//    Getter et Setter
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public String getAdresse() {
        return adresse;
    }
    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public ArrayList<Salle> getSalles() {
        return salles;
    }

    public void setSalles(ArrayList<Salle> salles) {
        this.salles = salles;
    }

    // Ajouter une salle dans le cinema
    public void ajouterSall(String code, int capacite){
        Salle s = new Salle(code, capacite, this);
        salles.add(s);
    }

    // Methode Afficher
    public void AfficherCinema() {
        System.out.println("Cinema " + this.nom + " " + this.adresse);

        System.out.println("=========================================================");
        System.out.println("== =============== Listes des Salles =====================");
        System.out.println("=========================================================");

        for (Salle s : salles){
            System.out.println(s.toString());
        }
    }



}
