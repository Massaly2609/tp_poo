package sn.uasz.association_01;

public class Compte {
    private int numero;
    private double solde;
    private Personne personne ;

    public Compte(int numero, Personne personne) {
        this.numero = numero;
        this.solde = 0;
        this.personne = personne;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public Personne getPersonne() {
        return personne;
    }

    public void setPersonne(Personne personne) {
        this.personne = personne;
    }

    public void afficherCompte() {
        System.out.println("Compte: " + this.numero + " Solde: " + this.solde);

    }

    @Override
    public String toString() {
        return "Compte{" +
                "numero=" + numero +
                ", solde=" + solde +
                ", personne=" + personne +
                '}';
    }
}
