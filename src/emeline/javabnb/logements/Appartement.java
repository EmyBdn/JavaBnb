package emeline.javabnb.logements;

import emeline.javabnb.utilisateurs.Hote;

public class Appartement extends Logement {
    public Appartement(Hote paramHote, int paramTarifParNuit, String paramAdresse, int paramSuperficie, int paramNbVoyageursMax) {
        super(paramHote, paramTarifParNuit, paramAdresse, paramSuperficie, paramNbVoyageursMax);
    }
}
