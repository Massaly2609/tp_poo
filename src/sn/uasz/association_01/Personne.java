package sn.uasz.association_01;

public class Personne {
    private String nom;
    private String prenom;
    private Compte compte;


    public Personne(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public Compte getCompte() {
        return compte;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setCompte(Compte compte) {
        this.compte = compte;
    }

    public void afficherPersonne() {
        System.out.println("Personne : " + this.nom + " " + this.prenom);

        if (this.compte != null) {
            System.out.println("Compte : " + this.compte);
        } else {
            System.out.println("Compte : Compte est vide ");
        }
    }

    @Override
    public String toString() {
        return "Personne{" + "nom='" + nom + '\'' + ", prenom='" + prenom + '\'' + ", compte=" + compte + '}';
    }
}
