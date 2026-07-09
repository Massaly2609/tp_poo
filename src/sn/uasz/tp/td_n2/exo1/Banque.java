import sn.uasz.tp.td_n2.exo1.CompteBancaire;

void main(String[] args) {
    if(args.length < 3){
        System.out.println("Erreur: Le commande n'existe pas <numCompte> <titulairCompte> <credit>");
        return;
    }

//    Passer les arguments en ligne de commande
    String numCompte = args[0] ;
    String titulairCompte = args[1] ;
    double credit = Double.parseDouble(args[2]);

//    Instancier un compte bancsire
    CompteBancaire cbanque = new CompteBancaire(numCompte,titulairCompte,credit);

    System.out.println("Solde actuel :");
    System.out.println(cbanque.toString());
    System.out.println("======================================================");

//    Somme a debiter
    Scanner scanner = new Scanner(System.in);
    System.out.println ("Donner la somme a debiter ");
    double debit = scanner.nextDouble();

    cbanque.debit(debit);
    System.out.println("Solde restant :");
    System.out.println(cbanque.toString());
    System.out.println("======================================================");
}