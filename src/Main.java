import sn.uasz.association_01.Compte;
import sn.uasz.association_01.Personne;

void main() {

    Personne p1 = new Personne("Medoune", "Massaly");
    Personne p2 = new Personne("Khadija", "Ndiaye");

    System.out.println("==========================================================================");

    p1.afficherPersonne();
//    p2.afficherPersonne();

    Compte c1 = new Compte(221, p1);
    Compte c2 = new Compte(221, p2);

    System.out.println("***********************************************************");

    c1.afficherCompte();
//    c2.afficherCompte();


    p1.afficherPersonne();
//    p2.afficherPersonne();


}
