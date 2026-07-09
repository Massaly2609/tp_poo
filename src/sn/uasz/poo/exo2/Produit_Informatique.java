package sn.uasz.poo.exo2;

import java.time.LocalDate;

public class Produit_Informatique {

    private int ref ;
    private String marque;
    private LocalDate date_fabrication;
    private Double prix;

    public Produit_Informatique(int ref, String marque, LocalDate date_fabrication, Double prix){
        this.ref = ref;
        this.marque = marque;
        this.date_fabrication = date_fabrication;
        this.prix = prix;
    }

    public int getRef() {
        return ref;
    }

    public void setRef(int ref) {
        this.ref = ref;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public LocalDate getDate_fabrication() {
        return date_fabrication;
    }

    public void setDate_fabrication(LocalDate date_fabrication) {
        this.date_fabrication = date_fabrication;
    }

    public Double getPrix() {
        return prix;
    }

    public void setPrix(Double prix) {
        this.prix = prix;
    }

    @Override
    public String toString() {
        return "Réf: " + ref + ", Marque: " + marque +
                ", Date fabrication: " + date_fabrication +
                ", Prix: " + prix;
    }

}
