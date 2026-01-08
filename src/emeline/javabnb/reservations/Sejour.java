package emeline.javabnb.reservations;

import emeline.javabnb.logements.Logement;

import java.util.Date;

public class Sejour {
    private Date dateArrivee;
    private int nbNuits;
    private Logement logement;
    private int nbVoyageurs;
    private int tarifSejour;

    public Sejour(Date paramDateArrivee, int paramNbNuits, Logement paramLogement, int paramNbVoyageurs) {
        dateArrivee = paramDateArrivee;
        nbNuits = paramNbNuits;
        logement = paramLogement;
        nbVoyageurs = paramNbVoyageurs;
        tarifSejour = calculerPrixSejour();
    }

    public int calculerPrixSejour() {
        return nbNuits * logement.getTarifParNuit() * nbVoyageurs;
    };

    public void afficher() {
        System.out.println("La date d'arrivée est le " + dateArrivee + " pour " + nbNuits + " nuits.");
        System.out.println("Le prix de ce séjour est de " + tarifSejour + " euros.");
    }
}
