package sn.uasz.tp.td_n6;

public class Corps {
    private double poids;
    private double taille;

    // 2. Constructeur avec paramètres
    public Corps(double poids, double taille) {
        this.poids = poids;
        this.taille = taille;
    }

    // 3. Getters et Setters
    public double getPoids() { return poids; }
    public void setPoids(double poids) { this.poids = poids; }

    public double getTaille() { return taille; }
    public void setTaille(double taille) { this.taille = taille; }

    // 4. Méthode afficher
    public void afficher() {
        System.out.println("Corps [Poids: " + poids + "g, Taille: " + taille + "cm]");
    }
}
