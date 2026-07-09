package sn.uasz.tp.td_n4.exo2;

import java.time.LocalDate;

public class Peripherique extends Produit_Informatique{
    protected String type;
    protected String resolution;
    protected double vitesse;

    public Peripherique(int ref, String marque, LocalDate date_fabrication,double prix, String type, String resolution, double vitesse) {
        super(ref, marque, date_fabrication, prix);
        this.type = type;
        this.resolution = resolution;
        this.vitesse = vitesse;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Type: " + type +
                ", Résolution: " + resolution +
                ", Vitesse: " + vitesse ;
    }


}
