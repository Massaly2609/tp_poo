package sn.uasz.poo.exo2;

import java.time.LocalDate;

public class Imprimante extends Peripherique {
    private String vitesse_impression;

    public Imprimante(int ref, String marque, LocalDate date_fabrication, double prix,
                      String type, String resolution, double vitesse, String vitesse_impression) {

        super(ref, marque, date_fabrication, prix, type, resolution, vitesse);
        this.vitesse_impression = vitesse_impression;
    }

    public String getVitesse_impression() {
        return vitesse_impression;
    }

    public void setVitesse_impression(String vitesse_impression) {
        this.vitesse_impression = vitesse_impression;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Vitesse impression: " + vitesse_impression ;
    }

}
