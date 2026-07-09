import sn.uasz.poo.exo1.Chef;
import sn.uasz.poo.exo1.Directeur;
import sn.uasz.poo.exo1.Employe;
import sn.uasz.poo.exo1.Personne;

void main() {
//    Creer un tableau de huit personne

    Personne[] p = new Personne[8];

//    5 emplyés dans personne

    p[0] = new Employe("Massaly", "Moussa", LocalDate.of(2002, 01, 26), 150000);
    p[1] = new Employe("Massaly", "Moussa", LocalDate.of(2015, 02, 12), 2000000);
    p[2] = new Employe("Massaly", "Moussa", LocalDate.of(2011, 01, 12), 250000);
    p[3] = new Employe("Massaly", "Moussa", LocalDate.of(2003, 12, 12), 120000);
    p[4] = new Employe("Massaly", "Moussa", LocalDate.of(2010, 05, 12), 100000);

//    2 chefs dans personne

    p[5] = new Chef("Ka", "Coura", LocalDate.of(2000, 02, 12), 250000, "Chef de departemet");
    p[6] = new Chef("Sarr", "Awa", LocalDate.of(2012, 01, 12), 350000, "Directrice RTS");

    p[7] = new Directeur("Ndiaye", "Pape", LocalDate.of(1990, 11, 25), 12000, "ELeveur", "Mbour-peche");

//    Afficher l'ensemble des elements du tableau a l'aide d'une boucle for
    for (Personne p1 : p) {
        p1.afficher();
    }

}