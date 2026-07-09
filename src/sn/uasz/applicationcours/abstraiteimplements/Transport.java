package sn.uasz.applicationcours.abstraiteimplements;

import java.util.ArrayList;
import java.util.List;

public abstract class  Transport   {

     protected Marchandise m ;

    public Transport(Marchandise m) {
        this.m = m;
    }

    //    Methode abstraite
     public abstract  double prixU();
     public abstract  double prixE();


     public double tarif (){
         return prixE() * prixU();
     }

     @Override
    public String toString(){
         return  "Le poids :" + m.getPoids()
                 + " Le volume :" + m.getVolume()
                 + " Le prix Unitaire : " + prixU()
                 + " | Le prix Encombrement : " + prixE()
                 + " Le Tarif : " +  tarif() ;
     }

}
