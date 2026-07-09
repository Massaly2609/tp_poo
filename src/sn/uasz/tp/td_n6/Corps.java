package sn.uasz.tp.td_n6;

public class Corps {

    protected double poids ;
    protected double taille ;

    public Corps (double poids, double taille ){
        this.poids  = poids ;
        this.taille = taille ;
    }

    public  double getPoids (){
        return  poids ;
    }

    public void setPoids (double poids ){
        this.poids = poids ;
    }

    public double getTaille() {
        return taille;
    }

    public void setTaille(double taille) {
        this.taille = taille;
    }



//    Affichage d'un corps dee de Bic (pen)
    public void afficher(){
        System.out.println("Corps : poids :"   + poids + " et taille :"  + taille);
    }
}
