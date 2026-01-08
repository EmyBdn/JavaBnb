package emeline.javabnb.logements;
import emeline.javabnb.utilisateurs.Hote;
import emeline.javabnb.utilisateurs.Personne;

public class Logement {
    private Personne hote;
    private int tarifParNuit;
    private String adresse;
    private int superficie;
    private int nbVoyageursMax;

    public Logement(Hote paramHote, int paramTarifParNuit, String paramAdresse, int paramSuperficie, int paramNbVoyageursMax) {
        hote = paramHote;
        tarifParNuit = paramTarifParNuit;
        adresse = paramAdresse;
        superficie = paramSuperficie;
        nbVoyageursMax = paramNbVoyageursMax;
    }

    public void afficher() {
        hote.afficher();
        System.out.println("Le logement est situé " + adresse + ".");
        System.out.println("Superficie : " + superficie + "m2");
    }

    public int getTarifParNuit() {
        return tarifParNuit;
    }

    public int getSuperficie() {
        return superficie;
    }


}
