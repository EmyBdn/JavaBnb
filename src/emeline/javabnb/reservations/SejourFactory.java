package emeline.javabnb.reservations;

import emeline.javabnb.logements.Logement;

import java.util.Date;

public class SejourFactory {

    private SejourFactory() {}

    public static Sejour creerSejour(int monNbNuits, Date maDate, Logement monLogement, int monNbVoyageurs) {

        Sejour monSejour;

        if (monNbNuits <= 6) {
            monSejour = new SejourCourt(maDate, monNbNuits, monLogement, monNbVoyageurs);
        } else {
            monSejour = new SejourLong(maDate, monNbNuits, monLogement, monNbVoyageurs);
        }
        return monSejour;
    }
}
