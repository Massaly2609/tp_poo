package sn.uasz.applicationcours.abstraiteimplements;

public class Aerien extends Transport{

    public Aerien(Marchandise m) {
        super(m);
    }

    //    Methode abstraite dans la classe abstraite Transport à implementer
    public double prixU() {
        return 1000;
    }

    public double prixE() {
        return super.m.getPoids() * 0.5;
    }

    @Override
    public  String toString() {
        return super.toString();
    }
}
