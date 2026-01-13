package emeline.javabnb.reservations;

import emeline.javabnb.logements.Logement;
import java.util.Date;

public class SejourLong extends Sejour {

    private int promotion;
    private static final int PROMOTION_EN_POURCETAGE = 20;

    SejourLong(Date paramDateArrivee, int paramNbNuits, Logement paramLogement, int paramNbVoyageurs) {
        super(paramDateArrivee, paramNbNuits, paramLogement, paramNbVoyageurs);

        miseAJourPrixSejour();
    }

    public void miseAJourPrixSejour() {
        int prixInitial = getNbNuits() * getLogement().getTarifParNuit();
        promotion = prixInitial * PROMOTION_EN_POURCETAGE / 100;
        prix = prixInitial - promotion;
    }
    
    @Override
    public void afficher() {
        super.afficher();
        System.out.println("Le prix de ce séjour long est de " + prix + "€" + " car il comprend une réduction de " + promotion + "€");
    }
}

