package sn.uasz.devoir.exo1;

public class Marchandise {
    // Attributs privés
    private int poids;
    private int volume;
    private Transport transport; // Association 0..1 vers Transport

    // Constructeur avec paramètres
    public Marchandise(int poids, int volume) {
        this.poids = poids;
        this.volume = volume;
        this.transport = null; // Pas de transport assigné par défaut
    }

    // Getters et Setters
    public double poids() { // Retourne double selon le diagramme UML
        return (double) this.poids;
    }

    public void setPoids(int poids) {
        this.poids = poids;
    }

    public double volume() { // Retourne double selon le diagramme UML
        return (double) this.volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public Transport getTransport() {
        return transport;
    }

    public void setTransport(Transport transport) {
        this.transport = transport;
    }

    // Méthode afficher
    public void afficher() {
        System.out.println("Marchandise [Poids: " + poids + " kg, Volume: " + volume + " m³]");
    }
}