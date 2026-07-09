import sn.uasz.tp.td_n5.exercice1.Cinema;
import sn.uasz.tp.td_n5.exercice1.Film;
import sn.uasz.tp.td_n5.exercice1.Projection;
import sn.uasz.tp.td_n5.exercice1.Salle;

void main() {

    Cinema cinema = new Cinema("Rio", "Boucotte","Ziguinchor");
//    On ajoute deux salles dans le cinema
    cinema.ajouterSall("Rio 001", 100);
    cinema.ajouterSall("Rio 002", 150);


//    Film
    Film film1 =  new Film("My Hero Academique", "2h50","Action");
    Film film2 =  new Film("Classroom of the Elite", "2h50","Action");

//
    Salle s1 = cinema.getSalles().get(0);
    Salle s2 = cinema.getSalles().get(1);

    s1.afficherSalle();
    Projection p1 = new Projection("2h:00", "20-09-2026", s1, film1);
    Projection p2 = new Projection("2h:00", "20-09-2026", s2, film2);

    cinema.AfficherCinema();
    p1.afficher();

}