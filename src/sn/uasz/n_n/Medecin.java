package sn.uasz.n_n;

import java.util.ArrayList;

public class Medecin {

    private String nom;
    private int experience;
    private ArrayList<Patient> listPatient;

    public Medecin(String nom, int experience) {
        this.nom = nom;
        this.experience = experience;
        this.listPatient = new ArrayList<Patient>();
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }


    public void ajouterPatient(Patient p) {
        if (!listPatient.contains(p)) {
            listPatient.add(p);
            p.ajouterMedecin(this);
        }
    }

    public void listerPatients() {
        System.out.println("La liste des patients");
        for (Patient p : listPatient) {
            System.out.println("Nom :" + getNom() + " | Experience :" + getExperience());
        }
    }
}
