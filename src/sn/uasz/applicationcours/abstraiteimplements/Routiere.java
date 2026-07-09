package sn.uasz.applicationcours.abstraiteimplements;

public class Routiere extends Transport{
    public Routiere(Marchandise m) {
        super(m);
    }

    public double prixE(){
        return 0.5 * super.m.getVolume();
    }

    public double prixU(){
        return 750 ;
    }

    @Override
    public  String toString() {
        return super.toString();
    }
}
