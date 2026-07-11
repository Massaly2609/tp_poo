package sn.uasz.tp.td_n6;

public class Bouchon {
    private String couleur;

    // 2. Constructeur avec paramètres
    public Bouchon(String couleur) {
        this.couleur = couleur;
    }

    // 3. Getters et Setters
    public String getCouleur() { return couleur; }
    public void setCouleur(String couleur) { this.couleur = couleur; }

    // 4. Méthode afficher
    public void afficher() {
        System.out.println("Bouchon [Couleur: " + couleur + "]");
    }
}
