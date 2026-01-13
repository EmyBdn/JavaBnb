package emeline.javabnb.reservations;

import emeline.javabnb.logements.Logement;

import java.util.Date;

public class SejourCourt extends Sejour {

    private int prix;

    SejourCourt(Date paramDateArrivee, int paramNbNuits, Logement paramLogement, int paramNbVoyageurs) {
        super(paramDateArrivee, paramNbNuits, paramLogement, paramNbVoyageurs);
        prix = paramNbNuits * paramLogement.getTarifParNuit();
    }

    @Override
    public void afficher() {
        super.afficher();

        System.out.println("Le prix de ce séjour court est : " + prix + " euros.");
    }
}
