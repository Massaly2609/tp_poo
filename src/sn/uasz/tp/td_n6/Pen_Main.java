import sn.uasz.tp.td_n6.*;

void main() {

    Stylo s1 = new Stylo("Rouge", "Bic", 0.5, 12.2);
    Corps cop = s1.getCorps();

    Bouchon bouchon = new Bouchon("Blanc");
    Feutre  f1 = new Feutre("Bleu", "Schneider", 0.3, 1, bouchon);

    cop.afficher();
    s1.afficher();
    f1.afficher();
}