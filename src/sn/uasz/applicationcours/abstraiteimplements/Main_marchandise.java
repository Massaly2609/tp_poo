import sn.uasz.applicationcours.abstraiteimplements.*;

void main() {

    Marchandise m = new Marchandise(100.00, 70.0);
    Transport[] t = new Transport[3];

    t[0] = new Aerien(m);
    t[1] = new Urgent(m);
    t[2] = new Routiere(m);

    for (Transport ts: t){
        System.out.println(ts.tarif());
    }

//    System.out.println(t[0]);
//    System.out.println(t[1]);
//    System.out.println(t[2]);






}