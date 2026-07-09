package sn.uasz.applicationcours.abstraiteimplements;

public class Urgent extends Aerien{
    public Urgent(Marchandise m) {
        super(m);
    }

    public double prixU(){
        return 2 * super.prixU();
    }


    @Override
    public  String toString() {
        return super.toString();
    }
}
