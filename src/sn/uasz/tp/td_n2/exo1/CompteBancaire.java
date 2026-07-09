package sn.uasz.tp.td_n2.exo1;

public class CompteBancaire {


    private String numCompte ;
    private String titulaireCompte ;
    private double credit ;

    public CompteBancaire(String numCompte, String titulaireCompte, double credit) {
        this.numCompte = numCompte;
        this.titulaireCompte = titulaireCompte;
        this.credit = credit;
    }

    public String getNumCompte() {
        return numCompte;
    }

    public void setNumCompte(String numCompte) {
        this.numCompte = numCompte;
    }

    public String getTitulaireCompte() {
        return titulaireCompte;
    }

    public void setTitulaireCompte(String titulaireCompte) {
        this.titulaireCompte = titulaireCompte;
    }

    public double getCredit() {
        return credit;
    }

    public void setCredit(double credit) {
        this.credit = credit;
    }

//    Methode pour debiter
    public  void debit(double debit){
        if(debit > 0 && debit >= this.credit){
            this.credit -= debit ;
        }else {
            System.out.print("Solde insuffisant impossible de debiter");
        }
    }

    @Override
    public String toString(){
        return "Numero de compte " + this.numCompte + " Proprietaire " + this.titulaireCompte +
                " Solde " + this.credit;
    }
}
