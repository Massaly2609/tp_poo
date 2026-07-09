package sn.uasz.tp.td_n4.exo2;

import java.time.LocalDate;

public class Pc_Bureau extends Ordinateur{

    private String carte_graphe;

    public Pc_Bureau(int ref, String marque, LocalDate date_fabrication, Double prix,
                     String processeur, String tailleRam, String tailleDisque, String systeme_exploitation, String carte_graphe) {

        super(ref, marque, date_fabrication, prix, processeur, tailleRam, tailleDisque,
                systeme_exploitation);

        this.carte_graphe = carte_graphe;
    }

    public String getCarte_graphe() {
        return carte_graphe;
    }

    public void setCarte_graphe(String carte_graphe) {
        this.carte_graphe = carte_graphe;
    }


    @Override
    public String toString() {
        return super.toString() +
                ", Carte graphique: " + carte_graphe;
    }

}
