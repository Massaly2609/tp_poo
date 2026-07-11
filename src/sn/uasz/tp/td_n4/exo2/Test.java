import sn.uasz.tp.td_n4.exo2.Imprimante;
import sn.uasz.tp.td_n4.exo2.Ordinateur;
import sn.uasz.tp.td_n4.exo2.Produit_Informatique;
import sn.uasz.tp.td_n4.exo2.Scanner_Informatique;

void main() {

    Produit_Informatique p1 = new Ordinateur(1, "Dell-7890", LocalDate.of(2022, 3, 11), 12500.50,
            "Intel Dual Core", "8 Go", "512 Go", "Windows");

    Produit_Informatique p2 = new Imprimante(2, "HP-LaserJet", LocalDate.of(2024, 5, 20), 35000.00,
            "Laser", "1200 dpi", 20, "15 ppm");

    Produit_Informatique p3 = new Scanner_Informatique(3, "Canon-Scan", LocalDate.of(2025, 1, 30), 15000.00,
            "À plat", "600 dpi", 10.0, "PDF");


    //     Affichage d'un seul coup
    //    System.out.println(p1);
    //    System.out.println(p2);
    //    System.out.println(p3);


    // Affichage par cible attribut
    System.out.println("Ordinateur: " + p1.getMarque());
    System.out.println("Imprimante: " + p2.getMarque());
    System.out.println("Scanner: " + p3.getMarque());

}


