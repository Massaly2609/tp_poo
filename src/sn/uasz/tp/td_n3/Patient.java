package sn.uasz.tp.td_n3;

import java.util.ArrayList;

public class Patient {

    private String nom;
    private int age  ;
    private Maladie maladie;

    private ArrayList<Medecin>  medecins;

    public Patient(String nom, int age, Maladie maladie) {
        this.nom = nom;
        this.age = age;
        this.maladie = maladie;
        this.medecins = new ArrayList<Medecin>();
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Maladie getMaladie() {
        return maladie;
    }

    public void setMaladie(Maladie maladie) {
        this.maladie = maladie;
    }

    public void ajouterMedecin(Medecin m) {
        if(!medecins.contains(m)) {
            medecins.add(m);
            m.ajouterPatient(this);
        }
    }

    public void afficher(){
        System.out.println("=================================== Debut =========================================");
        System.out.println("Patient : " + nom + "  " + age + "  " + maladie);
        System.out.println("Liste des Medecins dans Patient :");

//        Lister tous les Medcins dans la lite des Patients
        for (Medecin m : medecins) {
            System.out.println( m.getNom() + " " + m.getExperience());
        }

        System.out.println("================================== Fin Liste ==========================================");
    }


    @Override
    public String toString() {
        return "Patient [ " +
                "nom ='" + nom + '\'' +
                ", age =" + age +
                ", maladie =" + maladie +
                ']';
    }
}
