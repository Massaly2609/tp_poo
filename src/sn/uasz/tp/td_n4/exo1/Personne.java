package sn.uasz.tp.td_n4.exo1;

import java.time.LocalDate;
import java.util.Date;

public class Personne {

    private String nom;
    private String prenom;
    private LocalDate date_naissance ;

    public Personne(String nom, String prenom, LocalDate date_naissance) {
        this.nom = nom;
        this.prenom = prenom;
        this.date_naissance = date_naissance;
    }

    // getter  et  setter
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }

    public String prenom(){
        return prenom;
    }

    public void setPrenom (String prenom){
        this.prenom = prenom;
    }

    public LocalDate getDate_naissance() {
        return date_naissance;
    }

    public void setDate_naissance (LocalDate date_naissance) {
        this.date_naissance = date_naissance;
    }

//    La methode afficher
    public void afficher(){
        System.out.println(this.nom + " " + this.prenom +" "+ this.date_naissance);
    }


}
