package sn.uasz.poo.exo2;

import java.time.LocalDate;

public class Pc_Portable extends Ordinateur{

    private String type_ecran;
    private int taille_ecran;

    public Pc_Portable(int ref, String marque, LocalDate date_fabrication, Double prix, String processeur,
                       String tailleRam, String tailleDisque, String systeme_exploitation,
                       String type, int taille) {

        super(ref, marque, date_fabrication, prix, processeur, tailleRam,
                tailleDisque, systeme_exploitation);
        this.type_ecran = type;
        this.taille_ecran = taille;
    }

    public String getType_ecran() {
        return type_ecran;
    }

    public void setType_ecran(String type_ecran) {
        this.type_ecran = type_ecran;
    }

    public int getTaille_ecran() {
        return taille_ecran;
    }

    public void setTaille_ecran(int taille_ecran) {
        this.taille_ecran = taille_ecran;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Type écran: " + type_ecran +
                ", Taille écran: " + taille_ecran + " pouces";
    }

}
