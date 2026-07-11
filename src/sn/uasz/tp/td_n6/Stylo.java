package sn.uasz.tp.td_n6;

public class Stylo extends Pen {

    // 2. Constructeur avec paramètres
    public Stylo(String couleur, String marque, double poidsCorps, double tailleCorps) {
        super(couleur, marque, poidsCorps, tailleCorps);
    }

    // 4. Méthode afficher
    @Override
    public void afficher() {
        System.out.print("[Stylo] ");
        super.afficher();
    }
}