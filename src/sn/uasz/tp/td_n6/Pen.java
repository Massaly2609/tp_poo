package sn.uasz.tp.td_n6;

public abstract class Pen {
    protected String couleur;
    protected String marque;
    protected Corps corps; // Composition forte (1)

    // 2. Constructeur avec paramètres
    public Pen(String couleur, String marque, double poidsCorps, double tailleCorps) {
        this.couleur = couleur;
        this.marque = marque;
        // La composition impose que le Pen crée son propre Corps
        this.corps = new Corps(poidsCorps, tailleCorps);
    }

    // 3. Getters et Setters
    public String getCouleur() { return couleur; }
    public void setCouleur(String couleur) { this.couleur = couleur; }

    public String getMarque() { return marque; }
    public void setMarque(String marque) { this.marque = marque; }

    public Corps getCorps() { return corps; }
    public void setCorps(Corps corps) { this.corps = corps; }

    // 4. Méthode afficher
    public void afficher() {
        System.out.print("Marque: " + marque + " | Couleur d'encre: " + couleur + " | ");
        corps.afficher();
    }
}