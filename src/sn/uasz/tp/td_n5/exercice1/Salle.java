package sn.uasz.tp.td_n5.exercice1;

import java.util.ArrayList;

public class Salle {

    private String code ;
    private int capacite ;
    private Cinema cinema ;
    private ArrayList<Projection> projections ;

    public Salle(String code, int capacite, Cinema cinema) {
        this.code = code;
        this.capacite = capacite;
        this.cinema = cinema;
        this.projections = new ArrayList<Projection>();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getCapacite() {
        return capacite;
    }

    public void setCapacite(int capacite) {
        this.capacite = capacite;
    }

    public Cinema getCinema() {
        return cinema;
    }

    public void setCinema(Cinema cinema) {
        this.cinema = cinema;
    }

    public ArrayList<Projection> getProjections() {
        return projections;
    }

    public void setProjections(ArrayList<Projection> projections) {
        this.projections = projections;
    }

//    Afficher les details
    public  void afficherSalle(){
        System.out.println("Salle : " + this.getCode() + " - " + this.capacite);
    }

//    Ajouter une projestion dans salle
    public void ajouterProjetion (Projection p){
        this.projections.add(p);
    }

    @Override
    public String toString() {
        return code + " " + capacite ;
    }

}
