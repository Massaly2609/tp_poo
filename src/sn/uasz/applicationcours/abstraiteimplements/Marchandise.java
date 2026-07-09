package sn.uasz.applicationcours.abstraiteimplements;

public class Marchandise {

    private double poids ;
    private double volume ;


    public Marchandise (double poids, double volme) {
        this.poids  = poids ;
        this.volume = volume ;
    }

    // Getter et setter


    public double getPoids() {
        return poids;
    }

    public void setPoids(double poids) {
        this.poids = poids;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }


}
