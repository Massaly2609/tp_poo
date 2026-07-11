package sn.uasz.tp.td_n6;

public class Feutre extends Pen {
    private Bouchon bouchon; // Agrégation 0..1[cite: 7]

    // 2. Constructeur avec paramètres (sans bouchon initialement)
    public Feutre(String couleur, String marque, double poidsCorps, double tailleCorps) {
        super(couleur, marque, poidsCorps, tailleCorps);
        this.bouchon = null; // Par défaut, pas de bouchon mis[cite: 7]
    }

    // 3. Getters et Setters pour l'agrégation
    public Bouchon getBouchon() { return bouchon; }
    public void setBouchon(Bouchon bouchon) { this.bouchon = bouchon; }

    // 4. Méthode afficher
    @Override
    public void afficher() {
        System.out.print("[Feutre] ");
        super.afficher();
        if (bouchon != null) {
            System.out.print("        └── ");
            bouchon.afficher();
        } else {
            System.out.println("        └── Aucun bouchon mis.");
        }
    }
}