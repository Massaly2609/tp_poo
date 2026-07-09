package sn.uasz.poo.exo1;

import java.time.LocalDate;
import java.util.Date;

public class Directeur extends Chef {

    private String societe ;

    public Directeur(String nom, String prenom, LocalDate date_naissance, int salaire, String service, String societe) {
        super(nom, prenom, date_naissance, salaire, service);
        this.societe = societe;
    }

//    getter et setter
    public String getSociete() {
        return societe;
    }
    public void setSociete(String societe) {
        this.societe = societe;
    }

//    Redifinition de la methode afficher
    @Override
    public void afficher(){
        super.afficher();
        System.out.println("Societe : " + this.societe);
    }
}
