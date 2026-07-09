package sn.uasz.tp.td_n4.exo1;

import java.time.LocalDate;

public class Chef extends Employe{

    private String service ;

    public Chef(String nom, String prenom, LocalDate date_naissance, int salaire, String service) {
        super(nom, prenom, date_naissance, salaire);
        this.service = service;
    }


    // getter et setter
    public String getService(){
        return service;
    }

    public void setService(String service){
        this.service = service;
    }

//    redefinition de la methode afficher
    @Override
    public void afficher(){
        super.afficher();
        System.out.println("Chef : " + this.service);
    }
}
