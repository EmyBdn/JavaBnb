package emeline.javabnb.reservations;

import emeline.javabnb.logements.Logement;

import java.util.Date;

public class Sejour implements Reservable {
    private final Date dateArrivee;
    private final int nbNuits;
    private final Logement logement;
    private final int nbVoyageurs;
    protected int prix;

    public Sejour(Date paramDateArrivee, int paramNbNuits, Logement paramLogement, int paramNbVoyageurs) {
        dateArrivee = paramDateArrivee;
        nbNuits = paramNbNuits;
        logement = paramLogement;
        nbVoyageurs = paramNbVoyageurs;
    }

    public void afficher() {
        System.out.println("La date d'arrivée est le " + dateArrivee + " pour " + nbNuits + " nuits.");
    }

    public Logement getLogement() {
        return logement;
    }

    public int getNbNuits() {
        return nbNuits;
    }

    public int getNbVoyageurs() {
        return nbVoyageurs;
    }

    public boolean aUneDateArriveeCorrecte() {
        Date dateActuelle = new Date();

        if (dateArrivee.after(dateActuelle)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean aUnNombreDeNuitsCorrect() {
        return nbNuits > 0 && nbNuits <= 31;
    }

    public boolean aUnNombreDeVoyageursCorrect() {
        return nbVoyageurs > 0 && nbVoyageurs <= logement.getNbVoyageursMax();
    }
}
