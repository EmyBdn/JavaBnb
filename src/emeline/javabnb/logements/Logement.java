package emeline.javabnb.logements;
import emeline.javabnb.utilisateurs.Hote;
public abstract class Logement {
    private final Hote hote;
    private int tarifParNuit;
    private final String adresse;
    private final int superficie;
    private final int nbVoyageursMax;

    public Logement(Hote paramHote, int paramTarifParNuit, String paramAdresse, int paramSuperficie, int paramNbVoyageursMax) {
        hote = paramHote;
        tarifParNuit = paramTarifParNuit;
        adresse = paramAdresse;
        superficie = paramSuperficie;
        nbVoyageursMax = paramNbVoyageursMax;
    }

    public abstract void afficher();

    public int getTarifParNuit() {
        return tarifParNuit;
    }

    public int getSuperficie() {
        return superficie;
    }

    public Hote getHote() {
        return hote;
    }

    public int getNbVoyageursMax() {
        return nbVoyageursMax;
    }
}
