package sn.uasz.poo.exo2;

import java.time.LocalDate;

public class Ordinateur extends Produit_Informatique{

    private String processeur;
    private String tailleRam ;
    private String tailleDisque;
    private String systeme_exploitation;

    public Ordinateur(int ref, String marque, LocalDate date_fabrication, Double prix, String processeur, String tailleRam,
                      String tailleDisque, String systeme_exploitation) {

        super(ref, marque, date_fabrication, prix);
        this.processeur = processeur;
        this.tailleRam = tailleRam;
        this.tailleDisque = tailleDisque;
        this.systeme_exploitation = systeme_exploitation;
    }

    public String getProcesseur() {
        return processeur;
    }

    public void setProcesseur(String processeur) {
        this.processeur = processeur;
    }

    public String getTailleRam() {
        return tailleRam;
    }

    public void setTailleRam(String tailleRam) {
        this.tailleRam = tailleRam;
    }

    public String getTailleDisque() {
        return tailleDisque;
    }

    public void setTailleDisque(String tailleDisque) {
        this.tailleDisque = tailleDisque;
    }

    public String getSysteme_exploitation() {
        return systeme_exploitation;
    }

    public void setSysteme_exploitation(String systeme_exploitation) {
        this.systeme_exploitation = systeme_exploitation;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Processeur: " + processeur +
                ", RAM: " + tailleRam +
                ", Disque: " + tailleDisque +
                ", OS: " + systeme_exploitation;
    }

}
