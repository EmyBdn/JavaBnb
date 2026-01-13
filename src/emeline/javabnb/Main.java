package emeline.javabnb;
import java.util.

import emeline.javabnb.logements.Appartement;
import emeline.javabnb.logements.Logement;
import emeline.javabnb.logements.Maison;
import emeline.javabnb.outils.Utile;
import emeline.javabnb.reservations.Reservation;
import emeline.javabnb.reservations.Sejour;
import emeline.javabnb.reservations.SejourFactory;
import emeline.javabnb.utilisateurs.Hote;
import emeline.javabnb.utilisateurs.Voyageur;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Hote moi = new Hote("Emeline", "Baudouin", 27, 1);

        Maison leDomainedOreo = new Maison(moi, 15, "8 rue Jeanne Jugan, 45000 Orléans", 38, 2, 500, true);
        leDomainedOreo.afficher();

        Date dateArriveeSejour1 = Utile.creerDate(5,12,2026);
        Sejour vacancesEnneigees = new Sejour(dateArriveeSejour1, 4, leDomainedOreo, 2);
        vacancesEnneigees.afficher();

        Appartement monHameauDeCharme = new Appartement(moi, 120, "29 Avenue des Oliviers, 83000 Toulon", 200, 6, 5, 0);
        monHameauDeCharme.afficher();

        Voyageur Lucas = new Voyageur("Lucas", "Baudouin", 25);

        //TESTS
        Date dateVacances = Utile.creerDate(20, 7, 2025);
        int nbNuits = 2;
        int nbVoyageurs = -1;

        Sejour mesVacances = SejourFactory.creerSejour(nbNuits, dateVacances, monHameauDeCharme, nbVoyageurs);

        try {
        Reservation maReservation = new Reservation(mesVacances, Lucas);
        maReservation.afficher();
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }


}
