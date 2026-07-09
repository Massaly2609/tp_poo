package sn.uasz.tp.td_n3;

public class Man {
    public static void main(String[] args) {

         Patient p1 = new Patient("KA", 20,  Maladie.DIABETE);
         Patient p2 = new Patient("Sall", 30,  Maladie.ASTHME);
         Patient p3 = new Patient("Sarr", 70,  Maladie.DIABETE);

         Medecin m1 = new Medecin("Dr Fall", 35);
         Medecin m2 = new Medecin("Dr Diop", 12);


         p1.ajouterMedecin(m1);
         p1.ajouterMedecin(m2);
         p2.ajouterMedecin(m2);
         p3.ajouterMedecin(m2);

//         Ajouter un Patient dans la liste de Medcin
         m1.ajouterPatient(p1);
         m1.ajouterPatient(p2);
         m1.ajouterPatient(p3);

         p1.afficher();
         p2.afficher();
         p3.afficher();

         m1.listerPatients();

    }
}
