package sn.uasz.devoir.exo1;

public abstract class Transport {
    // Association 1 vers Marchandise (obligatoire)
    protected Marchandise marchandise;

    // Constructeur avec paramètres
    public Transport(Marchandise marchandise) {
        this.marchandise = marchandise;
        // On établit la relation bidirectionnelle
        if (marchandise != null) {
            marchandise.setTransport(this);
        }
    }

    // Getter et Setter
    public Marchandise getMarchandise() {
        return marchandise;
    }

    public void setMarchandise(Marchandise marchandise) {
        this.marchandise = marchandise;
    }

    // Formule commune : Tarif = Prix Unitaire * Encombrement
    public double tarif() {
        return this.prixUnitaire() * this.encombrement();
    }

    // Méthodes abstraites redéfinies par les sous-classes
    public abstract double prixUnitaire();
    public abstract double encombrement();

    // Méthode afficher
    public void afficher() {
        System.out.println("Transport - Tarif Global: " + this.tarif() + " FCFA");
    }
}