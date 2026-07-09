package sn.uasz.tp.td_n4.exo1;

import java.time.LocalDate;

public class Employe extends Personne {

    private int salaire ;

    public Employe(String nom, String prenom, LocalDate date_naissance, int salaire) {
        super(nom, prenom, date_naissance);
        this.salaire = salaire;
    }

    public int getSalaire() {
        return salaire;
    }
    public void setSalaire(int salaire) {
        this.salaire = salaire;
    }

    //    redefinition de la methode afficher()
    @Override
    public void afficher(){
        super.afficher();
        System.out.println("Salaire : " + this.salaire);

    }

}
